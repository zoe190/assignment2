package com.example.assignment1.ui.theme;


import com.example.assignment1.R;

import java.util.List;

public interface AdDao {
        @Insert
        void insert(Ad ad);

        @Update
        void update(Ad ad);

        void delete(Ad ad);

        @Query(.getString(R.string.select_from_ad_where_title_like_query_or_description_like_query))
        List<Ad> searchAds(String query);
    }

