package com.example.DOANAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class forgot_pwd extends AppCompatActivity {

    EditText edtEmailorPhone;
    Button btnResetPwd;
    TextView txtBackto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pwd);

        LinkViews();
        AddEvents();
    }
    private void LinkViews() {
        edtEmailorPhone = findViewById(R.id.edt_emailorphone);
        btnResetPwd = findViewById(R.id.btn_resetPwd);
        txtBackto = findViewById(R.id.txt_BackTo);
    }
    private void AddEvents() {
        btnResetPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtEmailorPhone.getText().length() == 0)
                    Toast.makeText(forgot_pwd.this, "You must fill in all the information to signing up!", Toast.LENGTH_SHORT).show();
                else startActivity(new Intent(forgot_pwd.this,confirm_OPT.class));
            }
        });
        txtBackto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }


}