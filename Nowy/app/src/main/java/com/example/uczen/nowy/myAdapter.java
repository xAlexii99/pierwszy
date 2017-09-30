package com.example.uczen.nowy;

import android.content.Context;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by uczen on 2017-09-30.
 */

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    private Context context;
    private List<album> albums;

    public myAdapter (Context context,List albums){
        this.albums = albums;
        this.context= context;
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.activity_nie,parent,false);

        return new myViewHolder(view,context,this);

    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.przypisanieWidoku(albums.get(position));
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }
    public void removeAlbum(int pos){
        albums.remove(pos);
        notifyItemRemoved(pos);

    }
    public void addAlbum(album album){
        albums.add(album);
        notifyItemInserted(albums.size());
    }
}
