package com.forex.insurance.medical.anew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Tutor extends AppCompatActivity {
    Button button2;
    Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_tutor);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Tutor.this.intent = new Intent(Tutor.this.getApplicationContext(), MainActivity.class);
                Tutor.this.startActivity(Tutor.this.intent);
            }
        });
    }
}