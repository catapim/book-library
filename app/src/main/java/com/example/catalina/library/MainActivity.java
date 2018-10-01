package com.example.catalina.library;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.librosBtn:
                    setContentView(R.layout.activity_main);
                    return true;
                case R.id.salirBtn:
                    finish();
                    System.exit(0);
                    return true;
                case R.id.verButton:
                    setContentView(R.layout.activity_main);
            }
            return false;
        }


    };
}

