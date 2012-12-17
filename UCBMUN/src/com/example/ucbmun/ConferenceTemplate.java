package com.example.ucbmun;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ConferenceTemplate extends Activity {
	
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_frontpage, menu);
	        return true;
	    }
	    public boolean onOptionsItemSelected(MenuItem item) {
	    	goHome();
	    	return true;
	    }
	 	public void onBackPressed() {
	    	goHome();
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
			Intent i = new Intent(this,Hotel.class);
			startActivity(i);
		}
		public void exploreSFIcon(View v) {
			Intent i = new Intent(this,SF.class);
			startActivity(i);
		}

}
