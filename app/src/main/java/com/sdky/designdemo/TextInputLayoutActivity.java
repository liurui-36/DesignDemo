package com.sdky.designdemo;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TextInputLayoutActivity extends AppCompatActivity {

    @BindView(R.id.til_pwd)
    TextInputLayout tilPwd;
    @BindView(R.id.til_user)
    TextInputLayout tilUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        initView();
    }

    private void initView() {
        tilUser.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() > 11) {
                    tilUser.setError("Username error");
                    tilUser.setErrorEnabled(true);
                } else {
                    tilUser.setErrorEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        tilPwd.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() < 6) {
                    tilPwd.setError("Password error");
                    tilPwd.setErrorEnabled(true);
                } else {
                    tilPwd.setErrorEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @OnClick(R.id.bt_submit)
    public void onViewClicked() {
        if (tilUser.isErrorEnabled()) {
            Utils.toast(this, "用户名错误");
        } else if (tilPwd.isErrorEnabled()) {
            Utils.toast(this, "密码错误");
        } else {
            Utils.toast(this, "登录");
        }
    }
}
