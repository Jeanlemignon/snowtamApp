package com.pidev.snowtamproject.View.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.pidev.snowtamproject.Model.Snowtam;
import com.pidev.snowtamproject.Model.SnowtamJsonUtil;
import com.pidev.snowtamproject.R;
import com.pidev.snowtamproject.View.Fragment.FragmentDecode.Aiport1DecodeFragment;
import com.pidev.snowtamproject.View.MapActivity;
import com.pidev.snowtamproject.View.SnowtamDecodeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Airport1Fragment extends Fragment {

    private TextView textView;
    private Button btnMap,btnRaw;
    private SnowtamJsonUtil snowtamJsonUtil;
    private Snowtam snowtam;
    private TextView CodeAirport,CodeCountry,nameCountry,hour,idPisteLayout,runwayVal;
    private TextView thresholdVal,DThresholdval,AThresholdval,taxiwayDval;

    public Airport1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /*View v = inflater.inflate(R.layout.fragment_airport1, container,false);

        textView = v.findViewById(R.id.textview);
        String data = getArguments().getString("key");
        textView.setText(data);*/
        View view = inflater.inflate(R.layout.fragment_airport1, container, false);
        btnMap = view.findViewById(R.id.btnMap);
        btnRaw = view.findViewById(R.id.btnRaw);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MapActivity.class);
                startActivity(intent);
            }
        });
        btnRaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnowtamDecodeActivity.class);
                startActivity(intent);
                  /*Fragment mFragment = null;
                mFragment = new Aiport1DecodeFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment1, fragment2);
                fragmentTransaction.commit();*/
            }
        });

        //---------------------Recuperation du JSON----------------------
        snowtamJsonUtil = new SnowtamJsonUtil();
        snowtam = snowtamJsonUtil.extractNoTam(0,getContext());

        //--------------------------- Affichage----------------------------

        thresholdVal = view.findViewById(R.id.thresholdVal);
        thresholdVal.setText(snowtam.getId());
        return view;
    }

}
