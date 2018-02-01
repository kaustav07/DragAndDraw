package com.android.ola.draganddraw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.ola.draganddraw.R;

public class DragAndDrawFragment extends Fragment {

    public DragAndDrawFragment() {
        // Required empty public constructor
    }

    public static DragAndDrawFragment newInstance() {
        DragAndDrawFragment fragment = new DragAndDrawFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drag_and_draw, container, false);
    }

}
