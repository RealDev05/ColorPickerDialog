package com.realdev.colorpickerdialog;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class CustomRGBContainer extends LinearLayout {

    public CustomRGBContainer(Context context, String TextViewText, SeekBar seekBar, EditText editText, int width) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setGravity(Gravity.CENTER);
        setOrientation(LinearLayout.HORIZONTAL);
        TextView text=new TextView(context);
        text.setLayoutParams(new ViewGroup.LayoutParams(width, ViewGroup.LayoutParams.WRAP_CONTENT));
        text.setText(TextViewText);
        addView(text);
        addView(seekBar);
        addView(editText);
    }
}