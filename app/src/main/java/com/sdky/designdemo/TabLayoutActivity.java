package com.sdky.designdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TabLayoutActivity extends AppCompatActivity {

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tab)
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initView();
    }

    private void initView() {
        List<String> tabTitle = new ArrayList<>();
        tabTitle.add("Title 1");
        tabTitle.add("Title 2");
        tabTitle.add("Title 3");
        tabTitle.add("Title 4");
        List<Fragment> fragments = new ArrayList<>();
        for (String s : tabTitle) {
            tab.addTab(tab.newTab().setText(s));
            fragments.add(new TabFragment());
        }
        FragmentAdapter adapter =
                new FragmentAdapter(getSupportFragmentManager(), fragments, tabTitle);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
        tab.setTabsFromPagerAdapter(adapter);
    }
}
