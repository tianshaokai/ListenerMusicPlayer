package com.afollestad.appthemeengine.inflation;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import android.util.AttributeSet;

import com.afollestad.appthemeengine.ATEActivity;
import com.afollestad.appthemeengine.tagprocessors.ATEDefaultTags;

/**
 * @author Aidan Follestad (afollestad)
 */
class ATESearchViewAutoComplete extends SearchView.SearchAutoComplete implements ViewInterface {

    public ATESearchViewAutoComplete(Context context) {
        super(context);
        init(context, null);
    }

    public ATESearchViewAutoComplete(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, null);
    }

    public ATESearchViewAutoComplete(Context context, AttributeSet attrs, @Nullable ATEActivity keyContext) {
        super(context, attrs);
        init(context, keyContext);
    }

    private void init(Context context, @Nullable ATEActivity keyContext) {
        ATEDefaultTags.process(this);
        try {
            ATEViewUtil.init(keyContext, this, context);
        } catch (Throwable t) {
            throw new RuntimeException(t.getMessage(), t);
        }
    }

    @Override
    public boolean setsStatusBarColor() {
        return false;
    }

    @Override
    public boolean setsToolbarColor() {
        return false;
    }
}