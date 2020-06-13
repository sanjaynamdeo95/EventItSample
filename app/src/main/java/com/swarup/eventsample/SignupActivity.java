package com.swarup.eventsample;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView back_arrow;
    Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        back_arrow = findViewById(R.id.signup_back_arrow);
        next1 = findViewById(R.id.next1);
        back_arrow.setOnClickListener(this);
        next1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.signup_back_arrow:
                Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();

            case R.id.next1:
                Intent intent1 = new Intent(SignupActivity.this, SignupActivity2.class);
                startActivity(intent1);
                break;
        }
    }
}