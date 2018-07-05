package jrsinnovation.com.msvsearchview;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.claudiodegio.msv.MaterialSearchView;
import com.claudiodegio.msv.OnSearchViewListener;
import com.claudiodegio.msv.SuggestionMaterialSearchView;

import java.util.ArrayList;
import java.util.List;

import jrsinnovation.com.msvsearchview.new_era.TabPagerAdapter;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener
{
    private Toolbar mToolbar;

    private ViewPager mViewPager;
    private TabPagerAdapter tabPagerAdapter;
    private TabLayout mTabLayout;

    private DrawerLayout navDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ERA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager =  findViewById(R.id.tabPager);
        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager() , this);
        mViewPager.setAdapter(tabPagerAdapter);

        mTabLayout =  findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

        navDrawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, navDrawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        navDrawer.addDrawerListener(mDrawerToggle);
        mDrawerToggle.setDrawerIndicatorEnabled(false);
        mDrawerToggle.setHomeAsUpIndicator(R.drawable.drawer_toggle);
        mDrawerToggle.setToolbarNavigationClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (navDrawer.isDrawerVisible(GravityCompat.START))
                {
                    navDrawer.closeDrawer(GravityCompat.START);
                }
                else
                {
                    navDrawer.openDrawer(GravityCompat.START);
                }
            }
        });
        mDrawerToggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        return false;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
