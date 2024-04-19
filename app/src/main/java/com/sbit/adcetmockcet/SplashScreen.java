package com.sbit.adcetmockcet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY = 10000;
    ImageView logo,logo2,naac,nba,twefiv;
    Animation slideup,slideright;
    TextView colgname,naact;
    MediaPlayer music;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        logo=findViewById(R.id.logo);
        logo2=findViewById(R.id.logo2);
        naac=findViewById(R.id.naacimg);
        naact=findViewById(R.id.naact);
        nba=findViewById(R.id.nba);
        twefiv=findViewById(R.id.year);

        slideup= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.slideup);
        slideright= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.anim_slide_in_right);

        logo.startAnimation(slideright);
        logo2.startAnimation(slideright);
        nba.startAnimation(slideright);
        twefiv.startAnimation(slideright);

        colgname=findViewById(R.id.colg_name);
        colgname.startAnimation(slideup);
        naac.startAnimation(slideup);
        naact.startAnimation(slideup);

        music = MediaPlayer.create(SplashScreen.this, R.raw.splashadcet);

        if(i==0){
            music.start();
            i=1;

        }

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY);
    }
    @Override
    protected void onStop() {
        super.onStop();
        music.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        music.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        music.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        music.start();
    }
}