package com.example.anahi.irupana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class BarrasActivity extends AppCompatActivity {

    ListView ListView;


String[] valores = new String[]{"Barra de Chocolate","barra de frutos rojos","barra de ajonjoli","barra de coco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barras);

        ListView = (ListView)findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valores);
        ListView.setAdapter(adapter);
    }
}
