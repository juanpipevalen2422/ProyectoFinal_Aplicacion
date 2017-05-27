package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class OfertaAcademica extends AppCompatActivity {

    WebView webviewOfertaAcademica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta_academica);
        webviewOfertaAcademica = (WebView) findViewById(R.id.OfertaAcademica);
        webviewOfertaAcademica.loadUrl("http://www.uniremington.edu.co/manizales/1427-Oferta-Acad%C3%A9mica.html");
    }
}
