package com.example.madhu.kishann;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

DatabaseHelper dbhelper=new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);




    }

    public void buttonclick(View view) {
        if (view.getId() == R.id.login) {
            EditText username = (EditText) findViewById(R.id.user);
            String email1 = username.getText().toString();
            EditText password = (EditText) findViewById(R.id.passid);
            String passw = password.getText().toString();
            if (email1.matches("") || passw.matches("")) {
                Toast.makeText(MainActivity.this, "कृपया डाटा हान्नुहोस्", Toast.LENGTH_SHORT).show();
            } else {
                Boolean Loginchk = dbhelper.searchPass(email1, passw);

                if (Loginchk) {

//                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kisanforum.boards.net/board/1/general-discussion"));
                    Intent i = new Intent(this, forum.class);

                    startActivity(i);
                    finish();
                    Toast.makeText(MainActivity.this, "तपाईँलाई स्वागत छ", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "माफ गर्नुहोला मिलेन", Toast.LENGTH_LONG).show();
                }


            }
        }
    }

public void signup(View view){
    Intent j= new Intent(this,signup.class);
    startActivity(j);


}

    }

