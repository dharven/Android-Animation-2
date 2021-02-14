package com.example.fading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView bat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bat = (ImageView)findViewById(R.id.batID);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        bat.setVisibility(View.VISIBLE);
        Handler mhandler = new Handler();
        mhandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation startanimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein_animation);
                bat.startAnimation(startanimation);
            }
        },50);
        return super.onTouchEvent(event);
    }
}
