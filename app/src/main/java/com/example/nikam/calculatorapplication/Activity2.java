package com.example.nikam.calculatorapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle ext = getIntent().getExtras();

        if(ext != null) {
            String rec = ext.getString("S1");
        }

    }
}
