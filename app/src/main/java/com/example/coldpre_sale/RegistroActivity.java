package com.example.coldpre_sale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {
    ImageView imagencarro;
    EditText Registro;
    TextView Nombres;
    TextView Apellidos;
    TextView DNI;
    TextView CorreoElectronico;
    TextView Contraseña;
    TextView RepetirContraseña;
    Button BotonCraer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
      BotonCrear.setOnClickListener(new View.OnClickListener() {
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
}