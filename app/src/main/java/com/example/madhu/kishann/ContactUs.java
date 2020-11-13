package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void fblike(View view){
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Nepal-Agricultural-Research-Council-Recruitment-Committee-1656472631235781/"));
        startActivity(i);
        Toast.makeText(ContactUs.this, "fb page", Toast.LENGTH_SHORT).show();
    }
}
