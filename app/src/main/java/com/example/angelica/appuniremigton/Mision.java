package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Mision extends AppCompatActivity {

    WebView webviewmision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mision);
        webviewmision = (WebView) findViewById(R.id.Mision);
        webviewmision.loadUrl("");
    }
}
