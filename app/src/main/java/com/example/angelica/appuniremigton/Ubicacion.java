package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Ubicacion extends AppCompatActivity {

    WebView webviewubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        webviewubicacion = (WebView) findViewById(R.id.Ubicacion);
        webviewubicacion.loadUrl("");
    }
}
