package com.example.yq.screenfit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yq on 2017/2/22.
 */

public class RightFragment extends Fragment {
    TextView textView;
    int currentPosition = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        textView = new TextView(getContext());
        textView.setText(contents[currentPosition]);
        return textView;
    }

    public void update(int position) {
        currentPosition = position;
        textView.setText(contents[currentPosition]);
    }
    String[] contents = {"小草-没有花香没有树高\n" +
            "我是一棵无人知道小草\n" +
            "从不寂寞从不烦恼\n" +
            "你看我的伙伴遍及天涯海角\n" +
            "春风啊春风你把我吹绿\n" +
            "阳光啊阳光你把我照耀\n" +
            "河流啊山川你哺育了我\n" +
            "大地啊母亲把我紧紧拥抱\n" +
            "春风啊春风你把我吹绿\n" +
            "阳光啊阳光你把我照耀\n" +
            "河流啊山川你哺育了我\n" +
            "大地啊母亲把我紧紧拥抱\n" +
            "没有花香没有树高\n" +
            "我是一棵无人知道小草\n" +
            "从不寂寞从不烦恼\n" +
            "你看我的伙伴遍及天涯海角",
            "小燕子-小燕子穿花衣\n" +
                    "年年春天到这里\n" +
                    "我问燕子你为啥来\n" +
                    "燕子说 这里的春天最美丽\n" +
                    "小燕子告诉你\n" +
                    "今年这里更美丽\n" +
                    "我们盖起了大工厂\n" +
                    "装上了新机器\n" +
                    "欢迎你长期住在这里\n" +
                    "小燕子穿花衣\n" +
                    "年年春天到这里\n" +
                    "我问燕子你为啥来\n" +
                    "燕子说 这里的春天最美丽\n" +
                    "小燕子告诉你\n" +
                    "今年这里更美丽\n" +
                    "我们盖起了大工厂\n" +
                    "装上了新机器\n" +
                    "欢迎你长期住在这里",
            "让我们荡起双桨-让我们荡起双桨\n" +
                    "小船儿推开波浪\n" +
                    "海面倒映着美丽的白塔\n" +
                    "四周环绕着绿树红墙\n" +
                    "小船儿轻轻\n" +
                    "飘荡在水中\n" +
                    "迎面吹来了凉爽的风\n" +
                    "红领巾迎着太阳\n" +
                    "阳光洒在海面上\n" +
                    "水中鱼儿望着我们\n" +
                    "悄悄地听我们愉快歌唱\n" +
                    "小船儿轻轻\n" +
                    "飘荡在水中\n" +
                    "迎面吹来了凉爽的风\n" +
                    "做完了一天的功课\n" +
                    "我们来尽情欢乐\n" +
                    "我问你亲爱的伙伴\n" +
                    "谁给我们安排下幸福的生活",
            "卖报歌-啦啦啦 啦啦啦\n" +
                    "我是卖报的小行家\n" +
                    "不等天明去等派报\n" +
                    "一面走 一面叫\n" +
                    "今天的新闻真正好\n" +
                    "七个铜板就买两份报\n" +
                    "啦啦啦 啦啦啦\n" +
                    "我是卖报的小行家\n" +
                    "大风大雨里满街跑\n" +
                    "走不好 滑一跤\n" +
                    "满身的泥水惹人笑\n" +
                    "饥饿寒冷只有我知道\n" +
                    "啦啦啦 啦啦啦"};
}
