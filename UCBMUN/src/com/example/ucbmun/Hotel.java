package com.example.ucbmun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Hotel extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_hotel);		
	}
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_frontpage, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
    	goHome();
    	return true;
    }
    public void goHome () {
    	Intent i = new Intent(this, Frontpage.class);
    	startActivity(i);
    }
	public void committeeIcon(View v) {
		Intent i = new Intent(this,CommitteeInfo.class);
		startActivity(i);		
	}
	public void gavelIcon(View v) {
		Intent i = new Intent(this,SecretariatInfo.class);
		startActivity(i);
	}
	public void rpIcon(View v) {
		Intent i = new Intent(this,RP.class);
		startActivity(i);
	}
	public void hotelIcon(View v){

	}
	public void exploreSFIcon(View v) {
		Intent i = new Intent(this,SF.class);
		startActivity(i);
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
