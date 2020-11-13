package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Bhadaiyaa extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhadaiyaa);
        tv=(TextView)findViewById(R.id.textView12);
        loadText();
    }
    public void loadText(){
        String s="भदैया धान,धान उत्पादनको त्यस्तो पद्धति हो जसमा धान-आलु ,धान-तोरी ढाँचामा खेति गरिन्छ |" +
                "तथापि, उपलब्धता र प्रारम्भिक चामल विविधताको  ग्रहणका  कारण भदैया धानको अवधारणा त्यति प्रचलनमा छैन |" +
                " बैसाख/जेष्ठमा रोपाइँ गरिने यो धान भाद्र महिनामा स्याहारिन्छ | " +
                "हर्दिनाथ-१ ,बिन्देस्वारी र हाइब्रिड प्रजाति: यु. एस. ३१२ ,तेज ,चाइना बोरो आदि यो धानका प्रकार हुन् |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
