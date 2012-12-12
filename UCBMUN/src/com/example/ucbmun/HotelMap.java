package com.example.ucbmun;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class HotelMap extends MapActivity {

	Drawable drawable;
	MapSupport itemizedoverlay;
	MapController mC;
	List<Overlay> mapOverlays;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotelmap);
		MapView mV = (MapView) findViewById(R.id.mapview);
		mV.setBuiltInZoomControls(true);
        drawable = this.getResources().getDrawable(R.drawable.yellowpin);
        itemizedoverlay = new MapSupport(drawable, this);
        mC = mV.getController();
        mC.setZoom(14);
        mapOverlays = mV.getOverlays();
        GeoPoint hotel = new GeoPoint(37795143,-122404312);
        OverlayItem oi = new OverlayItem(hotel, "Hilton","UCBMUNC 2013");
        itemizedoverlay.addOverlay(oi);
        mapOverlays.add(itemizedoverlay);
        
        mC.setCenter(hotel);
	}
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
