package com.example.vietvan.tracnghiemflag;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by VietVan on 03/05/2018.
 */

public class RetrofitInstance {

    public static Retrofit retrofit;

    public static Retrofit getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://restcountries.eu/rest/v2/")
                    .build();
        }

        return retrofit;
    }

}
