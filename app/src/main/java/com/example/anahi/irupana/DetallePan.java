package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class DetallePan extends AppCompatActivity {

    private TextView lblTitulo;

    private Context context;
    private TiposDePanes objPan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pan);

        context=this;
        lblTitulo=(TextView)findViewById(R.id.lblTitulo);


        //Recibimos todas las variables del intent
        Intent intent=getIntent();
        if(intent.hasExtra("objPan")){ //Verificamos si tenemos algo con la clave objPan

            try {
                String strObjPan=intent.getStringExtra("objPan"); //Recibo en un String el objeto serializado
                objPan = new Gson().fromJson(strObjPan,TiposDePanes.class); //Convierto en objeto la cadena strObjPan (Deserializar)
                
                mostrarDetalles(objPan);
            }catch (Exception ex){

            }
        }
    }

    private void mostrarDetalles(TiposDePanes objPan) {
        lblTitulo.setText(objPan.getTitulo());
    }
}
