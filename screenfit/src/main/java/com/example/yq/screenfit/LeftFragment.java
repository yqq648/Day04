package com.example.yq.screenfit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by yq on 2017/2/22.
 */
public class LeftFragment extends ListFragment {
    String[] lefts = {"小草","小燕子",
            "让我们荡起双桨","卖报歌"};
    public int currentPosition = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        selectedListener = (SelectedListener) context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_activated_1,lefts));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        getListView().setItemChecked(currentPosition, true);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        currentPosition = position;
        getListView().setItemChecked(currentPosition, true);
        selectedListener.selectedItem(position);
    }
    private SelectedListener selectedListener;
    public interface SelectedListener{
        void selectedItem(int position);
    }
}