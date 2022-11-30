package com.example.DOANAPP;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.DOANAPP.Interface.MyBtnVoucherClick;
import com.example.DOANAPP.adapter.checkout_adapter;
import com.example.DOANAPP.adapter.voucher_adapter;
import com.example.DOANAPP.databinding.ActivityCheckoutBinding;
import com.example.DOANAPP.models.Product;
import com.example.DOANAPP.models.Vouchers;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class checkout extends AppCompatActivity implements MyBtnVoucherClick
{
    ActivityCheckoutBinding binding;
    checkout_adapter adapter;
    ArrayList<Product> products;
    BottomSheetDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_checkout);
        binding = ActivityCheckoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        addEvent();
    }

    private void addEvent()
    {
        binding.btnEditAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(checkout.this,address.class);
                startActivity(intent);

            }
        });
        binding.txtRedeem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dialog = new BottomSheetDialog(checkout.this);
                dialog.setContentView(R.layout.layout_popup_myvoucher);
                ListView lvVoucher = dialog.findViewById(R.id.lvMyvoucherPopUp);
                voucher_adapter adapter;
                ArrayList<Vouchers> vouchers;
                vouchers = new ArrayList<>();
                vouchers.add(new Vouchers(R.drawable.logoconverse,"CONVERSE","BUY 1 GET 1"));
                vouchers.add(new Vouchers(R.drawable.logobalenciaga,"BALENCIAGA","Sale off 10%"));
                vouchers.add(new Vouchers(R.drawable.logonike_voucher,"NIKE","Sale off 10% "));
                adapter = new voucher_adapter(checkout.this,R.layout.item_voucher_list,vouchers);
                lvVoucher.setAdapter(adapter);
                dialog.show();
            }
        });
        binding.txtEditDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {Dialog dialogDelivery = new Dialog(checkout.this);
                dialogDelivery.setContentView(R.layout.layout_popup_delivery);
                dialogDelivery.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                LinearLayout llStandard, llFast, ll24h;
                llStandard = dialogDelivery.findViewById(R.id.llStandard);
                llFast = dialogDelivery.findViewById(R.id.llFast);
                ll24h = dialogDelivery.findViewById(R.id.ll24h);
                switchDeliveryMethod(ll24h, llStandard, llFast , dialogDelivery);
                dialogDelivery.show();
            }

        });

        binding.btnMomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkout.this,momomethod.class);
                startActivity(intent);
            }
        });
        binding.btnPaymentmethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkout.this,paymentmethod.class);
                startActivity(intent);
            }
        });

        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(checkout.this,mypurchase.class);
                startActivity(intent);
            }
        });

    }
    private void switchDeliveryMethod(LinearLayout ll24h, LinearLayout llStandard, LinearLayout llFast, Dialog dialogDelivery) {
        llStandard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtEditDelivery.setText("Standard Delivery");
                binding.txtPriceDelivery.setText("3$");
                binding.imvDelivery.setImageResource(R.drawable.standard_deli);
                dialogDelivery.cancel();
            }
        });

        llFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtPriceDelivery.setText("Fast Delivery");
                binding.txtPriceDelivery.setText("5$");
                binding.imvDelivery.setImageResource(R.drawable.fast_deli);
                dialogDelivery.cancel();
            }
        });

        ll24h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.txtEditDelivery.setText("24h Delivery");
                binding.txtPriceDelivery.setText("10$");
                binding.imvDelivery.setImageResource(R.drawable.deli_24h);
                dialogDelivery.cancel();
            }
        });
    }

    private void loadData()
    {
        products = new ArrayList<>();
        products.add(new Product(R.drawable.puma,"Puma","Shoes fashion","180000","2"));
        products.add(new Product(R.drawable.logoconverse,"Converse","Shoes fashion","190000","3"));
        adapter = new checkout_adapter(checkout.this,R.layout.item_checkout_list,products);
        binding.lvproductCheckout.setAdapter(adapter);
    }


    @Override
    public void btnclick(Vouchers voucher)
    {
        binding.txtRedeem.setText(voucher.getTxtTitle());
        dialog.dismiss();
    }


}