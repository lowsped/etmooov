package com.forex.insurance.medical.anew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;

public class Pilih extends AppCompatActivity {
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    int clickcount;
    int clickcount2 = 0;
    Intent intent;
    private AdView mAdView;
    TextView titleEdit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_pilih);
        this.btn3 = (Button) findViewById(R.id.button3);
        this.btn4 = (Button) findViewById(R.id.button4);
        this.btn5 = (Button) findViewById(R.id.button5);
        this.btn6 = (Button) findViewById(R.id.button6);
        this.btn7 = (Button) findViewById(R.id.button7);
        this.mAdView = (AdView) findViewById(R.id.adView);
        this.mAdView.loadAd(new Builder().addTestDevice("C0AE6C45DB835D1E370B998A2D81871C").build());
        this.btn3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Pilih.this.intent = new Intent(Pilih.this.getApplicationContext(), MainActivity4.class);
                Pilih.this.intent.putExtra("Banner", 1);
                Pilih.this.intent.putExtra("Interistial", 1);
                Pilih.this.intent.putExtra("Total", 2);
                Pilih.this.startActivity(Pilih.this.intent);
            }
        });
        this.btn4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Pilih.this.intent = new Intent(Pilih.this.getApplicationContext(), MainActivity7.class);
                Pilih.this.intent.putExtra("Banner", 1);
                Pilih.this.intent.putExtra("Interistial", 1);
                Pilih.this.intent.putExtra("Total", 2);
                Pilih.this.startActivity(Pilih.this.intent);
            }
        });
        this.btn5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Pilih.this.intent = new Intent(Pilih.this.getApplicationContext(), MainActivity3.class);
                Pilih.this.intent.putExtra("Banner", 9);
                Pilih.this.intent.putExtra("Interistial", 0);
                Pilih.this.intent.putExtra("Total", 9);
                Pilih.this.startActivity(Pilih.this.intent);
            }
        });
        this.btn6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Pilih.this.intent = new Intent(Pilih.this.getApplicationContext(), MainActivity5.class);
                Pilih.this.intent.putExtra("Banner", 5);
                Pilih.this.intent.putExtra("Interistial", 1);
                Pilih.this.intent.putExtra("Total", 6);
                Pilih.this.startActivity(Pilih.this.intent);
            }
        });
        this.btn7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Pilih.this.intent = new Intent(Pilih.this.getApplicationContext(), Banner2Activity.class);
                Pilih.this.intent.putExtra("Banner", 3);
                Pilih.this.intent.putExtra("Interistial", 0);
                Pilih.this.intent.putExtra("Total", 3);
                Pilih.this.startActivity(Pilih.this.intent);
            }
        });
    }
}