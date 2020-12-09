package com.pidev.snowtamproject.View.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pidev.snowtamproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Airport2Fragment extends Fragment {


    public Airport2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_airport2, container, false);
        return view;
    }

}
