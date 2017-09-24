package pl.aleksander.pierwsza;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by uczen on 2017-09-24.
 */

public class zad11 extends AppCompatActivity {
    EditText edit;
    EditText edit2;
    Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zad11);

        edit = (EditText) findViewById(R.id.lo);
        edit2 = (EditText) findViewById(R.id.ha);
        btn = (Button) findViewById(R.id.g);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean czMogeLogowac = true;
                if(edit.getText().toString().isEmpty()) {
                    edit.setError("Login nie moze byc pusty");
                    czMogeLogowac = false;
                }else{
                    edit.setError(null);
                }
                if(edit2.getText().toString().isEmpty()){
                    edit2.setError("Haslo nie moze byc puste");
                }else{
                    edit2.setError(null);
                }
                if(czMogeLogowac){
                    if(edit.getText().toString().equals("user")
                    && edit2.getText().toString().equals("qwe123")){
                        Toast.makeText(getApplicationContext(),"Zalogowano",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),"Błąd łogowania",Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });


    }
}
