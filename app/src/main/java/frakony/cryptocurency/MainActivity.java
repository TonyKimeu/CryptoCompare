package frakony.cryptocurency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import frakony.cryptocurency.Adapter.CurrencyAdapter;
import frakony.cryptocurency.Model.BTC;
import frakony.cryptocurency.Model.ETH;
import frakony.cryptocurency.Model.Price;
import frakony.cryptocurency.Rest.ApiClient;
import frakony.cryptocurency.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    //list of Currency Symbols
    private final static String CURRENCY_LIST = "EUR,NGN,KES,GBP,JPY,CHF,CAD,AUD,HKD,INR,CNY,EGP,ILS,RUB,ZAR,ARS,BRL,SEK,SAR,QAR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (CURRENCY_LIST.isEmpty()) {
            Toast.makeText(getApplicationContext(), "No currency input", Toast.LENGTH_LONG).show();
            return;
        }

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.priceRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Price> call = apiService.getLatestPrice(CURRENCY_LIST);
        call.enqueue(new Callback<Price>() {
            @Override
            public void onResponse(Call<Price>call, Response<Price> response) {
                List<BTC> btc = response.body();

                List<ETH> eth = response.body().getETH();
                recyclerView.setAdapter(new CurrencyAdapter(btc,eth, R.layout.lis_item_currencies, getApplicationContext()));
                Toast.makeText(MainActivity.this, btc.get, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Price>call, Throwable t) {
                // Log error here since request failed
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
                Log.e(TAG, t.toString());
            }
        });
    }
}
