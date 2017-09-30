package com.example.uczen.nowy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by uczen on 2017-09-30.
 */

public class activity_niewiem extends AppCompatActivity {
    private RecyclerView recycler;
    private FloatingActionButton btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tak);
        recycler = (RecyclerView) findViewById(R.id.a);
        btn = (FloatingActionButton) findViewById(R.id.btn);

        List<album> albums = new LinkedList<>();
        albums.add(new album("egzotyka", "2017", "Quebonafide", R.drawable.egzotyka));
        albums.add(new album("egoteryka", "2017", "Quebonafide", R.drawable.ezoteryka));
        albums.add(new album("utopia", "2016", "Quebonafide", R.drawable.utopia));
        albums.add(new album("egzotyka", "2017", "Quebonafide", R.drawable.egzotyka));
        albums.add(new album("egoteryka", "2017", "Quebonafide", R.drawable.ezoteryka));
        albums.add(new album("utopia", "2016", "Quebonafide", R.drawable.utopia));
        albums.add(new album("egzotyka", "2017", "Quebonafide", R.drawable.egzotyka));
        albums.add(new album("egoteryka", "2017", "Quebonafide", R.drawable.ezoteryka));
        albums.add(new album("utopia", "2016", "Quebonafide", R.drawable.utopia));

        final myAdapter adapter = new myAdapter(this, albums);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                album album = new album("utopia", "2016", "Quebonafide", R.drawable.utopia);
                adapter.addAlbum(album);
                recycler.scrollToPosition(adapter.getItemCount()-1);


            }
        });


    }

}
