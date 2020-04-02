package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

public class javalist extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javalist);
        toolbar = findViewById(R.id.main_page_toolbar);
        setSupportActionBar(toolbar);

        String name = getIntent().getStringExtra("tt");
        getSupportActionBar().setTitle(name);
        //ok
    }
}
