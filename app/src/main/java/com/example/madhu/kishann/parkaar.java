package com.example.madhu.kishann;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class parkaar extends Fragment{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_parkaar);
//    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.activity_parkaar, container, false);
        Button b = (Button) rootView.findViewById(R.id.button9);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), boro.class);
                startActivity(i);

            }
        });
        Button c = (Button) rootView.findViewById(R.id.button10);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), chaite.class);
                startActivity(i);

            }
        });
        Button d = (Button) rootView.findViewById(R.id.button6);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Bhadaiyaa.class);
                startActivity(i);

            }
        });
        Button e = (Button) rootView.findViewById(R.id.button8);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Barkhe.class);
                startActivity(i);

            }
        });
        Button f = (Button) rootView.findViewById(R.id.button2);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Ghaiyaa.class);
                startActivity(i);

            }
        });
        return rootView;

    }

//    public void borod(View v){
//        Intent intent=new Intent(getActivity(),boro.class);
//        startActivity(intent);
//
//    }
//    public void chaited(View v) {
//        Intent intent = new Intent(getActivity(), chaite.class);
//        startActivity(intent);
//    }
//    public void bhadaiyaad(View v) {
//        Intent intent = new Intent(getActivity(), Bhadaiyaa.class);
//        startActivity(intent);
//    }
//    public void barkhed(View v) {
//        Intent intent = new Intent(getActivity(), Barkhe.class);
//        startActivity(intent);
//    }
//    public void ghaiyaad(View v) {
//        Intent intent = new Intent(getActivity(), Ghaiyaa.class);
//        startActivity(intent);
//    }
}
