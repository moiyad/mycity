package com.example.moiyad.mycity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.*;
import android.view.View;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * Created by Moiyad on 15/04/17.
 */

public class Jeddah extends android.support.v4.app.Fragment {


    public Jeddah() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootv=inflater.inflate(R.layout.riyadh,container,false);

        ArrayList<Place> arrayList =new ArrayList<Place>();

        arrayList.add(new Place(R.string.jeddahmall,R.string.decMall,R.drawable.jeddahmall));
        arrayList.add(new Place(R.string.jeddah_Altahlayh,R.string.dec_tahlia,R.drawable.jeddahmall));
        arrayList.add(new Place(R.string.JeddahCoffee,R.string.decCoffee,R.drawable.coffee));

        viewAdapter adapter1=new viewAdapter(getActivity(),arrayList);

        ListView listview=(ListView)rootv.findViewById(R.id.List);

        listview.setAdapter(adapter1);

        return rootv;
    }
}
