package com.example.coldpre_sale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView siguiente;
    TextView registrateAqui;
    EditText correoLogin;
    EditText contraseñaLogin;
    Button botonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        siguiente =(TextView) findViewById(R.id.textregistro);

        correoLogin = findViewById(R.id.correo);
        contraseñaLogin = findViewById(R.id.contraseña);
        botonLogin = findViewById(R.id.botoningresar);
        registrateAqui = findViewById(R.id.textregistro);

        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String emailUsuario = correoLogin.getText().toString().trim();
              String contraseñaUsuario= contraseñaLogin.getText().toString().trim();

              if (emailUsuario.isEmpty() && contraseñaUsuario.isEmpty()){
                  Toast.makeText(LoginActivity.this,"Ingrese todos los datos",Toast.LENGTH_SHORT).show();
              }else{
                  loginUser(emailUsuario,contraseñaUsuario);
              }
            }
        });
 

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this,RegistroActivity.class);
                 startActivity(i);
            }
        });
        siguiente =(Button)findViewById(R.id.botoningresar);


        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this,MenuActivity.class);
                startActivity(i);
            }
        });
    }

    private void loginUser(String emailUsuario, String contraseñaUsuario) {
    }
}