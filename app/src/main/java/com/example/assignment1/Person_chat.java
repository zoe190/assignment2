package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class Person_chat extends AppCompatActivity {
    ImageView image;
    ImageView image2;
    ImageView image3;

    // Store message timestamps for editing and deleting
    private Map<String, Long> messageTimestamps = new HashMap<>();
    private Handler editHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_chat);

        image = findViewById(R.id.phone);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Person_chat.this, audio_call.class);
                startActivity(intent);
            }
        });

        image2 = findViewById(R.id.video);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Person_chat.this, video_call.class);
                startActivity(intent);
            }
        });

        image3 = findViewById(R.id.camera);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Person_chat.this, photo.class);
                startActivity(intent);
            }
        });
        TextView messageTextView = findViewById(R.id.messageTextView);
        messageTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = messageTextView.getText().toString();
                sendMessage(message);
            }
        });
    }

    private void sendMessage(String message) {
        long currentTime = System.currentTimeMillis();

        messageTimestamps.put(message, currentTime);

        editHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                messageTimestamps.remove(message);
            }
        }, 5 * 60 * 1000);
    }
    private void editMessage(String message) {
        Long messageTimestamp = messageTimestamps.get(message);
        if (messageTimestamp != null) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - messageTimestamp < 5 * 60 * 1000) {
            } else {
            }
        }
    }

    private void deleteMessage(String message) {
        Long messageTimestamp = messageTimestamps.get(message);
        if (messageTimestamp != null) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - messageTimestamp < 5 * 60 * 1000) {

            } else {

            }
        }
    }
}
