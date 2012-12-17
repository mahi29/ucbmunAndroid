package com.example.ucbmun;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

public class SecretariatInfo extends ConferenceTemplate {
	Context context;
	public SecretariatInfo() {
		// TODO Auto-generated constructor stub
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_sec);
		context = this;
		TextView name = (TextView) findViewById(R.id.sidname);
		name.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(context, SiddharthBio.class);
				startActivity(i);
			}
		});
	}
	public void sidBio(View v) {

	}
}
