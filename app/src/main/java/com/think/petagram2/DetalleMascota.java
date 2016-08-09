package com.think.petagram2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.think.petagram2.adapters.mascotaAdaptador;
import com.think.petagram2.pojo.mascota;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {
    ArrayList<mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);
        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBarDetalle);
        setSupportActionBar(actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.nombreActiv2);
        RecyclerView rvFavoritos = (RecyclerView)findViewById(R.id.rvFavoritos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvFavoritos.setLayoutManager(llm);
        mascotas = (ArrayList<mascota>) getIntent().getSerializableExtra("mascotas");
        mascotaAdaptador ma = new mascotaAdaptador(mascotas,this);
        rvFavoritos.setAdapter(ma);
    }
}
