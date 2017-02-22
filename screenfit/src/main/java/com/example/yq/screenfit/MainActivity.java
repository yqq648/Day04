package com.example.yq.screenfit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements LeftFragment.SelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//布局是动态的，因为配置了屏幕适配 两套布局values.values-w480dp
        //activity_main.xml   left_right.xml
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.left)!=null){
            LeftFragment leftFragment = new LeftFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.left,leftFragment).commit();
        }
//        dp->px
//        Toast.makeText(this, ""+getResources().getDimension(R.dimen.padding_left), Toast.LENGTH_SHORT).show();
    }

    @Override//Fragment之间的交互,是通过Activity的实现接口来控制
    public void selectedItem(int position) {
        RightFragment rightFragment = (RightFragment) getSupportFragmentManager()
                .findFragmentById(R.id.right_fragment);
        if (rightFragment!=null){
            rightFragment.update(position);
        }else{//一个屏幕的时候，直接替换布局
            rightFragment = new RightFragment();
            rightFragment.currentPosition = position;
            //
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.left,rightFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
