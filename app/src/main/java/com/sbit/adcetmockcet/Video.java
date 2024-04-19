package com.sbit.adcetmockcet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Video extends AppCompatActivity {

    CardView plasticVideo,substain,lakshy,campus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Video");

        plasticVideo=findViewById(R.id.platic_video);
        substain=findViewById(R.id.substain_video);
        lakshy=findViewById(R.id.lakshy_video);
        campus=findViewById(R.id.campus_video);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.machine);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "FlRiUc-vHFc";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.sustain);
        getLifecycle().addObserver(youTubePlayerView1);
        youTubePlayerView1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "EAk0pDKIN7k";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        YouTubePlayerView youTubePlayerView2 = findViewById(R.id.laks);
        getLifecycle().addObserver(youTubePlayerView2);

        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "oItvKZXO9I0";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.camp);
        getLifecycle().addObserver(youTubePlayerView3);

        youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "c7QJLiHey-A";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
//        plasticVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://www.youtube.com/watch?v=FlRiUc-vHFc";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        substain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://www.youtube.com/watch?v=EAk0pDKIN7k";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        lakshy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://www.youtube.com/watch?v=oItvKZXO9I0";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
//        campus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "https://www.youtube.com/watch?v=c7QJLiHey-A";
//
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
//            }
//        });
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
}