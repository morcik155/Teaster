package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class GropFillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grop_fill);

        Button s = findViewById(R.id.set_b2);
        Button g = findViewById(R.id.grop_b2);

        Button c1 = findViewById(R.id.b_contest_1);
        Button c2 = findViewById(R.id.b_contest_2);
        Button c3 = findViewById(R.id.b_contest_3);
        Button c4 = findViewById(R.id.b_contest_4);
        Button c5 = findViewById(R.id.b_contest_5);

        Button l = findViewById(R.id.l_f);
        Button r = findViewById(R.id.r_f);

        s.setOnClickListener(view -> { Intent i = new Intent(this, SettingsActivity.class); startActivity(i); });
        g.setOnClickListener(view -> { Intent i = new Intent(this, GropsListActivity.class); startActivity(i); });

        c1.setOnClickListener(view -> {Intent i = new Intent(this, ContestActivity.class); startActivity(i);});
        c2.setOnClickListener(view -> {Intent i = new Intent(this, ContestActivity.class); startActivity(i);});
        c3.setOnClickListener(view -> {Intent i = new Intent(this, ContestActivity.class); startActivity(i);});
        c4.setOnClickListener(view -> {Intent i = new Intent(this, ContestActivity.class); startActivity(i);});
        c5.setOnClickListener(view -> {Intent i = new Intent(this, ContestActivity.class); startActivity(i);});
    }
}