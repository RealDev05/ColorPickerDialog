package com.realdev.colorpickerdialog;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CustomHSVSeekBar extends androidx.appcompat.widget.AppCompatSeekBar{

    public CustomHSVSeekBar(Context context, int max,int padding) {
        super(context);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT,1f));
        setMax(max);
        setPadding(padding,padding,padding,padding);
        setProgress(0);
        GradientDrawable thumb=new GradientDrawable();
        thumb.setShape(GradientDrawable.RECTANGLE);
        thumb.setSize(padding/2,padding*2);
        thumb.setColor(Color.BLACK);
        setThumb(thumb);
    }
}
