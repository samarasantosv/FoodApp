package com.example.foodapp.Activity.Model;

public class Category {
    private String title;
    private String picture;

    public Category(String title, String picture) {
        this.title = title;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
