package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PreInscripcion extends AppCompatActivity {

    WebView webviewTarifas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_inscripcion);
        webviewTarifas = (WebView) findViewById(R.id.Preinscripcion);
        webviewTarifas.loadUrl("https://www.q10academico.com/preinscripcion?aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
    }
}
