package com.example.anahi.irupana;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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

        //Buscamos el archivo de preferencias llamado MisPreferencias
        SharedPreferences prefs =
                getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        //Se busca los datos almacenados. SI no hay el resultado será no.
        String email_almacenado = prefs.getString("email","no");
        String password_almacenado = prefs.getString("password","no");

        //Si hay datos de usuarios almacenados se irá a menu principal.
        if(email_almacenado.compareTo("no")!=0 && password_almacenado.compareTo("no")!=0)
        {
            Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
            finish();
            startActivity(a);
        }


        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPassword=(EditText)findViewById(R.id.txtTPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        txtRegistrarse=(TextView)findViewById(R.id.txtRegistrarse);

        //Evento de click en el botón
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String campo_usuario = txtEmail.getText().toString();
                String campo_password = txtPassword.getText().toString();

                if (campo_usuario.compareTo("irupana@gmail.com") == 0 && campo_password.compareTo("irupana") == 0) {
                    AlertDialog dialogo;
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Bienvenido");
                    builder.setMessage("Bienvenido al Menu de Irupana");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //Abrimos el archivo de preferencias
                            SharedPreferences prefs =
                                    getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);

                            //Editamos los campos existentes
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putString("email", txtEmail.getText().toString());
                            editor.putString("password", txtPassword.getText().toString());
                            //Concretamos la edicion
                            editor.commit();

                            Intent menu = new Intent(context, MenuPrincipal.class);
                            startActivity(menu);
                        }
                    });
                    dialogo=builder.create();
                    dialogo.getWindow().getAttributes().windowAnimations=R.style.transicion;
                    dialogo.show();
                    dialogo.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public void onCancel(DialogInterface dialog) {

                        }
                    });



                }else{
                    AlertDialog dialogo;
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Login Fallido");
                    builder.setMessage("Ingreso mal el Email o el Password");


                    dialogo=builder.create();
                    dialogo.getWindow().getAttributes().windowAnimations=R.style.transicion;
                    dialogo.show();
                    dialogo.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public void onCancel(DialogInterface dialog) {

                        }
                    });



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
