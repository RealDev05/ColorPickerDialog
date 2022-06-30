package com.realdev.colorpickerdialog;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class CustomRGBSeekBar extends androidx.appcompat.widget.AppCompatSeekBar{

    public CustomRGBSeekBar(Context context,int padding) {
        super(context);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,1));
        setMax(255);
        setPadding(padding,padding,padding,padding);
        setProgress(255);
    }
}
