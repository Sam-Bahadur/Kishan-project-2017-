package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class paatmaruwa extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paatmaruwa);
        tv=(TextView)findViewById(R.id.textView8);
        loadText();
    }
    public void loadText(){
        String s="लक्ष्यण\n" +
                "यो रोगको  लक्ष्यण  पातमा बडी देखा पर्छ | पातको किनारा वा कुनै भागबाट पानीले भिजेको " +
                "जस्तो लामो अर्धपारदर्शक लामो पहेलो वा खैरो रंगका धर्साहरु देखिन्छन | यी धर्साहरु पछि गएर लम्बाई यी धर्साहरु पछि गएर लम्बाई अथवा चौडाई दुवै तिर बद्छन" +
                "र पछि पुरै पात बटारिएर सुक्ने र यसको प्रकोप गान्जमा पनि देखिन्छ|" +
                " यो रोग डढुवा नै हो कि होइन भनि जाँच्न रोगि पातलाई काटेर पानि भरेको सिसाको ग्लास वा  " +
                "टेस्ट ट्युबमा नचलाई राखेमा काटिएको भागबाट मसिना धर्साहरुका रुपमा किटाणु पानीमा झरेको देखिन्छ | \nब्यबस्थापन्:" +
                "- नाइट्रोजनयुक्त मल बडी प्रयोग नगरी सिफारिस अनुसार रासायनिक मल हाल्ने |\n" +
                "- हिले ब्याडको सट्टा धुले ब्याड राख्ने |" ;
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
