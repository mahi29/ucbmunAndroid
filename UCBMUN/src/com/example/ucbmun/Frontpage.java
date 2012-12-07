package com.example.ucbmun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Frontpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_frontpage, menu);
        return true;
    }
    public void clubButton(View v) {
    	Intent i = new Intent(this, ClubInfo.class);
    	startActivity(i);
    }
    public void conferenceButton(View v) {
    	Intent i = new Intent(this, CommitteeInfo.class);
    	startActivity(i);
    }
    
}
