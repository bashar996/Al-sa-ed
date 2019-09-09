package com.example.al_saad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class consumables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumables);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("مواد غذائية",true));
        items.add(new Item("منظفات",true));
        items.add(new Item("دخان",true));
        items.add(new Item("منوعات",true));


        ItemAdapter itemAdapter= new ItemAdapter(this,items);

        ListView listView = findViewById(R.id.consume_list);

        listView.setAdapter(itemAdapter);
    }
}
