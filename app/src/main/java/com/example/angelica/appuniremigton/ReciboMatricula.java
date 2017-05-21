package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReciboMatricula extends AppCompatActivity {

    WebView webviewRecibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo_matricula);
        webviewRecibo = (WebView) findViewById(R.id.ReciboMatri);
        webviewRecibo.loadUrl("http://www.uniremingtonmanizales.edu.co/liquidacion/inicio.php");
    }
}
