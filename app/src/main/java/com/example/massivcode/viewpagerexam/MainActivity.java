package com.example.massivcode.viewpagerexam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Fragment> mList;
    private PagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mList = new ArrayList<>();

        mList.add(new Fragment1());
        mList.add(new Fragment2());
        mList.add(new Fragment3());

        mAdapter = new PagerAdapter(getSupportFragmentManager(), mList);

        mViewPager.setAdapter(mAdapter);
    }
}
