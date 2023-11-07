package com.example.myapplications;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class TopPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_page);

        // 画面遷移を行うためのIntentの作成
        findViewById(R.id.LoginButton).setOnClickListener(v -> {
            Intent intent = new Intent(TopPage.this, Login.class);
            startActivity(intent); // SecondActivityに遷移
        });
    }
}