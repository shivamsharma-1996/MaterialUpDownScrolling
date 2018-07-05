package jrsinnovation.com.msvsearchview.new_era;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by shivam sharma on 8/9/2017.
 */
public class TabPagerAdapter extends FragmentPagerAdapter
{
    private Context context;

    public TabPagerAdapter(FragmentManager fm, Context context)
    {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                Graph graph = new Graph();
                return graph;
            case 1:
                TodayActivity todayActivity = new TodayActivity();
                return todayActivity;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "graph\nActivity";
            case 1:
                return "today\nActivity";
            default:
                return null;

        }
    }
}

