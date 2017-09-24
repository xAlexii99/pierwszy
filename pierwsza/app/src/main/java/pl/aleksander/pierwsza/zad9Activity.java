package pl.aleksander.pierwsza;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by uczen on 2017-09-24.
 */

public class zad9Activity extends AppCompatActivity {
    private AppCompatEditText edit;
    private Button przycisk;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zad9);

        edit = (AppCompatEditText) findViewById(R.id.b);
        przycisk = (Button) findViewById(R.id.c);
        text = (TextView) findViewById(R.id.d);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edit.getText().toString();
                text.setText(s);
            }

        });
    }
}

