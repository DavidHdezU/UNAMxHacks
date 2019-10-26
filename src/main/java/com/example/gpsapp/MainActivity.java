package com.example.gpsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUbicacion, btnPanico, btnContactos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUbicacion = (Button) findViewById(R.id.btn_Ubicacion); // Para activar los botones
        btnPanico = (Button) findViewById(R.id.btn_Panico);
        btnContactos = (Button) findViewById(R.id.btn_Contactos);

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //Cuando alguien le dé click al boton debera realizar una accion
                Intent intent = new Intent(getApplicationContext(), MapsActivity1.class); // Para pasar a la siguiente actividad
                startActivity(intent);

            }
        });
    }
}















































































































































































































