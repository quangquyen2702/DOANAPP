package com.example.DOANAPP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.DOANAPP.databinding.ActivityCartBinding;
import com.example.DOANAPP.models.Productcart;
import com.example.DOANAPP.adapter.cart_adapter;

import java.util.ArrayList;

public class cart extends AppCompatActivity
{
    ActivityCartBinding binding;
    cart_adapter adapter;
    ArrayList<Productcart> productcarts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_cart);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        addEvent();

    }

    private void addEvent()
    {
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



    private void loadData()
    {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rcvListCart);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(cart.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Productcart> arrayList = new ArrayList<>();
        arrayList.add(new Productcart(R.drawable.puma,"puma"));
        arrayList.add(new Productcart(R.drawable.logoconverse,"converse"));
        cart_adapter cart_adapter= new cart_adapter(arrayList,getApplicationContext()) ;
        recyclerView.setAdapter(cart_adapter);
    }
}