package com.example.navi_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RouteDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_detail);
        getSupportActionBar().hide();
    }
}
