package com.android.ola.draganddraw;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.ola.draganddraw.Fragments.DragAndDrawFragment;

public class DragAndDrawActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
