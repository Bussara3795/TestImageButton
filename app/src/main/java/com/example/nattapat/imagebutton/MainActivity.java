package com.example.nattapat.imagebutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public  class MainActivity extends AppCompatActivity {

    Button yesButton;
    ImageButton oneImageButton, twoImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesButton = (Button) findViewById(R.id.button2);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);
            }
        });
        oneImageButton = (ImageButton) findViewById(R.id.imageButton9);
        twoImageButton = (ImageButton) findViewById(R.id.imageButton8);


        oneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oneImageButton.setImageResource(R.drawable.l1);

            }
        });
twoImageButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        twoImageButton.setImageResource(R.drawable.l1);
    }
});
    }
    }
