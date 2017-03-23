package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;



public class PanActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panes);

        context=this;


        ListView lista=(ListView)findViewById(R.id.lista);
        final ArrayList<TiposDePanes> items=new ArrayList<TiposDePanes>();

        //Todo agregue los campos precio y descripcion larga
        TiposDePanes panChamillo=new TiposDePanes();
        panChamillo.setId(1);
        panChamillo.setTitulo("Pan Chamillo");
        panChamillo.setDescripcion("Pan 100% de harina integral");
        panChamillo.setDescripcionLarga("Descripción larga del pan chamillo");
        panChamillo.setPrecio(11.50);
        panChamillo.setImagen(android.R.drawable.ic_menu_camera);

        TiposDePanes panSemilla=new TiposDePanes();
        panSemilla.setId(2);
        panSemilla.setTitulo("Pan de semilla");
        panSemilla.setDescripcion("Pan con semillas de girasol, sesamo, linasa");
        panSemilla.setDescripcionLarga("Descripción larga del pan de semilla");
        panSemilla.setPrecio(20);
        panSemilla.setImagen(android.R.drawable.ic_media_play);

        TiposDePanes panQuinua=new TiposDePanes();
        panQuinua.setId(3);
        panQuinua.setTitulo("Pan de quinua");
        panQuinua.setDescripcion("Pan con harina de quinua");
        panQuinua.setDescripcionLarga("Descripción larga del pan de quinua");
        panQuinua.setPrecio(7);
        panQuinua.setImagen(android.R.drawable.ic_menu_gallery);

        //Agregamos los panes creados a la lista
        items.add(panChamillo);
        items.add(panSemilla);
        items.add(panQuinua);

        //Instanciamos el adaptador
        Adaptador adaptador=new Adaptador(PanActivity.this,items);
        //Utilizamos el adaptador
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                TiposDePanes objPan = items.get(posicion);

                Intent a=new Intent(context,DetallePan.class);
                String strObjPan=new Gson().toJson(objPan); // Creamos un JSON con el pan seleccionado
                a.putExtra("objPan",strObjPan); //Enviamos por intent con la clave objPan
                startActivity(a);
            }
        });

    }
}
