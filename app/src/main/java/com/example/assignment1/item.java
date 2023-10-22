package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class item extends AppCompatActivity {
    TextView text;
    ImageView image2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        button = findViewById(R.id.rentbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfilePage();
            }
        });
        text = findViewById(R.id.reportText);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(item.this, report.class);
                startActivity(intent);
            }
        });
        image2 = findViewById(R.id.backButton);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(item.this, profile.class);
                startActivity(intent);
            }
        });
    }
    public void openProfilePage() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}