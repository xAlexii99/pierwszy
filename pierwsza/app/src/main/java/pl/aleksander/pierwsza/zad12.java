package pl.aleksander.pierwsza;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by uczen on 2017-09-24.
 */

public class zad12 extends AppCompatActivity {

    ImageView image;
    ImageButton left;
    ImageButton Right;
    TextView indicator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zad12);

        image.add(R.drawable.aaa);



    }
}
