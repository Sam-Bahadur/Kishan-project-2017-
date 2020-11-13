package com.example.madhu.kishann;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void onsinupclick(View v) {

        EditText name = (EditText) findViewById(R.id.text);
        EditText pass1 = (EditText) findViewById(R.id.passw);
        EditText pass2 = (EditText) findViewById(R.id.conpass);


        String uname = name.getText().toString();
        String password1 = pass1.getText().toString();
        String password2 = pass2.getText().toString();
        if (uname.matches("") || password1.matches("") || password2.matches("")) {
            Toast.makeText(signup.this, "कृपया डाटा हान्नुहोस्", Toast.LENGTH_SHORT).show();
        } else {
            Boolean check = helper.searching(uname);
            if (check) {


                if (password1.equals(password2)) {
                    Contact c = new Contact();
                    c.setUsername(uname);
                    c.setPassword(password1);
                    helper.insertContact(c);
                    Toast.makeText(signup.this, "", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(signup.this, "गोप्य शब्द एउटै भएन", Toast.LENGTH_SHORT).show();
                }

            }
            else
                Toast.makeText(signup.this, "नाम उपलब्ध छैन कृपया नयाँ छान्नुहोस्", Toast.LENGTH_SHORT).show();

        }
    }
}



