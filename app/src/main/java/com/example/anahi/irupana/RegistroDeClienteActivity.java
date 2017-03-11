package com.example.anahi.irupana;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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

                if (campo_nombre.compareTo("irupana") == 0 && campo_password.compareTo("irupana") == 0 &&campo_apellido.compareTo("irupana")==0
                && campo_email.compareTo("irupana")==0&& campo_nit.compareTo("00000")==0&&campo_repetir_password.compareTo("irupana")==0) {
                    AlertDialog dialogo;
                    AlertDialog.Builder builder = new AlertDialog.Builder(RegistroDeClienteActivity.this);

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
        });


    }



}