package com.sbit.adcetmockcet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;

public class Gallery extends AppCompatActivity {

    RecyclerView alumView,twodayView,lakshyView,bookView,sportView,event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Gallery");

        alumView=findViewById(R.id.alumnilist);
        twodayView=findViewById(R.id.twodaylist);
        lakshyView=findViewById(R.id.lakshylist);
        bookView=findViewById(R.id.booklist);
        sportView=findViewById(R.id.sportlist);
        event=findViewById(R.id.eventlist);

        //Add alumlist
        ArrayList<Imagemodel> listphotos = new ArrayList<>();

        listphotos.add(new Imagemodel(R.drawable.ameet1));
        listphotos.add(new Imagemodel(R.drawable.ameet2));
        listphotos.add(new Imagemodel(R.drawable.ameet3));
        listphotos.add(new Imagemodel(R.drawable.ameet4));

        RecylerViewList(listphotos,alumView);

        //Add twolist
        ArrayList<Imagemodel> twophotos = new ArrayList<>();

        twophotos.add(new Imagemodel(R.drawable.two_day1));

        RecylerViewList(twophotos,twodayView);

        //add laskyphoto
        ArrayList<Imagemodel> lakshyphotos = new ArrayList<>();

        lakshyphotos.add(new Imagemodel(R.drawable.l1));
        lakshyphotos.add(new Imagemodel(R.drawable.l2));
        lakshyphotos.add(new Imagemodel(R.drawable.l3));

        RecylerViewList(lakshyphotos,lakshyView);

        //add book photo
        ArrayList<Imagemodel> bookphotos = new ArrayList<>();

        bookphotos.add(new Imagemodel(R.drawable.book1));
        bookphotos.add(new Imagemodel(R.drawable.book2));
        bookphotos.add(new Imagemodel(R.drawable.book3));

        RecylerViewList(bookphotos,bookView);

        //add sport photo
        ArrayList<Imagemodel> sportphotos = new ArrayList<>();

        sportphotos.add(new Imagemodel(R.drawable.asport1));
        sportphotos.add(new Imagemodel(R.drawable.asport2));
        sportphotos.add(new Imagemodel(R.drawable.asport3));
        sportphotos.add(new Imagemodel(R.drawable.asport4));

        RecylerViewList(sportphotos,sportView);

        ArrayList<Imagemodel> eventphoto = new ArrayList<>();
        eventphoto.add(new Imagemodel(R.drawable.i3));
        eventphoto.add(new Imagemodel(R.drawable.i2));
        eventphoto.add(new Imagemodel(R.drawable.i1));

        RecylerViewList(eventphoto,event);
    }

    public void RecylerViewList(ArrayList<Imagemodel> listphotos,RecyclerView recyclerView){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        GalleryAdapter adapter = new GalleryAdapter(listphotos, this);
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
}