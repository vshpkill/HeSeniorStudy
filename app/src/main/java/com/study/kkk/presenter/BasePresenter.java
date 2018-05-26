package com.study.kkk.presenter;

import com.study.kkk.interfaces.BaseViewModel;

public abstract class BasePresenter<T extends BaseViewModel> {
    protected T t;

    public BasePresenter(T t) {
        this.t = t;
    }

    public void onDetached() {
        t = null;
    }
}
