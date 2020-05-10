package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);
    }
    public void Loginback (View view) {
        Intent loginback = new Intent(this, LoginActivity.class);
        startActivity(loginback);
    }
    public void Register(View view) {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
}
