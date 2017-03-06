package com.example.anahi.irupana;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ing. Rafael Serate on 04/03/17.
 */

public class RegistroDeClienteActivity extends AppCompatActivity{
    private Button btnCrearCuentaComoCliente;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_cliente);
        context=this;
        btnCrearCuentaComoCliente=(Button)findViewById(R.id.btnCrearCuentaComoCliente);


        btnCrearCuentaComoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(context,MenuPrincipal.class);
                startActivity(a);
            }
        });

    }



}