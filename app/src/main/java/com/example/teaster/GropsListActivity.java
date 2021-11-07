package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class GropsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grops_list);

        ImageView bg = findViewById(R.id.bg_g_l);

        Button s = findViewById(R.id.set_b);
        Button g = findViewById(R.id.grop_b);

        Button g1 = findViewById(R.id.b_group_1);
        Button g2 = findViewById(R.id.b_group_2);
        Button g3 = findViewById(R.id.b_group_3);
        Button g4 = findViewById(R.id.b_group_4);
        Button g5 = findViewById(R.id.b_group_5);

        Button l = findViewById(R.id.left_list);
        Button r = findViewById(R.id.right_list);

        g1.setOnClickListener(view -> goToG(0));
        g2.setOnClickListener(view -> goToG(0));
        g3.setOnClickListener(view -> goToG(0));
        g4.setOnClickListener(view -> goToG(0));
        g5.setOnClickListener(view -> goToG(0));

        l.setOnClickListener(view -> {});
        r.setOnClickListener(view -> {});

        s.setOnClickListener(view -> {Intent i = new Intent(this, SettingsActivity.class); startActivity(i);});
        g.setOnClickListener(view -> {Intent i = new Intent(this, GropsListActivity.class); startActivity(i);});

        SharedPreferences sharedPreferences = getSharedPreferences("settings", Context.MODE_PRIVATE);
        int id = sharedPreferences.getInt("theme", 0);
        if (id == 0) {
            bg.setImageResource(R.drawable.bg_blue);
        }
        else if (id == 1) {
            bg.setImageResource(R.drawable.bg_green);
        }
        else if (id == 2) {
            bg.setImageResource(R.drawable.bg_orange);
        }
        else if (id == 3) {
            bg.setImageResource(R.drawable.bg_red);
        }
        else if (id == 4) {
            bg.setImageResource(R.drawable.bg_yellow);
        }
    }
    void goToG(int g) {
        Intent i = new Intent(this, GropFillActivity.class);
        i.putExtra("group", g);
        startActivity(i);
    }
}