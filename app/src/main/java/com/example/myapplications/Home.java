package com.example.myapplications;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

//        // 画面遷移を行うためのIntentの作成
//        findViewById(R.id.homeBackButton).setOnClickListener(v -> {
//            Intent intent = new Intent(home.this, Home.class);
//            startActivity(intent); // SecondActivityに遷移
//        });

    }
}