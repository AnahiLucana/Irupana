package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;


public class BarrasActivity extends AppCompatActivity {

    private Context context;
    private ImageView imgBcd;
    private ImageView imgfr;
    private ImageView imgAjon;
    private ImageView imgcoco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barras);
        context = this;
        imgBcd=(ImageView)findViewById(R.id.imgBcd);
        imgfr=(ImageView)findViewById(R.id.imgfr);
        imgAjon=(ImageView)findViewById(R.id.imgAjon);
        imgcoco=(ImageView)findViewById(R.id.imgcoco);



        imgBcd.setOnClickListener(new View.OnClickListener(){
            @Override

        public void onClick(View view) {
            Intent a=new Intent(context,barraChocolate.class);
            startActivity(a);
        }
        });


        imgfr.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view) {
                Intent a=new Intent(context,barrasFrutosRojos.class);
                startActivity(a);
            }
        });


        imgAjon.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view) {
                Intent a=new Intent(context,barrasAjonjoli.class);
                startActivity(a);
            }
        });


        imgcoco.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view) {
                Intent a=new Intent(context,barrasCoco.class);
                startActivity(a);
            }
        });




    }



}
