package pl.aleksander.pierwsza;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by uczen on 2017-09-24.
 */

public class zad10 extends AppCompatActivity{

    private Button przycisk;
    private Button przycisk2;
    private Button przycisk3;
    private Button przycisk4;
    private Button przycisk5;
    private Button przycisk6;
    private Button przycisk7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zad10);

        przycisk = (Button) findViewById(R.id.downa);
        przycisk2 = (Button) findViewById(R.id.downb);
        przycisk3 = (Button) findViewById(R.id.downc);
        przycisk4 = (Button) findViewById(R.id.downe);
        przycisk5 = (Button) findViewById(R.id.a);
        przycisk6 = (Button) findViewById(R.id.downf);
        przycisk7 = (Button) findViewById(R.id.downg);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),przycisk.getText().toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
