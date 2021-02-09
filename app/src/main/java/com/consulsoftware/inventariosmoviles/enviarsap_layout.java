package com.consulsoftware.inventariosmoviles;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class enviarsap_layout extends AppCompatActivity {

    ImageButton ibReturnE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviarsap_layout);

        init();
        inicializar();
    }

    private void init(){
        ibReturnE = (ImageButton)findViewById(R.id.ibReturnE);
    }
    private  void inicializar(){
        ibReturnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                return;
            }
        });
    }

}
