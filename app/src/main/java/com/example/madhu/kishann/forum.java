package com.example.madhu.kishann;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class forum extends AppCompatActivity {

//    EditText name, problem, reply;
    RequestQueue requestQueue;
    TextView text;
    Button button;

    String insertUrl = "http://192.168.1.12/createForum.php";
    String showdata = "http://192.168.1.12/showData.php";

    //private static final String DB_URL="jdbc:mysql:http://localhost/phpmyadmin/db_structure.php?server=1&db=forum&token=0189640ec5a4e9e506b080be639f08f1";
//    private static final String USER="";
//    private static final String PASS="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
//        name = (EditText) findViewById(R.id.forum_name);
//        problem = (EditText) findViewById(R.id.forum_problem);
        text = (TextView) findViewById(R.id.textttttt);
        button = (Button) findViewById(R.id.button12);
        requestQueue = Volley.newRequestQueue(getApplicationContext());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                        showdata, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        text.append("hello world");
                        try {

                            JSONArray students = response.getJSONArray("forum_kishan");

                            for (int i = 0; i < students.length(); i++) {
                                JSONObject student = students.getJSONObject(i);
                                String name = student.getString("name");
                                String problem = student.getString("problem");
                                String reply = student.getString("reply");

                                text.append(name + " " + problem + " " + reply + "\n");
                            }
                            text.append("===");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(forum.this, error.getMessage().toString(), Toast.LENGTH_LONG).show();

                        text.append("eroor response");
                    }
                });
                requestQueue.add(jsonObjectRequest);
            }
        });
    }

}





































































//    public void post_problem(View view){
//        text.append("hulalalallalala");
//        JsonObjectRequest jsonObjectRequest= new JsonObjectRequest(Request.Method.POST, showdata, new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                try {
//                    JSONArray student=response.getJSONArray("forum_kishan");
//                    for(int i=0; i<student.length(); i++){
//                        JSONObject students =student.getJSONObject(i);
//
//                        String name=students.getString("name");
//                        String problem=students.getString("problem");
//                        String reply=students.getString("reply");
//                        text.append(name+" "+problem+" "+reply+"\n");
//                    }
//                    text.append("===\n");
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//requestQueue.add(jsonObjectRequest);
//    }
//



