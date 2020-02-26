package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    users users;
    List<users> mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylist = new ArrayList<>();
        mylist.add(new users(1,"sehdev kumar is good programmer"));
        mylist.add(new users(2,"Ram is good employee"));
        mylist.add(new users(3,"James is so lucky"));
        mylist.add(new users(4,"Devid is so excited"));
        mylist.add(new users(5,"Seeta is beautiful girl"));
        mylist.add(new users(6,"Brajesh is best friend "));
        mylist.add(new users(7,"Divaker is taking enjoy"));
        mylist.add(new users(8,"sumit is not good boy"));
        mylist.add(new users(9,"Rani is so sad"));
        mylist.add(new users(10,"Mohan is late"));



        recyclerView = findViewById(R.id.recycle);
        adapterClass us = new adapterClass(this,mylist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(us);







    }
}
