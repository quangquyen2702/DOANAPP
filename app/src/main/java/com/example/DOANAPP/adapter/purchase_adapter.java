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
import com.example.DOANAPP.models.Mypurchase;

import java.util.List;

public class purchase_adapter extends BaseAdapter
{
    Activity activity;
    int item_layout;
    List<Mypurchase> mypurchases;

    public purchase_adapter(Activity activity, int item_layout, List<Mypurchase> mypurchases) {
        this.activity = activity;
        this.item_layout = item_layout;
        this.mypurchases = mypurchases;
    }

    @Override
    public int getCount() {
        return mypurchases.size();
    }

    @Override
    public Object getItem(int i) {
        return mypurchases.get(i);
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
            holder.imvThumb=view.findViewById(R.id.imv_picpurchase);
            holder.txtName = view.findViewById(R.id.txt_nameProduct);
            holder.txtStatus = view.findViewById(R.id.txt_status);
            holder.txtNameButton = view.findViewById(R.id.btn_contact);
            view.setTag(holder);

        } else
        {
            holder = (ViewHolder) view.getTag();
        }

        //Binding data
        Mypurchase b  = mypurchases.get(i);
        holder.imvThumb.setImageResource(b.getPurchaseThumb());
        holder.txtName.setText(b.getPurchaseName());
        holder.txtStatus.setText(String.valueOf(b.getPurchaseStatus()));
        holder.txtNameButton.setText(String.valueOf(b.getButtonName()));

        return view;
    }
    public static class ViewHolder
    {
        ImageView imvThumb;
        TextView txtName,txtStatus,txtNameButton;

    }
}
