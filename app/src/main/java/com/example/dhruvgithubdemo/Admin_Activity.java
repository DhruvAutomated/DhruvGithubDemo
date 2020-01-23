package com.example.dhruvgithubdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Admin_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_);

        EditText ettest = (EditText)findViewById(R.id.ettest);

        ettest.setText("this is test");

    }
}
