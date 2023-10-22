package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
    Button button;
    private static final int SPLASH_DURATION = 5000;
    private boolean userLoggedIn = false;

    TextView textView5;
    TextView textView8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                if (userLoggedIn) {
                    intent = new Intent(activity_login.this, Home.class);
                } else {
                    intent = new Intent(activity_login.this, Signup_activity.class);
                }
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);

        button=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_login.this,Navigation.class);
                startActivity(intent);
            }
        });
        textView5=findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_login.this,ForgotP_activity.class);
                startActivity(intent);
            }
        });

        textView8=findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_login.this,Signup_activity.class);
                startActivity(intent);
            }
        });

    }

}