package com.android.ola.draganddraw.CustomViews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.android.ola.draganddraw.Model.Box;
import com.github.lzyzsd.randomcolor.RandomColor;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;

/**
 * Created by Kaustav on 17-12-2017.
 */

public class BoxDragAndDraw extends View {

    Box mCurrentBox;
    List<Box> mBoxes = new ArrayList<>();
    Paint mPaint;
    Paint mBackgroundPaint;
    RandomColor randomColor = new RandomColor();

    public BoxDragAndDraw(Context context) {
        super(context);
    }

    public BoxDragAndDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint(ANTI_ALIAS_FLAG);
        mPaint.setColor(0x22ff0000);
        mBackgroundPaint = new Paint();
        mBackgroundPaint.setColor(0xfff8efe0);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PointF current = new PointF(event.getX(), event.getY());


        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mCurrentBox = new Box(current);
                mBoxes.add(mCurrentBox);
                break;
            case MotionEvent.ACTION_MOVE:
                if (mCurrentBox != null) {
                    mCurrentBox.setCurrent(current);
                    invalidate();
                }
                break;
            case MotionEvent.ACTION_UP:
                mCurrentBox = null;
                break;
            case MotionEvent.ACTION_CANCEL:
                mCurrentBox = null;
                break;
        }

        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        for(Box box:mBoxes){
            float left = Math.min(box.getCurrent().x,box.getOrigin().x);
            float Right = Math.max(box.getCurrent().x,box.getOrigin().x);
            float top = Math.min(box.getCurrent().y,box.getOrigin().y);
            float bottom = Math.max(box.getCurrent().y,box.getOrigin().y);
          //  mPaint.setColor(randomColor.randomColor());
            canvas.drawRect(left,top,Right,bottom,mPaint);
        }
    }
}
