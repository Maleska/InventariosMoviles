package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EntregaCaptura_LayOut extends AppCompatActivity {

    Button btnCaptura,btnEnviar;
    ImageButton imButtonReturn;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entregacaptura_layout);

        init();
        inicializar();
    }

    private void inicializar(){
        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntregaCaptura_LayOut.this,orden_de_Venta_Activity.class);
                startActivity(intent);
            }
        });
        imButtonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }

    private void init(){
        btnCaptura =(Button)findViewById(R.id.btnIniCapEntMerc);
        //btnEnviar =(Button)findViewById(R.id.btnEnviarSAPEntrega);
        imButtonReturn =(ImageButton)findViewById(R.id.imReturnCapEntMer);
    }



}
