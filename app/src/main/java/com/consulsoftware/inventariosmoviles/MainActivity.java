package com.consulsoftware.inventariosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText etUsuario,etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button)findViewById(R.id.btnLogin);
        etPass = (EditText)findViewById(R.id.etContrasena);
        etUsuario=(EditText)findViewById(R.id.etUsuario);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etPass.getText().toString().isEmpty() || etUsuario.getText().toString().isEmpty()){
                    //Snackbar.make(MainActivity.this,"Favor de agregar un usuario y/o contraseña",Snackbar.LENGTH_SHORT).show();
                    Toast.makeText(MainActivity.this,"Favor de agregar un usuario y/o contraseña",Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this,menu_activity.class);
                startActivity(intent);
            }
        });

    }

    public void validaInfo(int i){

    }
}