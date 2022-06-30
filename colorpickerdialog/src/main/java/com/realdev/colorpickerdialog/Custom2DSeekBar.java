package com.realdev.colorpickerdialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("ViewConstructor")
public class Custom2DSeekBar extends View {
    LayerDrawable corneredGradient;
    GradientDrawable blackToTransparent;
    Paint whiteStroke=new Paint(),blackStroke=new Paint();
    public float x=0,y=0,radius,width,height;
    Context contxt;

    public Custom2DSeekBar(Context context,int initColor,int initHeight) {
        super(context);
        contxt=context;

        blackToTransparent= new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP,new int[]{
                Color.BLACK,Color.TRANSPARENT
        });

        radius=initHeight/15f;
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,initHeight));
        setBackground(initColor);

        whiteStroke.setColor(Color.WHITE);
        whiteStroke.setStrokeWidth(radius/2.5f);
        whiteStroke.setStyle(Paint.Style.STROKE);

        blackStroke.setColor(Color.BLACK);
        blackStroke.setStrokeWidth(radius/2.5f);
        blackStroke.setStyle(Paint.Style.STROKE);

        addOnLayoutChangeListener((view, i, i1, i2, i3, i4, i5, i6, i7) -> {
            width=i2-i;
            height=i3-i1;
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(x,y,radius*0.8f,whiteStroke);
        canvas.drawCircle(x,y,radius,blackStroke);
    }

    @SuppressLint("ClickableViewAccessibility")
    public void setCordsChangedListener(SeekBar2DCordsChangedListener listener){
        if(listener==null){return;}
        setOnTouchListener((view, motionEvent) -> {
            switch (motionEvent.getActionMasked()){
                case MotionEvent.ACTION_DOWN:
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_UP:
                    setCords(motionEvent.getX(),motionEvent.getY());
                    listener.changed(x,y);
                    return true;
            }
            return false;
        });
    }

    public void setCords(float X, float Y){
        x=Math.min(width, Math.max(0,X));
        y=Math.min(height, Math.max(0,Y));
        invalidate();
    }

    public void setBackground(int color){
        corneredGradient=new LayerDrawable(new Drawable[]{
                new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{
                        Color.WHITE,color
                }),blackToTransparent
        });
        setBackground(corneredGradient);
    }

    public interface SeekBar2DCordsChangedListener{
        void changed(float x,float y);
    }
}
