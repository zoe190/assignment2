package com.example.assignment1.ui.theme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.assignment1.R;

public class Search extends Fragment {

    // Database and DAO
    private DBadd DBadd;
    private add add;

    // Views
    private EditText titleEditText;
    private EditText descriptionEditText;
    private Button btncreate;
    private Button btnsearch;
    private Button btndelete;
    private Button btnupdate;
    private RecyclerView adRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        DBadd = Room.databaseBuilder(requireContext(), DBadd.class, "dbADD").build();
        add = DBadd.add();
        titleEditText = view.findViewById(R.id.titleEditText);
        descriptionEditText = view.findViewById(R.id.descriptionEditText);
        btnupdate = view.findViewById(R.id.btnupdate);
        btnsearch = view.findViewById(R.id.btnsearch);
        btncreate = view.findViewById(R.id.btncreate);
        btndelete = view.findViewById(R.id.btndelete);

        adRecyclerView = view.findViewById(R.id.adRecyclerView);

        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = titleEditText.getText().toString();
                String description = descriptionEditText.getText().toString();
                Ad ad = new Ad();
                ad.title = title;
                ad.description = description;
                insertAd(ad);
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = titleEditText.getText().toString();
                searchAds(query);
            }
        });
        return view;
    }

    private void insertAd(Ad ad) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                add.insert(ad);
            }
        }).start();
    }

    private void searchAds(String query) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<Ad> ads = add.searchAds("%" + query + "%");

            }
        }).start();
    }

    private void updateAd(Ad ad) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                add.update(ad);

            }
        }).start();
    }

}