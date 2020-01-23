package com.example.dhruvgithubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Basic_Activity22 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_22);

        String dhruv = "this is test";
        Toast.makeText(Basic_Activity22.this,"add"+dhruv,Toast.LENGTH_LONG).show();
    }
}
