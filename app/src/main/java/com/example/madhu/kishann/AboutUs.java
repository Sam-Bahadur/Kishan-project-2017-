package com.example.madhu.kishann;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void fblike(View view){
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fb.com/openmyacc/"));
        startActivity(i);
        Toast.makeText(AboutUs.this, "fb page", Toast.LENGTH_SHORT).show();
    }
}
