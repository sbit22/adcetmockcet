package com.sbit.adcetmockcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Placement extends AppCompatActivity {

    private ScaleGestureDetector scaleGestureDetector;
    RecyclerView poster,poster1,poster2;

    private float mScaleFactor = 1.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Placement");

        poster=findViewById(R.id.place1);
        ArrayList<Imagemodel> listphotos = new ArrayList<>();
        listphotos.add(new Imagemodel(R.drawable.place1));
        RecylerViewList(listphotos,poster);

        poster1=findViewById(R.id.place2);
        ArrayList<Imagemodel> listphotos2 = new ArrayList<>();
        listphotos2.add(new Imagemodel(R.drawable.place_stude));
        RecylerViewList(listphotos2,poster1);

        poster2=findViewById(R.id.place3);
        ArrayList<Imagemodel> listphotos3 = new ArrayList<>();
        listphotos3.add(new Imagemodel(R.drawable.comp_visit));
        RecylerViewList(listphotos3,poster2);

//        poster.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(getApplicationContext(), FullScreen.class);
//                intent.putExtra("imagename", String.valueOf(poster.getDrawable()));
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
//
//            }
//        });
//        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

    }
    public void RecylerViewList(ArrayList<Imagemodel> listphotos,RecyclerView recyclerView){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        PlacementAdapter adapter = new PlacementAdapter(listphotos, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
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

//    @Override
//    public boolean onTouchEvent(MotionEvent motionEvent) {
//        scaleGestureDetector.onTouchEvent(motionEvent);
//        return true;
//    }
//    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
//        @Override
//        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
//            mScaleFactor *= scaleGestureDetector.getScaleFactor();
//            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f));
//            poster.setScaleX(mScaleFactor);
//            poster.setScaleY(mScaleFactor);
//            return true;
//        }
//    }
}