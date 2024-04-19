package com.sbit.adcetmockcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    CardView exam,aboutus,course,placemnt,gallery,contact,video;
    LinearLayout link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exam=findViewById(R.id.exam);
        aboutus=findViewById(R.id.aboutus);
        course=findViewById(R.id.course);
        placemnt=findViewById(R.id.placement);
        gallery=findViewById(R.id.gallery);
        contact=findViewById(R.id.contactus);
        video=findViewById(R.id.video);
        link=findViewById(R.id.link);

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),WebViewlink.class);
                intent.putExtra("res","link");
                startActivity(intent);
            }
        });
        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Exam.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Aboutus.class);
                startActivity(intent);
            }
        });
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Course.class);
                startActivity(intent);
            }
        });
        placemnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Placement.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Contactus.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Gallery.class);
                startActivity(intent);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Video.class);
                startActivity(intent);
            }
        });
    }
}