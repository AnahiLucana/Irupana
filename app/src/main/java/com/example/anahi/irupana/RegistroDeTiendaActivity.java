package com.example.anahi.irupana;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ing. Rafael Serate on 04/03/17.
 */

public class RegistroDeTiendaActivity  extends AppCompatActivity{
    private Button btnCrearCuentaComoTienda;
    private Context context;

    private EditText txtTNombre;

    private EditText txtTEmail;
    private EditText txtTPassword;
    private EditText txtTRepetirPassword;
    private EditText txtTNit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_tienda);
        context=this;
        btnCrearCuentaComoTienda=(Button)findViewById(R.id.btnCrearCuentaComoTienda);

        txtTNombre=(EditText)findViewById(R.id.txtTNombre) ;
        txtTEmail=(EditText)findViewById(R.id.txtTEmail) ;
        txtTPassword=(EditText)findViewById(R.id.txtTPassword);
        txtTRepetirPassword=(EditText)findViewById(R.id.txtTRepetirPassword);
        txtTNit=(EditText)findViewById(R.id.txtTNit);


        btnCrearCuentaComoTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String campo_nombre = txtTNombre.getText().toString();
                String campo_email = txtTEmail.getText().toString();
                String campo_password = txtTPassword.getText().toString();
                String campo_repetir_password = txtTRepetirPassword.getText().toString();
                String campo_nit = txtTNit.getText().toString();

                if (campo_nombre.compareTo("irupana") == 0 && campo_password.compareTo("irupana") == 0
                        && campo_email.compareTo("irupana")==0&& campo_nit.compareTo("00000")==0&&campo_repetir_password.compareTo("irupana")==0) {
                    Intent a=new Intent(context,MenuPrincipal.class);
                    startActivity(a);
                }
            }
        });




    }
}
