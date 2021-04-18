package com.example.fragmentappsonar;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActicty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);

        Log.v( "CREATING", "SECOND ACTIVITY");

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        if (savedIntanceState == null){
            SecondFragment details = new SecondFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
