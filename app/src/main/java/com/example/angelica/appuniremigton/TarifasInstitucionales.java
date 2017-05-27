package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebMessagePort;
import android.webkit.WebView;

public class TarifasInstitucionales extends AppCompatActivity {

    WebView webviewtarifasinst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifas_institucionales);
        webviewtarifasinst = (WebView) findViewById(R.id.TarifasInstitucionales);
        webviewtarifasinst.loadUrl("http://www.uniremington.edu.co/manizales/784-tarifas-institucionales-2017.html");
    }
}
