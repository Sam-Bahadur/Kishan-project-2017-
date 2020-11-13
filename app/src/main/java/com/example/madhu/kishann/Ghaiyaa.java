package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Ghaiyaa extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghaiyaa);
        tv=(TextView)findViewById(R.id.textView2);
        loadText();
    }
    public void loadText(){
        String s="यो धान बिशेस गरेर नेपालको पहाडी जिल्ला हरु तथा तराइका केहि जिल्ला हरुमा पाइन्छ | " +
                "सिँचाईको लागि बर्षाको पानीमा निर्भर रहने किशानहरुको लागि यो धान अतिनै उत्तम मानिन्छ | " +
                "घैया- २ लोकप्रिय घैया धान हो तथापि अन्य स्थानिय धानहरु पनि प्रचलनमा छन् |  " +
                "बिशेस गरि असार महिनामा रोपी कार्तिक महिनातिर स्याहरिने यो धान छिट्टै उत्पादन हुने र कम पानि चाहिने धान हो | " +
                "रोग बाट छिट्टै आक्रमण हुने र कम उत्पादन हुने हुदा यो धान लोप हुने अवस्थामा पुगेको छ |";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);

    }
}
