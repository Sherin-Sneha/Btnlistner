package com.example.btnlistner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
 Button b;
 ImageView i;
 String s;
 EditText e;
 TextView t;
 Button u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i= findViewById(R.id.imageView2);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome :) ", Toast.LENGTH_SHORT).show();
            }
        });
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hey Sherin here's your toast", Toast.LENGTH_SHORT).show();
            }
        });
        e = findViewById(R.id.editTextTextPersonName);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= e.getText().toString();
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                t.setText(s);
            }
        });
        u = findViewById(R.id.button2);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newact = new Intent();
                startActivity(newact);
                Toast.makeText(MainActivity.this, "Hey Sherin here's another toast", Toast.LENGTH_SHORT).show();
            }
        });

    }
}