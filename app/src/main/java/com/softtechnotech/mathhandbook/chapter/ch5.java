package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch5T1;
import com.softtechnotech.mathhandbook.Topic.Ch5T2;
import com.softtechnotech.mathhandbook.Topic.Ch5T3;
import com.softtechnotech.mathhandbook.Topic.Ch5T4;
import com.softtechnotech.mathhandbook.Topic.Ch5T5;

public class ch5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch5);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch5p1:
                Intent intent1 = new Intent(ch5.this, Ch5T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch5p2:
                Intent intent2 = new Intent(ch5.this, Ch5T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch5p3:
                Intent intent3 = new Intent(ch5.this, Ch5T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch5p4:
                Intent intent4 = new Intent(ch5.this, Ch5T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch5p5:
                Intent intent5 = new Intent(ch5.this, Ch5T5.class);
                startActivity(intent5);
                break;

        }
    }
}