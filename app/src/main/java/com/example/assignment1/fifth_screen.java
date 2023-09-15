package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.assignment1.databinding.ActivityMainBinding;

public class fifth_screen extends AppCompatActivity {
 ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_screen);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        binding.bottomNavigationView.setOnItemSelectedListener(item->{
//            switch(item.getItemId()){
//                case R.id.home:
//                    break;
//                case R.id.Search:
//                    break;
//                case R.id.Chat:
//                    break;
//                case R.id.Profile:
//                    break;
//            }
//
//            return true;
//        });



    }
}