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




    ListView ListView;


//String[] valores = new String[]{"Barra de Chocolate","barra de frutos rojos","barra de ajonjoli","barra de coco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barras);
        context = this;
        imgBcd=(ImageView)findViewById(R.id.imgBcd);


        imgBcd.setOnClickListener(new View.OnClickListener(){
            @Override

        public void onClick(View view) {
            Intent a=new Intent(context,barraChocolate.class);
            startActivity(a);
        }
    });









    ListView = (ListView)findViewById(R.id.lista);






        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valores);
        //ListView.setAdapter(adapter);
    }



}
