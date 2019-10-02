package com.example.coffeefinderapp;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.coffeefinderapp.R.layout.activity_main;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] coffee={"Dunkin'", "McDonald's", "Starbucks", "Wawa"};
        setListAdapter(new ArrayAdapter<String>(this, activity_main, R.id.rental, coffee));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, Dunkin.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, McDonalds.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Wawa.class));
                break;
        }

    }



}
