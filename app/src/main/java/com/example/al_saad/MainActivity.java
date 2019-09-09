package com.example.al_saad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("مواد غذائية",true));
        items.add(new Item("منظفات",false));
        items.add(new Item("دخان",true));
        items.add(new Item("منوعات",false));


        ItemAdapter itemAdapter= new ItemAdapter(this,items);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(itemAdapter);



    }


}
