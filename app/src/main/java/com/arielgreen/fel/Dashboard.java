package com.arielgreen.fel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class Dashboard extends AppCompatActivity {

    TextView text;
    Bundle bundle;
    //master Comment
    ////master Comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//master Comment

//master Comment

        bundle = getIntent().getExtras();
        text = findViewById(R.id.text);
        text.setText("Hi, "+bundle.getString("user"));

        Snackbar.make(findViewById(R.id.root), "Welcome!!", Snackbar.LENGTH_LONG).show();
    }
}