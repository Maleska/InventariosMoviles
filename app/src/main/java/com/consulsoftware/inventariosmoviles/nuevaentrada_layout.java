package com.consulsoftware.inventariosmoviles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class nuevaentrada_layout extends AppCompatActivity {
    ImageButton imReturn;
    Button btnproveedores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuevaentrada_layout);
        init();
        inicializar();
    }
    private void init(){
        imReturn =(ImageButton)findViewById(R.id.ibReturnNE);
        btnproveedores =(Button)findViewById(R.id.btnBuscar);
    }
    private void inicializar(){
        imReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
        btnproveedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
