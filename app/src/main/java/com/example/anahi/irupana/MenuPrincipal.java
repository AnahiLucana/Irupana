package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    private Context context;

    private ImageView imgMiel;
    private ImageView imgCafe;
    private ImageView imgBarritas;
    private ImageView imgPan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        context=this;
        imgBarritas=(ImageView)findViewById(R.id.imgBarritas);
        imgMiel=(ImageView)findViewById(R.id.imgMiel);
        imgPan=(ImageView)findViewById(R.id.imgPan);
        imgCafe=(ImageView)findViewById(R.id.imgCafe);


        imgBarritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(context,BarrasActivity.class);
                startActivity(a);
            }
        });

        imgMiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(context,MielActivity.class);
                startActivity(a);
            }
        });

        imgCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(context,CafeActivity.class);
                startActivity(a);
            }
        });
        imgPan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();

                /*Intent a=new Intent(context,PanActivity.class);
                startActivity(a);*/
            }
        });

    }

    private void logout(){
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
