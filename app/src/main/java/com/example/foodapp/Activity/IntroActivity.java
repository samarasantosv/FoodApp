package com.example.foodapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import com.example.foodapp.R;

public class IntroActivity extends AppCompatActivity {

    private ConstraintLayout startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        startBtn = findViewById(R.id.startBtn);

        startBtn.setOnClickListener(view -> {
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}