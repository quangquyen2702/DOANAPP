package com.example.DOANAPP;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.DOANAPP.databinding.ActivityEditaccountBinding;

public class editaccount extends AppCompatActivity {
    ActivityEditaccountBinding binding;
    ActivityResultLauncher<Intent> launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_editaccount);
        binding = ActivityEditaccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK && result.getData()!= null)
            {
                Bitmap bitmap = (Bitmap) result.getData().getExtras().get("data");
                binding.imvUserpic.setImageBitmap(bitmap);
            }
        });
        addEvent();

    }

    private void addEvent() {
        binding.btnEdit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                launcher.launch(intent);
            }
        });
        binding.btnChangeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(editaccount.this,address.class);
                startActivity(intent);
            }
        });
        binding.btnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(editaccount.this,changepassword.class);
                startActivity(intent);
            }
        });
        binding.btnBackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                 finish();
            }
        });
    }
}