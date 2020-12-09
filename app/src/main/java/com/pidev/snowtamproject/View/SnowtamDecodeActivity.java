package com.pidev.snowtamproject.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.pidev.snowtamproject.Controller.viewPagerAdapter;
import com.pidev.snowtamproject.R;
import com.pidev.snowtamproject.View.Fragment.Airport1Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport2Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport3Fragment;
import com.pidev.snowtamproject.View.Fragment.Airport4Fragment;
import com.pidev.snowtamproject.View.Fragment.FragmentDecode.Aiport1DecodeFragment;
import com.pidev.snowtamproject.View.Fragment.FragmentDecode.Aiport2DecodeFragment;
import com.pidev.snowtamproject.View.Fragment.FragmentDecode.Aiport3DecodeFragment;
import com.pidev.snowtamproject.View.Fragment.FragmentDecode.Aiport4DecodeFragment;

public class SnowtamDecodeActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private com.pidev.snowtamproject.Controller.viewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snowtam_decode);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragment(new Aiport1DecodeFragment(), "AirportD 1");
        viewPagerAdapter.addFragment(new Aiport2DecodeFragment(), "AirportD 2");
        viewPagerAdapter.addFragment(new Aiport3DecodeFragment(), "AirportD 3");
        viewPagerAdapter.addFragment(new Aiport4DecodeFragment(), "AirportD 4");

        tabLayout.setupWithViewPager(viewPager);

        viewPager.setAdapter(viewPagerAdapter);
    }
}
