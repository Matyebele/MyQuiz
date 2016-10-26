package com.example.android.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void maths(View v){
        Intent intent = new Intent(MainActivity.this,Mathematics.class);
        startActivity(intent);
    }
    public void history(View v){
        Intent intent = new Intent(MainActivity.this,History.class);
        startActivity(intent);

    }
    public void soccer(View v){
        Intent intent = new Intent(MainActivity.this,Soccer.class);
        startActivity(intent);
    }
}
