package com.sdky.designdemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        Snackbar.make(getWindow().getDecorView(), "点击了Float按钮", Snackbar.LENGTH_LONG)
                .setAction("知道了", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Utils.toast(FloatingActionButtonActivity.this, "点击了Snackbar Action");
                    }
                }).show();
    }
}
