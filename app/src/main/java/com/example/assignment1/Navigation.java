package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.assignment1.ui.theme.Search;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Navigation extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    Home homeFragment = new Home();
    Search searchFragment = new Search();
    Chats chatFragment=new Chats( );
    Profiles profileFragment=new Profiles();
    post postItemFragment=new post();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        bottomNavigationView = findViewById(R.id.bottom_Navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                item.setChecked(true);
                if (id == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                    return true;
                } else if (id == R.id.Search) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment).commit();
                    return true;
                } else if (id == R.id.Chat) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, chatFragment).commit();
                    return true;
                }
                else if (id == R.id.Profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                }
                else if (id == R.id.Add) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, postItemFragment).commit();
                    return true;
                }
                return false;
            }
        });
    }
}