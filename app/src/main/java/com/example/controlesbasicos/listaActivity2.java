package com.example.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class listaActivity2 extends AppCompatActivity {
ListView lsvDatos;
Button btnPaises, btnPlanetas,btnNombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista2);

        btnPaises= findViewById(R.id.btnPaises);
        btnPlanetas= findViewById(R.id.bntPlanetas);
        btnNombres= findViewById(R.id.bntNombres);
        lsvDatos=(ListView) findViewById(R.id.lsvDatos);
        btnPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paises();
            }
        });
        btnPlanetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Planetas();
            }
        });
        btnNombres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Nombres();
            }
        });
    }

    private void Nombres() {
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(listaActivity2.this, R.array.nombres, android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }

    private void Planetas() {
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(listaActivity2.this, R.array.planetas, android.R.layout.simple_list_item_1);
        lsvDatos.setAdapter(adapter);
    }

    private void Paises() {
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(listaActivity2.this, R.array.paises, android.R.layout.simple_list_item_1);
    lsvDatos.setAdapter(adapter);
    }
}