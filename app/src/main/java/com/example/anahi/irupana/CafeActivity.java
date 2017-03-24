package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;



public class CafeActivity extends AppCompatActivity{

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        context=this;

        ListView lista=(ListView)findViewById(R.id.lista);
        final ArrayList<Producto> items = new ArrayList<Producto>();

        Producto CafeTostado = new Producto();
        CafeTostado.setId(1);
        CafeTostado.setTitulo("Cafe Tostado");
        CafeTostado.setDescripcion("Cafe tostado sin azucar");
        CafeTostado.setPrecio(60);
        CafeTostado.setImagen(R.drawable.cafetostado);

        Producto CafeTorrado = new Producto();
        CafeTorrado.setId(2);
        CafeTorrado.setTitulo("Cafe Torrado");
        CafeTorrado.setDescripcion("Cafe tostado con azucar");
        CafeTorrado.setPrecio(60);
        CafeTorrado.setImagen(R.drawable.cafetorrado);

        items.add(CafeTostado);
        items.add(CafeTorrado);

        Adaptador adaptador = new Adaptador(CafeActivity.this,items);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Producto objCafe = items.get(posicion);

                Intent a=new Intent(context,DetalleProducto.class);
                String strObjCafe=new Gson().toJson(objCafe); // Creamos un JSON con el cafe seleccionado
                a.putExtra("objProducto",strObjCafe); //Enviamos por intent con la clave objCafe
                startActivity(a);
            }
        });

    }
}
