package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RequisitosInscripcion extends AppCompatActivity {

    WebView webviewrequisitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requisitos_inscripcion);
        webviewrequisitos = (WebView) findViewById(R.id.RequisitosIncripcion);
        webviewrequisitos.loadUrl("http://www.uniremington.edu.co/manizales/778-requisitos-de-inscripcion.html");
    }
}
