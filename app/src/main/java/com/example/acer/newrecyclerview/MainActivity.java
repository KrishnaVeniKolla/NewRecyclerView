package com.example.acer.newrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[] names={"name1","name2","name3","name4","name5"};
    String[] subtitle={"title1","title2","title3","title4","title5"};
    int[] images={R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);
rv.setLayoutManager(new LinearLayoutManager(this));
rv.setAdapter(new MyAdapter(this,names,subtitle,images));
    }
}
