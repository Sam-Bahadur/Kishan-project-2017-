package com.example.madhu.kishann;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class videogallary extends AppCompatActivity {
Button clk;
    VideoView videov;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videogallary);
        clk=(Button)findViewById(R.id.playvideo);
        videov=(VideoView)findViewById(R.id.videoView);
        mediaC=new MediaController(this);
    }

    public void playvideo(View v){
String videopath="android.resource://com.example.madhu.kishann/"+R.raw.ropai;
        Uri uri=Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaC);
        mediaC.setAnchorView(videov);
        videov.start();
    }
}
