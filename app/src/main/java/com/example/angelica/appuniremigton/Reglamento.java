package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Reglamento extends AppCompatActivity {

    WebView webviewreglamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamento);
        webviewreglamento = (WebView) findViewById(R.id.Reglamento);
        webviewreglamento.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
    }
}
