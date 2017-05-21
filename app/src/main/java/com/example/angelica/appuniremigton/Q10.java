package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Q10 extends AppCompatActivity {

    WebView webviewQ10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
        webviewQ10 = (WebView) findViewById(R.id.Q10);
        webviewQ10.loadUrl("https://www.q10academico.com/login?ReturnUrl=%2F&aplentId=a2e25504-9d7b-4e4e-861a-5f015f373d8f");
    }
}
