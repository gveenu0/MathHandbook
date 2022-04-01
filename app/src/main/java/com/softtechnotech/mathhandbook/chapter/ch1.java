package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch1T1;
import com.softtechnotech.mathhandbook.Topic.Ch1T2;
import com.softtechnotech.mathhandbook.Topic.Ch1T3;
import com.softtechnotech.mathhandbook.Topic.Ch1T4;

public class ch1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch1p1:
                Intent intent1 = new Intent(ch1.this, Ch1T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch1p2:
                Intent intent2 = new Intent(ch1.this, Ch1T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch1p3:
                Intent intent3 = new Intent(ch1.this, Ch1T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch1p4:
                Intent intent4 = new Intent(ch1.this, Ch1T4.class);
                startActivity(intent4);
                break;
            
        }
    }
}