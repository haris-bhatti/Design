package com.example.sheikhspc.design;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;


public class dashboard extends FragmentActivity {
    PagerAdapter mPagerAdapter;
    ViewPager mViewPager;
    TabLayout tabLayout;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager.setAdapter(mPagerAdapter);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.home_icon_black);
        tabLayout.getTabAt(1).setIcon(R.drawable.date_icon);
        tabLayout.getTabAt(2).setIcon(R.drawable.noti_icon);
        tabLayout.getTabAt(3).setIcon(R.drawable.subscription_icon);
        tabLayout.getTabAt(4).setIcon(R.drawable.setting_icon);
        tabLayout.getTabAt(5).setIcon(R.drawable.logout_icon);

    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment;
            switch (i) {
                case 0:
                    fragment = new dashboard1();
                    return fragment;

                case 1:
                    fragment = new AvailableDates();
                    return fragment;

                case 2:
                    fragment = new Notification();
                    return fragment;

                case 3:
                    fragment = new Subscription();
                    return fragment;

                case 4:
                    fragment = new Settings();
                    return fragment;

                case 5:
                    fragment = new LogOut();
                    return fragment;


            }
            return null;
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return null;
        }
    }
}