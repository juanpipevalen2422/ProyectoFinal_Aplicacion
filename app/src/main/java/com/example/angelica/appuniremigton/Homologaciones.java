package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Homologaciones extends AppCompatActivity {

    WebView webviewhomologaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homologaciones);
        webviewhomologaciones = (WebView) findViewById(R.id.Homologaciones);
        webviewhomologaciones.loadUrl("http://www.uniremington.edu.co/manizales/782-homologaciones.html");
    }
}
