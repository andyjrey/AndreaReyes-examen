package com.uisrael.andreareyes_examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {
    String tpag;
    TextView twru, twnom, twtpa,twr1, twr2, twr3;
    Bundle usuariol, nombresol,pagi,pagmen,resp1,resp2,resp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        twru=findViewById(R.id.twu);
        twnom=findViewById(R.id.twnomsol);
        twtpa=findViewById(R.id.twtp);
        twr1=findViewById(R.id.twR1);
        twr2=findViewById(R.id.twR2);
        twr3=findViewById(R.id.twR3);
        usuariol=getIntent().getExtras();
        nombresol=getIntent().getExtras();
        pagi=getIntent().getExtras();
        pagmen=getIntent().getExtras();
        resp1=getIntent().getExtras();
        resp2=getIntent().getExtras();
        resp3=getIntent().getExtras();
        String usu=usuariol.getString("datoen");
        String sol=nombresol.getString("datosol");
        String pi=pagi.getString("datopini");
        String pmen=pagmen.getString("datopmen");
        String r1=resp1.getString("datorp1");
        String r2=resp2.getString("datorp2");
        String r3=resp3.getString("datorp3");
        tpag=pi+pmen;
        twru.setText(usu);
        twnom.setText(sol);
        twtpa.setText(tpag);
        twr1.setText(r1);
        twr2.setText(r2);
        twr3.setText(r3);






    }
}
