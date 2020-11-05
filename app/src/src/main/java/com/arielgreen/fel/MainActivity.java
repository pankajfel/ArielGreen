package com.arielgreen.fel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void show(View view) {

        if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
            Snackbar.make(findViewById(R.id.root), "Enter email and password", Snackbar.LENGTH_LONG).show();
        }else {
            Intent intent = new Intent(this, Dashboard.class);
            intent.putExtra("user", email.getText().toString());
            startActivity(intent);
        }

    }
}