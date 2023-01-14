package com.example.foodapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.Activity.Model.Category;
import com.example.foodapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerViewCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Pizza", "cat_1"));
        categories.add(new Category("Burguer", "cat_2"));
        categories.add(new Category("Hotdog", "cat_3"));
        categories.add(new Category("Drink", "cat_4"));
        categories.add(new Category("Donut", "cat_5"));
    }
}