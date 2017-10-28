package com.example.shiyo.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shiyo on 2017/10/27.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
