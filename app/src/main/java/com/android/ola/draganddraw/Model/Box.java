package com.android.ola.draganddraw.Model;

import android.graphics.PointF;

/**
 * Created by Kaustav on 17-12-2017.
 */

public class Box {

    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = origin;
        mCurrent = origin;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }
}
