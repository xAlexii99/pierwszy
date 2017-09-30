package com.example.uczen.nowy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by uczen on 2017-09-30.
 */

public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener{
    private TextView Autor;
    private TextView Data_wydania;
    private TextView Tytuł;
    private ImageView Okładka;
    private Context context;
    private myAdapter adapter;

    public myViewHolder(View itemView, Context context,myAdapter adapter) {
        super(itemView);
        this.context = context;
        this.adapter = adapter;
        Autor = (TextView) itemView.findViewById(R.id.w);
        Data_wydania = (TextView) itemView.findViewById(R.id.e);
        Tytuł = (TextView) itemView.findViewById(R.id.q);
        Okładka = (ImageView) itemView.findViewById(R.id.ccc);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }
     public void przypisanieWidoku(album a){
         Autor.setText(a.getAutor());
         Data_wydania.setText(a.getData_wydania());
         Tytuł.setText(a.getTytuł());
         Okładka.setImageDrawable(context.getResources().getDrawable(a.getIdOkladki()));
     }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, Tytuł.getText(),Toast.LENGTH_SHORT).show();
    }
/*uwanie*/
    @Override
    public boolean onLongClick(View view) {
        adapter.removeAlbum(getAdapterPosition());
        return false;
    }
}
