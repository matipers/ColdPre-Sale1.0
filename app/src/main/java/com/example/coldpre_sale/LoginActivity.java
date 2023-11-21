package com.example.coldpre_sale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ktx.Firebase;

public class LoginActivity extends AppCompatActivity {
    TextView siguiente;
    TextView registrateAqui;
    EditText correoLogin;
    EditText contrasenaLogin;
    Button botonLogin;
     FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        siguiente =(TextView) findViewById(R.id.textregistro);
        correoLogin = findViewById(R.id.correo);
        contrasenaLogin = findViewById(R.id.contraseña);
        botonLogin = findViewById(R.id.botoningresar);
        registrateAqui = findViewById(R.id.textregistro);


        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String emailUsuario = correoLogin.getText().toString().trim();
              String contrasenaUsuario= contrasenaLogin.getText().toString().trim();

              if (emailUsuario.isEmpty() && contrasenaUsuario.isEmpty()){
                  Toast.makeText(LoginActivity.this,"Ingrese todos los datos",Toast.LENGTH_SHORT).show();
              }else{
                  loginUser(emailUsuario,contrasenaUsuario);
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



    }

    private void loginUser(String emailUsuario, String contraseñaUsuario) {
        mAuth.signInWithEmailAndPassword(emailUsuario, contraseñaUsuario).addOnCompleteListener
                (new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            finish();
                            startActivity(new Intent(LoginActivity.this,MenuActivity.class));
                            Toast.makeText(LoginActivity.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(LoginActivity.this,"ERROR",Toast.LENGTH_SHORT).show();
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(LoginActivity.this,"ERROR AL INICIAR SESIÓN", Toast.LENGTH_SHORT).show();
            }
        });
    }
}