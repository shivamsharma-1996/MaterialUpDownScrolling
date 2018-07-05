package jrsinnovation.com.msvsearchview.new_era;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import jrsinnovation.com.msvsearchview.R;


public class TodayActivity extends Fragment {


    View todayView;
    public TodayActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment

        todayView =  inflater.inflate(R.layout.fragment_today, container, false);
        return todayView;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        }

    @Override
    public void onStop() {
        super.onStop();
        }
}
