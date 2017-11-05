package frakony.cryptocurency.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import frakony.cryptocurency.Model.BTC;
import frakony.cryptocurency.Model.ETH;
import frakony.cryptocurency.R;

/**
 * Created by tonyk on 10/29/2017.
 */

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> {

    private List<BTC> btc;
    private List<ETH> eth;
    private int rowLayout;
    private Context context;



    public static class CurrencyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView tvBTC;
        TextView tvETH;


        public CurrencyViewHolder(View v) {
            super(v);
            tvBTC = (TextView) v.findViewById(R.id.btc);
            tvETH = (TextView) v.findViewById(R.id.eth);
        }
    }

    public CurrencyAdapter(List<BTC> btc,List<ETH> eth, int rowLayout, Context context) {
        this.btc = btc;
        this.eth = eth;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public CurrencyAdapter.CurrencyViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new CurrencyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CurrencyViewHolder holder, final int position) {
        holder.tvBTC.setText(btc.get(position).getARS().toString());
        holder.tvETH.setText(eth.get(position).getARS().toString());

    }

    @Override
    public int getItemCount() {
        return btc.size();
    }
}