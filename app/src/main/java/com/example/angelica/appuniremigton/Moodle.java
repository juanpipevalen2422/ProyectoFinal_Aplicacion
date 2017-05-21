package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Moodle extends AppCompatActivity {

    WebView webviewMoodle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);
        webviewMoodle = (WebView) findViewById(R.id.PLaMoodle);
        webviewMoodle.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
    }
}
