package com.crypto.currency.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crypto.currency.PriceFragment;
import com.crypto.currency.R;
import com.crypto.currency.activity.CurrencyDetailActivity;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

/**
 * Created by tonyk on 10/30/2017.
 */

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.ViewHolder> {
    private Context mContext;
    private List<PriceFragment.PriceClasses.PriceObject> ethList;
    private List<PriceFragment.PriceClasses.PriceObject> btcList;

    @Override
    public PriceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_price, parent, false);

        return new PriceAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PriceAdapter.ViewHolder holder, final int position) {

        PriceFragment.PriceClasses.PriceObject eth = ethList.get(position);
        final PriceFragment.PriceClasses.PriceObject btc = btcList.get(position);

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        format.setCurrency(Currency.getInstance(eth.TOSYMBOL));
        format.setMinimumFractionDigits(2);
        String result1 = format.format(Double.parseDouble(btc.PRICE.toString()));
        String result2 = format.format(Double.parseDouble(eth.PRICE.toString()));
        holder.btcName.setText(eth.TOSYMBOL);
        holder.btcPrice.setText(result1);
        holder.ethPrice.setText(result2);


        final String btcPriceKey = btcList.get(position).PRICE.toString();
        final String ethPriceKey = ethList.get(position).PRICE.toString();
        final String btcSymbolKey = btcList.get(position).TOSYMBOL.toString();
        final String ethSymbolKey = ethList.get(position).TOSYMBOL.toString();


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title =btcList.get(position).MARKET;
                //Toast.makeText(mContext, title, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, CurrencyDetailActivity.class);
                intent.putExtra(String.valueOf(CurrencyDetailActivity.EXTRA_BTC_PRICE_KEY), btcPriceKey);
                intent.putExtra(String.valueOf(CurrencyDetailActivity.EXTRA_ETH_PRICE_KEY), ethPriceKey);
                intent.putExtra(String.valueOf(CurrencyDetailActivity.EXTRA_BTC_SYMBOL_KEY), btcSymbolKey);
                intent.putExtra(String.valueOf(CurrencyDetailActivity.EXTRA_ETH_SYMBOL_KEY), ethSymbolKey);
                mContext.startActivity(intent);
            }
        });

    }

    public PriceAdapter(Context mContext, List<PriceFragment.PriceClasses.PriceObject> priceList, List<PriceFragment.PriceClasses.PriceObject> btcList) {
        this.mContext = mContext;
        this.ethList = priceList;
        this.btcList = btcList;
    }

    @Override
    public int getItemCount() {
        return ethList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView btcName, btcPrice,ethPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            btcName = (TextView) itemView.findViewById(R.id.tvName);
            ethPrice = (TextView) itemView.findViewById(R.id.tvETH);
            btcPrice = (TextView) itemView.findViewById(R.id.tvBTC);


        }
    }
}
