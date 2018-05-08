package com.example.vietvan.tracnghiemflag;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by VietVan on 03/05/2018.
 */

public interface FlagService {
    @GET("all")
    Call<List<FlagResponse>> getAll();

    @GET("regionalbloc/asean")
    Call<List<FlagResponse>> getListCountryinAsean();

}
