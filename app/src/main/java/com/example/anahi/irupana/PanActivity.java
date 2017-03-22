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
        items.add(new TiposDePanes(1, "Pan Chamillo", "Pan 100% de harina integral", android.R.drawable.ic_menu_camera));
        items.add(new TiposDePanes(1, "Pan de semilla", "Pan con semillas de girasol, sesamo, linasa", android.R.drawable.ic_media_play));
        items.add(new TiposDePanes(1, "Pan de quinua", "Pan con harina de quinua", android.R.drawable.ic_menu_gallery));

        //Instanciamos el adaptador
        Adaptador adaptador=new Adaptador(PanActivity.this,items);
        //Utilizamos el adaptador
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                TiposDePanes objLista = items.get(posicion);

                Intent a=new Intent(context,DetallePan.class);


            }
        });

    }
}
