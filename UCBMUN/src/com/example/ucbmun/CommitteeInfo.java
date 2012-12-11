package com.example.ucbmun;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

public class CommitteeInfo extends Activity {
	Context context;
	public CommitteeInfo() {
		// TODO Auto-generated constructor stub
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.committee_frontpage);
		context = this;
		ImageButton committeeIcon = (ImageButton) this.findViewById(R.id.committeeIcon);																											
		committeeIcon.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(context, "Committees", Toast.LENGTH_SHORT).show();
				return true;
			}
		});
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
	
	//Page Specific
	public void crisisCommittees(View v) {
		
	}
	public void jcc(View v) {
		
	}
	public void specializedBodies(View v) {
		
	}

}
