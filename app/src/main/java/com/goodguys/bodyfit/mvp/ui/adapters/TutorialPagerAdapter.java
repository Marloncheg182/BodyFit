package com.goodguys.bodyfit.mvp.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.goodguys.bodyfit.mvp.ui.fragments.FirstTutorialFragment;
import com.goodguys.bodyfit.mvp.ui.fragments.FirstTutorialFragment_;
import com.goodguys.bodyfit.mvp.ui.fragments.SecondTutorialFragment;
import com.goodguys.bodyfit.mvp.ui.fragments.SecondTutorialFragment_;
import com.goodguys.bodyfit.mvp.ui.fragments.ThirdTutorialFragment;
import com.goodguys.bodyfit.mvp.ui.fragments.ThirdTutorialFragment_;

/**
 * Created by Oleg Romanenchuk on 23.09.2017.
 */

public class TutorialPagerAdapter extends FragmentPagerAdapter {

    private int pages = 3;

    public TutorialPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FirstTutorialFragment_.builder().build();
            case 1:
                return SecondTutorialFragment_.builder().build();
            case 2:
                return ThirdTutorialFragment_.builder().build();
        }
        return null;
    }

    @Override
    public int getCount() {
        return pages;
    }

}