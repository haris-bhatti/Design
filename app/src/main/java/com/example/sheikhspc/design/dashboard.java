package com.example.sheikhspc.design;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {

    ImageView home1, subs1, noti1,settings1,date1;
    Fragment frag = null;
    TextView home, subs,noti,set,date;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        home1 = (ImageView) findViewById(R.id.home1);
        subs1 = (ImageView) findViewById(R.id.subs1);
        noti1 = (ImageView) findViewById(R.id.noti1);
        settings1 = (ImageView) findViewById(R.id.settings1);
        date1 = (ImageView) findViewById(R.id.date1);
        frag = new dashboard1();
        home = (TextView)findViewById(R.id.hometv);
        subs = (TextView)findViewById(R.id.substv);
        noti = (TextView)findViewById(R.id.notitv);
        set = (TextView)findViewById(R.id.settingstv);
        date = (TextView)findViewById(R.id.datestv);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().add(R.id.container1,frag).commit();

        Toolbar mytoolbar = (Toolbar)findViewById(R.id.mytoolbar);

        setSupportActionBar(mytoolbar);
        getSupportActionBar().setTitle("Home");
        home.setTextColor(0xFF000000);

        fragmentManager = getFragmentManager();
        fragmentManager.addOnBackStackChangedListener(this);









    }

    @Override
    public void onBackStackChanged() {
        //get the current fragment being displayed
        Fragment fragment = fragmentManager.findFragmentById(R.id.container1);
        if (fragment instanceof AvailableDates) {
            //do your stuff
        dates(null);
        } else if (fragment instanceof Subscription) {
            //do other stuff
        } //and so on for each fragment
    }
    public void dbfragment(View view)
    {
        if(frag != null)
        {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
  //              home1.setBackground(getResources().getDrawable(R.drawable.home_icon_black));
    //        }
            home1.setBackgroundDrawable(getResources().getDrawable(R.drawable.home_icon_black));
home.setTextColor(0xFF000000);
            subs1.setBackgroundDrawable(getResources().getDrawable(R.drawable.subscription_icon));
            noti1.setBackgroundDrawable(getResources().getDrawable(R.drawable.noti_icon));
            settings1.setBackgroundDrawable(getResources().getDrawable(R.drawable.setting_icon));
            date1.setBackgroundDrawable(getResources().getDrawable(R.drawable.date_icon));

            frag = new dashboard1();
            getSupportActionBar().setTitle("Home");
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.container1,frag);

            fragmentTransaction.commit();




        }
    }
    public void dates(View view)
    {
        if(frag != null)
        {
            home1.setBackgroundDrawable(getResources().getDrawable(R.drawable.home_icon));
            subs1.setBackgroundDrawable(getResources().getDrawable(R.drawable.subscription_icon));
            noti1.setBackgroundDrawable(getResources().getDrawable(R.drawable.noti_icon));
            settings1.setBackgroundDrawable(getResources().getDrawable(R.drawable.setting_icon));
            date1.setBackgroundDrawable(getResources().getDrawable(R.drawable.date_icon_black));
            date.setTextColor(0xFF000000);
            getSupportActionBar().setTitle("Available Dates");
            frag = new AvailableDates();
            FragmentManager fm = getFragmentManager();

            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.container1,frag);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void subscription(View view)
    {
        if (frag != null)
        {
            home1.setBackgroundDrawable(getResources().getDrawable(R.drawable.home_icon));
            subs1.setBackgroundDrawable(getResources().getDrawable(R.drawable.subscription_icon_black));
            noti1.setBackgroundDrawable(getResources().getDrawable(R.drawable.noti_icon));
            settings1.setBackgroundDrawable(getResources().getDrawable(R.drawable.setting_icon));
            date1.setBackgroundDrawable(getResources().getDrawable(R.drawable.date_icon));
            subs.setTextColor(0xFF000000);
            getSupportActionBar().setTitle("Subscriptions");
            frag = new Subscription();
            FragmentManager fm = getFragmentManager();

            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.container1,frag);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void noti(View view)
    {
        getSupportActionBar().setTitle("Notifications");
        if (frag != null)
        {
            home1.setBackgroundDrawable(getResources().getDrawable(R.drawable.home_icon));
            subs1.setBackgroundDrawable(getResources().getDrawable(R.drawable.subscription_icon));
            noti1.setBackgroundDrawable(getResources().getDrawable(R.drawable.noti_icon_black));
            settings1.setBackgroundDrawable(getResources().getDrawable(R.drawable.setting_icon));
            noti.setTextColor(0xFF000000);
            date1.setBackgroundDrawable(getResources().getDrawable(R.drawable.date_icon));
            frag = new Notification();
            FragmentManager fm = getFragmentManager();

            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.container1,frag);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void settings(View view)
    {
        getSupportActionBar().setTitle("Settings");
        if (frag != null)
        {
            set.setTextColor(0xFF000000);
            home1.setBackgroundDrawable(getResources().getDrawable(R.drawable.home_icon));
            subs1.setBackgroundDrawable(getResources().getDrawable(R.drawable.subscription_icon));
            noti1.setBackgroundDrawable(getResources().getDrawable(R.drawable.noti_icon));
            settings1.setBackgroundDrawable(getResources().getDrawable(R.drawable.setting_ion_black));
            date1.setBackgroundDrawable(getResources().getDrawable(R.drawable.date_icon));
            frag = new Settings();
            FragmentManager fm = getFragmentManager();

            FragmentTransaction fragmentTransaction = fm.beginTransaction();

            fragmentTransaction.replace(R.id.container1,frag);
            fragmentTransaction.addToBackStack(null);

            fragmentTransaction.commit();
        }
    }
    public void signout(View view)
    {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);

    }

    @Override
    public void onBackPressed() {

            super.onBackPressed();



    }

}
