package com.example.faizanmalik.sjbxsj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.faizanmalik.sjbxsj.Adapter.Recycler_Adapter;
import com.example.faizanmalik.sjbxsj.Model.Model_recycler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Model_recycler> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        list=new ArrayList<Model_recycler>();
        listData();

        Recycler_Adapter recycler_adapter=new Recycler_Adapter(getApplicationContext(),list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recycler_adapter.notifyDataSetChanged();
        recyclerView.setAdapter(recycler_adapter);
    }

    private void listData() {

        list.add(new Model_recycler(R.drawable.bike2,"pakistan","Unity Tripra A"));
        list.add(new Model_recycler(R.drawable.bike4,"Lahore","Adnan"));
        list.add(new Model_recycler(R.drawable.bike2,"Isb","Azam"));
        list.add(new Model_recycler(R.drawable.bike4,"Skp","Amir"));

    }
}
