package com.example.budikdamberapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.text1);
        imageView = findViewById(R.id.imgv1);

        textView.animate().translationX(+1600).setDuration(1000).setStartDelay(4500);
        imageView.animate().translationY(1800).setDuration(1000).setStartDelay(4000);

        //intent untuk perpindahan activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5400);
    }
}
