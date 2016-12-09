package com.example.sheikhspc.design;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class Dates extends Fragment {


    public Dates() {
        // Required empty public constructor
    }


    TextView tv;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_dates, container, false);
tv = (TextView)view.findViewById(R.id.date);
        String date = getArguments().getString("Date1");
        tv.setText(date);

        return view;
    }

}
