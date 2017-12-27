package com.forex.insurance.medical.anew.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity6 extends AppCompatActivity {
    public static final String Banner1 = "BannerKey";
    public static final String Interstitial1 = "InterstitialKey";
    public static final String Scond1 = "ScondKey";
    public static final String Scond2 = "Scond2Key";
    public static final String mypreference = "mypref";
    Button btnStart;
    int clickcount = 0;
    TextView edtBanner2;
    TextView edtInterstitial2;
    TextView edtScond2;
    TextView edtScond3;
    private final Handler handler = new Handler();
    Intent intent;
    private AdView mAdView;
    private AdView mAdView10;
    private AdView mAdView2;
    private AdView mAdView3;
    private AdView mAdView4;
    private AdView mAdView5;
    private AdView mAdView6;
    private AdView mAdView7;
    private AdView mAdView8;
    private AdView mAdView9;
    SharedPreferences sharedpreferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main6);
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
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setBackgroundColor(Color.parseColor("#ff3c4556"));
        this.mAdView = new AdView(this);
        this.mAdView.setAdSize(AdSize.BANNER);
        this.mAdView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        this.mAdView2 = new AdView(this);
        this.mAdView2.setAdSize(AdSize.BANNER);
        this.mAdView2.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView3 = new AdView(this);
        this.mAdView3.setAdSize(AdSize.BANNER);
        this.mAdView3.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView4 = new AdView(this);
        this.mAdView4.setAdSize(AdSize.BANNER);
        this.mAdView4.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView5 = new AdView(this);
        this.mAdView5.setAdSize(AdSize.BANNER);
        this.mAdView5.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView6 = new AdView(this);
        this.mAdView6.setAdSize(AdSize.BANNER);
        this.mAdView6.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView7 = new AdView(this);
        this.mAdView7.setAdSize(AdSize.BANNER);
        this.mAdView7.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView8 = new AdView(this);
        this.mAdView8.setAdSize(AdSize.BANNER);
        this.mAdView8.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView9 = new AdView(this);
        this.mAdView9.setAdSize(AdSize.BANNER);
        this.mAdView9.setAdUnitId(this.edtBanner2.getText().toString());
        this.mAdView10 = new AdView(this);
        this.mAdView10.setAdSize(AdSize.BANNER);
        this.mAdView10.setAdUnitId(this.edtBanner2.getText().toString());
        layout.addView(this.mAdView);
        layout.addView(this.mAdView2);
        layout.addView(this.mAdView3);
        layout.addView(this.mAdView4);
        layout.addView(this.mAdView5);
        layout.addView(this.mAdView6);
        layout.addView(this.mAdView7);
        layout.addView(this.mAdView8);
        layout.addView(this.mAdView9);
        layout.addView(this.mAdView10);
        setContentView((View) layout);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Integer scond2 = Integer.valueOf(0);
                scond2 = Integer.valueOf(MainActivity6.this.edtScond2.getText().toString());
                Builder adRequestBuilder = new Builder();
                adRequestBuilder.addTestDevice("B3EEABB8EE11C2BE770B684D95219ECB");
                MainActivity6.this.mAdView.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView2.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView3.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView4.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView5.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView6.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView7.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView8.loadAd(adRequestBuilder.build());
                MainActivity6.this.mAdView9.loadAd(adRequestBuilder.build());
                handler.postDelayed(this, (long) (scond2.intValue() * 1000));
            }
        }, 2000);
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