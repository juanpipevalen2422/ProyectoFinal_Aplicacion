package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ConveniosDescuentos extends AppCompatActivity {

    WebView webviewConveniosDescuentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convenios_descuentos);
        webviewConveniosDescuentos = (WebView) findViewById(R.id.FormaPago);
        webviewConveniosDescuentos.loadUrl("http://www.uniremington.edu.co/manizales/781-convenios-y-descuentos.html");

    }
}
