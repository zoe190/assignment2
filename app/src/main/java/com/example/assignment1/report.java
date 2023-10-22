package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class report extends AppCompatActivity {

    private EditText reportEditText;
    private Button submitReportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        reportEditText = findViewById(R.id.editTextTextMultiLine);
        submitReportButton = findViewById(R.id.button);

        submitReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userReport = reportEditText.getText().toString().trim();

                finish();
            }
        });
    }
}
