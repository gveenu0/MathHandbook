package com.softtechnotech.mathhandbook.chapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.softtechnotech.mathhandbook.R;
import com.softtechnotech.mathhandbook.Topic.Ch3T1;
import com.softtechnotech.mathhandbook.Topic.Ch3T10;
import com.softtechnotech.mathhandbook.Topic.Ch3T11;
import com.softtechnotech.mathhandbook.Topic.Ch3T12;
import com.softtechnotech.mathhandbook.Topic.Ch3T13;
import com.softtechnotech.mathhandbook.Topic.Ch3T14;
import com.softtechnotech.mathhandbook.Topic.Ch3T15;
import com.softtechnotech.mathhandbook.Topic.Ch3T16;
import com.softtechnotech.mathhandbook.Topic.Ch3T17;
import com.softtechnotech.mathhandbook.Topic.Ch3T18;
import com.softtechnotech.mathhandbook.Topic.Ch3T19;
import com.softtechnotech.mathhandbook.Topic.Ch3T2;
import com.softtechnotech.mathhandbook.Topic.Ch3T20;
import com.softtechnotech.mathhandbook.Topic.Ch3T21;
import com.softtechnotech.mathhandbook.Topic.Ch3T22;
import com.softtechnotech.mathhandbook.Topic.Ch3T23;
import com.softtechnotech.mathhandbook.Topic.Ch3T24;
import com.softtechnotech.mathhandbook.Topic.Ch3T25;
import com.softtechnotech.mathhandbook.Topic.Ch3T26;
import com.softtechnotech.mathhandbook.Topic.Ch3T27;
import com.softtechnotech.mathhandbook.Topic.Ch3T28;
import com.softtechnotech.mathhandbook.Topic.Ch3T29;
import com.softtechnotech.mathhandbook.Topic.Ch3T3;
import com.softtechnotech.mathhandbook.Topic.Ch3T30;
import com.softtechnotech.mathhandbook.Topic.Ch3T31;
import com.softtechnotech.mathhandbook.Topic.Ch3T32;
import com.softtechnotech.mathhandbook.Topic.Ch3T33;
import com.softtechnotech.mathhandbook.Topic.Ch3T34;
import com.softtechnotech.mathhandbook.Topic.Ch3T35;
import com.softtechnotech.mathhandbook.Topic.Ch3T36;
import com.softtechnotech.mathhandbook.Topic.Ch3T37;
import com.softtechnotech.mathhandbook.Topic.Ch3T38;
import com.softtechnotech.mathhandbook.Topic.Ch3T39;
import com.softtechnotech.mathhandbook.Topic.Ch3T4;
import com.softtechnotech.mathhandbook.Topic.Ch3T40;
import com.softtechnotech.mathhandbook.Topic.Ch3T5;
import com.softtechnotech.mathhandbook.Topic.Ch3T6;
import com.softtechnotech.mathhandbook.Topic.Ch3T7;
import com.softtechnotech.mathhandbook.Topic.Ch3T8;
import com.softtechnotech.mathhandbook.Topic.Ch3T9;

