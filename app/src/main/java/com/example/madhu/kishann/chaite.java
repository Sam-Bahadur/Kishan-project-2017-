package com.example.madhu.kishann;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class chaite extends AppCompatActivity {
TextView tv;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp=MediaPlayer.create(this,R.raw.chaite);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaite);
        tv=(TextView)findViewById(R.id.textView11);
        loadText();
    }
    public void loadText(){
String s="चैत्र महिनामा रोपिने हुनाले यो धानको नाम चैते धान हुन गएको हो |" +
        "यो धानमा करिब ११ प्रजातिका धानहरू प्रदछन |" +
        "नेपालका हरेक क्षेत्रमा चैत्र महिनामा सिंचाइको सुबिधा नहुने हुदा जम्मा ५० जिल्लामा मात्र चैते धानको उत्पातादन हुन्छ |" +
        " हर्दिनाथ -१ ,चैते-२,चैते-४,सी. एच.-४५   प्रचलित चैते धान हरु हुन् जसमध्ये चैते-२ पुर्बी तराईक जिल्लाहरु झापा,बारामा उत्पादन हुन्छ भने चैते -४ " +
        "मोरंग, झापा, सुनसरी,चितवन,धनुषामा फलाइञ्छ | त्यस्तै सी. एच. ४५ पहाडी जिल्लाहरुमा उत्पादन गरिन्छ |  ";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }

    @Override
    public void onBackPressed() {
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.chaite);
        super.onBackPressed();
    }

    public void chaite_clickplay(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.start();
    }

    public void chaite_clickpause(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.chaite);
    }
}
