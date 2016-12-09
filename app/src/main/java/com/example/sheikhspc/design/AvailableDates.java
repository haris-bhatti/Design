package com.example.sheikhspc.design;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AvailableDates extends Fragment implements View.OnClickListener {

    TextView tv1, tv2;
    View rootView;
    Fragment frag ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_available_dates, container, false);
        tv1 = (TextView)rootView.findViewById(R.id.showdatetimetv);
        tv2 = (TextView)rootView.findViewById(R.id.showdatetimetv1);

        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);



        return rootView;
    }
    @Override
    public void onClick(View view) {

        Bundle b = new Bundle();

        switch (view.getId()){
            case R.id.showdatetimetv:
                frag = new Dates();
                String key1 = "Date1";
                String value1 = tv1.getText().toString();
                b.putString(key1,value1);
                frag.setArguments(b);
                FragmentManager fm = getFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.pager,frag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                break;
            case R.id.showdatetimetv1:
                frag = new Dates();

                String key2 = "Date1";
                String value2 = tv2.getText().toString();
                b.putString(key2,value2);
                frag.setArguments(b);
                FragmentManager fmm = getFragmentManager();
                FragmentTransaction fragmentTransaction1 = fmm.beginTransaction();
                fragmentTransaction1.addToBackStack(null);

                fragmentTransaction1.replace(R.id.pager,frag);

                fragmentTransaction1.commit();

                break;
            default:
                break;

        }
    }

}
