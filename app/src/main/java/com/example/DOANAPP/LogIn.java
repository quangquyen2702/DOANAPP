package com.example.DOANAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    EditText edtEmail, edtPassword;
    TextView tvFogotPassword;
    Button btnLogIn, btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Linkviews();
        AddEvents();
    }
    private void Linkviews() {
        edtEmail = findViewById(R.id.edt_emailorphone);
        edtPassword = findViewById(R.id.edt_password);
        tvFogotPassword = findViewById(R.id.tv_ForgotPassword);
        btnSignUp = findViewById(R.id.btn_signup);
        btnLogIn = findViewById(R.id.btn_login);
    }

    private void AddEvents() {
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtEmail.getText().length() == 0)
                Toast.makeText(LogIn.this, "You must fill in all the information to signing up!", Toast.LENGTH_SHORT).show();
                else startActivity(new Intent(LogIn.this, MainActivity.class));
            }
        });

        tvFogotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogIn.this, forgot_pwd.class));
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogIn.this, SignUp.class));
            }
        });
    }


}