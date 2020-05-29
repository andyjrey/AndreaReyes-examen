package com.uisrael.andreareyes_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {
    TextView twu;
    EditText resp1;
    CheckBox chbx1, chbx2, chbx3;
    RadioButton rb1, rb2;
    Bundle usua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        twu=findViewById(R.id.twusuario);
        resp1=findViewById(R.id.etR1);
        chbx1=findViewById(R.id.cBox1);
        chbx2=findViewById(R.id.cBox2);
        chbx3=findViewById(R.id.cBox3);
        rb1=findViewById(R.id.rbSi);
        rb2=findViewById(R.id.rbNo);
        usua=getIntent().getExtras();
        String red1=usua.getString("dato");
        twu.setText(red1);
    }
    public void pasar_datos(View v){
        Intent intResumen = new Intent(Encuesta.this, Resumen.class);
        intResumen.putExtra("datoen", twu.getText().toString());
        intResumen.putExtra("datorp1", resp1.getText().toString());
        if (chbx1.isChecked()== true){
            intResumen.putExtra("datorp2", chbx1.getText().toString());
        }
        else {
            if (chbx2.isChecked()== true){
                intResumen.putExtra("datorp2", chbx2.getText().toString());
            }
            else {
                intResumen.putExtra("datorp2", chbx3.getText().toString());
            }
        }
        if (rb1.isChecked()==true){
            intResumen.putExtra("datorp3", rb1.getText().toString());
        }
        else{
            intResumen.putExtra("datorp3",rb2.getText().toString());
        }

        startActivity(intResumen);
    }

}
