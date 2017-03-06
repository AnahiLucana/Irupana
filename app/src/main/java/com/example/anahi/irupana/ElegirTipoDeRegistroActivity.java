package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ElegirTipoDeRegistroActivity extends AppCompatActivity {

    private Button btnCliente;
    private Button btnTienda;
    private Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_tipo_de_registro);

        context=this;
        btnCliente=(Button)findViewById(R.id.btnCliente);
        btnTienda=(Button)findViewById(R.id.btnTienda);


        //evento de hacer click en el boton de cliente
        btnTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(context,RegistroDeTiendaActivity.class);
                startActivity(a);
            }
        });

        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(context,RegistroDeClienteActivity.class);
                startActivity(a);
            }
        });


    }


}