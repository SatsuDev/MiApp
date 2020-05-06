package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      /*  Button bRegister = (Button)findViewById(R.id.bRegister);
        Button bLogin = (Button)findViewById(R.id.bLogin);
        TextView bRecover = (TextView) findViewById(R.id.bRecover);*/
    }
    public void Login(View view) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
    public void Register(View view) {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }
    public void Recover (View view)
    {
        Intent recover = new Intent(this, RecoverActivity.class);
        startActivity(recover);
    }


}
