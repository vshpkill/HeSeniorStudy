package com.study.kkk;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.study.kkk.presenter.BasePresenter;

public abstract class BaseActivity<T extends BasePresenter> extends Activity {
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
        initView();
        loadData();
        initVariables();
    }

    abstract void initView();

    abstract void loadData();

    abstract void initVariables();

    abstract T initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetached();
        presenter = null;
    }
}
