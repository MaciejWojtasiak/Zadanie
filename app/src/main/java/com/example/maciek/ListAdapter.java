package com.example.maciek.odrabianiezajec;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    @NonNull
    private String[] data;
    public ListAdapter(String[] data){
        this.data = data;
    }

    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        String title = data[position];
        holder.textView.setText(title);

        Random  r = new Random();
        int minNumber= 2;
        int maxNumber = 15;
        int randomNumber = r.nextInt((maxNumber-minNumber)+1)+minNumber;

        holder.textView2.setText(String.valueOf(randomNumber));
    }


    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ListViewHolder extends  RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;


        public ListViewHolder(View itemView){
            super(itemView);
            ;

            textView2 = (TextView) itemView.findViewById(R.id.textView2);
            textView = (TextView) itemView.findViewById(R.id.textView);




        }
    }
}
