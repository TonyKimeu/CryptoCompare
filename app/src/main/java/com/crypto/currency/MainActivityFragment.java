package com.crypto.currency;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.crypto.currency.adapter.CoinAdapter;
import com.crypto.currency.app.AppController;
import com.crypto.currency.model.Coin;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private String TAG = MainActivityFragment.class.getSimpleName();
    // This tag will be used to cancel the request
    private String tag_string_req = "string_req";

    private RecyclerView rvCoinList;
    private CoinAdapter coinAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        rvCoinList = rootView.findViewById(R.id.rvCoinList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvCoinList.setLayoutManager(mLayoutManager);
        rvCoinList.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        rvCoinList.setItemAnimator(new DefaultItemAnimator());

        //makeStringReq();
        new CoinClasses().getCoinList();

        return rootView;
    }

    /**
     * Making json object request
     * */
    private void makeStringReq() {
        final String apiUrl = "https://www.cryptocompare.com/api/data/coinlist/";

        StringRequest strReq = new StringRequest(Request.Method.GET,
                apiUrl, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, response.toString());
                //msgResponse.setText(response.toString());
                //hideProgressDialog();

                Type avRs = new TypeToken<List<Coin>>() {}.getType();
                List<Coin> myCoins = new Gson().fromJson(response, avRs);

                //coinAdapter = new CoinAdapter(getContext(),myCoins);
                //rvCoinList.setAdapter(coinAdapter);

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                //hideProgressDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);

    }

    public class CoinClasses {
         public class CoinObject {
            public String Url;
            public String ImageUrl;
            public String Name;
            public String CoinName;
            public String FullName;
            public String Algorithm;
            public String ProofType;
            public String SortOrder;
        }

         public void getCoinList(){
            final String apiURL = "https://www.cryptocompare.com/api/data/coinlist/"; //Url for the request

            StringRequest getCoinRequest = new StringRequest(apiURL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.e("Coin List", response);

                    //Json Converter Classes
                    JsonElement jelement = new JsonParser().parse(response);
                    JsonObject jobject = jelement.getAsJsonObject();
                    JsonObject anObject = jobject.getAsJsonObject("Data");

                    Map<String, CoinObject> map = new Gson().fromJson(anObject.toString(), new TypeToken<Map<String, CoinObject>>(){}.getType());

                    Collection<CoinObject> values = map.values(); //Converting the map to a collection to convert to list
                    List<CoinObject> coins = new ArrayList<>(values); //This is a list of the coins


                    int numCoins = coins.size();
                    Log.e("Coins", Integer.toString(numCoins));

                    //Can set the list to an adapter:
                    //CoinAdapter adapter = new CoinAdapter(coins); //List of the coins to the adapter
                    coinAdapter = new CoinAdapter(getContext(),coins);
                    rvCoinList.setAdapter(coinAdapter);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });

            AppController.getInstance().addToRequestQueue(getCoinRequest);
        }
    }
}

