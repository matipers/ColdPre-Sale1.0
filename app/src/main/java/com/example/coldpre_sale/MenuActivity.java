package com.example.coldpre_sale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    Button Empleados;
    Button CrearEmpleados;
    Button Inventario;
    Button CerrarSesion;
    ImageView Empleado;
    ImageView Logo;
    TextView TextviewHead;

Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        siguiente =(Button)findViewById(R.id.botonCrearEmpleado);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuActivity.this,CrearEmpleadoActivity.class);
                startActivity(i);
            }
        });
    }
}