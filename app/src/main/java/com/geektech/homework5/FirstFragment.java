package com.geektech.homework5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    RecyclerView recyclerView;
    List<username> list;

    FirstFragmentAdapter adapter;


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
        adapter = new FirstFragmentAdapter();
        recyclerView.setAdapter(adapter);
        list = new ArrayList<>();

        ArrayList<username> list = new ArrayList<>();
        list.add(0, new username("Айдар", "Касымбеков"));
        list.add(1, new username("Айдар", "Касымбеков"));
        list.add(2, new username("Айдар", "Касымбеков"));
        list.add(3, new username("Айдар", "Касымбеков"));
        list.add(4, new username("Айдар", "Касымбеков"));
        list.add(5, new username("Айдар", "Касымбеков"));
        list.add(6, new username("Айдар", "Касымбеков"));
        list.add(7, new username("Айдар", "Касымбеков"));
        list.add(8, new username("Айдар", "Касымбеков"));
        list.add(9, new username("Айдар", "Касымбеков"));
        list.add(10, new username("Айдар", "Касымбеков"));
        adapter.addText(list);

    }

}