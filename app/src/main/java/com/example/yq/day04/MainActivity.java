package com.example.yq.day04;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //crop裁剪
    public void cropClick(View view) {
        TouchImageView iv = (TouchImageView) findViewById(R.id.iv);
        /** 如何拿到ImageView的src.Drawable相当于是所有图片资源的父类 */
        BitmapDrawable mDrawable =  (BitmapDrawable)
                iv.getDrawable();
        Bitmap mBitmap = mDrawable.getBitmap();//原图
        //TouchImageView缩放之后的 小图的坐标x,y width,height
        RectF rect = iv.getZoomedRect();
        //大图中截取小图
        Bitmap newBitmap = Bitmap.createBitmap(mBitmap,
                (int)rect.left,(int)rect.top,
                (int)rect.width(),(int)rect.height());
        //设置到其它View上显示截图
        ImageView new_iv = (ImageView) findViewById(R.id.new_iv);
        new_iv.setImageBitmap(newBitmap);
    }
}