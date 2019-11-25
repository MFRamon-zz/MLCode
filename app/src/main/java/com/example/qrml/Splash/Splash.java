package com.example.qrml.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qrml.Activities.LoginActivity;
import com.example.qrml.MainActivity;
import com.example.qrml.R;

public class Splash extends AppCompatActivity {
    private final int DURACION = 3000;
    //private View img = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(Splash.this, LoginActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION);
    }
}
