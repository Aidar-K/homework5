package com.geektech.homework5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {


    RecyclerView recyclerView;
    List<Counter> list;

    SecondFragmentAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        adapter = new SecondFragmentAdapter();
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();

        ArrayList<Counter> list = new ArrayList<>();
        list.add(0, new Counter("1"));
        list.add(1, new Counter("2"));
        list.add(2, new Counter("3"));
        list.add(3, new Counter("4"));
        list.add(4, new Counter("5"));
        list.add(5, new Counter("6"));
        list.add(6, new Counter("7"));
        list.add(7, new Counter("8"));
        list.add(8, new Counter("9"));
        list.add(9, new Counter("10"));
        list.add(10, new Counter("11"));
        list.add(11, new Counter("12"));
        list.add(12, new Counter("13"));
        list.add(13, new Counter("14"));
        list.add(14, new Counter("15"));
        list.add(15, new Counter("16"));
        list.add(16, new Counter("17"));
        list.add(17, new Counter("18"));
        list.add(18, new Counter("19"));
        list.add(19, new Counter("20"));
        list.add(20, new Counter("21"));
        list.add(21, new Counter("22"));
        list.add(22, new Counter("23"));
        list.add(23, new Counter("24"));
        list.add(24, new Counter("25"));
        list.add(25, new Counter("26"));
        list.add(26, new Counter("27"));
        list.add(27, new Counter("28"));
        list.add(28, new Counter("29"));
        list.add(29, new Counter("30"));
        adapter.addText(list);

    }

}