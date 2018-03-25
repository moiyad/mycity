package com.example.moiyad.mycity;

import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ActivityPageerAdapter pagerAdapter;
    private ListView lvjeddah;
    private viewAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vpPager);
        pagerAdapter = new ActivityPageerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);








    }
}
