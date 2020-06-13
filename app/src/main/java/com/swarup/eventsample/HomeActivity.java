package com.swarup.eventsample;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button login_button, signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button login_button, signup_button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        login_button = findViewById(R.id.login_button);
        signup_button = findViewById(R.id.signup_button);

        login_button.setOnClickListener(this);
        signup_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.login_button:
                Intent intent = new Intent(HomeActivity.this, LginActivity.class);
                startActivity(intent);
                break;

            case R.id.signup_button:
                Intent intent1 = new Intent(HomeActivity.this, SignupActivity.class);
                startActivity(intent1);
                finish();
        }
    }
}

