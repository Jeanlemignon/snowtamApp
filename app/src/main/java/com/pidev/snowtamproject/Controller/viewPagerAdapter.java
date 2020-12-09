package com.pidev.snowtamproject.Controller;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;

    public viewPagerAdapter(@NonNull FragmentManager fm) {

        super(fm);
        this.fragments = new ArrayList<>();
        this.titles = new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        /*Airport1Fragment airport1Fragment = new Airport1Fragment();
        Bundle bundle = new Bundle();
        position +=1;
        bundle.putString("key",""+position);
        airport1Fragment.setArguments(bundle);
        return airport1Fragment;*/


            return fragments.get(position);

    }

    /*@Override
    public int getCount() {
        return 4;
    } */

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        titles.add(title);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
