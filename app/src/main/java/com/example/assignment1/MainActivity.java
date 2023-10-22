package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    Timer timer;

    private static final int delay = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer=new Timer();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an intent to navigate to the next screen (replace NextActivity.class with your next activity)
                Intent intent = new Intent(MainActivity.this, activity_login.class);
                startActivity(intent);
                finish(); // Close the splash screen activity
            }
        }, delay);
    }
}