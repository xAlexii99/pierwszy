package com.example.uczen.nowy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by uczen on 2017-09-30.
 */

public class activity_niewiem extends AppCompatActivity {
    private RecyclerView recycler;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tak);
        recycler =(RecyclerView) findViewById(R.id.a);

        List<album> albums = new LinkedList<>();
        albums.add(new album("egzotyka","2017","Quebonafide",R.drawable.egzotyka));
        albums.add(new album("egoteryka","2017","Quebonafide",R.drawable.ezoteryka));
        albums.add(new album("utopia","2016","Quebonafide",R.drawable.utopia));
        albums.add(new album("egzotyka","2017","Quebonafide",R.drawable.egzotyka));
        albums.add(new album("egoteryka","2017","Quebonafide",R.drawable.ezoteryka));
        albums.add(new album("utopia","2016","Quebonafide",R.drawable.utopia));
        albums.add(new album("egzotyka","2017","Quebonafide",R.drawable.egzotyka));
        albums.add(new album("egoteryka","2017","Quebonafide",R.drawable.ezoteryka));
        albums.add(new album("utopia","2016","Quebonafide",R.drawable.utopia));

        myAdapter adapter = new myAdapter(this, albums);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
    }

}
