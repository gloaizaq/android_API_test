package com.example.gloaiza.responses;

import android.util.Log;

import com.example.gloaiza.interfaces.Callback;
import com.example.gloaiza.models.Date;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

/**
 * Created by gloaiza on 1/12/2017.
 */

public class DateResponse {

    public static void getDate(final Callback<Date> callback){
        String url = "http://date.jsontest.com/";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, null, new TextHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Gson gson = new GsonBuilder().create();
                Date fecha = gson.fromJson(responseString, Date.class);
                if (callback != null){
                    callback.onResponse(fecha);
                }
            }
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

            }
        });
    }
}
