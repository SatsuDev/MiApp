package com.example.miapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private CheckBox condicionalert;
    boolean ter = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        condicionalert = (CheckBox) findViewById(R.id.bterminos);
        condicionalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(RegisterActivity.this);
                alerta.setMessage("Todo texto, información, datos, gráficos, código fuente y código objeto, muestras de audio y video, marcas y logotipos y similares pertenecen al desarrollador de esta aplicación.")
                        .setCancelable(false)
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                ter = true;
                            }
                        })
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                condicionalert.toggle();
                            }
                        });
                AlertDialog titulo = alerta.create();
                titulo.setTitle("Términos y condiciones de uso");
                titulo.show();
            }
        });

    }
        public void Loginback (View view) {
        if (ter == true) {
            Intent loginback = new Intent(this, LoginActivity.class);
            startActivity(loginback);
            finish();
        }else
        {
            Toast.makeText(this,"Debe aceptar los términos y condiciones",Toast.LENGTH_LONG).show();
        }
    }



}
