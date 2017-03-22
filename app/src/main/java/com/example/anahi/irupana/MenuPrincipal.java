package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private Context context;

    private ImageView imgMiel;
    private ImageView imgCafe;
    private ImageView imgBarritas;
    private ImageView imgPan;
    private ImageView logOut;
    private  ImageView  imgOfertas;
    private ImageView imgTienda;
    private ImageView imgCarrito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        context = this;
        imgBarritas = (ImageView) findViewById(R.id.imgBarritas);
        imgMiel = (ImageView) findViewById(R.id.imgMiel);
        imgPan = (ImageView) findViewById(R.id.imgPan);
        imgCafe = (ImageView) findViewById(R.id.imgCafe);
        logOut = (ImageView) findViewById(R.id.logOut);
        imgOfertas=(ImageView)findViewById(R.id.imgOfertas);
        imgTienda=(ImageView)findViewById(R.id.imgTienda);
        imgCarrito=(ImageView)findViewById(R.id.imgCarrito);

        imgBarritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, BarrasActivity.class);
                startActivity(a);
            }
        });

        imgMiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, MielActivity.class);
                startActivity(a);
            }
        });
       // imgTienda.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View view) {
               // Intent a = new Intent(context, TiendaActivity.class);
             //   startActivity(a);
           // }
        //});
        imgCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, CafeActivity.class);
                startActivity(a);
            }
        });
        imgCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, CarritoActivity.class);
                startActivity(a);
            }
        });
        imgPan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(context, PanActivity.class);
                startActivity(a);
            }
        });
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });
        imgOfertas.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view) {
                Intent a = new Intent(context, Ofertas.class);
                startActivity(a);
            }
        });





    }

            private void logout() {
                Toast.makeText(getApplicationContext(),
                        "Cerrando sesión.", Toast.LENGTH_SHORT).show();

                SharedPreferences prefs =
                        getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = prefs.edit();
                editor.clear();
                editor.commit();
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(a);
            }
        }
