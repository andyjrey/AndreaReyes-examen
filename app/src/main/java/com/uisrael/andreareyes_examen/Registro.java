package com.uisrael.andreareyes_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
TextView namere;
EditText nombre, pagoini, pagomensu;
Bundle usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        namere=findViewById(R.id.twnamer);
        nombre=findViewById(R.id.etSol);
        pagoini=findViewById(R.id.etPini);
        pagomensu=findViewById(R.id.etPmensual);
        usuario=getIntent().getExtras();
        String redat=usuario.getString("datoenviado");
        namere.setText(redat);

    }
    public void calcular ( View v){
        double pin,pmen, res;
        pin=Double.parseDouble(pagoini.getText().toString());
        res=((1800-pin)/3)*0.05;
        pmen=((1800-pin)/3)+res;
        pagomensu.setText(Double.toString(pmen));

    }

    public void Guardar( View v){
        Intent intenvio = new Intent(Registro.this, Encuesta.class);
        intenvio.putExtra("dato", namere.getText().toString());
        Intent int2 = new Intent(Registro.this, Resumen.class);
        int2.putExtra("datosol", nombre.getText().toString());
        int2.putExtra("datopini", pagoini.getText().toString());
        int2.putExtra("datopmen", pagomensu.getText().toString());
        startActivity(intenvio);
        Toast.makeText(getApplicationContext(), "Elemento Guardado Con Exito ", Toast.LENGTH_LONG).show();
    }
}
