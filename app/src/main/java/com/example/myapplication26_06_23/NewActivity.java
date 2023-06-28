package com.example.myapplication26_06_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        String userLogin = getIntent().getStringExtra("userLogin");
        String userPassword = getIntent().getStringExtra("userPassword");

        TextView loginTextView = findViewById(R.id.loginTextView);
        loginTextView.setText(userLogin);
        TextView passwordTextView = findViewById(R.id.passwordTextView);
        passwordTextView.setText(userPassword);
    }
}