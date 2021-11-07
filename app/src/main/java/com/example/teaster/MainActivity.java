package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b_l =findViewById(R.id.login);
        Button b_r =findViewById(R.id.register);
        b_l.setOnClickListener(view -> on_click_b_l());
        b_r.setOnClickListener(view -> on_click_b_r());
    }
    void on_click_b_l(){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
    void on_click_b_r(){
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i);
    }

}