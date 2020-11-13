package com.example.madhu.kishann;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Khaire extends AppCompatActivity {
TextView tv;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp=MediaPlayer.create(this,R.raw.khairey);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaire);

      tv=(TextView)findViewById(R.id.khairep);
        loadText();
    }
   private void loadText(){
        String s="लक्ष्यण\n" +
                "पात वा धानका गेडामा ससाना गोलाकार वा लाम्चो खैरो थोप्लाहरु देखिन्छन|\nब्यबस्थापन्:\n-रोगी खेतको पानी निरोगी खेतमा नलगाउने|" +
                "\n-यो रोग विशेस गरेर मलजल नपुगेको अवस्थामा हुने हुँदा उपयुक्त मलजलको प्रयोग गर्ने|\n" +
                "-यो रोग बिउबाट पनि सर्ने भएकाले एग्रोसान जी.एन. वा वेभिशतिन २.५ ग्राम प्रति के.जी. बिउका दरले बिउ उपचार गर्ने| " +
                "\n-चैत्र महिनाको पहिलो हप्ता सिफारिस गरिएका जातहरु सिचाई गरिएको ठाउमा रोप्ने |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }


    @Override
    public void onBackPressed() {
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.khairey);
        super.onBackPressed();
    }

    public void khaire_clickplay(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.start();
    }

    public void khaire_clickpause(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.khairey);
    }
}
