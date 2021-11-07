package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SettingsActivity extends AppCompatActivity {
    private ImageView bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        bg = findViewById(R.id.bg_settings);
        Button s = findViewById(R.id.set_b3);
        Button g = findViewById(R.id.grop_b3);
        RadioButton b = findViewById(R.id.is_blue);
        RadioButton gr = findViewById(R.id.is_green);
        RadioButton o = findViewById(R.id.is_orange);
        RadioButton r = findViewById(R.id.is_red);
        RadioButton y = findViewById(R.id.is_yellow);

        s.setOnClickListener(view -> { Intent i = new Intent(this, SettingsActivity.class); });
        g.setOnClickListener(view -> { Intent i = new Intent(this, GropsListActivity.class); });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @SuppressLint("NonConstantResourceId")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.is_blue:
                        bg.setImageResource(R.drawable.bg_blue);
                        save_settings(0);
                        break;
                    case R.id.is_green:
                        bg.setImageResource(R.drawable.bg_green);
                        save_settings(1);
                        break;
                    case R.id.is_orange:
                        bg.setImageResource(R.drawable.bg_orange);
                        save_settings(2);
                        break;
                    case R.id.is_red:
                        bg.setImageResource(R.drawable.bg_red);
                        save_settings(3);
                        break;
                    case R.id.is_yellow:
                        bg.setImageResource(R.drawable.bg_yellow);
                        save_settings(4);
                        break;

                    default:
                        break;
                }
            }
        });
    }
    void save_settings(int id) {
        SharedPreferences sharedPreferences = getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("theme", id);
        editor.apply();
    }
}
