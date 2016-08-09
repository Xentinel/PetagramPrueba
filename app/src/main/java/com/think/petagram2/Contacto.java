package com.think.petagram2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBarMain);
        setSupportActionBar(actionBar);
        getSupportActionBar().setTitle(R.string.menuCont);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}