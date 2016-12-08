package com.example.sheikhspc.design;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AvailableDates extends Fragment implements View.OnClickListener {

    TextView tv1, tv2;

    View rootView;
    Fragment frag ;
    public AvailableDates() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
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
                fragmentTransaction.addToBackStack(null);

                fragmentTransaction.replace(R.id.container1,frag);

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

                fragmentTransaction1.replace(R.id.container1,frag);

                fragmentTransaction1.commit();

                break;
            default:
                break;

        }
    }

}
