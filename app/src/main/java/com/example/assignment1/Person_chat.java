package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Person_chat extends AppCompatActivity {
ImageView image;
ImageView image2;
ImageView image3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_chat);
        image=findViewById(R.id.phone);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Person_chat.this,audio_call.class);
                startActivity(intent);
            }
        });
        image2=findViewById(R.id.video);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Person_chat.this,video_call.class);
                startActivity(intent);
            }
        });

        image3=findViewById(R.id.camera);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Person_chat.this,photo.class);
                startActivity(intent);
            }
        });
    }
    }
