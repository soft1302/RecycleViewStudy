package com.recycleviewstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecycleViewAdapter adapter;
    private List<User> listDatas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i < 5; i++) {
            listDatas.add(new User());
        }
        adapter = new RecycleViewAdapter(this, listDatas);
        recyclerView.setAdapter(adapter);
        adapter.setListener(new RecycleViewClickListener() {
            @Override
            public void onClick(int position, View view) {
                Toast.makeText(MainActivity.this, "点击了" + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(int position, View view) {
                Toast.makeText(MainActivity.this, "长安了" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
