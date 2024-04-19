package com.sbit.adcetmockcet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Course extends AppCompatActivity {

    MediaPlayer music;

    ImageView volumnup,volumndown;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Courses");

        volumnup=findViewById(R.id.volumeupcu);
        volumndown=findViewById(R.id.volumedowncu);

        volumnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music!= null) {
                    music.stop();
                    music.release();
                    i=0;
                    music= null;

                }
                volumnup.setVisibility(View.GONE);
                volumndown.setVisibility(View.VISIBLE);
            }
        });

        volumndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                final Dialog dialog = new Dialog(Course.this);
//                dialog.setContentView(R.layout.app_functionality);
                // if button is clicked, close the custom dialog

                music = MediaPlayer.create(Course.this, R.raw.courseaudio_adcet);
                if(i==0) {
                    music.start();
                    i=1;
                }
//                dialog.show();
//                dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT );

                volumnup.setVisibility(View.VISIBLE);
                volumndown.setVisibility(View.GONE);
            }
        });

//        music = MediaPlayer.create(Course.this, R.raw.courseaudio_adcet);
//
//        if(i==0){
//            music.start();
//            i=1;
//
//        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(i==1){
            music.stop();
            i=0;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(i==1){
            music.stop();
            i=0;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(i==1){
            music.stop();
            i=0;
        }
    }
}