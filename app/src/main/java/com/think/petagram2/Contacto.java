package com.think.petagram2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {
    private Button enviarMail;
    private EditText nombre,email,mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Toolbar actionBar = (Toolbar) findViewById(R.id.actionBarMain);
        setSupportActionBar(actionBar);
        getSupportActionBar().setTitle(R.string.menuCont);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        incializarElementosGUI();
        enviarMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contacto.this, email.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void incializarElementosGUI() {
        enviarMail = (Button)findViewById(R.id.enviarMail);
        nombre     = (EditText)findViewById(R.id.input_name);
        email      = (EditText)findViewById(R.id.input_email);
        mensaje    = (EditText)findViewById(R.id.input_message);
    }
}
