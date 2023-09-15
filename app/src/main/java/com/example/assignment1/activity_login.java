package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {
   private Button button;
   TextView textView5;
   TextView textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfifth_screen();

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
    public void openfifth_screen(){
        Intent intent=new Intent(this,fifth_screen.class);
        startActivity(intent);
    }


}

