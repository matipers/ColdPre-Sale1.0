package com.example.coldpre_sale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MenuActivity extends AppCompatActivity {

    Button Empleados;
    Button CrearEmpleados;
    Button Inventario;
    Button CerrarSesion;
    ImageView Empleado;
    ImageView Logo;
    TextView TextviewHead;
    FirebaseAuth mAuth;

Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        siguiente =(Button)findViewById(R.id.botonCrearEmpleado);

        mAuth =FirebaseAuth.getInstance();


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuActivity.this,CrearEmpleadoActivity.class);
                startActivity(i);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuActivity.this,CrearEmpleadoActivity.class);
                startActivity(i);
            }
        });
        siguiente =(Button)findViewById(R.id.botonEmpleados);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuActivity.this,EmpleadosActivity.class);
                startActivity(i);
            }
        });
        siguiente =(Button)findViewById(R.id.botonInventario);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuActivity.this,InventarioActivity.class);
                startActivity(i);
            }
        });
    }

    public void cerrarAplicacion(View view) {
        mAuth.signOut();
        finish();
        startActivity(new Intent(MenuActivity.this,LoginActivity.class));
    }

}