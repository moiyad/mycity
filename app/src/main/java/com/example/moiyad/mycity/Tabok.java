package com.example.moiyad.mycity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Moiyad on 15/04/17.
 */

public class Tabok extends Fragment {

    public Tabok() {
    }

    @Nullable
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        android.view.View rootv = inflater.inflate(R.layout.riyadh, container, false);

        ArrayList<Place> arrayList = new ArrayList<Place>();

        arrayList.add(new Place(R.string.tabokBeach, R.string.decBeach, R.drawable.rim));
        arrayList.add(new Place(R.string.Tabok_Alsahba, R.string.decMountin, R.drawable.desih));
        arrayList.add(new Place(R.string.Tabok_aljof, R.string.decJof, R.drawable.thesea));

        viewAdapter adapter1 = new viewAdapter(getActivity(), arrayList);

        ListView listview = (ListView) rootv.findViewById(R.id.List);

        listview.setAdapter(adapter1);

        return rootv;
    }
}
