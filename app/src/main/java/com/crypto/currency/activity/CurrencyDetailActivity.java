package com.crypto.currency.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crypto.currency.PriceFragment;
import com.crypto.currency.R;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class CurrencyDetailActivity extends AppCompatActivity {


    public static final String EXTRA_BTC_PRICE_KEY = "btcPriceKey";
    public static final String EXTRA_ETH_PRICE_KEY = "ethPriceKey";
    public static final String EXTRA_BTC_SYMBOL_KEY = "btcSymbolKey";
    public static final String EXTRA_ETH_SYMBOL_KEY = "ethSymbolKey";
    private String mEthKey,sEthKey;
    private String mBtcKey;
    private TextView btc,eth,amountCurrency,amountSymbol;
    private double base2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Crypto Compare");

         btc = (TextView) findViewById(R.id.btcPrice);
         eth = (TextView) findViewById(R.id.ethPrice);
        amountCurrency = (TextView) findViewById(R.id.amountCurrency);
        amountSymbol = (TextView) findViewById(R.id.amountSymbol);
        Button convert = (Button) findViewById(R.id.convert);


        // Get post key from intent
        mBtcKey = getIntent().getStringExtra(EXTRA_BTC_PRICE_KEY);
        if (mBtcKey == null) {
            throw new IllegalArgumentException("Must pass BTC_PRICE_KEY");
        }
        mEthKey = getIntent().getStringExtra(EXTRA_ETH_PRICE_KEY);
        if (mEthKey == null) {
            throw new IllegalArgumentException("Must pass ETH_PRICE_KEY");
        }
        sEthKey = getIntent().getStringExtra(EXTRA_ETH_SYMBOL_KEY);
        if (sEthKey == null) {
            throw new IllegalArgumentException("Must pass ETH_PRICE_KEY");
        }
        amountSymbol.setText(sEthKey);

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
        format.setCurrency(Currency.getInstance(sEthKey));
        format.setMinimumFractionDigits(2);
        String result1 = format.format(Double.parseDouble(mBtcKey));
        String result2 = format.format(Double.parseDouble(mEthKey));
        btc.setText(result1);
        eth.setText(result2);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                base2 = Double.parseDouble(amountCurrency.getText().toString());

                Double btc0 = Double.parseDouble(mBtcKey);
                Double btc1 =  base2/btc0;

                Double eth0 = Double.parseDouble(mEthKey);
                Double eth1 =  base2/eth0;

                NumberFormat format = NumberFormat.getCurrencyInstance(Locale.getDefault());
                format.setCurrency(Currency.getInstance(sEthKey));
                format.setMinimumFractionDigits(4);
                String result1 = format.format(Double.parseDouble(String.valueOf(btc1)));
                String result2 = format.format(Double.parseDouble(String.valueOf(eth1)));
                btc.setText(result1);
                eth.setText(result2);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



}
