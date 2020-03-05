package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    protected void OnCreate(Bundle savedInstanceState){
        setContentView(R.layout.activity_main);
        Intent returnIntent = new Intent();
        setResult(SecondActivity.REQUEST_CODE, returnIntent);
        finish();
    }
}
