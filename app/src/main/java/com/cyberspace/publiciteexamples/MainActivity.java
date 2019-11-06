package com.cyberspace.publiciteexamples;

import android.content.Intent;
import android.os.Bundle;

import com.cyberspace.publicite.android.sdk.ui.fpads.PubliciteFPAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView bt_native, bt_full_page, bt_slider, bt_banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bt_banner = findViewById(R.id.bt_banner);
        bt_full_page = findViewById(R.id.bt_full_page);
        bt_native = findViewById(R.id.bt_native);
        bt_slider = findViewById(R.id.bt_slider);

        bt_full_page.setOnClickListener(v ->{
            /* create a publi  cite full page Ads with 50s refresh rate */
                new PubliciteFPAds(getApplicationContext(), "").loadAds("fpOtdSZU7KST3SyyenezshjVnmyVrHK8asUZBIls2T8%3D", 50000);
        });

        bt_slider.setOnClickListener(v -> {
            Intent slider_ad = new Intent(getApplicationContext(), SliderActivity.class);
            startActivity(slider_ad);
        });

        bt_native.setOnClickListener(v -> {

        });

        bt_banner.setOnClickListener(v -> {
            Intent slider_ad = new Intent(getApplicationContext(), BannerActivity.class);
            startActivity(slider_ad);
        });

    }




}
