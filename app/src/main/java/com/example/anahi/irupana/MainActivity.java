package com.example.anahi.irupana;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView txtRegistrarse;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPassword=(EditText)findViewById(R.id.txtTPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtRegistrarse=(TextView)findViewById(R.id.txtRegistrarse);

        //Evento de click en el botón
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String campo_usuario = txtEmail.getText().toString();
                String campo_password = txtPassword.getText().toString();

                if (campo_usuario.compareTo("irupana") == 0 && campo_password.compareTo("irupana") == 0) {
                    txtRegistrarse.setText("Login aceptado");

                    Intent menu = new Intent(context, MenuPrincipal.class);
                    startActivity(menu);
                }else{
                    txtRegistrarse.setText("Login Fallido");

                }
            }


            }

        );

        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(context,ElegirTipoDeRegistroActivity.class);
                startActivity(a);
            }
        });


    }




}
