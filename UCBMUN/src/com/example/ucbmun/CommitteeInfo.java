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

public class CommitteeInfo extends ConferenceTemplate {
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
	//Page Specific
	public void crisisCommittees(View v) {
		
	}
	public void jcc(View v) {
		
	}
	public void specializedBodies(View v) {
		
	}

}
