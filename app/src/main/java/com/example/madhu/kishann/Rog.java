package com.example.madhu.kishann;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;

public class Rog extends Fragment {


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_rog);
   //
// }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.activity_rog, container, false);
        Button button = (Button) rootView.findViewById(R.id.khairothople);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Khaire.class);
                startActivity(i);

            }
        });
                                      Button button2 = (Button) rootView.findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Paatkofed.class);
                startActivity(i);

            }
        });
        Button b = (Button) rootView.findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), fedkuhine.class);
                startActivity(i);

            }
        });

        Button c = (Button) rootView.findViewById(R.id.button5);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), paatmaruwa.class);
                startActivity(i);

            }
        });
        Button d = (Button) rootView.findViewById(R.id.button7);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Blast.class);
                startActivity(i);

            }
        });
        Button e = (Button) rootView.findViewById(R.id.button11);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Bacterialleaf.class);
                startActivity(i);

            }
        });
        return rootView;

    }

//    public void paat(View v){
//        Intent intent=new Intent(getActivity(),Paatkofed.class);
//        startActivity(intent);
//    }
//    public void fedku(View v){
//        Intent intent=new Intent(getActivity(),fedkuhine.class);
//        startActivity(intent);
//
//    }
//    public  void paatmaro(View view){
//        Intent intent=new Intent(getActivity(),paatmaruwa.class);
//        startActivity(intent);
//
//    }
//    public  void blastd(View view) {
//        Intent intent = new Intent(getActivity(), Blast.class);
//        startActivity(intent);
//    }
//    public  void bacterial(View view) {
//        Intent intent = new Intent(getActivity(), Bacterialleaf.class);
//        startActivity(intent);
//    }


}
