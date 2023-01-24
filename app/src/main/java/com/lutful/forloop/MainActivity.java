package com.lutful.forloop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout = findViewById(R.id.myLayout);


        for(int x=0; x<=10; x++){

            Button button = new Button(MainActivity.this);
            button.setText("Button: "+x);

            myLayout.addView(button);

        }


    }
}