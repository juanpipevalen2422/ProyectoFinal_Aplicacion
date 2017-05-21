package com.example.angelica.appuniremigton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class VistaUniremington extends AppCompatActivity implements View.OnClickListener{

    Button botonMoodle;
    Button botonCorreo;
    Button botonQ10;
    Button botonRecibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_uniremington);
        botonMoodle = (Button) findViewById(R.id.Moodle);
        botonMoodle.setOnClickListener(this);
        botonCorreo = (Button) findViewById(R.id.CorreoIns);
        botonCorreo.setOnClickListener(this);
        botonQ10 = (Button) findViewById(R.id.q10);
        botonQ10.setOnClickListener(this);
        botonRecibo = (Button) findViewById(R.id.Recibo);
        botonRecibo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==botonMoodle){
            Intent intento = new Intent(this,Moodle.class);
            startActivity(intento);
        }else if (v == botonCorreo){
            Intent intento2 = new Intent(this,CorreoInst.class);
            startActivity(intento2);
        }else if (v == botonQ10){
            Intent intento3 = new Intent(this,Q10.class);
            startActivity(intento3);
        }else if (v == botonRecibo){
            Intent intento4 = new Intent(this,ReciboMatricula.class);
            startActivity(intento4);
        }

    }
}
