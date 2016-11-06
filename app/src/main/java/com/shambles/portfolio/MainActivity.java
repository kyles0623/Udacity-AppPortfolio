package com.shambles.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final Map<Integer, String> myMap;

    private static final String TOAST_PRE_TEXT = "This button will launch my ";

    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(R.id.btn_pop_movies, TOAST_PRE_TEXT+"Pop Movies app!");
        aMap.put(R.id.btn_capstone, TOAST_PRE_TEXT+"Capstone App!");
        aMap.put(R.id.btn_build_bigger, TOAST_PRE_TEXT+"Build It Bigger App!");
        aMap.put(R.id.btn_stock_hawk, TOAST_PRE_TEXT+"Stock Hawk App!");
        aMap.put(R.id.btn_ubiqitous, TOAST_PRE_TEXT+"Ubiquitous App!");
        myMap = Collections.unmodifiableMap(aMap);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayToast(View view) {
        Toast.makeText(this, myMap.get(view.getId()),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        displayToast(v);
    }
}
