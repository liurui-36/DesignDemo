package com.sdky.designdemo;

import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BottomSheetActivity extends AppCompatActivity {

    @BindView(R.id.layout)
    LinearLayout layout;

    BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initView();
    }

    private void initView() {
        bottomSheetBehavior = BottomSheetBehavior.from(layout);
    }

    @OnClick({R.id.btn, R.id.btn2})
    public void onViewClicked(View view) {
        if (view.getId() == R.id.btn) {
            if (bottomSheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        } else {
            bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            Toast.makeText(this, "点击了按钮", Toast.LENGTH_SHORT).show();
        }

    }
}
