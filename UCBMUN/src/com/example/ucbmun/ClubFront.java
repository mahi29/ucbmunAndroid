package com.example.ucbmun;

import java.util.Hashtable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ClubFront extends Activity {
	private Hashtable<String,String> memberNames;
	public ClubFront() {
		// TODO Auto-generated constructor stub
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.club_front);
		memberNames = new Hashtable<String, String>();
		setHash();
	}
	private void setHash() {
		memberNames.put("Anirudh","510-517-8201");
		memberNames.put("Mahith", "925-360-2387");
		memberNames.put("Ravi","510-387-7178");
	}
	public void startSearch(View v) {
		 EditText eTParam = (EditText) findViewById(R.id.nameentry);
		 EditText phoneDisplay = (EditText) findViewById(R.id.display);
		 String param = eTParam.getText().toString().trim();
		 String out = memberNames.get(param);
		 if (out == null) {
			 Toast.makeText(this, "Sorry, " + param + " is not in the database",Toast.LENGTH_SHORT).show();
		 } else {
			 phoneDisplay.setText(out);
		 }
		 
	}
}
