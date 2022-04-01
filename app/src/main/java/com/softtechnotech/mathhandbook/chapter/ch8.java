package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch8T1;
import com.softtechnotech.mathhandbook.Topic.Ch8T2;
import com.softtechnotech.mathhandbook.Topic.Ch8T3;
import com.softtechnotech.mathhandbook.Topic.Ch8T4;
import com.softtechnotech.mathhandbook.Topic.Ch8T5;
import com.softtechnotech.mathhandbook.Topic.Ch8T6;
import com.softtechnotech.mathhandbook.Topic.Ch8T7;
import com.softtechnotech.mathhandbook.Topic.Ch8T8;
import com.softtechnotech.mathhandbook.Topic.Ch8T9;

public class ch8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch8);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch8p1:
                Intent intent1 = new Intent(ch8.this, Ch8T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch8p2:
                Intent intent2 = new Intent(ch8.this, Ch8T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch8p3:
                Intent intent3 = new Intent(ch8.this, Ch8T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch8p4:
                Intent intent4 = new Intent(ch8.this, Ch8T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch8p5:
                Intent intent5 = new Intent(ch8.this, Ch8T5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch8p6:
                Intent intent6 = new Intent(ch8.this, Ch8T6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch8p7:
                Intent intent7 = new Intent(ch8.this, Ch8T7.class);
                startActivity(intent7);
                break;
            case R.id.tv_ch8p8:
                Intent intent8 = new Intent(ch8.this, Ch8T8.class);
                startActivity(intent8);
                break;
            case R.id.tv_ch8p9:
                Intent intent9 = new Intent(ch8.this, Ch8T9.class);
                startActivity(intent9);
                break;


        }
    }
}