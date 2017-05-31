package com.kbeta.jni.learnjni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
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
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,BaseDataTypeActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,StringTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,ArrayTypeActivity.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
    }

    private List<String> getTitleList(){
        List<String> titles = new ArrayList<>();
        titles.add("基本类型");
        titles.add("字符串操作");
        titles.add("对象操作");
        titles.add("数组操作");
        titles.add("数组对象操作");
        return titles;
    }
}
