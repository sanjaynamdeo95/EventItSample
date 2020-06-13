package com.swarup.eventsample;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LginActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView login_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgin);
        login_back_arrow = findViewById(R.id.login_back_arrow);
        login_back_arrow.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_back_arrow:
                Intent intent = new Intent(LginActivity.this, HomeActivity.class);
                startActivity(intent);
                break;
        }
    }
}

