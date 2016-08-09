package com.think.petagram2.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.think.petagram2.R;
import com.think.petagram2.pojo.mascota;

import java.util.ArrayList;

/**
 * Created by julio on 14/07/2016.
 */
public class mascotaAdaptador extends RecyclerView.Adapter<mascotaAdaptador.mascotaViewHolder>  {
    private ArrayList <mascota> mascotas;
    private Activity activity;
    public mascotaAdaptador(ArrayList mascotas, Activity activity){
        this.activity = activity;
        this.mascotas = mascotas;
    }

    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_detalle_mascota,parent,false);
        return new mascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final mascotaViewHolder holder, int position) {
        final mascota m1 = mascotas.get(position);
        holder.nombre.setText(m1.getNombre());
        holder.foto.setImageResource(m1.getFoto());
        holder.likes.setText(m1.getNumLikes());
        holder.huesoLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"Like",Toast.LENGTH_SHORT).show();
                m1.incLikes();
                holder.likes.setText(m1.getNumLikes());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class mascotaViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private TextView likes;
        private ImageView foto;
        private ImageButton huesoLike;
        public mascotaViewHolder(View itemView) {
            super(itemView);
            nombre      = (TextView)itemView.findViewById(R.id.cvNombreMascota);
            likes       = (TextView)itemView.findViewById(R.id.cvNumLikes);
            foto        = (ImageView)itemView.findViewById(R.id.cvFotoDetMasc);
            huesoLike   = (ImageButton)itemView.findViewById(R.id.cvHuesoLike);
        }
    }
}
