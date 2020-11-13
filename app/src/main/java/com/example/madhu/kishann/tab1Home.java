package com.example.madhu.kishann;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class tab1Home extends Fragment {
    ViewPager viewpager;
   @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                       @Nullable      Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.tab1home, container, false);
return rootView;
    }
}