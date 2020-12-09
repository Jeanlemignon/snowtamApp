package com.pidev.snowtamproject.View.Fragment.FragmentDecode;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pidev.snowtamproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Aiport1DecodeFragment extends Fragment {

    Button btnRaw;
    public Aiport1DecodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aiport1_decode, container, false);
        btnRaw = view.findViewById(R.id.btnRaw);
       /* btnRaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), .class);
                startActivity(intent);
            }
        });*/
        return  view;
    }

}
