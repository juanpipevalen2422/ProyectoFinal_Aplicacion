package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Noticia1 extends AppCompatActivity {

    WebView webviewnoticia1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia1);
        webviewnoticia1 = (WebView) findViewById(R.id.notici1);
        webviewnoticia1.loadUrl("http://www.uniremington.edu.co/manizales/1457-visita-tecnica-al-puerto-de-buenaventura-uniremington-manizales.html");
    }
}
