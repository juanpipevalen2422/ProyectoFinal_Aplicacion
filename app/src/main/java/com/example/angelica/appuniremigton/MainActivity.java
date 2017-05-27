package com.example.angelica.appuniremigton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String validacion = "juan@gmail.com";
    String validacion2 = "juan1234";
    EditText correo;
    EditText contraseña;
    Button Ingresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = (EditText) findViewById(R.id.correo);
        contraseña = (EditText) findViewById(R.id.contraseña);
        Ingresar = (Button) findViewById(R.id.ingresar);
        Ingresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String valcorreo = correo.getText().toString();
        String valcontraseña = contraseña.getText().toString();

        if (validacion.equals(valcorreo) && validacion2.equals(valcontraseña)){
            Intent interfaz = new Intent(this,VistaUniremington.class);
            startActivity(interfaz);
        }else{
            Toast.makeText(getApplicationContext(), "Contraseña Incorrecta, Validar datos nuevamente", Toast.LENGTH_SHORT).show();
        }

    }

}
