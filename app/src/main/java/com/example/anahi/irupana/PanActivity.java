package com.example.anahi.irupana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class PanActivity extends AppCompatActivity {

    ListView ListView;

    String[] valores = new String[]{"Pan Chamillo","Pan de semillas","Pan de Quinua","Pan de soya","Pan de Anis","Pan de avena","pan de Wilkaparu","pan molde"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan);

        ListView = (ListView)findViewById(R.id.lista);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valores);
        ListView.setAdapter(adapter);

    }
}
