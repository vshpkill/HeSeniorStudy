package com.study.kkk.android1_base.lesson1_touchevent;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MyTouchView extends FrameLayout {
    public MyTouchView(@NonNull Context context) {
        super(context);
    }

    public MyTouchView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTouchView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("触摸事件", "FrameLayout_Intercept_ACTION_DOWN");
                return false;
            case MotionEvent.ACTION_MOVE:
                Log.e("触摸事件", "FrameLayout_Intercept_ACTION_MOVE");
                return true;
            case MotionEvent.ACTION_UP:
                Log.e("触摸事件", "FrameLayout_Intercept_ACTION_UP");
                return true;

        }
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("触摸事件", "FrameLayout_Touch_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("触摸事件", "FrameLayout_Touch_ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("触摸事件", "FrameLayout_Touch_ACTION_UP");
                break;

        }
        return true;
    }
}
