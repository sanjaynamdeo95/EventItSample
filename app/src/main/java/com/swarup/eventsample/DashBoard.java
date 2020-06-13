package com.swarup.eventsample;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;
import androidx.viewpager.widget.ViewPager;

public class DashBoard extends AppCompatActivity implements View.OnClickListener {
    TextView dashboard_login;
    ////////// banner View
    private ViewPager bannerSlider;
    private List<BannerModel> bannerModelList;
    private int currentPage = 2;
    private Timer timer;
    final  private long delay_time =3000;
    final  private long period_time=3000;
    ///////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://images.livemint.com/img/2020/01/30/600x338/wedding-kLcC--621x414@LiveMint_1580406878555.jpg", "1 image"));
        slideModels.add(new SlideModel("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/unknown-1576618284.jpeg?crop=1xw:1xh;center,top&resize=980:*", "2 img"));
        slideModels.add(new SlideModel("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/img-3462-1-1576693070.jpg?crop=0.998xw:0.403xh;0.00160xw,0.317xh&resize=980:*", "3 img"));
        slideModels.add(new SlideModel("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/hbz-chris-simon-wedding-33-1576608813.jpg?crop=1xw:1xh;center,top&resize=980:*", "4 img"));
        imageSlider.setImageList(slideModels, true);

    }

        //////////////////////////////////
        @Override
        public void onClick (View v){
            switch (v.getId()) {
                case R.id.text_login:
                    Intent intent = new Intent(DashBoard.this, HomeActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }


