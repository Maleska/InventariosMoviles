package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CapturarEntradaMercancia_LayOut extends AppCompatActivity {
    ImageButton ibreturn;
    Button btnCaptura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capturarentradamercancia_layout);

        init();
        inicializar();

    }
    private void init(){
        ibreturn =(ImageButton)findViewById(R.id.imReturnCapEntMer);
        btnCaptura =(Button)findViewById(R.id.btnIniCapEntMerc);
    }
    private void inicializar(){
       ibreturn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });
        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CapturarEntradaMercancia_LayOut.this,detalleEntrada_layOut.class);
                startActivity(intent);
            }
        });
    }
}
