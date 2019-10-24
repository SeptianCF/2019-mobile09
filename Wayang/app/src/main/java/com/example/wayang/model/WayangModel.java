package com.example.wayang.model;

import android.graphics.drawable.Drawable;

public class WayangModel {
    public String wayangName;
    public Drawable wayangImage;

    public WayangModel(String wayangName, Drawable wayangImage) {
        this.wayangName = wayangName;
        this.wayangImage = wayangImage;
    }

    public String getWayangName() {
        return wayangName;
    }

    public void setWayangName(String wayangName) {
        this.wayangName = wayangName;
    }
    public Drawable getWayangImage(){
        return wayangImage;
    }
    public void setWayangImage(Drawable wayangImage) {
        this.wayangImage = wayangImage;
    }
}