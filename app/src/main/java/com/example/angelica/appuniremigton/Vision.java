package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Vision extends AppCompatActivity {

    WebView webviewvision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision);
        webviewvision = (WebView) findViewById(R.id.Vision);
        webviewvision.loadUrl("http://www.uniremington.edu.co/manizales/792-sede-cable.html");
    }
}
