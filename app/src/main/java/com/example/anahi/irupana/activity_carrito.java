package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Usuario on 23/03/2017.
 */

public class activity_carrito extends AppCompatActivity {

    private Context context;

    private Button Hacerpedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        context=this;

        Hacerpedido = (Button) findViewById(R.id.ubicarme);
        Hacerpedido.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                Intent inten =new Intent(activity_carrito.this,pantallafinaldecompra.class);
                startActivity(inten);
            }
        });



    }}
