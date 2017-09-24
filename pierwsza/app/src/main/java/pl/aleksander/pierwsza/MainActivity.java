package pl.aleksander.pierwsza;

import android.graphics.*;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private TextView tak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zad8);

        tak =(TextView) findViewById(R.id.a);

        String napis = tak.getText().toString();


        Lista1.add(film);
        Lista1.add(film2);
        Lista1.add(film3);
        Lista1.add(film4);

        for(int i=0;i<Lista1.size();i++){
            tak.append("tytuł: \"" + Lista1.get(i).getTitle() + "\" Długość: " + Lista1.get(i).getLength() + "min" + "\n");
        }


    }



        Film film = new Film("tak", 124);
        Film film2 = new Film("Takie tam", 154);
        Film film3 = new Film("Narnia", 211);
        Film film4 = new Film("Darek mój przydupas", 230);

        LinkedList<Film> Lista1 = new LinkedList<>();




}
