package com.example.lost_and_found_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;


import java.util.List;

public class SeeAllLostItemsActivity extends AppCompatActivity {

    ArrayAdapter itemArrayAdapter;
    List<LostAndFoundModel> allPosts;
    ListView itemList;
    DbHelper dataBaseHelper;
    //Todo @Jason: Use SimpleCursor Adaptor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_see_all_lost_items);
        itemList = (ListView) findViewById(R.id.idListView);

        dataBaseHelper = new DbHelper(SeeAllLostItemsActivity.this);
        allPosts = dataBaseHelper.getAllItemRecords();

        itemArrayAdapter = new ArrayAdapter<LostAndFoundModel>(SeeAllLostItemsActivity.this, android.R.layout.simple_list_item_1, allPosts);
        itemList.setAdapter(itemArrayAdapter);

    }
}