package com.example.ucbmun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ClubInfo extends Activity {
	String correctPass = "ucbmun";
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club);
	}
	
	public void passwordCheck(View v) {
		 EditText editText = (EditText) findViewById(R.id.password);
		 String password = editText.getText().toString();
		 boolean correct = password.equals(correctPass);
		 
		 if (correct) {
			 Toast.makeText(this,"Password Accepted. Welcome!", Toast.LENGTH_SHORT).show();
			 editText.setText("");
			 Intent i = new Intent(this, ClubFront.class);
			 startActivity(i);
		 } else {
			 Toast.makeText(this,"Sorry, wrong password", Toast.LENGTH_SHORT).show();
			 editText.setText("");
		 }
	}

}
