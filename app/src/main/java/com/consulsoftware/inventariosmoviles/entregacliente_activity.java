package com.consulsoftware.inventariosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class entregacliente_activity extends AppCompatActivity {
    Button btnCaptura,btnEnviar;
    ImageButton ibReturnEC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entregacliente_activity);

        init();
        inicializar();
    }

    private void init(){
        btnCaptura =(Button)findViewById(R.id.btnCapturaEntrega);
        btnEnviar =(Button)findViewById(R.id.btnEnviarSAPEntrega);
        ibReturnEC= (ImageButton)findViewById(R.id.ibReturEC);
    }

    private void inicializar(){
        btnCaptura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(entregacliente_activity.this, EntregaCaptura_LayOut.class);
                startActivity(intent);
            }
        });
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ibReturnEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }
}
