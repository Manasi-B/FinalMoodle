package com.example.finalmoodle;


 
import javax.xml.parsers.DocumentBuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


 
public class Login extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login);
        
        
        

        final EditText passwd = (EditText)findViewById(R.id.pass);

        Button dashboardScreen = (Button)findViewById(R.id.link_to_dashboard);
 
        
 
        // Listening to register new account link
        dashboardScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
            	String password = passwd.getText().toString();
            	if(password.equals("vjti123")){
                // Switching to Register screen
            		
            		Intent i = new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(i);
                
            	}
            	
            	else
            	{ 
            	 Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_SHORT).show();
            	}
            }

        });
        
     }
}


