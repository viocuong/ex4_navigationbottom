package com.example.ex4_bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.ex4_bottomnavigation.adapter.ViewpagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView navigationView;
    private ViewpagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        TextView t;
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        navigationView = findViewById(R.id.navigation);
        adapter = new ViewpagerAdapter(getSupportFragmentManager(),ViewpagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.imessage:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.inotify:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.igroup:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.istatus:
                        viewPager.setCurrentItem(3);
                        break;
                    case R.id.ipersonal:
                        viewPager.setCurrentItem(4);
                        break;
                }
                return true;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        navigationView.getMenu().findItem(R.id.imessage).setChecked(true);
                        break;
                    case 1:
                        navigationView.getMenu().findItem(R.id.inotify).setChecked(true);
                        break;
                    case 2:
                        navigationView.getMenu().findItem(R.id.igroup).setChecked(true);
                        break;
                    case 3:
                        navigationView.getMenu().findItem(R.id.istatus).setChecked(true);
                        break;
                    case 4:
                        navigationView.getMenu().findItem(R.id.ipersonal).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}