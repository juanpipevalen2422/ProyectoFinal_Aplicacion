package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CalendarioAcademico extends AppCompatActivity {

    WebView webviewcalendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_academico);
        webviewcalendario = (WebView) findViewById(R.id.CalendarioAcademico);
        webviewcalendario.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-37.html");
    }
}
