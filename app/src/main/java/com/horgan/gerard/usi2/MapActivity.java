package com.horgan.gerard.usi2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap m_map;
    boolean mapReady= false;
    MarkerOptions trinity, su, outR, counselling;



    @Override
    public Resources getResources() {
        return super.getResources();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        outR = new MarkerOptions()
                .position(new LatLng(53.345102, -6.257505))
                .title("Out Reach center, Room 5")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.biggestpink));


        trinity = new MarkerOptions()
                .position(new LatLng(53.343792, -6.254572))
                .title("Trinity GP Services. Room 1" )
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.biggestpink));


        su = new MarkerOptions()
                .position(new LatLng(53.344711, -6.258911))
                .title("Trinty Students' Union, Room 4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.biggestpink));

        counselling = new MarkerOptions()
                .position(new LatLng(53.344768, -6.257977))
                .title("Trinity Student Counselling Service , Room 6")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.biggestpink));



        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap map){
        mapReady=true;
        m_map = map;
        Marker marker= m_map.addMarker(trinity);
        Marker marker1= m_map.addMarker(su);
        Marker marker2= m_map.addMarker(counselling);
        Marker marker3= m_map.addMarker(outR);
        marker.showInfoWindow();
        marker1.showInfoWindow();
        marker2.showInfoWindow();
        marker3.showInfoWindow();





    }



}
