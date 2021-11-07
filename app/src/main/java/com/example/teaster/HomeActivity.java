package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button g = findViewById(R.id.b_g);
        Button s = findViewById(R.id.b_s);
        g.setOnClickListener(view -> on_click(GropsListActivity.class));
        s.setOnClickListener(view -> on_click(SettingsActivity.class));
    }
    void on_click(Class a) {
        Intent i = new Intent(this, a);
        startActivity(i);
    }
}