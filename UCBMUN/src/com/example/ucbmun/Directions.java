package com.example.ucbmun;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class Directions extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_directions);
		setSFO();
		setOak();
		setlafreeway();
		setfreeway();
	}
	
	private void setSFO() {
		TextView tV = (TextView) findViewById(R.id.bartdirections);
		tV.setText("\n\tTake the Pittsburgh/Baypoint BART train and exit at Montgomery St.\n\tAfter exiting BART, walk north on Montgomery St until you reach Clay St. \n\tLeft on Clay St. and right on Kearny St. \n\tThe Hilton will be on your right\n\n\tTotal Cost: $8.25");
	}
	private void setOak() {
		TextView tV = (TextView) findViewById(R.id.oakdirections);
		tV.setText("\n\tTake the Oakland airport shuttle from the Oakland Airport to the Coliseum/Oakland Airport BART Station. \n\tFrom the BART station, take either the Fremont/Daly City [Green line] or the Dublin/Daly City [Blue line] towards Daly City \n\tGet off at Montgomery St and exit the BART station \n\tWalk north on Montgomery St until Clay St.\n\t Left on Clay St and right on Kearny St and the Hilton will be on your right\n\n\tTotal cost: $6.85" );
	}
	private void setlafreeway() {
		TextView tV = (TextView) findViewById(R.id.i5directions);
		tV.setText("\n\tFrom I-5, merge onto I-580W (signs for Oakland/SF)\n\tTake Exit 19A to merge on to I-80W towards San Francisco");
	}
	private void setfreeway() {
		TextView tV = (TextView) findViewById(R.id.i80directions);
		tV.setText("\n\tTake Exit 2C to merge onto Fremont St\n\tContinue onto Front St\n\tTurn Left onto Pine St\n\tTurn Right onto Kearny St. The Hilton is on the left");
	}
}
