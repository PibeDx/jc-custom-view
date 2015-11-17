package com.josecuentas.jc_custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Jose Cuentas Turpo on 17/11/2015 - 10:32 AM.
 * E-mail: jcuentast@gmail.com
 */
public class FontTextView extends TextView {

    float mTextPos;

//    public FontTextView(Context context) {
//        super(context);
//        initStyle();
//    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initStyle(context, attrs);
    }

    public void initStyle(Context context, AttributeSet attrs) {
        this.setTextColor(getResources().getColor(R.color.colorPrimary));
        //this.setTextSize(20f);

        //

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontTextView,
                0, 0);

        try {
            //mShowText = a.getBoolean(R.styleable.PieChart_showText, false);
            mTextPos = a.getDimension(R.styleable.FontTextView_size, 14f);
            this.setTextSize(mTextPos);
        } finally {
            a.recycle();
        }
    }
}
