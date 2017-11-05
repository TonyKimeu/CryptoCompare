package com.crypto.currency;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allattentionhere.fabulousfilter.AAH_FabulousFragment;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.crypto.currency.adapter.PriceAdapter;
import com.crypto.currency.app.AppController;
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import static com.crypto.currency.BottomFabFragment.joined;

/**
 * Created by tonyk on 10/30/2017.
 */

public class PriceFragment extends Fragment implements AAH_FabulousFragment.Callbacks{
    private String TAG = PriceFragment.class.getSimpleName();
    // This tag will be used to cancel the request
    private String tag_string_req = "string_req";

    private RecyclerView rvPriceList;
    private MultiSnapRecyclerView topRecyclerView;

    private PriceAdapter priceAdapter;
    BottomFabFragment dialogFrag;
    String apiURL;

    public PriceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_price, container, false);
        rvPriceList = rootView.findViewById(R.id.rvPriceList);

        final FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        dialogFrag = BottomFabFragment.newInstance();
        dialogFrag.setParentFab(fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogFrag.setCallbacks(PriceFragment.this);
                dialogFrag.show(getActivity().getSupportFragmentManager(), dialogFrag.getTag());
            }
        });

        topRecyclerView =(MultiSnapRecyclerView) rootView.findViewById(R.id.top_recycler_view);
        LinearLayoutManager secondManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        topRecyclerView.setLayoutManager(secondManager);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvPriceList.setLayoutManager(mLayoutManager);
        rvPriceList.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.HORIZONTAL));
        rvPriceList.setItemAnimator(new DefaultItemAnimator());

        Timer timer = new Timer();
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                // Update UI here if u need
            }
        };
        TimerTask task = new TimerTask () {
            @Override
            public void run () {
                //send requests according to your logic here
                new PriceFragment.PriceClasses().getPriceList();
                new PriceFragment.PriceClasses().getPriceList2();
            }
        };
        timer.schedule(task, 0, 60000); // 60000 = 1 min

        return rootView;
    }



    @Override
    public void onResult(Object result) {
        Log.d("k9res", "onResult: " + result.toString());
        if (result.toString().equalsIgnoreCase("swiped_down")) {
            //do something or nothing
        } else {
            //handle result
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (dialogFrag.isAdded()) {
            dialogFrag.dismiss();
            dialogFrag.show(getActivity().getSupportFragmentManager(), dialogFrag.getTag());
        }

    }

    public class PriceClasses {
        public class PriceObject {
            public String TYPE;
            public String MARKET;
            public String FROMSYMBOL;
            public String TOSYMBOL;
            public String FLAGS;
            public Double PRICE;
            public Integer LASTUPDATE;
            public Double LASTVOLUME;
            public Double LASTVOLUMETO;
            public String LASTTRADEID;
            public Double VOLUMEDAY;
            public Double VOLUMEDAYTO;
            public Double VOLUME24HOUR;
            public Double VOLUME24HOURTO;
            public Double OPENDAY;
            public Double HIGHDAY;
            public Double LOWDAY;
            public Double OPEN24HOUR;
            public Double HIGH24HOUR;
            public Double LOW24HOUR;
            public String LASTMARKET;
            public Double CHANGE24HOUR;
            public Double CHANGEPCT24HOUR;
            public Double CHANGEDAY;
            public Double CHANGEPCTDAY;
            public Double SUPPLY;
            public Double MKTCAP;
            public String TOTALVOLUME24H;
            public Double TOTALVOLUME24HTO;
        }


        public void getPriceList(){

            if (joined == null){
                apiURL = "https://min-api.cryptocompare.com/data/pricemultifull?fsyms=ETH,BTC&tsyms=USD,EUR,NGN,KES,GBP,JPY,CHF,CAD,AUD,HKD,INR,CNY,EGP,ILS,RUB,ZAR,ARS,BRL,SEK,SAR,QAR/";
            }else {
                 apiURL = "https://min-api.cryptocompare.com/data/pricemultifull?fsyms=ETH,BTC&tsyms="+ joined + "/";

            }

            StringRequest getPriceRequest = new StringRequest(apiURL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.e("Price List", response);

                    //Json Converter Classes
                    JsonElement jelement = new JsonParser().parse(response);
                    JsonObject jobject = jelement.getAsJsonObject();
                    JsonObject anObject0 = jobject.getAsJsonObject("RAW");
                    JsonObject anObject = anObject0.getAsJsonObject("ETH");
                    JsonObject anObject2 = anObject0.getAsJsonObject("BTC");

                    Map<String, PriceFragment.PriceClasses.PriceObject> map = new Gson().fromJson(anObject.toString(), new TypeToken<Map<String, PriceFragment.PriceClasses.PriceObject>>(){}.getType());

                    Collection<PriceFragment.PriceClasses.PriceObject> values = map.values(); //Converting the map to a collection to convert to list
                    List<PriceFragment.PriceClasses.PriceObject> prices = new ArrayList<>(values); //This is a list of the coins

                    Map<String, PriceFragment.PriceClasses.PriceObject> map2 = new Gson().fromJson(anObject2.toString(), new TypeToken<Map<String, PriceFragment.PriceClasses.PriceObject>>(){}.getType());

                    Collection<PriceFragment.PriceClasses.PriceObject> values2 = map2.values(); //Converting the map to a collection to convert to list
                    List<PriceFragment.PriceClasses.PriceObject> prices2 = new ArrayList<>(values2); //This is a list of the coins


                    int numCoins = prices.size();
                    Log.e("Coins", Integer.toString(numCoins));
//                    Toast.makeText(getActivity(), Integer.toString(numCoins), Toast.LENGTH_SHORT).show();

                    //Can set the list to an adapter:
                    //CoinAdapter adapter = new CoinAdapter(coins); //List of the coins to the adapter
                    priceAdapter = new PriceAdapter(getContext(),prices,prices2);
                    rvPriceList.setAdapter(priceAdapter);

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });

            AppController.getInstance().addToRequestQueue(getPriceRequest);
        }

        public void getPriceList2(){

                apiURL = "https://min-api.cryptocompare.com/data/pricemultifull?fsyms=ETH,BTC&tsyms=USD,EUR,NGN,KES,GBP,JPY,CHF,CAD,AUD,HKD,INR,CNY,EGP,ILS,RUB,ZAR,ARS,BRL,SEK,SAR,QAR/";

            StringRequest getPriceRequest = new StringRequest(apiURL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.e("Price List", response);

                    //Json Converter Classes
                    JsonElement jelement = new JsonParser().parse(response);
                    JsonObject jobject = jelement.getAsJsonObject();
                    JsonObject anObject0 = jobject.getAsJsonObject("RAW");
                    JsonObject anObject = anObject0.getAsJsonObject("ETH");
                    JsonObject anObject2 = anObject0.getAsJsonObject("BTC");

                    Map<String, PriceFragment.PriceClasses.PriceObject> map = new Gson().fromJson(anObject.toString(), new TypeToken<Map<String, PriceFragment.PriceClasses.PriceObject>>(){}.getType());

                    Collection<PriceFragment.PriceClasses.PriceObject> values = map.values(); //Converting the map to a collection to convert to list
                    List<PriceFragment.PriceClasses.PriceObject> prices = new ArrayList<>(values); //This is a list of the coins

                    Map<String, PriceFragment.PriceClasses.PriceObject> map2 = new Gson().fromJson(anObject2.toString(), new TypeToken<Map<String, PriceFragment.PriceClasses.PriceObject>>(){}.getType());

                    Collection<PriceFragment.PriceClasses.PriceObject> values2 = map2.values(); //Converting the map to a collection to convert to list
                    List<PriceFragment.PriceClasses.PriceObject> prices2 = new ArrayList<>(values2); //This is a list of the coins


                    int numCoins = prices.size();
                    Log.e("Coins", Integer.toString(numCoins));
//                    Toast.makeText(getActivity(), Integer.toString(numCoins), Toast.LENGTH_SHORT).show();

                    //Can set the list to an adapter:
                    //CoinAdapter adapter = new CoinAdapter(coins); //List of the coins to the adapter

                    PriceAdapter secondAdapter = new PriceAdapter(getContext(),prices,prices2);
                    topRecyclerView.setAdapter(secondAdapter);
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });

            AppController.getInstance().addToRequestQueue(getPriceRequest);
        }
    }
}