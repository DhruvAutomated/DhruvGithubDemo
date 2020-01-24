package com.example.dhruvgithubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int au = 1;


        Toast.makeText(MainActivity.this,"dhruv test00",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"dhruv test",Toast.LENGTH_LONG).show();
    }
}
