package com.example.DOANAPP;

import android.os.Bundle;
import android.view.View;

import com.example.DOANAPP.adapter.purchase_adapter;
import androidx.appcompat.app.AppCompatActivity;

import com.example.DOANAPP.databinding.ActivityMypurchaseBinding;
import com.example.DOANAPP.models.Mypurchase;

import java.util.ArrayList;

public class mypurchase extends AppCompatActivity {
    ActivityMypurchaseBinding binding;
    purchase_adapter adapter;
    ArrayList<Mypurchase> puchaselist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mypurchase);
        binding = ActivityMypurchaseBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        addEvent();
    }

    private void addEvent()
    {
        binding.btnBackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void loadData()
    {
        puchaselist = new ArrayList<>();
        puchaselist.add(new Mypurchase(R.drawable.logonike_voucher,"Sneaker1","To pay","Pay now"));
        puchaselist.add(new Mypurchase(R.drawable.logoconverse,"Sneaker2","To ship","Contact"));
        puchaselist.add(new Mypurchase(R.drawable.logoconverse,"Sneaker3","Complete","Rate"));
        adapter =new purchase_adapter(mypurchase.this,R.layout.item_mypurchase_list,puchaselist);
        binding.lvPurchase.setAdapter(adapter);
    }
}