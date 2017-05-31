package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Especializaciones extends AppCompatActivity {

    WebView webviewespeciali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especializaciones);
        webviewespeciali = (WebView) findViewById(R.id.Especializaciones);
        webviewespeciali.loadUrl("http://www.uniremington.edu.co/manizales/buscador.html?isc=1&category_id=&xf_1=4&xf_2=33&programa=si");
    }
}
