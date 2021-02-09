package com.consulsoftware.inventariosmoviles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class captura_activity extends AppCompatActivity {

        Button btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.captura_activity);

        init();
        inicializar();
    }

    private void init(){
        btncancel = (Button)findViewById(R.id.btnCancelC);
    }
    private void inicializar(){
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }

}
