package com.example.uczen.nowy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class przypomnienie extends AppCompatActivity {

    private Button a;
    private Button b;
    private Button c;
    private TextView d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przypomnienie);
        a= (Button) findViewById(R.id.a);
        b= (Button) findViewById(R.id.b);
        c= (Button) findViewById(R.id.c);
        d= (TextView) findViewById(R.id.d);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setTextColor(getResources().getColor(R.color.czerwony));
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setTextColor(getResources().getColor(R.color.niebieski));
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setTextColor(getResources().getColor(R.color.zielony));
            }
        });
    }
}
