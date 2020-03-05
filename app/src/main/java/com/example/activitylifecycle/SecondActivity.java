package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    static final int REQUEST_CODE = 0;
    Button klik;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        klik = (Button) view.findViewById(R.id.button);
        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == SecondActivity.REQUEST_CODE){
            if (resultCode== RESULT_OK){
                Log.d("Activity 1", "onPause()");
            }
            if (resultCode == RESULT_CANCELED){
                Log.d("Activiti 2", "onRestart()");
            }
        }
    }
}
