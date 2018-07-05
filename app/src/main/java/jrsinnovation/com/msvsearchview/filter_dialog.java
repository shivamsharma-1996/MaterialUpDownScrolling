package jrsinnovation.com.msvsearchview;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class filter_dialog extends DialogFragment
{
    TextView tv_nameFilter, tv_addressFilter, tv_numberFilter;
    FloatingActionButton fab_cancel, fab_submit;
    public filter_dialog()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View filterDialog_view = getLayoutInflater().inflate(R.layout.filter_dialog ,  container, false);
        //tv_nameFilter = filterDialog_view.findViewById(R.id.filter_name);
       /// tv_addressFilter = filterDialog_view.findViewById(R.id.filter_address);
       // tv_numberFilter = filterDialog_view.findViewById(R.id.filter_number);

        fab_cancel = filterDialog_view.findViewById(R.id.fab_cancel);
        fab_submit = filterDialog_view.findViewById(R.id.fab_submit);

        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return filterDialog_view;
    }


    @Override
    public void onStart()
    {
        super.onStart();

        fab_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                 // getDialog().dismiss();
                  getActivity().finish();
            }
        });

        fab_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                getActivity().finish();
            }
        });
    }


}
