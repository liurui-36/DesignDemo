package com.sdky.designdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.TextInputLayout, R.id.FloatingActionButton, R.id.NavigationView, R.id.TabLayout, R.id.CoordinatorLayout,R.id.BottomSheet})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.TextInputLayout:
                Utils.startActivity(MainActivity.this, TextInputLayoutActivity.class);
                break;
            case R.id.FloatingActionButton:
                Utils.startActivity(MainActivity.this, FloatingActionButtonActivity.class);
                break;
            case R.id.NavigationView:
                Utils.startActivity(MainActivity.this, NavigationViewActivity.class);
                break;
            case R.id.TabLayout:
                Utils.startActivity(MainActivity.this, TabLayoutActivity.class);
                break;
            case R.id.CoordinatorLayout:
                Utils.startActivity(MainActivity.this, CoordinatorLayoutActivity.class);
                break;
            case R.id.BottomSheet:
                Utils.startActivity(MainActivity.this, BottomSheetActivity.class);
                break;
        }
    }
}
