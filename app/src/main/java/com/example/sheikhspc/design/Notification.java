package com.example.sheikhspc.design;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;;

public class Notification extends Fragment implements View.OnClickListener {


    public Notification() {
        // Required empty public constructor
    }


    Button pushbutton, emailbutton;
    View view;
    boolean push = false;
    boolean email = false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notification, container, false);
        pushbutton = (Button)view.findViewById(R.id.pushnotificationbtn);
        emailbutton = (Button)view.findViewById(R.id.emailnotificationbtn);

        pushbutton.setOnClickListener(this);
        emailbutton.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.pushnotificationbtn:

                if(!push) {
                    pushbutton.setText("On");
                    //pushbutton.setImageResource(R.drawable.on_btn);
                    pushbutton.setBackgroundDrawable(getResources().getDrawable(R.drawable.on_btn));
                    push = true;
                }
                else
                {
                    pushbutton.setText("off");
                    pushbutton.setBackgroundDrawable(getResources().getDrawable(R.drawable.off_btn));
                    push = false;
                }
                break;
            case R.id.emailnotificationbtn:
                if(!email) {
                    emailbutton.setText("On");
                    //pushbutton.setImageResource(R.drawable.on_btn);
                    emailbutton.setBackgroundDrawable(getResources().getDrawable(R.drawable.on_btn));
                    email = true;
                }
                else
                {
                    emailbutton.setText("off");
                    emailbutton.setBackgroundDrawable(getResources().getDrawable(R.drawable.off_btn));
                    email = false;
                }
                break;
            default:
                break;


        }


    }
}
