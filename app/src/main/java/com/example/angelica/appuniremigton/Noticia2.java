package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Noticia2 extends AppCompatActivity {

    WebView webviewnoticia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia2);
        webviewnoticia2 = (WebView) findViewById(R.id.notici2);
        webviewnoticia2.loadUrl("http://www.uniremington.edu.co/manizales/1456-cena-de-graduacion-2017-01-uniremington-manizales.html");
    }
}
