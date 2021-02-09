package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class capturaArticulo_LayOut extends AppCompatActivity {

    Button btnCancelar,btnArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articulos_layout);

        init();
        inicializar();

    }

    private void init(){
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        btnArt =(Button)findViewById(R.id.btnBuscarArticulo);
    }
    private void inicializar(){
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
        btnArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(capturaArticulo_LayOut.this,buscadorArticulo_LayOut.class);
                startActivity(intent);;
            }
        });
    }

}
