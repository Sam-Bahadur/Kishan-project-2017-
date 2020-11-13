package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Barkhe extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barkhe);
        tv=(TextView)findViewById(R.id.textView13);
        loadText();
    }
    public void loadText(){
        String s="सबैभन्दा बढी प्रचलनमा रहेको धान बर्खे धान हो | धान खेति गरिने नेपालका ९२ % स्थानमा यो खेति गरिन्छ | बर्षाको पानीमा निर्भर रहने पहाडका धेरै जस्तो ठाउहरु तथा तराईका केहि स्थानमा बर्खे धान लोकप्रिय छ | " +
                "असार महिनामा रोपाई गरि मंगसिर महिनामा स्यहारिने यो धान धेरै जसो नेपालीको प्रमुख खाद्धन  बालि हो |" +
                " सावित्री , राधा ४,राधा १२, मकवानपुर १ ,सोना मन्सुली लगायतका १५ प्रकारका धानहरू यो सिजनमा उत्पादन गरिन्छ | " +
                "अन्य स्थानीय प्रकारका धानहरू, जसको नाम ठाउँ अनुसार फरक फरक हुन्छ, पनि प्रचलित बर्खे धान हुन् | ";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
