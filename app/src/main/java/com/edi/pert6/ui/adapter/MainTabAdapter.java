package com.edi.pert6.ui.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.edi.pert6.ui.main.AboutFragment;
import com.edi.pert6.ui.main.HomeFragment;
import com.edi.pert6.ui.main.SettingFragment;

public class MainTabAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MainTabAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                SettingFragment settingFragment = new SettingFragment();
                return settingFragment;
            case 2:
                AboutFragment nbaFragment = new AboutFragment();
                return nbaFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
