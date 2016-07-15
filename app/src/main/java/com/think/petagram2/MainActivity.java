package com.think.petagram2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBarMain);
        setSupportActionBar(actionBar);
        crearMascotas();
        listaMascotas = (RecyclerView)findViewById(R.id.rvListaMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();
        ImageButton btnFav = (ImageButton)findViewById(R.id.botonFavoritos);
        btnFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),DetalleMascota.class);
                i.putExtra("mascotas",mascotas);
                startActivity(i);
            }
        });
    }
    private void crearMascotas()
    {
        mascotas = new ArrayList<>();
        mascotas.add(new mascota("Bugs Bunny",R.drawable.conejo,3));
        mascotas.add(new mascota("Porky",R.drawable.lechon,2));
        mascotas.add(new mascota("Pandita",R.drawable.panda,5));
        mascotas.add(new mascota("Silvestre",R.drawable.gatito,1));
        mascotas.add(new mascota("Perrito",R.drawable.perrito,4));
    }
    private void inicializarAdaptador(){
        mascotaAdaptador ma = new mascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(ma);
    }

}
