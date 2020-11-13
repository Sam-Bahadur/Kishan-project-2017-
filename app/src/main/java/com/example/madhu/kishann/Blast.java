package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Blast extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blast);
        tv=(TextView)findViewById(R.id.textView5);
        loadText();
    }
    public void loadText(){
        String s="लक्ष्यण :\n" +
                "पातमा लामो खैरो थोप्ला साथै थोप्लाको बिचमा सेतो टिका देखिन्छ | " +
                "बाला मुन्तिरको डाठ वरिपरि वा आंख्लामा खैरो रंगको दाग देखिन्छ | " +
                "व्यवस्थापन :\n" +
                "-बेभिस्टन क्यापटन वा थिरम २-३ ग्राम प्रति के. जी. बिउ उपचार गरि ब्याडमा राख्ने | " +
                "\n - खेतमा पानि जमाई राख्ने |\n" +
                "- ब्याडमा रोग लागेमा हिनोसान १ मिलिल्टर प्रति लिटर पानीका दरले ब्याडमा छर्ने |  " +
                "\n - बोट गजाई रहेको बेलामा हिनोसान १.५ मिलिलिटर प्रति लिटर पानीका दरले १०/१५ दिनको फरकमा २ पटक छर्ने |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
