package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.DOANAPP.Interface.MyBtnVoucherClick;
import com.example.DOANAPP.R;

import java.util.ArrayList;

import com.example.DOANAPP.Voucher;
import com.example.DOANAPP.models.Vouchers;

public class voucher_adapter extends BaseAdapter
{
    Context context;
    int item_layout;
    ArrayList<Vouchers> vouchers;

    public voucher_adapter(Context context, int item_layout, ArrayList<Vouchers> vouchers) {
        this.context = context;
        this.item_layout = item_layout;
        this.vouchers = vouchers;
    }

    @Override
    public int getCount() {
        return vouchers.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            holder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(item_layout,null);
            holder.imvThumb = view.findViewById(R.id.imv_logovoucher);
            holder.txtTitle = view.findViewById(R.id.txt_titlevoucher);
            holder.txtValid= view.findViewById(R.id.txt_validvoucher);
            holder.btnVoucher = view.findViewById(R.id.btn_usevoucher);
            view.setTag(holder);
        } else {holder = (ViewHolder) view.getTag();}
        Vouchers voucher = vouchers.get(i);
        holder.imvThumb.setImageResource(voucher.getImvThumb());
        holder.txtTitle.setText(voucher.getTxtTitle());
        holder.txtValid.setText(voucher.getTxtValid());
        holder.btnVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (context instanceof MyBtnVoucherClick)
                {
                    ((MyBtnVoucherClick) context).btnclick(voucher);
                }
                else
                {
                    Voucher voucher1 = (Voucher) view.getContext();
                    voucher1.btngetvoucher(holder.btnVoucher);
                }

            }
        });


        return view;
    }
    public class ViewHolder{
        ImageView imvThumb;
        TextView txtTitle,txtValid;
        Button btnVoucher;
    }
}
