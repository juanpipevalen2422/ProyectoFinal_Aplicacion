package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CorreoInst extends AppCompatActivity {

    WebView webviewCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_inst);
        webviewCorreo = (WebView) findViewById(R.id.CorreoUni);
        webviewCorreo.loadUrl("https://accounts.google.com");
    }
}
