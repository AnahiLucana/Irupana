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

public class pantallafinaldecompra extends AppCompatActivity {

    private Context context;

    private Button Volveralmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        context=this;

        Volveralmenu = (Button) findViewById(R.id.ubicarme);
        Volveralmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0){
                Intent inten =new Intent(pantallafinaldecompra.this,MenuPrincipal.class);
                startActivity(inten);
            }
        });



    }


}
