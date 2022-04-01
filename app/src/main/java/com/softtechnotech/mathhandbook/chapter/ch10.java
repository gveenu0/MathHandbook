package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch10T1;
import com.softtechnotech.mathhandbook.Topic.Ch10T2;
import com.softtechnotech.mathhandbook.Topic.Ch10T3;

public class ch10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch10);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch10p1:
                Intent intent1 = new Intent(ch10.this, Ch10T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch10p2:
                Intent intent2 = new Intent(ch10.this, Ch10T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch10p3:
                Intent intent3 = new Intent(ch10.this, Ch10T3.class);
                startActivity(intent3);
                break;


        }
    }
}