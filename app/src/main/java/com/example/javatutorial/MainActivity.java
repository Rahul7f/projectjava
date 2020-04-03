package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bjava,ajava,example,iq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bjava = findViewById(R.id.basicjava);
        ajava = findViewById(R.id.advancejava);
        example = findViewById(R.id.example);
        iq= findViewById(R.id.interview_question);

        bjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = "basic java";
                int id = v.getId();
                Intent intent = new Intent(getApplicationContext(),javalist.class);
                intent.putExtra("tt",name);
                intent.putExtra("btnid",id);
                startActivity(intent);


            }
        });

        ajava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = "Advance java";
                int id = v.getId();
                Intent intent = new Intent(getApplicationContext(),javalist.class);
                intent.putExtra("tt",name);
                intent.putExtra("btnid",id);
                startActivity(intent);

            }
        });

        example.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = "Example";
                int id = v.getId();
                Intent intent = new Intent(getApplicationContext(),javalist.class);
                intent.putExtra("tt",name);
                intent.putExtra("btnid",id);
                startActivity(intent);

            }
        });

        iq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = "Interview Question";
                int id = v.getId();
                Intent intent = new Intent(getApplicationContext(),javalist.class);
                intent.putExtra("tt",name);
                intent.putExtra("btnid",id);
                startActivity(intent);

            }
        });

    }
}
