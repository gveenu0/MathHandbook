package com.softtechnotech.mathhandbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.chapter.ch1;
import com.softtechnotech.mathhandbook.chapter.ch10;
import com.softtechnotech.mathhandbook.chapter.ch11;
import com.softtechnotech.mathhandbook.chapter.ch12;
import com.softtechnotech.mathhandbook.chapter.ch2;
import com.softtechnotech.mathhandbook.chapter.ch3;
import com.softtechnotech.mathhandbook.chapter.ch4;
import com.softtechnotech.mathhandbook.chapter.ch5;
import com.softtechnotech.mathhandbook.chapter.ch6;
import com.softtechnotech.mathhandbook.chapter.ch7;
import com.softtechnotech.mathhandbook.chapter.ch8;
import com.softtechnotech.mathhandbook.chapter.ch9;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void  shareText(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareText = "Please, share with friends to support my Efforts. Thanks in Advance. Play store Download Link https://play.google.com/store/apps/details?id=com.softtechnotech.mathhandbook";
        intent.putExtra(Intent.EXTRA_TEXT,shareText);
        startActivity(Intent.createChooser(intent,"Choose sharing Method"));
    }

    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch1:
                Intent intent1 = new Intent(MainActivity.this,ch1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch2:
                Intent intent2 = new Intent(MainActivity.this,ch2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch3:
                Intent intent3 = new Intent(MainActivity.this,ch3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch4:
                Intent intent4 = new Intent(MainActivity.this,ch4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch5:
                Intent intent5 = new Intent(MainActivity.this,ch5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch6:
                Intent intent6 = new Intent(MainActivity.this,ch6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch7:
                Intent intent7 = new Intent(MainActivity.this,ch7.class);
                startActivity(intent7);
                break;
            case R.id.tv_ch8:
                Intent intent8 = new Intent(MainActivity.this,ch8.class);
                startActivity(intent8);
                break;
            case R.id.tv_ch9:
                Intent intent9 = new Intent(MainActivity.this,ch9.class);
                startActivity(intent9);
                break;
            case R.id.tv_ch10:
                Intent intent10 = new Intent(MainActivity.this,ch10.class);
                startActivity(intent10);
                break;
            case R.id.tv_ch11:
                Intent intent11 = new Intent(MainActivity.this,ch11.class);
                startActivity(intent11);
                break;
            case R.id.tv_ch12:
                Intent intent12 = new Intent(MainActivity.this,ch12.class);
                startActivity(intent12);
                break;
        }
    }


}