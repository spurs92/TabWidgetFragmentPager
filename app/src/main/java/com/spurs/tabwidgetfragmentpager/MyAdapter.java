package com.spurs.tabwidgetfragmentpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alfo06-11 on 2017-06-07.
 */

public class MyAdapter extends FragmentPagerAdapter {

    Fragment[] frags=new Fragment[3];

    public MyAdapter(FragmentManager fm) {
        super(fm);

        frags[0]=new Page1Fragment();
        frags[1]=new Page2Fragment();
        frags[2]=new Page3Fragment();

    }

    @Override
    public Fragment getItem(int position) {
        return  frags[position];
    }

    @Override
    public int getCount() {
        return frags.length;
    }
}
