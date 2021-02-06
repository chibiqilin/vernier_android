package com.vu.vernier_android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class LineView extends View {
    Paint paint = new Paint();
    Rect rect = new Rect();
    int width;
    int height;
    int x,y;
    int sizeX, sizeY;


    private void init() {
        paint.setColor(Color.BLACK);
        width  = Resources.getSystem().getDisplayMetrics().widthPixels;
        height = Resources.getSystem().getDisplayMetrics().heightPixels;
        x = width/2;
        y = height/2;
        sizeX = 4;
        sizeY = height/3;
    }

    public LineView(Context context) {
        super(context);
        init();
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LineView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(x-sizeX, y-sizeY, x+sizeX, y+sizeY, paint);
        //canvas.drawRect(0,0,canvas.getWidth(),canvas.getHeight()/2, paint);
    }

    public void setSizeX(int value) {sizeX=value;}
    public void incSizeX(){sizeX++;}
    public void decSizeX(){sizeX--;}

}