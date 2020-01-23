package com.example.dhruvgithubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Basic_demo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_demo);

        Toast.makeText(Basic_demo.this,"test",Toast.LENGTH_LONG).show();

        Toast.makeText(Basic_demo.this,"this is test",Toast.LENGTH_LONG).show();
    }
}
