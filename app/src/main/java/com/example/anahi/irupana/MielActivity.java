package com.example.anahi.irupana;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Ing. Rafael Serate on 04/03/17.
 */

public class MielActivity extends AppCompatActivity{

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miel);
            context=this;

            ListView lista=(ListView)findViewById(R.id.lista);
            final ArrayList<Producto> items = new ArrayList<Producto>();

            Producto MielDelValle = new Producto();
            


            Producto MielDeYungas= new Producto();

            items.add(MielDelValle);
            items.add(MielDeYungas);



        }



}








