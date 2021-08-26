package com.example.miwok;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class myFragmentAdapter extends FragmentPagerAdapter {
    public myFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    public String[] tabTitles = new String[] {"NUMBERS", "FAMILY", "COLORS", "PHRASES" };
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorFragment();
            case 3:
                return new PhraseFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
