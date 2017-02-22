package com.example.yq.screenfit;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity
        implements LeftFragment.SelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.left)!=null){
            LeftFragment leftFragment = new LeftFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.left,leftFragment).commit();
        }
    }

    @Override
    public void selectedItem(int position) {
        RightFragment rightFragment = (RightFragment) getSupportFragmentManager()
                .findFragmentById(R.id.right_fragment);
        if (rightFragment!=null){
            rightFragment.update(position);
        }else{
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
