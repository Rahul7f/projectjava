package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class javalist extends AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolbar;

    ListView listView;
    TextView textView;
    String[] listItem;
    public int id;
    public  String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javalist);
        toolbar = findViewById(R.id.main_page_toolbar);
        listView = findViewById(R.id.showlist);
        textView = findViewById(R.id.txtview);

         name = getIntent().getStringExtra("tt");
         id = getIntent().getIntExtra("btnid",0);


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(name);

        switch (id){
            case R.id.basicjava:
                listItem = getResources().getStringArray(R.array.Basic_java);
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
                break;

            case R.id.advancejava:
                Toast.makeText(this, "Advance java", Toast.LENGTH_SHORT).show();
                listItem = getResources().getStringArray(R.array.Advance_java);
                final ArrayAdapter<String> madapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
                listView.setAdapter(madapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value=madapter.getItem(position);
                        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                    }
                });
                break;


            case R.id.example:
                Toast.makeText(this, "Example", Toast.LENGTH_SHORT).show();
                listItem = getResources().getStringArray(R.array.Example);
                final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
                listView.setAdapter(adapter2);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value=adapter2.getItem(position);
                        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                    }
                });

                break;

            case R.id.interview_question:
                Toast.makeText(this, "Interview Question", Toast.LENGTH_SHORT).show();
                listItem = getResources().getStringArray(R.array.Interview_Question);
                final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
                listView.setAdapter(adapter3);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value=adapter3.getItem(position);
                        Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

                    }
                });
                break;
        }




    }
}
