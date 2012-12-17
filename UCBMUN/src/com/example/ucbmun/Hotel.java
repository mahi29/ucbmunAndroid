package com.example.ucbmun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Hotel extends ConferenceTemplate {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hotel);		
	}
	public void startMaps(View v) {
		Intent i = new Intent(this, HotelMap.class);
		startActivity(i);
	}
	public void directions(View v) {
		Intent i = new Intent(this, Directions.class);
		startActivity(i);
	}
}
