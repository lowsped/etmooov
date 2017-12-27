package com.forex.insurance.medical.anew.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity2 extends AppCompatActivity {
    public static final String Banner1 = "BannerKey";
    public static final String Interstitial1 = "InterstitialKey";
    public static final String Scond1 = "ScondKey";
    public static final String Scond2 = "Scond2Key";
    public static final String mypreference = "mypref";
    Integer Banner;
    Integer Interistial;
    Integer Total;
    Button btnStart;
    TextView edtBanner2;
    TextView edtInterstitial2;
    TextView edtScond2;
    TextView edtScond3;
    private final Handler handler = new Handler();
    Intent intent;
    private InterstitialAd interstitial;
    SharedPreferences sharedpreferences;
    TextView titleEdit;
    private TextView view;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        this.Banner = Integer.valueOf(extras.getInt("Banner", 0));
        this.Interistial = Integer.valueOf(extras.getInt("Interistial", 1));
        this.Total = Integer.valueOf(extras.getInt("Total", 1));
        setTitle("Banner: " + this.Banner + " | Interistial: " + this.Interistial + " = " + this.Total);
        this.edtBanner2 = (TextView) findViewById(R.id.edtBanner2);
        this.edtInterstitial2 = (TextView) findViewById(R.id.edtInterstitial2);
        this.edtScond2 = (TextView) findViewById(R.id.edtScond2);
        this.edtScond3 = (TextView) findViewById(R.id.edtScond3);
        this.btnStart = (Button) findViewById(R.id.btnStart);
        this.sharedpreferences = getSharedPreferences("mypref", 0);
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
        Integer scond = Integer.valueOf(0);
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            public void run() {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("Banner", MainActivity2.this.Banner.intValue() + 9);
                intent.putExtra("Interistial", MainActivity2.this.Interistial.intValue() + 0);
                intent.putExtra("Total", MainActivity2.this.Total.intValue() + 9);
                intent.setFlags(268468224);
                MainActivity2.this.startActivity(intent);
                MainActivity2.this.finish();
                MainActivity2.this.finishAffinity();
            }
        }, (long) (Integer.valueOf(this.edtScond2.getText().toString()).intValue() * 1000));
        AdRequest adRequest = new Builder().addTestDevice("C0AE6C45DB835D1E370B998A2D81871C").build();
        this.interstitial = new InterstitialAd(this);
        this.interstitial.setAdUnitId(this.edtInterstitial2.getText().toString());
        this.interstitial.loadAd(adRequest);
        this.interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                MainActivity2.this.displayInterstitial();
            }
        });
    }

    public void displayInterstitial() {
        if (this.interstitial.isLoaded()) {
            this.interstitial.show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(268468224);
        startActivity(i);
        finish();
        finishAffinity();
        System.exit(0);
    }
}