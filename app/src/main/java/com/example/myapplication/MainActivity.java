package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.JsonArray;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity  implements Callback<List<UserModel>> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Webservices.URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Webservices apiInterface = retrofit.create(Webservices.class);

        try {

            JSONObject paramObject = new JSONObject();
            paramObject.put("mobileno","8210771639");
            paramObject.put("apikey", "apischool");

            Call<List<UserModel>> userCall = apiInterface.getUser(paramObject);
            userCall.enqueue(this);
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void onResponse(Call<List<UserModel>> call, Response<List<UserModel>> response) {

        Toast.makeText(getApplicationContext(),response.body().get(0).getUsid().toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(Call<List<UserModel>> call, Throwable t) {

            Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG).show();
    }
}
