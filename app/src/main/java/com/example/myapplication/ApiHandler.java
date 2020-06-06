package com.example.myapplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.myapplication.Webservices.URL_BASE;

public class ApiHandler {

    private static Webservices apiService;

//    public static Webservices getApiService() {

//        if (apiService == null) {
//
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
//            Retrofit retrofit = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson)).baseUrl(URL_BASE).build();
//
//            apiService = retrofit.create(Webservices.class);
//            return apiService;
//        } else {
//            return apiService;
//        }
//    }
}
