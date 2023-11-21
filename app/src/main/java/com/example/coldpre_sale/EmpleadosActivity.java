package com.example.coldpre_sale;

import static com.example.coldpre_sale.R.id.botonCrearEmpleado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmpleadosActivity extends AppCompatActivity {
     Button Buscar;
     Button VerInformacion;
     Button CrearEmpleado;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empleados);
         Button siguiente = (Button) findViewById(R.id.botonverinformacion);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(EmpleadosActivity.this,SelectEmpleadoActivity.class);
                startActivity(i);
            }
        });
          siguiente = (Button) findViewById(R.id.botoncrearempleado);
         siguiente.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent i = new Intent(EmpleadosActivity.this,CrearEmpleadoActivity.class);
                 startActivity(i);
             }
         });
    }

}