package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void purchaseCarBtn (View v)
    {
        Intent carSelectionActivity = new Intent(this,CarSelection_Activity.class);
        startActivity(carSelectionActivity);
    }
}
