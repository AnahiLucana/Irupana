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
import android.widget.Spinner;


public class BarrasActivity extends AppCompatActivity {



    private Context context;
    private ImageView imgBcd;



    Spinner ingredientes;



//String[] valores = new String[]{"Barra de Chocolate","barra de frutos rojos","barra de ajonjoli","barra de coco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barras);
        context = this;
        imgBcd=(ImageView)findViewById(R.id.imgBcd);

        ingredientes=(Spinner)findViewById(R.id.sp1);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.barraDeChoco,android.R.layout.simple_spinner_item);

        ingredientes.setAdapter(adapter1);

        ingredientes=(Spinner)findViewById(R.id.sp2);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.barraDeFrutos,android.R.layout.simple_spinner_item);

        ingredientes.setAdapter(adapter2);

        ingredientes=(Spinner)findViewById(R.id.sp3);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.barraDeAjonjoli,android.R.layout.simple_spinner_item);

        ingredientes.setAdapter(adapter3);
        ingredientes=(Spinner)findViewById(R.id.sp4);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.barraDeCoco,android.R.layout.simple_spinner_item);

        ingredientes.setAdapter(adapter4);

        imgBcd.setOnClickListener(new View.OnClickListener(){
            @Override

        public void onClick(View view) {
            Intent a=new Intent(context,barraChocolate.class);
            startActivity(a);
        }
    });





    }



}
