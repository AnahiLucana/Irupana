package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.vision.text.Text;
import com.google.gson.Gson;

public class DetalleProducto extends AppCompatActivity {

    private TextView titulo;

    private Context context;
    private Producto objProducto;
    private TextView descripcionLarga;
    private TextView precio;
    private TextView imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pan);

        context=this;
        titulo=(TextView)findViewById(R.id.Titulo);
        descripcionLarga=(TextView)findViewById(R.id.descripcion);
        precio=(TextView)findViewById(R.id.precio);
        imagen= (ImageView)findViewById(R.id.imagen);


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
        titulo.setText(objPan.getTitulo());
        descripcionLarga.setText(objPan.getDescripcion());
        //precio.setText(objPan.getPrecio());
        imagen.setText(objPan.getImagen());






    }
}
