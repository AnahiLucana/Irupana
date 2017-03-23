package com.example.anahi.irupana;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by andresvasquez on 11/4/16.
 */
public class Base_datos extends SQLiteOpenHelper
{
    public static final String NOMBREBD = "irupana.sqlite"; //.sqlite or .db

    //Versión de la base de datos
    public Base_datos(Context context, int VERSION)
    {
        super(context, NOMBREBD, null, VERSION);
    }

    //Método utilizado cuando se crea la base de datos.
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table usuarios (id integer primary key autoincrement not null, nombre varchar, apellido varchar, email varchar, password varchar, nit varchar);");
        db.execSQL("create table productos (id integer primary key autoincrement not null, titulo varchar, descripcion varchar, imagen integer, descripcion_larga varchar, precio double);");
        Log.d("Todos los tablas: ", "Se crearon las tablas");

        /*ContentValues producto1=new ContentValues();
        producto1.put("titulo","Miel de cania");
        producto1.put("descripcion","Miel de cania");
        producto1.put("imagen","Miel de cania");
        db.insert("productos",null,producto1);*/

    }

    //Método utilizado cuando se actualiza la base de datos
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

}