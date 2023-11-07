package com.example.myapplications;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // 画面遷移を行うためのIntentの作成
        findViewById(R.id.LoginButton).setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, LoginComp.class);
            startActivity(intent); // SecondActivityに遷移
        });

    }
}