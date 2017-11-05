package com.crypto.currency.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.crypto.currency.MainActivityFragment;
import com.crypto.currency.R;

import java.util.List;

/**
 * Created by francis on 27/10/2017.
 */

public class CoinAdapter extends RecyclerView.Adapter<CoinAdapter.ViewHolder> {
    private Context mContext;
    private List<MainActivityFragment.CoinClasses.CoinObject> coinList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coin, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CoinAdapter.ViewHolder holder, int position) {

        MainActivityFragment.CoinClasses.CoinObject coin = coinList.get(position);
        holder.id.setText(coin.CoinName);
        holder.name.setText(coin.Url);
        holder.url.setText(coin.Name);

    }

    public CoinAdapter(Context mContext, List<MainActivityFragment.CoinClasses.CoinObject> coinList) {
        this.mContext = mContext;
        this.coinList = coinList;
    }

    @Override
    public int getItemCount() {
        return coinList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, id, url;
        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.tvName);
            id = (TextView) itemView.findViewById(R.id.tvId);
            url = (TextView) itemView.findViewById(R.id.tvUrl);

        }
    }
}
