package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class DetalleProducto extends AppCompatActivity {

    private TextView lblTitulo;

    private Context context;
    private Producto objProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pan);

        context=this;
        lblTitulo=(TextView)findViewById(R.id.lblTitulo);


        //Recibimos todas las variables del intent
        Intent intent=getIntent();
        if(intent.hasExtra("objProducto")){ //Verificamos si tenemos algo con la clave objProducto

            try {
                String strObjPan=intent.getStringExtra("objProducto"); //Recibo en un String el objeto serializado
                objProducto = new Gson().fromJson(strObjPan,Producto.class); //Convierto en objeto la cadena strObjPan (Deserializar)
                
                mostrarDetalles(objProducto);
            }catch (Exception ex){

            }
        }
    }

    private void mostrarDetalles(Producto objPan) {
        lblTitulo.setText(objPan.getTitulo());
        //TODO que muestres todos los items de detalle pan
    }
}
