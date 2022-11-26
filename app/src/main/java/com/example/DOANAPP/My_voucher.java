package com.example.DOANAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import adapter.voucher_adapter;
import com.example.DOANAPP.models.Vouchers;

public class My_voucher extends AppCompatActivity implements com.example.DOANAPP.Interface.MyBtnVoucherClick {

    Button btnback;
    ListView lvVouchers;
    voucher_adapter adapter;
    ArrayList<Vouchers> vouchers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_voucher);
        linkViews();
        intData();
        loadData();
       addEvent();
    }

    private void addEvent() {
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void loadData() {
        adapter = new voucher_adapter(this, R.layout.item_voucher_list, vouchers);
        lvVouchers.setAdapter(adapter);
    }

    private void intData() {
        vouchers = new ArrayList<>();
        vouchers.add(new Vouchers(R.drawable.logonike_voucher, "CONVERSE", "BUY 1 GET 1"));
        vouchers.add(new Vouchers(R.drawable.logobalenciaga, "BALENCIAGA", "Sale off 10% for women items"));
        vouchers.add(new Vouchers(R.drawable.logoconverse, "NIKE", "Sale off 10% all products."));
    }

    private void linkViews() {
        lvVouchers = findViewById(R.id.lv_voucher);
        btnback = findViewById(R.id.btn_backhome);
    }

    @Override
    public void btnclick(Vouchers voucher) {
        Toast.makeText(this, "Use this voucher when making payment", Toast.LENGTH_SHORT).show();
    }
}
