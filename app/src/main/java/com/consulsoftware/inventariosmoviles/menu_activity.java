package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class menu_activity extends AppCompatActivity {
        Button btnEntrega,btnEntrada;
        ImageView imSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activity);

        init();
        funciones();
        }

        private void init(){
            btnEntrada =findViewById(R.id.btnEntrada);
            btnEntrega = findViewById(R.id.btnEntrega);
            imSalir = findViewById(R.id.imSalir);
        }

        private void funciones(){

        btnEntrega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_activity.this,entregacliente_activity.class);
                startActivity(intent);
            }
        });

        btnEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu_activity.this,entradamercancia_layout.class);
                startActivity(intent);
            }
        });






        }
}