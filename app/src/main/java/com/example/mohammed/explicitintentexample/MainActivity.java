package com.example.mohammed.explicitintentexample;

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

    public void startSecondary(View v){
        Intent secondaryIntent = new Intent(this,SecondActivity.class);
        secondaryIntent.putExtra("firstValue",123);
        secondaryIntent.putExtra("secondValue","Test string!");
        startActivity(secondaryIntent);
    }
}
