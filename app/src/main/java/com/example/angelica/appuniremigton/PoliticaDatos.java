package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PoliticaDatos extends AppCompatActivity {

    WebView webpoliticadatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politica_datos);
        webpoliticadatos = (WebView) findViewById(R.id.Politicadatos);
        webpoliticadatos.loadUrl("");
    }
}
