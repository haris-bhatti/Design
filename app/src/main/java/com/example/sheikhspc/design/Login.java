package com.example.sheikhspc.design;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void continue1 (View view)
    {
        Intent intent = new Intent(this,dashboard.class);
        startActivity(intent);
        finish();

    }
    public void book(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
        builder.setTitle("Book Test");
        builder.setMessage("You will be redirected to DVSA web site.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gov.uk/book-driving-test"));
                startActivity(intent);


            }
        });
        builder.setNegativeButton("CANCEL",null);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
