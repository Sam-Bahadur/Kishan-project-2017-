package com.example.madhu.kishann;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Paatkofed extends AppCompatActivity {
TextView tv;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp=MediaPlayer.create(this,R.raw.patkofed);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paatkofed);
        tv=(TextView)findViewById(R.id.textView3);
        loadText();
    }
    public void loadText(){
        String s="पातको फेदमा अन्दाकार थोप्लाहरु देखिन्छन जुन पहिला  खैरा खैरा " +
                "हरियो रंगका हुन्छन | पछि यी थोप्लाहरु आकारमा वृद्धि भइ बेआकारका बन्दछन " +
                "जुन पछि गएर खैरा रंगमा परिणत हुन्छन र ढुसीको कालो गिर्खाहरु देखा पर्दछ|  " +
                "प्रकोप बढी भएमा यी थोलाहरु बोटको माथिल्लो भागमा सर्दै सबै पातमा  " +
                "समेत पुग्दछन र पुरै पात डड्छन र फलस्वरुप पुरै बोट डडेको जस्तो देखिन्छ | \n" +
                "व्यवस्थापन: \n" +
                "- सिफारिस अनुसार नाइट्रोजन मात्र प्रयोग गर्ने | \n" +
                "- फार्वेण्डाजिम वा डोरोसाल ५० % डब्लु पी ढुसिनासक विषादी १.५ ग्राम " +
                "प्रति लिटर पानीमा मिसाई १०-१२ दिनको फरकमा २ पटक छर्किने |\n" +
                "उन्नत जातको धान रोप्दा बोट देखि बोटको दुरी बढाउने |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }

    @Override
    public void onBackPressed() {
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.patkofed);
        super.onBackPressed();
    }

    public void patkofed_clickplay(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.start();
    }

    public void patkofed_clickpause(View v){
//        final MediaPlayer mp=MediaPlayer.create(this,R.raw.me);
        mp.stop();
        mp=MediaPlayer.create(this,R.raw.patkofed);
    }
}
