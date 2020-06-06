package com.example.myapplication;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Webservices {

   String URL_BASE  = "http://52.172.155.50/TestAPP/appservice.asmx/";

    @Headers("Content-Type: application/json")
    @POST("loginUser")
    Call <List<UserModel>> getUser(@Body JSONObject body);
}
