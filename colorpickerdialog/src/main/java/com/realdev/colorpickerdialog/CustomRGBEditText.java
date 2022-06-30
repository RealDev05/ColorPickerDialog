package com.realdev.colorpickerdialog;

import android.content.Context;
import android.text.InputType;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;

public class CustomRGBEditText extends androidx.appcompat.widget.AppCompatEditText{

    public CustomRGBEditText(Context context,int width) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(width, ViewGroup.LayoutParams.WRAP_CONTENT));
        setEms(10);
        setText(R.string.number_255); // R.string.number_255 = "255"
        setInputType(InputType.TYPE_NUMBER_FLAG_SIGNED);
        setImeOptions(EditorInfo.IME_ACTION_DONE);
    }
}