public class ch3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch3);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void openChap(View view){
        int id = view.getId();
        switch(id){
            case R.id.tv_ch3p1:
                Intent intent1 = new Intent(ch3.this, Ch3T1.class);
                startActivity(intent1);
                break;
            case R.id.tv_ch3p2:
                Intent intent2 = new Intent(ch3.this, Ch3T2.class);
                startActivity(intent2);
                break;
            case R.id.tv_ch3p3:
                Intent intent3 = new Intent(ch3.this, Ch3T3.class);
                startActivity(intent3);
                break;
            case R.id.tv_ch3p4:
                Intent intent4 = new Intent(ch3.this, Ch3T4.class);
                startActivity(intent4);
                break;
            case R.id.tv_ch3p5:
                Intent intent5 = new Intent(ch3.this, Ch3T5.class);
                startActivity(intent5);
                break;
            case R.id.tv_ch3p6:
                Intent intent6 = new Intent(ch3.this, Ch3T6.class);
                startActivity(intent6);
                break;
            case R.id.tv_ch3p7:
                Intent intent7 = new Intent(ch3.this, Ch3T7.class);
                startActivity(intent7);
                break;
            case R.id.tv_ch3p8:
                Intent intent8 = new Intent(ch3.this, Ch3T8.class);
                startActivity(intent8);
                break;
            case R.id.tv_ch3p9:
                Intent intent9 = new Intent(ch3.this, Ch3T9.class);
                startActivity(intent9);
                break;
            case R.id.tv_ch3p10:
                Intent intent10 = new Intent(ch3.this, Ch3T10.class);
                startActivity(intent10);
                break;
            case R.id.tv_ch3p11:
                Intent intent11 = new Intent(ch3.this, Ch3T11.class);
                startActivity(intent11);
                break;
            case R.id.tv_ch3p12:
                Intent intent12 = new Intent(ch3.this, Ch3T12.class);
                startActivity(intent12);
                break;
            case R.id.tv_ch3p13:
                Intent intent13 = new Intent(ch3.this, Ch3T13.class);
                startActivity(intent13);
                break;
            case R.id.tv_ch3p14:
                Intent intent14 = new Intent(ch3.this, Ch3T14.class);
                startActivity(intent14);
                break;
            case R.id.tv_ch3p15:
                Intent intent15 = new Intent(ch3.this, Ch3T15.class);
                startActivity(intent15);
                break;
            case R.id.tv_ch3p16:
                Intent intent16 = new Intent(ch3.this, Ch3T16.class);
                startActivity(intent16);
                break;
            case R.id.tv_ch3p17:
                Intent intent17 = new Intent(ch3.this, Ch3T17.class);
                startActivity(intent17);
                break;
            case R.id.tv_ch3p18:
                Intent intent18 = new Intent(ch3.this, Ch3T18.class);
                startActivity(intent18);
                break;
            case R.id.tv_ch3p19:
                Intent intent19 = new Intent(ch3.this, Ch3T19.class);
                startActivity(intent19);
                break;
            case R.id.tv_ch3p20:
                Intent intent20 = new Intent(ch3.this, Ch3T20.class);
                startActivity(intent20);
                break;
            case R.id.tv_ch3p21:
                Intent intent21 = new Intent(ch3.this, Ch3T21.class);
                startActivity(intent21);
                break;
            case R.id.tv_ch3p22:
                Intent intent22 = new Intent(ch3.this, Ch3T22.class);
                startActivity(intent22);
                break;
            case R.id.tv_ch3p23:
                Intent intent23 = new Intent(ch3.this, Ch3T23.class);
                startActivity(intent23);
                break;
            case R.id.tv_ch3p24:
                Intent intent24 = new Intent(ch3.this, Ch3T24.class);
                startActivity(intent24);
                break;
            case R.id.tv_ch3p25:
                Intent intent25 = new Intent(ch3.this, Ch3T25.class);
                startActivity(intent25);
                break;
            case R.id.tv_ch3p26:
                Intent intent26 = new Intent(ch3.this, Ch3T26.class);
                startActivity(intent26);
                break;
            case R.id.tv_ch3p27:
                Intent intent27 = new Intent(ch3.this, Ch3T27.class);
                startActivity(intent27);
                break;
            case R.id.tv_ch3p28:
                Intent intent28 = new Intent(ch3.this, Ch3T28.class);
                startActivity(intent28);
                break;
            case R.id.tv_ch3p29:
                Intent intent29 = new Intent(ch3.this, Ch3T29.class);
                startActivity(intent29);
                break;
            case R.id.tv_ch3p30:
                Intent intent30 = new Intent(ch3.this, Ch3T30.class);
                startActivity(intent30);
                break;
            case R.id.tv_ch3p31:
                Intent intent31 = new Intent(ch3.this, Ch3T31.class);
                startActivity(intent31);
                break;
            case R.id.tv_ch3p32:
                Intent intent32 = new Intent(ch3.this, Ch3T32.class);
                startActivity(intent32);
                break;
            case R.id.tv_ch3p33:
                Intent intent33 = new Intent(ch3.this, Ch3T33.class);
                startActivity(intent33);
                break;
            case R.id.tv_ch3p34:
                Intent intent34 = new Intent(ch3.this, Ch3T34.class);
                startActivity(intent34);
                break;
            case R.id.tv_ch3p35:
                Intent intent35 = new Intent(ch3.this, Ch3T35.class);
                startActivity(intent35);
                break;
            case R.id.tv_ch3p36:
                Intent intent36 = new Intent(ch3.this, Ch3T36.class);
                startActivity(intent36);
                break;
            case R.id.tv_ch3p37:
                Intent intent37 = new Intent(ch3.this, Ch3T37.class);
                startActivity(intent37);
                break;
            case R.id.tv_ch3p38:
                Intent intent38 = new Intent(ch3.this, Ch3T38.class);
                startActivity(intent38);
                break;
            case R.id.tv_ch3p39:
                Intent intent39 = new Intent(ch3.this, Ch3T39.class);
                startActivity(intent39);
                break;
            case R.id.tv_ch3p40:
                Intent intent40 = new Intent(ch3.this, Ch3T40.class);
                startActivity(intent40);
                break;    
        }
    }
}