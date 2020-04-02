package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class javalist extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;

    ListView listView;
    TextView textView;
    String[] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javalist);
        toolbar = findViewById(R.id.main_page_toolbar);
        listView = findViewById(R.id.showlist);
        textView = findViewById(R.id.txtview);
        listItem = getResources().getStringArray(R.array.Basic_java);

        setSupportActionBar(toolbar);
        String name = getIntent().getStringExtra("tt");
        getSupportActionBar().setTitle(name);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

            }
        });


    }
}
