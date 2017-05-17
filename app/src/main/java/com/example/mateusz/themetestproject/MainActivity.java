package com.example.mateusz.themetestproject;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.socks.library.KLog;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> planetList = new ArrayList<>();
    private String currentTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logNightMode();

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        logNightMode();

        populateRecycler();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        PlanetAdapter adapter = new PlanetAdapter(planetList, getApplicationContext());
        recyclerView.setAdapter(adapter);

        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-543543543/543543543");
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitialAd.loadAd(adRequest);
    }

    private void populateRecycler() {
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
        planetList.add("TEST");
    }


    private void logNightMode() {
        int currentNightMode = getResources().getConfiguration().uiMode
                & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode) {
            case Configuration.UI_MODE_NIGHT_NO:
                KLog.e("UI_MODE_NIGHT_NO");
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                KLog.e("UI_MODE_NIGHT_YES");
                break;
            case Configuration.UI_MODE_NIGHT_UNDEFINED:
                KLog.e("UI_MODE_NIGHT_UNDEFINED");
        }
    }

    public void button(View view) {
    }
}
