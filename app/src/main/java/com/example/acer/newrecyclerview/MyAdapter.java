package com.example.acer.newrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] n,s;
    int[] i;

    public MyAdapter(MainActivity mainActivity, String[] names, String[] subtitle, int[] images) {
        this.context=mainActivity;
        this.n=names;
        this.s=subtitle;
        this.i=images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.design,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int im) {
        myViewHolder.iv.setImageResource(i[im]);
        myViewHolder.name.setText(n[im]);
        myViewHolder.subtitle.setText(s[im]);

    }

    @Override
    public int getItemCount() {
        return n.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView name,subtitle;
        public MyViewHolder(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.imageview);
            name=itemView.findViewById(R.id.name);
            subtitle=itemView.findViewById(R.id.subtitle);
        }
    }
}
