package com.example.maciek.odrabianiezajec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView List= (RecyclerView) findViewById(R.id.List);
        List.setLayoutManager(new LinearLayoutManager(this));
        String[] licznik = {"1","2","3","4","5","6","7","8","9","10"};
        List.setAdapter(new ListAdapter(licznik));
    }
}
