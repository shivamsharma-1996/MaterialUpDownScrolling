package jrsinnovation.com.msvsearchview.new_era;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import jrsinnovation.com.msvsearchview.R;

public class Graph extends Fragment
{
    View graphView;
    ImageView next, pre;
    public Graph()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        graphView = inflater.inflate(R.layout.fragment_graph, container, false);
        pre = graphView.findViewById(R.id.pre);
        next = graphView.findViewById(R.id.next);

        return graphView;
    }

    @Override
    public void onStart() {
        super.onStart();

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

            }
        });

        pre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
