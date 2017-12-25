package com.sdky.designdemo;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NavigationViewActivity extends AppCompatActivity {

    @BindView(R.id.navigation_view)
    NavigationView navigationView;
    @BindView(R.id.dl_main_drawer)
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_view);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initView();
    }

    private void initView() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                switch (menuItem.getItemId()) {
                    case R.id.nav_home :
                        Utils.toast(NavigationViewActivity.this,"nav_home");
                        break;
                    case R.id.nav_messages :
                        Utils.toast(NavigationViewActivity.this,"nav_messages");
                        break;
                    case R.id.nav_friends :
                        Utils.toast(NavigationViewActivity.this,"nav_friends");
                        break;
                    case R.id.nav_discussion :
                        Utils.toast(NavigationViewActivity.this,"nav_discussion");
                        break;
                    case R.id.nav_android :
                        Utils.toast(NavigationViewActivity.this,"nav_android");
                        break;
                    case R.id.nav_ios :
                        Utils.toast(NavigationViewActivity.this,"nav_ios");
                        break;
                    default:
                        break;
                }

                return false;
            }
        });
    }

}
