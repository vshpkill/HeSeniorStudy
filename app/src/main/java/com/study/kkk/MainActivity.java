package com.study.kkk;

import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.study.kkk.interfaces.MainViewModel;
import com.study.kkk.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainViewModel{

    @Override
    void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    void loadData() {

    }

    @Override
    void initVariables() {

    }

    @Override
    MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
//                getParent().requestDisallowInterceptTouchEvent(true);
                Log.e("触摸事件", "Activity_Touch_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("触摸事件", "Activity_Touch_ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("触摸事件", "Activity_Touch_ACTION_UP");
                break;

        }
        return true;
    }
}
