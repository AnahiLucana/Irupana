package com.example.anahi.irupana;


import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegistroDeClienteActivity extends AppCompatActivity{

    private Button btnCrearCuentaComoCliente;
    private Context context;
    private EditText txtCNombre;
    private EditText txtCApellido;
    private EditText txtCEmail;
    private EditText txtCPassword;
    private EditText txtCRepetirPassword;
    private EditText txtCNit;
    private Button DialogAnimado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_cliente);
        context=this;
        btnCrearCuentaComoCliente=(Button)findViewById(R.id.btnCrearCuentaComoCliente);
        txtCNombre=(EditText)findViewById(R.id.txtCNombre) ;
        txtCApellido=(EditText)findViewById(R.id.txtCApellido) ;
        txtCEmail=(EditText)findViewById(R.id.txtCEmail) ;
        txtCPassword=(EditText)findViewById(R.id.txtCPassword);
        txtCRepetirPassword=(EditText)findViewById(R.id.txtCRepetirPassword);
        txtCNit=(EditText)findViewById(R.id.txtCNit);
        DialogAnimado=(Button)findViewById(R.id.btnCrearCuentaComoCliente);

        btnCrearCuentaComoCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String campo_nombre = txtCNombre.getText().toString();
                String campo_apellido = txtCApellido.getText().toString();
                String campo_email = txtCEmail.getText().toString();
                String campo_password = txtCPassword.getText().toString();
                String campo_repetir_password = txtCRepetirPassword.getText().toString();
                String campo_nit = txtCNit.getText().toString();

                guardarEnDb(campo_nombre,campo_apellido,campo_password,campo_email,campo_nit);

                AlertDialog dialogo;
                AlertDialog.Builder builder = new AlertDialog.Builder(RegistroDeClienteActivity.this);

                if (campo_nombre.isEmpty()&& campo_apellido.isEmpty()&& campo_nit.isEmpty() && campo_password.equals(campo_repetir_password)
                        &&campo_email.isEmpty()) {

                    builder.setMessage("El registro no se realizo correctamente");
                    dialogo=builder.create();
                    dialogo.getWindow().getAttributes().windowAnimations = R.style.transicion;
                    dialogo.show();

                }
                else{
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

                    }




            }

    private void guardarEnDb(String nombre, String apellido, String password, String email, String nit){
        ContentValues values=new ContentValues();
        values.put("nombre",nombre);
        values.put("apellido",apellido);
        values.put("password",password);
        values.put("email",email);
        values.put("nit",nit);

        Base_datos baseDatos=new Base_datos(context,1);
        SQLiteDatabase db=baseDatos.getWritableDatabase();
        db.insert("usuarios",null,values);
    }

}