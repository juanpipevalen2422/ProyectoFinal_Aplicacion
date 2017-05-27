package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FormaPago extends AppCompatActivity {

    WebView webviewformapago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma_pago);
        webviewformapago = (WebView) findViewById(R.id.FormaPago);
        webviewformapago.loadUrl("http://www.uniremington.edu.co/manizales/779-formas-de-pago.html");

    }
}
