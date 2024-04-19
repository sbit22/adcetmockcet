package com.sbit.adcetmockcet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PlacementAdapter extends RecyclerView.Adapter<PlacementAdapter.viewHolder>{

    private ArrayList<Imagemodel> list;
    private Context context;

    public PlacementAdapter(ArrayList<Imagemodel> list, Context photoGallery) {
        this.list=list;
        this.context=photoGallery;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.placement_recycler,parent,false);
        return new PlacementAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacementAdapter.viewHolder holder, int position) {

        Imagemodel recycleModel = list.get(position);

        Picasso
                .get()
                .load(recycleModel.getPic())
                .into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, FullScreen.class);
                intent.putExtra("imagename", recycleModel.getPic());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.recycle_pimageView);

        }
    }
}
