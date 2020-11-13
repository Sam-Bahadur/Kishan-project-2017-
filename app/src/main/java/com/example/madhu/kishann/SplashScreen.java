package com.example.madhu.kishann;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.madhu.kishann.MainActivity;
import com.example.madhu.kishann.R;

/**
 * Created by madhu on 6/23/2017.
 */

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
       new Handler().postDelayed(new Runnable(){
                                     @Override
                                     public void run() {
                                         Intent i=new Intent(SplashScreen.this,Navigation.class);
                                         startActivity(i);
                                         SplashScreen.this.finish();
                                     }
                                 },1000);


    }

    }

