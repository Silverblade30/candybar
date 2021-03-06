package com.candybar.dev.activities;

import androidx.annotation.NonNull;

import com.candybar.dev.R;

import candybar.lib.activities.CandyBarSplashActivity;
import candybar.lib.activities.configurations.SplashScreenConfiguration;

public class SplashActivity extends CandyBarSplashActivity {

    @NonNull
    @Override
    public SplashScreenConfiguration onInit() {
        return new SplashScreenConfiguration(MainActivity.class)
                .setBottomText(getString(R.string.splash_screen_title));
    }
}
