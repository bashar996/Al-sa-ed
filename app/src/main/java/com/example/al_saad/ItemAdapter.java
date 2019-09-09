package com.example.al_saad;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {


    ItemAdapter(Activity context , ArrayList<Item> item ){
        super(context,0,item);

    }
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        Item currentItem = getItem(position);

        View listItemView = convertView;

        if (listItemView ==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView itemTextView =  listItemView.findViewById(R.id.ItemName);
        itemTextView.setText(currentItem.getItemName());


        TextView itemAvailable =  listItemView.findViewById(R.id.Available);
        itemAvailable.setText(currentItem.getAvailability());
        if(currentItem.ismAvailable())
        {
            itemAvailable.setTextColor(Color.rgb(0,200,83));
        }
        else
            itemAvailable.setTextColor(Color.rgb(211,47,47));

        return listItemView;
    }

}
