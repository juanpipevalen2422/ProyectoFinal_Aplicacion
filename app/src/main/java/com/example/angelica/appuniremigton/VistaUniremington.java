package com.example.angelica.appuniremigton;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

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
    ImageView noticia1;
    ImageView noticia2;
    ToggleButton botonCambio;
    RadioGroup menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_uniremington);
        noticia1 =(ImageView) findViewById(R.id.noticia);
        noticia2 = (ImageView) findViewById(R.id.noticia2);
        botonCambio = (ToggleButton) findViewById(R.id.toggleButton);
        botonCambio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean On) {
                if(On==true){
                    noticia1.setImageDrawable();
                    Intent not1 = new Intent(VistaUniremington.this, Noticia1.class);
                    startActivity(not1);
                }else{
                    noticia2.getDrawable();
                    Intent not2 = new Intent(VistaUniremington.this, Noticia2.class);
                    startActivity(not2);
                }
            }



        });

        menu = (RadioGroup) findViewById(R.id.radiogroup);
        botonMoodle = (Button) findViewById(R.id.Moodle);
        botonMoodle.setOnClickListener(this);
        botonCorreo = (Button) findViewById(R.id.CorreoIns);
        botonCorreo.setOnClickListener(this);
        botonQ10 = (Button) findViewById(R.id.q10);
        botonQ10.setOnClickListener(this);
        botonRecibo = (Button) findViewById(R.id.Recibo);
        botonRecibo.setOnClickListener(this);
        aspirantes = (Spinner) findViewById(R.id.Aspirantes);
        final List list = new ArrayList();
        list.add("ASPIRANTES");
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
        list.add("ESTUDIANTES");
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
        list.add("DOCENTES_TUTORES");
        list.add("Plataforma Moodle");
        list.add("Plataforma Q10");
        list.add("Calendario Academico");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        list.add("Reserva de Equipos");
        egresados = (Spinner) findViewById(R.id.Egresados);
        List list3 = new ArrayList();
        list.add("EGRESADOS");
        list.add("Especializaciones");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        administrativos = (Spinner) findViewById(R.id.Administrativos);
        List list4 = new ArrayList();
        list.add("ADMINISTRATIVOS");
        list.add("Plataforma Q10");
        list.add("Correo Institucional");
        list.add("Directorio Administrativo");
        list.add("Reserva de Equipos");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aspirantes.setAdapter(arrayAdapter);
        aspirantes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VistaUniremington.this, "Nombre Seleccionado: "+ String.valueOf(aspirantes.getSelectedItem()),Toast.LENGTH_SHORT).show();
                switch (position){
                    case 1:
                        Intent oferta = new Intent(VistaUniremington.this, OfertaAcademica.class);
                        startActivity(oferta);
                        break;
                    case 2:
                        Intent pago = new Intent(VistaUniremington.this, FormaPago.class);
                        startActivity(pago);
                        break;
                    case 3:
                        Intent convenio = new Intent(VistaUniremington.this, ConveniosDescuentos.class);
                        startActivity(convenio);
                        break;
                    case 4:
                        Intent requi = new Intent(VistaUniremington.this, RequisitosInscripcion.class);
                        startActivity(requi);
                        break;
                    case 5:
                        Intent homo = new Intent(VistaUniremington.this, Homologaciones.class);
                        startActivity(homo);
                        break;
                    case 6:
                        Intent tarifa = new Intent(VistaUniremington.this, TarifasInstitucionales.class);
                        startActivity(tarifa);
                        break;
                    case 7:
                        Intent prein = new Intent(VistaUniremington.this, PreInscripcion.class);
                        startActivity(prein);
                        break;
                    case 8:
                        Intent docu = new Intent(VistaUniremington.this, DocumentosNuevos.class);
                        startActivity(docu);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estudiantes.setAdapter(arrayAdapter);
        estudiantes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VistaUniremington.this, "Nombre Seleccionado: "+ String.valueOf(estudiantes.getSelectedItem()),Toast.LENGTH_SHORT).show();
                switch (position){
                    case 1:
                        Intent calend = new Intent(VistaUniremington.this, CalendarioAcademico.class);
                        startActivity(calend);
                        break;
                    case 2:
                        Intent tari = new Intent(VistaUniremington.this, TarifasInstitucionales.class);
                        startActivity(tari);
                        break;
                    case 3:
                        Intent mod = new Intent(VistaUniremington.this, Moodle.class);
                        startActivity(mod);
                        break;
                    case 4:
                        Intent q10 = new Intent(VistaUniremington.this, Q10.class);
                        startActivity(q10);
                        break;
                    case 5:
                        Intent correo = new Intent(VistaUniremington.this, CorreoInst.class);
                        startActivity(correo);
                        break;
                    case 6:
                        Intent reci = new Intent(VistaUniremington.this, ReciboMatricula.class);
                        startActivity(reci);
                        break;
                    case 7:
                        Intent homol = new Intent(VistaUniremington.this, Homologaciones.class);
                        startActivity(homol);
                        break;
                    case 8:
                        Intent direc = new Intent(VistaUniremington.this, DirectorioAdministrativo.class);
                        startActivity(direc);
                        break;
                    case 9:
                        Intent regla = new Intent(VistaUniremington.this, Reglamento.class);
                        startActivity(regla);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        docentes.setAdapter(arrayAdapter);
        docentes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VistaUniremington.this, "Nombre Seleccionado: "+ String.valueOf(docentes.getSelectedItem()),Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 1:
                        Intent plat = new Intent(VistaUniremington.this, Moodle.class);
                        startActivity(plat);
                        break;
                    case 2:
                        Intent platq10 = new Intent(VistaUniremington.this, Q10.class);
                        startActivity(platq10);
                        break;
                    case 3:
                        Intent caleaca = new Intent(VistaUniremington.this, CalendarioAcademico.class);
                        startActivity(caleaca);
                        break;
                    case 4:
                        Intent correoin = new Intent(VistaUniremington.this, CorreoInst.class);
                        startActivity(correoin);
                        break;
                    case 5:
                        Intent dir = new Intent(VistaUniremington.this, DirectorioAdministrativo.class);
                        startActivity(dir);
                        break;
                    case 6:
                        Intent reci = new Intent(VistaUniremington.this, ReservaEquipos.class);
                        startActivity(reci);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        egresados.setAdapter(arrayAdapter);
        egresados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VistaUniremington.this, "Nombre Seleccionado: " + String.valueOf(egresados.getSelectedItem()), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 1:
                        Intent especia = new Intent(VistaUniremington.this, Especializaciones.class);
                        startActivity(especia);
                        break;
                    case 2:
                        Intent correoins = new Intent(VistaUniremington.this, CorreoInst.class);
                        startActivity(correoins);
                        break;
                    case 3:
                        Intent direcadm = new Intent(VistaUniremington.this, DirectorioAdministrativo.class);
                        startActivity(direcadm);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter5= new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        administrativos.setAdapter(arrayAdapter);
        administrativos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(VistaUniremington.this, "Nombre Seleccionado: "+ String.valueOf(administrativos.getSelectedItem()),Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 1:
                        Intent q10 = new Intent(VistaUniremington.this, Q10.class);
                        startActivity(q10);
                        break;
                    case 2:
                        Intent correoins = new Intent(VistaUniremington.this, CorreoInst.class);
                        startActivity(correoins);
                        break;
                    case 3:
                        Intent direcadm = new Intent(VistaUniremington.this, DirectorioAdministrativo.class);
                        startActivity(direcadm);
                        break;
                    case 4:
                        Intent reseequ = new Intent(VistaUniremington.this, ReservaEquipos.class);
                        startActivity(reseequ);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        menu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    Intent mision = new Intent(VistaUniremington.this, Mision.class);
                    startActivity(mision);
                } else if (checkedId == R.id.radioButton2){
                    Intent vision = new Intent(VistaUniremington.this, Vision.class);
                    startActivity(vision);
                }else if(checkedId == R.id.radioButton3){
                    Intent proda = new Intent(VistaUniremington.this, PoliticaDatos.class);
                    startActivity(proda);
                }else if(checkedId == R.id.radioButton4){
                    Intent ubica = new Intent(VistaUniremington.this, Ubicacion.class);
                    startActivity(ubica);
                }
            }
        });
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
