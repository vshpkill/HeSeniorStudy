package com.study.kkk.android1_base.lesson1_touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

public class MyButton extends android.support.v7.widget.AppCompatButton {

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                getParent().requestDisallowInterceptTouchEvent(true);
                Log.e("触摸事件", "Button_Touch_ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("触摸事件", "Button_Touch_ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("触摸事件", "Button_Touch_ACTION_UP");
                break;

        }
        return true;
    }
}
