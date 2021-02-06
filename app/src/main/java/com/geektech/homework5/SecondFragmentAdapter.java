package com.geektech.homework5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragmentAdapter extends RecyclerView.Adapter<SecondFragmentAdapter.MainViewHolder> {


    ArrayList<Counter> list;

    public SecondFragmentAdapter() {
        ArrayList<Counter> list = new ArrayList<>();
        this.list = list;
    }

    public void addText(ArrayList<Counter> number) {
        list = number;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SecondFragmentAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.count_list, parent, false);

        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView numbers;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            numbers = itemView.findViewById(R.id.numbers);
        }

        public void onBind(Counter number) {
            numbers.setText(number.number);


        }
    }

}
