package com.example.moiyad.mycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Moiyad on 14/04/17.
 */

public class viewAdapter extends ArrayAdapter<Place> {


    public viewAdapter( Context mContext, ArrayList<Place> object) {
        super(mContext, 0, object);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
           View v=convertView;
        Place current =getItem(position);


        v = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        TextView vname =(TextView)v.findViewById(R.id.name);
        TextView vdec =(TextView)v.findViewById(R.id.descruption);
        ImageView vimage=(ImageView)v.findViewById(R.id.imageView);

        vname.setText(current.getPlaceName());
        vdec.setText(current.getPlaceDescruption());
        vimage.setImageResource(current.getPlaceImage());
        vimage.setVisibility(View.VISIBLE);


        return v;

    }





}
