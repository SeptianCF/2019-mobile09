package com.example.wayang.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.wayang.R;
import com.example.wayang.model.WayangModel;

import java.util.List;



public class WayangAdapter extends RecyclerView.Adapter<WayangAdapter.MyViewHolder> {
    List<WayangModel> wayangList;

    public WayangAdapter(List<WayangModel> wayangList) {
        this.wayangList = wayangList;
    }

    @NonNull
    @Override
    public WayangAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View wayangModelView = layoutInflater.inflate(R.layout.item_super_hero,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(wayangModelView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //ambil satu item hero
        WayangModel hero = wayangList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.wayangName.setText(hero.getWayangName());
        holder.wayangImage.setImageDrawable(hero.getWayangImage());

    }

    @Override
    public int getItemCount() {
        return (wayangList != null) ? wayangList.size() : 0;
        /*for non shorthand people*/
        /*if(heroList!=null){
          return heroList.size();
        }else{
          return 0;
        }*/
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView wayangName;
        public ImageView wayangImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            wayangName = itemView.findViewById(R.id.wayangName);
            wayangImage = itemView.findViewById(R.id.wayangImage);
        }
    }
}