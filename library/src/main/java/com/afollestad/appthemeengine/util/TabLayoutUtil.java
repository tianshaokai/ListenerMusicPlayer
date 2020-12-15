package com.afollestad.appthemeengine.util;

import com.google.android.material.tabs.TabLayout;
import android.view.View;

/**
 * @author Aidan Follestad (afollestad)
 */
public final class TabLayoutUtil {

    // External class is used after checking if TabLayout is on the class path. Avoids compile errors.
    public static boolean isTabLayout(View view) {
        return view instanceof TabLayout;
    }

    private TabLayoutUtil() {
    }
}