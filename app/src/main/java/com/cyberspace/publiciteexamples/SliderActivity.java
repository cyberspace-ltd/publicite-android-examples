package com.cyberspace.publiciteexamples;

import android.os.Bundle;

import com.cyberspace.publicite.android.sdk.ui.PubliciteSliderAdsView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class SliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final PubliciteSliderAdsView publiciteSliderAdsView
                = findViewById(R.id.slider_adView);

        publiciteSliderAdsView.loadAds();

    }

}
