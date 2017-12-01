package com.example.gloaiza.practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.example.gloaiza.interfaces.Callback;
import com.example.gloaiza.models.Date;
import com.example.gloaiza.responses.DateResponse;
import com.loopj.android.http.*;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void obtenerFecha(View view){
        DateResponse.getDate(new Callback<Date>(){
            public void onResponse(Date fecha){
                EditText fechaText = (EditText) findViewById(R.id.fechaText);
                EditText horaText = (EditText) findViewById(R.id.horaText);
                fechaText.setText(fecha.getDate());
                horaText.setText(fecha.getTime());
            }
        });
    }
}
