package com.kbeta.jni.learnjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.kbeta.jni.learnjni.adapter.IndexAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        IndexAdapter adapter = new IndexAdapter(getTitleList());
        recyclerView.setAdapter(adapter);
    }

    private List<String> getTitleList(){
        List<String> titles = new ArrayList<>();
        titles.add("Java_jni->String");
        titles.add("aaaa");
        return titles;
    }
}
