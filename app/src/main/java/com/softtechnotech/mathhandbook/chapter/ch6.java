package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch6T1;
import com.softtechnotech.mathhandbook.Topic.Ch6T2;
import com.softtechnotech.mathhandbook.Topic.Ch6T3;
import com.softtechnotech.mathhandbook.Topic.Ch6T4;
import com.softtechnotech.mathhandbook.Topic.Ch6T5;
import com.softtechnotech.mathhandbook.Topic.Ch6T6;
import com.softtechnotech.mathhandbook.Topic.Ch6T7;

public class ch6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch6);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tv_ch6p1:
                Intent intent1 = new Intent(ch6.this, Ch6T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch6p2:
                Intent intent2 = new Intent(ch6.this, Ch6T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch6p3:
                Intent intent3 = new Intent(ch6.this, Ch6T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch6p4:
                Intent intent4 = new Intent(ch6.this, Ch6T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch6p5:
                Intent intent5 = new Intent(ch6.this, Ch6T5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch6p6:
                Intent intent6 = new Intent(ch6.this, Ch6T6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch6p7:
                Intent intent7 = new Intent(ch6.this, Ch6T7.class);
                startActivity(intent7);
                break;
        }
    }
}