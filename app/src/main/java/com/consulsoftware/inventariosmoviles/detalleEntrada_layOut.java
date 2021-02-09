package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class detalleEntrada_layOut extends AppCompatActivity {

    ImageButton ibreturn;
    Button btnCaptura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalleentrada_layout);

        init();
        inicializar();

    }

    private void init(){
        ibreturn = (ImageButton)findViewById(R.id.ibreturndetalle);
        btnCaptura =(Button)findViewById(R.id.btnCapturaDetalle);
    }
    private void inicializar(){
        ibreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(detalleEntrada_layOut.this,capturaArticulo_LayOut.class);
                startActivity(intent);
            }
        });
    }


}
