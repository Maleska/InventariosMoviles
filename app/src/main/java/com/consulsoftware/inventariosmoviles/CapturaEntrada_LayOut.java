package com.consulsoftware.inventariosmoviles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CapturaEntrada_LayOut extends AppCompatActivity {

    ImageButton ibreturnEnt;
    Button btnCaptura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capturaentrada_layout);

        init();
        inicializar();
    }
    private void init(){
        ibreturnEnt =(ImageButton)findViewById(R.id.imReturnCapEntMer);
        btnCaptura =(Button)findViewById(R.id.btnIniCapEntMerc);
    }
    private void inicializar(){
        ibreturnEnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
