package com.pidev.snowtamproject.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.pidev.snowtamproject.Controller.viewPagerAdapter;
import com.pidev.snowtamproject.R;
import com.pidev.snowtamproject.View.Fragment.Airport1Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport2Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport3Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport4Fragment;

public class SnowtamActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private viewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowtam);

       // Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
         viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new Airport1Fragment(), "Airport 1");
        viewPagerAdapter.addFragment(new Airport2Fragment(), "Airport 2");
        viewPagerAdapter.addFragment(new Airport3Fragment(), "Airport 3");
        viewPagerAdapter.addFragment(new Airport4Fragment(), "Airport 4");

        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(viewPagerAdapter);


    }

}
