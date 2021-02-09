package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class entradamercancia_layout extends AppCompatActivity {
        RadioButton rb1,rb2,rb3;
        ImageButton ibreturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entradamercancia_layout);

        init();
        inicializar();

    }

    private void init(){
        ibreturn = (ImageButton)findViewById(R.id.ibReturnEM);
        rb1 =(RadioButton)findViewById(R.id.rb1Crear);
        rb2 = (RadioButton)findViewById(R.id.rb2Captura);
    }
    private void inicializar(){
        ibreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(entradamercancia_layout.this,nuevaentrada_layout.class);
                startActivity(intent);
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(entradamercancia_layout.this,CapturarEntradaMercancia_LayOut.class);
                startActivity(intent);
            }
        });
    }




}
