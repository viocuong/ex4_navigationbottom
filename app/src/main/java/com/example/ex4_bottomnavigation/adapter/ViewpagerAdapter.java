package com.example.ex4_bottomnavigation.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.ex4_bottomnavigation.fragment.GroupFragment;
import com.example.ex4_bottomnavigation.fragment.MessageFragment;
import com.example.ex4_bottomnavigation.fragment.NotifyFragment;
import com.example.ex4_bottomnavigation.fragment.PersonalFragment;
import com.example.ex4_bottomnavigation.fragment.StatusFragment;

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    private int numPager = 5;

    public ViewpagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new MessageFragment();
            case 1:return new NotifyFragment();
            case 2: return new GroupFragment();
            case 3: return new StatusFragment();
            case 4: return new PersonalFragment();
            default: return new MessageFragment();
        }
    }
    @Override
    public int getCount() {
        return numPager;
    }

}
