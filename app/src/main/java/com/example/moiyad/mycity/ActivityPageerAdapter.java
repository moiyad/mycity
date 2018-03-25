package com.example.moiyad.mycity;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Moiyad on 07/04/17.
 */

public class ActivityPageerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ActivityPageerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Riyadh();
            case 1:
                return new Jeddah();
            default:
                return new Tabok();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.riyadh_city);
        } else if (position == 1) {
            return mContext.getString(R.string.Jeddah_city);
        } else {
            return mContext.getString(R.string.Tabok_city);

        }
    }
}








