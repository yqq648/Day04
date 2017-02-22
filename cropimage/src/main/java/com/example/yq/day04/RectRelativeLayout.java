package com.example.yq.day04;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by yq on 2017/2/21.
 * 自定义width=height的RectTouchImageView
 * 自定义有两种：容器ViewGroup 控件View
 */
public class RectRelativeLayout extends RelativeLayout {
    public RectRelativeLayout(Context context) {
        super(context);
    }

    public RectRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override//自定义View中测量本控件宽高
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }
}
