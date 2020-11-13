package com.example.madhu.kishann;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class boro extends AppCompatActivity {
    TextView tv;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp=MediaPlayer.create(this,R.raw.boro);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boro);
        tv=(TextView)findViewById(R.id.textView10);
        loadText();
    }
    public void loadText(){
        String s="'बोरो' शब्द संस्कृत शब्द 'बोरोब' बाट उत्पति भएको हो जसको अर्थ बिशेस धान उत्पादन गर्ने तरिका हो जुन  तराइ भू-भागमा प्रचलित थियो | " +
                "यो धान उत्पादन गर्ने तरिकामा जमिनमा संग्रहित पानीको सदुपयोग हुन्छ | यो धानको  ब्याड कार्तिक/मंग्सिर महिनामा राख्ने गरिन्छ भने पुष महिनामा रोपाइँ गरिन्छ र बैसाख महिनामा धान स्याहार्ने गरिन्छ |" +
                "नेपालको धेरै जसो खेत हरु जाडो सिजनमा बाँझोनै छोड्ने गरिन्छ त्यस्ता खेतहरूमा बोरो धानको खेति उपयुक्त हुन्छ | "
                ;
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }

    @Override
    public void onBackPressed() {
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.boro);
        super.onBackPressed();
    }

    public void boro_clickplay(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.start();
    }

    public void boro_clickpause(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.boro);
    }

}
