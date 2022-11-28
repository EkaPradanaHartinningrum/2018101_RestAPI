package com.example.restapi_2018101;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class Api {
    public static String BASE_URL = "https://kodepos-2d475.firebaseio.com/";

    @GET("list_propinsi.json?print=pretty")
    Call<List<Results>> getkodepos() {
        return null;
    }
}

