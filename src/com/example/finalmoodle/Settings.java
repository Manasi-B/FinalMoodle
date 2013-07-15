package com.example.finalmoodle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Settings extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
        
        // Listening to register new account link
       loginScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to IT screen
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });
        
        TextView contact_usScreen = (TextView) findViewById(R.id.link_to_contact_us);
        
        // Listening to forget password link
        contact_usScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(i);
            }
        });
        
    }
}
