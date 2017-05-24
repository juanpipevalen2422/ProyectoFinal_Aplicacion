package com.example.angelica.appuniremigton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class VistaUniremington extends AppCompatActivity implements View.OnClickListener{

    Button botonMoodle;
    Button botonCorreo;
    Button botonQ10;
    Button botonRecibo;
    Spinner aspirantes;
    Spinner estudiantes;
    Spinner docentes;
    Spinner egresados;
    Spinner administrativos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_uniremington);
        botonMoodle = (Button) findViewById(R.id.Moodle);
        botonMoodle.setOnClickListener(this);
        botonCorreo = (Button) findViewById(R.id.CorreoIns);
        botonCorreo.setOnClickListener(this);
        botonQ10 = (Button) findViewById(R.id.q10);
        botonQ10.setOnClickListener(this);
        botonRecibo = (Button) findViewById(R.id.Recibo);
        botonRecibo.setOnClickListener(this);
        aspirantes = (Spinner) findViewById(R.id.Aspirantes);
        List list = new ArrayList();
        list.add("Oferta Academica");
        list.add("Formas de Pago");
        list.add("Convenios y Descuentos");
        list.add("Requisitos de Inscripcion");
        list.add("Homologaciones");
        list.add("Tarifas Institucionales 2017");
        list.add("Pre-Inscripcion");
        list.add("Documentos Nuevos");
        estudiantes = (Spinner) findViewById(R.id.Estudiantes);
        List list1 = new ArrayList();
        list.add("Calendario Academico");
        list.add("Tarifas Institucionales 2017");
        list.add("Plataforma Moodle");
        list.add("Plataforma Q10");
        list.add("Correo Institucional");
        list.add("Recibo de Matricula");
        list.add("Homologaciones");
        list.add("Directorio Administrativo");
        list.add("Lineamientos Academicos");
        list.add("Reglamento Estudiantil");
        docentes = (Spinner) findViewById(R.id.docentes_Tutores);
        List list2 = new ArrayList();
        list.add("Plataforma Moodle");
        list.add("Plataforma Q10");
        list.add("Calendario Academico");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        list.add("Reserva de Equipos");
        egresados = (Spinner) findViewById(R.id.Egresados);
        List list3 = new ArrayList();
        list.add("Especializaciones");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        administrativos = (Spinner) findViewById(R.id.Administrativos);
        List list4 = new ArrayList();
        list.add("Plataforma Q10");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        list.add("Reserva de Equipos");
    }

    @Override
    public void onClick(View v) {
        if (v==botonMoodle){
            Intent intento = new Intent(this,Moodle.class);
            startActivity(intento);
        }else if (v == botonCorreo){
            Intent intento2 = new Intent(this,CorreoInst.class);
            startActivity(intento2);
        }else if (v == botonQ10){
            Intent intento3 = new Intent(this,Q10.class);
            startActivity(intento3);
        }else if (v == botonRecibo){
            Intent intento4 = new Intent(this,ReciboMatricula.class);
            startActivity(intento4);
        }

    }
}
