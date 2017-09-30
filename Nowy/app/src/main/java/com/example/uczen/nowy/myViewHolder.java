package com.example.uczen.nowy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by uczen on 2017-09-30.
 */

public class myViewHolder extends RecyclerView.ViewHolder {
    private TextView Autor;
    private TextView Data_wydania;
    private TextView Tytuł;
    private ImageView Okładka;
    private Context context;

    public myViewHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        Autor = (TextView) itemView.findViewById(R.id.w);
        Data_wydania = (TextView) itemView.findViewById(R.id.e);
        Tytuł = (TextView) itemView.findViewById(R.id.q);
        Okładka = (ImageView) itemView.findViewById(R.id.ccc);

    }
     public void przypisanieWidoku(album a){
         Autor.setText(a.getAutor());
         Data_wydania.setText(a.getData_wydania());
         Tytuł.setText(a.getTytuł());
         Okładka.setImageDrawable(context.getResources().getDrawable(a.getIdOkladki()));
     }
}
