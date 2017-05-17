package com.example.angelica.appuniremigton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class VistaUniremington extends AppCompatActivity implements View.OnClickListener{

    WebView webviewMoodle;
    WebView webviewCorreo;
    WebView webviewQ10;
    WebView webviewRecibo;
    Button Moodle;
    Button Correo1;
    Button Q10;
    Button Recibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_uniremington);
        Moodle = (Button) findViewById(R.id.Moodle);
        Moodle.setOnClickListener(this);
        Correo1 = (Button) findViewById(R.id.CorreoIns);
        Correo1.setOnClickListener(this);
        Q10 = (Button) findViewById(R.id.q10);
        Q10.setOnClickListener(this);
        Recibo = (Button) findViewById(R.id.Recibo);
        Recibo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Moodle:
                Intent intento = new Intent(this,Moodle.class);
                webviewMoodle = (WebView) findViewById(R.id.PLaMoodle);
                webviewMoodle.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
                startActivity(intento);
                break;
            case R.id.
        }

    }
}
