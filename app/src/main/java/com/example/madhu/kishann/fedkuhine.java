package com.example.madhu.kishann;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class fedkuhine extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fedkuhine);
        tv=(TextView)findViewById(R.id.textView4);
        loadText();
    }
    public void loadText(){
        String s="लक्ष्यण\n" +
                "खेतमा रोगि बिरुवा अग्लो नहुने, पहेंलिने र अन्तमा फेद कुहिएर मर्दछन " +
                "कहिलेकाही रोगि बोटको तल्लो आङ्ख्लाहरुबाट जराहरु समेत निस्किन्छन |\n" +
                "ब्यबस्थापन्:\n -यो रोग बीउबाट सर्ने भएकाले रोगि बोट भएको खेतबाट बिउ संकलन नगर्ने |" +
                "\n-फ़ार्जेण्डाजिम वा दोरोसाल ५० % डब्लु. पी. ढुसिनासक विषादी २ ग्राम प्रति किलो बिउका दरले उपचार गरि ब्याड राख्ने |" +
                "\n- रोगग्रस्त बोटहरु उखलेर फाल्ने | ";
        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(s);
    }
}
