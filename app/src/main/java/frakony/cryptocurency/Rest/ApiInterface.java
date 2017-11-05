package frakony.cryptocurency.Rest;

import frakony.cryptocurency.Model.Price;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by tonyk on 10/29/2017.
 */

public interface ApiInterface {

    @GET("pricemulti?fsyms=BTC,ETH")
    Call<Price> getLatestPrice(@Query("&tsyms") String currencyList);

 /*   @GET("movie/{id}")
    Call<Price> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/
}
