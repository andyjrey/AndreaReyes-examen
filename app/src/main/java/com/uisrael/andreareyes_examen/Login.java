package com.uisrael.andreareyes_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usr, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usr=findViewById(R.id.etname);
        pass=findViewById(R.id.etpass);
    }
    public void enviar_usr(View v) {
        String usu=usr.getText().toString();
        String pwd=pass.getText().toString();

        if (usu.equals( "estudiante2020") && pwd.equals("uisrael2020")) {
            Intent intenvio = new Intent(Login.this, Registro.class);
            intenvio.putExtra("datoenviado", usr.getText().toString());
            startActivity(intenvio);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario y Password Incorrectos", Toast.LENGTH_LONG).show();
        }
    }
}
