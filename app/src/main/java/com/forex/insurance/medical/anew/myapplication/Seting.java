package com.forex.insurance.medical.anew.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;


public class Seting extends AppCompatActivity {
    public static final String Banner1 = "BannerKey";
    public static final String Interstitial1 = "InterstitialKey";
    public static final String Scond1 = "ScondKey";
    public static final String Scond2 = "Scond2Key";
    public static final String mypreference = "mypref";
    Button btnStart;
    Button btnTutor;
    EditText edtBanner2;
    EditText edtInterstitial2;
    EditText edtScond2;
    EditText edtScond3;

    Intent intent;
    private AdView mAdView;
    SharedPreferences sharedpreferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_seting);

       {
            this.edtBanner2 = (EditText) findViewById(R.id.edtBanner2);
            this.edtScond2 = (EditText) findViewById(R.id.edtScond2);
            this.edtScond3 = (EditText) findViewById(R.id.edtScond3);
            this.edtInterstitial2 = (EditText) findViewById(R.id.edtIntertitial2);
            this.btnStart = (Button) findViewById(R.id.btnStart);

            this.sharedpreferences = getSharedPreferences("mypref", 0);

            this.edtBanner2 = (EditText) findViewById(R.id.edtBanner2);
            this.edtScond2 = (EditText) findViewById(R.id.edtScond2);
            this.edtScond3 = (EditText) findViewById(R.id.edtScond3);
            this.edtInterstitial2 = (EditText) findViewById(R.id.edtIntertitial2);
            this.btnStart = (Button) findViewById(R.id.btnStart);

            this.sharedpreferences = getSharedPreferences("mypref", 0);
        }
        if (this.sharedpreferences.contains("BannerKey")) {
            this.edtBanner2.setText(this.sharedpreferences.getString("BannerKey", ""));
        }
        if (this.sharedpreferences.contains("InterstitialKey")) {
            this.edtInterstitial2.setText(this.sharedpreferences.getString("InterstitialKey", ""));
        }
        if (this.sharedpreferences.contains("ScondKey")) {
            this.edtScond2.setText(this.sharedpreferences.getString("ScondKey", ""));
        }
        if (this.sharedpreferences.contains("Scond2Key")) {
            this.edtScond3.setText(this.sharedpreferences.getString("Scond2Key", ""));
        }
        this.mAdView = (AdView) findViewById(R.id.adView);
        this.mAdView.loadAd(new Builder().addTestDevice("C0AE6C45DB835D1E370B998A2D81871C").build());
        this.btnStart.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Seting.this.intent = new Intent(Seting.this.getApplicationContext(), MainActivity.class);
                Seting.this.intent.putExtra("Banner", Seting.this.edtBanner2.getText().toString());
                Seting.this.intent.putExtra("Interstitial", Seting.this.edtInterstitial2.getText().toString());
                Seting.this.intent.putExtra("Scond", Seting.this.edtScond2.getText().toString());
                Seting.this.intent.putExtra("Scond2", Seting.this.edtScond3.getText().toString());
                String n = Seting.this.edtBanner2.getText().toString();
                String e = Seting.this.edtInterstitial2.getText().toString();
                String s = Seting.this.edtScond2.getText().toString();
                String b = Seting.this.edtScond3.getText().toString();
                Editor editor = Seting.this.sharedpreferences.edit();
                editor.putString("BannerKey", n);
                editor.putString("InterstitialKey", e);
                editor.putString("ScondKey", s);
                editor.putString("Scond2Key", b);
                editor.commit();
                if (Seting.this.edtBanner2.getText().toString().trim().equals("")) {
                    Seting.this.edtBanner2.setError("isi id Banner");
                } else {
                    Seting.this.startActivity(Seting.this.intent);
                }
                if (Seting.this.edtInterstitial2.getText().toString().trim().equals("")) {
                    Seting.this.edtInterstitial2.setError("isi id Interstitial");
                } else {
                    Seting.this.startActivity(Seting.this.intent);
                }
                if (Seting.this.edtScond2.getText().toString().trim().equals("")) {
                    Seting.this.edtScond2.setError("isi delay");
                } else {
                    Seting.this.startActivity(Seting.this.intent);
                }
                if (Seting.this.edtScond3.getText().toString().trim().equals("")) {
                    Seting.this.edtScond3.setError("isi delay");
                } else {
                    Seting.this.startActivity(Seting.this.intent);
                }
            }
        });
        if (this.edtBanner2.getText().toString().trim().equals("")) {
            this.edtBanner2.setError("isi id Banner");
        }
        if (this.edtInterstitial2.getText().toString().trim().equals("")) {
            this.edtInterstitial2.setError("isi id Interstitial");
        }
        if (this.edtScond2.getText().toString().trim().equals("")) {
            this.edtScond2.setError("isi delay");
        }
        if (this.edtScond3.getText().toString().trim().equals("")) {
            this.edtScond3.setError("isi delay");
        }
    }
}