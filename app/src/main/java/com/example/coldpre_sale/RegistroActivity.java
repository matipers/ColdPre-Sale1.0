package com.example.coldpre_sale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistroActivity extends AppCompatActivity {
    ImageView imagencarro;
    EditText Registro;
    TextView Nombres;
    TextView Apellidos;
    TextView DNI;
    TextView CorreoElectronico;
    TextView Contraseña;
    Button BotonCrearRegistro;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Nombres=findViewById(R.id.editnombres);
        Apellidos=findViewById(R.id.editapellidos);
        DNI=findViewById(R.id.editdni);
        CorreoElectronico=findViewById(R.id.editcorreo);
        Contraseña=findViewById(R.id.editcontraseña);
        BotonCrearRegistro=findViewById(R.id.botonCrearregistro);

        mAuth = FirebaseAuth.getInstance();

        BotonCrearRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarUsuario();
            }
        });
    }

    private void registrarUsuario() {
        String email = CorreoElectronico.getText().toString().trim();
        String password = Contraseña.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegistroActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(RegistroActivity.this, "Error al registrar", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

}