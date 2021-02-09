package com.consulsoftware.inventariosmoviles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class buscador_layout extends AppCompatActivity {
    Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entradamercancia_layout);

        init();
        inicializar();

    }
    private void init(){
        btnAceptar=(Button)findViewById(R.id.btnAceptar);
    }
    private void inicializar(){
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }
}
