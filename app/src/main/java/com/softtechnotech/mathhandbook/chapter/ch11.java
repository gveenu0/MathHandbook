package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch11T1;
import com.softtechnotech.mathhandbook.Topic.Ch11T10;
import com.softtechnotech.mathhandbook.Topic.Ch11T11;
import com.softtechnotech.mathhandbook.Topic.Ch11T12;
import com.softtechnotech.mathhandbook.Topic.Ch11T13;
import com.softtechnotech.mathhandbook.Topic.Ch11T2;
import com.softtechnotech.mathhandbook.Topic.Ch11T3;
import com.softtechnotech.mathhandbook.Topic.Ch11T4;
import com.softtechnotech.mathhandbook.Topic.Ch11T5;
import com.softtechnotech.mathhandbook.Topic.Ch11T6;
import com.softtechnotech.mathhandbook.Topic.Ch11T7;
import com.softtechnotech.mathhandbook.Topic.Ch11T8;
import com.softtechnotech.mathhandbook.Topic.Ch11T9;

public class ch11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch11);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch11p1:
                Intent intent1 = new Intent(ch11.this, Ch11T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch11p2:
                Intent intent2 = new Intent(ch11.this, Ch11T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch11p3:
                Intent intent3 = new Intent(ch11.this, Ch11T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch11p4:
                Intent intent4 = new Intent(ch11.this, Ch11T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch11p5:
                Intent intent5 = new Intent(ch11.this, Ch11T5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch11p6:
                Intent intent6 = new Intent(ch11.this, Ch11T6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch11p7:
                Intent intent7 = new Intent(ch11.this, Ch11T7.class);
                startActivity(intent7);
                break;
            case R.id.tv_ch11p8:
                Intent intent8 = new Intent(ch11.this, Ch11T8.class);
                startActivity(intent8);
                break;
            case R.id.tv_ch11p9:
                Intent intent9 = new Intent(ch11.this, Ch11T9.class);
                startActivity(intent9);
                break;
            case R.id.tv_ch11p10:
                Intent intent10 = new Intent(ch11.this, Ch11T10.class);
                startActivity(intent10);
                break;
            case R.id.tv_ch11p11:
                Intent intent11 = new Intent(ch11.this, Ch11T11.class);
                startActivity(intent11);
                break;
            case R.id.tv_ch11p12:
                Intent intent12 = new Intent(ch11.this, Ch11T12.class);
                startActivity(intent12);
                break;
            case R.id.tv_ch11p13:
                Intent intent13 = new Intent(ch11.this, Ch11T13.class);
                startActivity(intent13);
                break;


        }
    }
}