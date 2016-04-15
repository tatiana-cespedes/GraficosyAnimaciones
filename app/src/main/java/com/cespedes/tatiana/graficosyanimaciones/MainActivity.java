package com.cespedes.tatiana.graficosyanimaciones;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // -----LEER LAS DIMENSIONES Y TIPO DE DATOS DE UNA IMAGEN ANTES DE SU CONSTRUCCIÓN------

        BitmapFactory.Options opciones = new BitmapFactory.Options(); // permite decodificar imagenes
        opciones.inJustDecodeBounds = true; // Evita asignación de memoria
        // Retorna el mapa de bits decodificado o null si no se puede decodificar
        // decodeResource(recurso donde se encuentra la imagen,  id, BitmapFactory.options)
        BitmapFactory.decodeResource(getResources(), R.id.imagen, opciones);

        int imageHeight = opciones.outHeight; //alto
        int imageWidth = opciones.outWidth;   //ancho
        String imageType = opciones.outMimeType; //tipo de la imagen

        Toast.makeText(this, " Alto: "+ imageHeight + "  Ancho:    " + imageWidth + "   Tipo  " + imageType, Toast.LENGTH_SHORT).show();


    }



}
