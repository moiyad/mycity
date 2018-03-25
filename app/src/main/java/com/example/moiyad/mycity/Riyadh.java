package com.example.moiyad.mycity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Moiyad on 07/04/17.
 */

public class Riyadh extends Fragment {

//    AppCompatActivity c;
//
//    ListView listView;
//    String[] placeName;
//    String[] placeDescrabtion;
//    private Context mcontect;

    public Riyadh() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootv = inflater.inflate(R.layout.riyadh, container, false);


        ArrayList<Place>  arrayList=new ArrayList<Place>();
        arrayList.add(new Place(R.string.dec_mamlakah,R.string.mamlakah_tower,R.drawable.mamlakah));
        arrayList.add(new Place(R.string.dec_pahysaliya,R.string.phaysaleyah_tower,R.drawable.phaysaleyh));
        arrayList.add(new Place(R.string.decBeach,R.string.butchershop,R.drawable.butchershop));

        viewAdapter adapter1=new viewAdapter(getActivity(),arrayList);

        ListView listview=(ListView)rootv.findViewById(R.id.List);

        listview.setAdapter(adapter1);

        return rootv;


    }


}
