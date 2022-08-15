package com.dumv.ailaso1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dumv.ailaso1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void batdau(View view) {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
    public void huongdan(View view) {
        Intent j = new Intent(this,Main3Activity.class);
        startActivity(j);
    }
}
