package com.example.teaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileWriter;
import java.io.IOException;

public class RegisterActivity extends AppCompatActivity {

    private String n_t;
    private String p_t;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.username_login);
        password = findViewById(R.id.password_login);
        n_t = null;
        p_t = null;
        Button send_b = findViewById(R.id.sumbit_b);
        send_b.setOnClickListener(view -> on_c_s_b());
    }
    void on_c_s_b() {
        n_t = name.getText().toString();
        p_t = password.getText().toString();
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}