package com.fontawesomeicon;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by piyush on 26/6/17.
 */

public class Fontawesome extends android.support.v7.widget.AppCompatTextView {

    public Fontawesome(Context context) {
        super(context);
        init();
    }

    public Fontawesome(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Fontawesome(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "fontawesome-webfont.ttf");
        setTypeface(tf);
    }

}
