package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch4T1;
import com.softtechnotech.mathhandbook.Topic.Ch4T10;
import com.softtechnotech.mathhandbook.Topic.Ch4T11;
import com.softtechnotech.mathhandbook.Topic.Ch4T12;
import com.softtechnotech.mathhandbook.Topic.Ch4T13;
import com.softtechnotech.mathhandbook.Topic.Ch4T14;
import com.softtechnotech.mathhandbook.Topic.Ch4T15;
import com.softtechnotech.mathhandbook.Topic.Ch4T16;
import com.softtechnotech.mathhandbook.Topic.Ch4T17;
import com.softtechnotech.mathhandbook.Topic.Ch4T18;
import com.softtechnotech.mathhandbook.Topic.Ch4T19;
import com.softtechnotech.mathhandbook.Topic.Ch4T2;
import com.softtechnotech.mathhandbook.Topic.Ch4T20;
import com.softtechnotech.mathhandbook.Topic.Ch4T21;
import com.softtechnotech.mathhandbook.Topic.Ch4T3;
import com.softtechnotech.mathhandbook.Topic.Ch4T4;
import com.softtechnotech.mathhandbook.Topic.Ch4T5;
import com.softtechnotech.mathhandbook.Topic.Ch4T6;
import com.softtechnotech.mathhandbook.Topic.Ch4T7;
import com.softtechnotech.mathhandbook.Topic.Ch4T8;
import com.softtechnotech.mathhandbook.Topic.Ch4T9;

public class ch4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch4);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch4p1:
                Intent intent1 = new Intent(ch4.this, Ch4T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch4p2:
                Intent intent2 = new Intent(ch4.this, Ch4T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch4p3:
                Intent intent3 = new Intent(ch4.this, Ch4T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch4p4:
                Intent intent4 = new Intent(ch4.this, Ch4T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch4p5:
                Intent intent5 = new Intent(ch4.this, Ch4T5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch4p6:
                Intent intent6 = new Intent(ch4.this, Ch4T6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch4p7:
                Intent intent7 = new Intent(ch4.this, Ch4T7.class);
                startActivity(intent7);
                break;
            case R.id.tv_ch4p8:
                Intent intent8 = new Intent(ch4.this, Ch4T8.class);
                startActivity(intent8);
                break;
            case R.id.tv_ch4p9:
                Intent intent9 = new Intent(ch4.this, Ch4T9.class);
                startActivity(intent9);
                break;
            case R.id.tv_ch4p10:
                Intent intent10 = new Intent(ch4.this, Ch4T10.class);
                startActivity(intent10);
                break;
            case R.id.tv_ch4p11:
                Intent intent11 = new Intent(ch4.this, Ch4T11.class);
                startActivity(intent11);
                break;
            case R.id.tv_ch4p12:
                Intent intent12 = new Intent(ch4.this, Ch4T12.class);
                startActivity(intent12);
                break;
            case R.id.tv_ch4p13:
                Intent intent13 = new Intent(ch4.this, Ch4T13.class);
                startActivity(intent13);
                break;
            case R.id.tv_ch4p14:
                Intent intent14 = new Intent(ch4.this, Ch4T14.class);
                startActivity(intent14);
                break;
            case R.id.tv_ch4p15:
                Intent intent15 = new Intent(ch4.this, Ch4T15.class);
                startActivity(intent15);
                break;
            case R.id.tv_ch4p16:
                Intent intent16 = new Intent(ch4.this, Ch4T16.class);
                startActivity(intent16);
                break;
            case R.id.tv_ch4p17:
                Intent intent17 = new Intent(ch4.this, Ch4T17.class);
                startActivity(intent17);
                break;
            case R.id.tv_ch4p18:
                Intent intent18 = new Intent(ch4.this, Ch4T18.class);
                startActivity(intent18);
                break;
            case R.id.tv_ch4p19:
                Intent intent19 = new Intent(ch4.this, Ch4T19.class);
                startActivity(intent19);
                break;
            case R.id.tv_ch4p20:
                Intent intent20 = new Intent(ch4.this, Ch4T20.class);
                startActivity(intent20);
                break;
            case R.id.tv_ch4p21:
                Intent intent21 = new Intent(ch4.this, Ch4T21.class);
                startActivity(intent21);
                break;

        }
    }
}