package com.example.DOANAPP.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.DOANAPP.R;
import com.example.DOANAPP.models.Product;

import java.util.List;

public class checkout_adapter extends BaseAdapter
{
    Activity activity;
    int item_layout;
    List<Product> products;

    public checkout_adapter(Activity activity, int item_layout, List<Product> products) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {

        ViewHolder holder;
        if (view == null)
        {
            //Link views
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(item_layout,null);
            holder.imvThumb=view.findViewById(R.id.imvThumb_checkout);
            holder.txtName = view.findViewById(R.id.txtName_checkout);
            holder.txtPrice = view.findViewById(R.id.txtPrice_checkout);
            holder.txtType= view.findViewById(R.id.txtType_checkout);
            holder.txtSl = view.findViewById(R.id.txtquantity);
            view.setTag(holder);

        } else
        {
            holder = (ViewHolder) view.getTag();
        }

        //Binding data
        Product b  = products.get(i);
        holder.imvThumb.setImageResource(b.getProductThumb());
        holder.txtName.setText(b.getProductname());
        holder.txtPrice.setText(String.valueOf(b.getProductPrice()));
        holder.txtType.setText(b.getProductType());
        holder.txtSl.setText(b.getProductSl());
        return view;
    }
    public static class ViewHolder
    {
        ImageView imvThumb;
        TextView txtName,txtPrice,txtType,txtSl;

    }
}
