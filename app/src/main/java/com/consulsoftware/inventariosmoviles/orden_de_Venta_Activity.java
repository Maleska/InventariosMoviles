package com.consulsoftware.inventariosmoviles;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class orden_de_Venta_Activity extends AppCompatActivity {

    ImageButton imReturnOV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orden_de_venta_layout);

        init    ();
        inicializar();
    }

    private void init(){
        imReturnOV = (ImageButton)findViewById(R.id.ibReturnOV);
    }

    private void inicializar(){
        imReturnOV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }
}
