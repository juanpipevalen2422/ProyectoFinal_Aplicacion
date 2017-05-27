package com.example.angelica.appuniremigton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReservaEquipos extends AppCompatActivity {

    WebView webviewreserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_equipos);
        webviewreserva = (WebView) findViewById(R.id.Reserva);
        webviewreserva.loadUrl("http://reservas.uniremingtonmanizales.edu.co/login.php");
    }
}
