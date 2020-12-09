package com.pidev.snowtamproject.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.pidev.snowtamproject.R;

import java.util.List;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private Button startbutton;
    GoogleMap gMap;
    TextView tvNormal, tvSatellite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        tvNormal = findViewById(R.id.tv_normal);
        tvSatellite= findViewById(R.id.tv_satellite);

        tvNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                tvNormal.setBackgroundResource(R.drawable.map_aeroport);
                tvSatellite.setVisibility(View.VISIBLE);
                tvNormal.setVisibility(View.GONE);
            }
        });

        tvSatellite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                tvSatellite.setBackgroundResource(R.drawable.map_aeroport_satellite);
                tvNormal.setVisibility(View.VISIBLE);
                tvSatellite.setVisibility(View.GONE);
            }
        });
        //Obtain the SupportMapFragment
        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.google_map);
        supportMapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
     //Assign Variable
     LatLng aeroport1 = new LatLng(-34,151);


     gMap = googleMap;
     //can be put on a loop
    // gMap.addMarker(new MarkerOptions().position(aeroport1).title("Marker in sydney"));
     //gMap.moveCamera(CameraUpdateFactory.newLatLng(aeroport1));
     gMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
         @Override
         public void onMapClick(LatLng latLng) {
             //Creating Marker
             MarkerOptions markerOptions = new MarkerOptions();
             //Set Marker position
             markerOptions.position(latLng);
             //Set latitude and longitude
             markerOptions.title(latLng.latitude+" "+latLng.longitude);
             //clear the previously click position
             gMap.clear();
             //zoom map
             gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,10));
             //Add Marker on Map
             gMap.addMarker(markerOptions);
         }
     });
    }
}

