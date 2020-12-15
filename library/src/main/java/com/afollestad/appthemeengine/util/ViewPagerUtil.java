package com.afollestad.appthemeengine.util;

import androidx.viewpager.widget.ViewPager;
import android.view.View;

/**
 * @author Aidan Follestad (afollestad)
 */
public final class ViewPagerUtil {

    // External class is used after checking if ViewPager is on the class path. Avoids compile errors.
    public static boolean isViewPager(View view) {
        return view instanceof ViewPager;
    }

    private ViewPagerUtil() {
    }
}
