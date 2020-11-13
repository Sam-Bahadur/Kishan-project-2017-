package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bacterialleaf extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacterialleaf);
        tv=(TextView)findViewById(R.id.textView6);
        loadText();
    }
    public void loadText(){
        String s="लक्ष्यण :\n" +
                "पातको किनाराबाट लामो पहेंलो वा खैरो रंगको धर्साहरु देखिन्छन र पातको टुप्पो सुकेर मर्दछ |" +
                "\nव्यवस्थापन :\n" +
                "- एग्रिमाइसिन-१०० ,0 .२५ ग्राम प्रति लिटर पानीको झोल बनाई बिउलाई ३० मिनेटसम्म डुबाएर बिउ उपचार गरि ब्याडमा राख्ने |" +
                "\n- रोग लागेको खेतमा केहि दिन पानी सुकाइदिने |" +
                "\n- रोग अवरोधक जातहरु लगाउने |" +
                "\nसिफारिस अनुसार राससयानिक मल हाल्ने |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
