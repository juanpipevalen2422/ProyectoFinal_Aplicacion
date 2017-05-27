package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DirectorioAdministrativo extends AppCompatActivity {

    WebView webviewdirectorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorio_administrativo);
        webviewdirectorio = (WebView) findViewById(R.id.DirectorioAdmin);
        webviewdirectorio.loadUrl("http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");
    }
}
