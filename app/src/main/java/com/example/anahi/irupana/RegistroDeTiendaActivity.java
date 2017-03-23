package com.example.anahi.irupana;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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


 public class RegistroDeTiendaActivity  extends AppCompatActivity {
     private Button btnCrearCuentaComoTienda;
     private Context context;

     private EditText txtTNombre;

     private EditText txtTEmail;
     private EditText txtTPassword;
     private EditText txtTRepetirPassword;
     private EditText txtTNit;
     private Button DialogAnimado;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_registro_de_tienda);
         context = this;
         btnCrearCuentaComoTienda = (Button) findViewById(R.id.btnCrearCuentaComoTienda);

         txtTNombre = (EditText) findViewById(R.id.txtTNombre);
         txtTEmail = (EditText) findViewById(R.id.txtTEmail);
         txtTPassword = (EditText) findViewById(R.id.txtTPassword);
         txtTRepetirPassword = (EditText) findViewById(R.id.txtTRepetirPassword);
         txtTNit = (EditText) findViewById(R.id.txtTNit);
         DialogAnimado = (Button) findViewById(R.id.btnCrearCuentaComoTienda);


         btnCrearCuentaComoTienda.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String campo_nombre = txtTNombre.getText().toString();
                 String campo_email = txtTEmail.getText().toString();
                 String campo_password = txtTPassword.getText().toString();
                 String campo_repetir_password = txtTRepetirPassword.getText().toString();
                 String campo_nit = txtTNit.getText().toString();

                 //TODO validaciones
                 //TODO agregar en base de datos
                 //TODO que no sea un solo usuario


                guardarEnDb(campo_nombre,campo_password,campo_email,campo_nit);

                AlertDialog dialogo;
                AlertDialog.Builder builder = new AlertDialog.Builder(RegistroDeTiendaActivity.this);

                builder.setTitle(campo_nombre);
                builder.setMessage("Tu registro se realizo exitosamente");
                dialogo = builder.create();
                dialogo.getWindow().getAttributes().windowAnimations = R.style.transicion;
                dialogo.show();
                dialogo.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialog) {
                        dialog.dismiss();
                    }
                });




               /* if (campo_password.compareTo("irupana") == 0 && campo_email.compareTo("irupana@gmail.com")==0&&
                        campo_nit.compareTo("00000")==0&&campo_repetir_password.compareTo("irupana")==0) {
                    AlertDialog dialogo;
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegistroDeTiendaActivity.this);

                    builder.setTitle(campo_nombre);
                    builder.setMessage("Tu registro se realizo exitosamente");
                    dialogo = builder.create();
                    dialogo.getWindow().getAttributes().windowAnimations = R.style.transicion;
                    dialogo.show();
                    dialogo.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialog) {
                            dialog.dismiss();
                        }
                    });
                    Intent a = new Intent(context, MenuPrincipal.class);
                    startActivity(a);
                }*/
             }


         });
     }


     private void guardarEnDb(String nombre, String password, String email, String nit) {
         ContentValues values = new ContentValues();
         values.put("nombre", nombre);
         values.put("password", password);
         values.put("email", email);
         values.put("nit", nit);

         Base_datos baseDatos = new Base_datos(context, 1);
         SQLiteDatabase db = baseDatos.getWritableDatabase();
         db.insert("usuarios", null, values);
     }

 }