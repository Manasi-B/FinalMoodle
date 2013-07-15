package com.example.finalmoodle;






import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SlidingDrawer;
import android.widget.TextView;
//import android.widget.TextView;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;


@SuppressWarnings("deprecation")
public class Dashboard extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
       
        
        /**
         * Creating all buttons instances
         * */
        // Dashboard News feed button
        Button btn_lectnotes = (Button) findViewById(R.id.btn_lect_notes);
        
        // Dashboard Friends button
        Button btn_assignments = (Button) findViewById(R.id.btn_assignments);
        
        // Dashboard Messages button
        Button btn_event = (Button) findViewById(R.id.btn_event);
        
        // Dashboard Places button
        Button btn_syllabus = (Button) findViewById(R.id.btn_syllabus);
        
        // Dashboard Events button
        Button btn_settings = (Button) findViewById(R.id.btn_settings);
        
        // Dashboard Photos button
        Button btn_help = (Button) findViewById(R.id.btn_help);
        
        /**
         * Handling all button click events
         * */
        
       SlidingDrawer slidingDrawer = (SlidingDrawer) findViewById(R.id.slidingDrawer1);
        slidingDrawer.setOnDrawerOpenListener(new OnDrawerOpenListener() {

           public void onDrawerOpened() {
            	
            	TextView loginScreen = (TextView) findViewById(R.id.link_to_login);
            	 
                // Listening to register new account link
                loginScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Login.class);
                        startActivity(i);
                    }
                });

            }
        });

        slidingDrawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {

            
            public void onDrawerClosed() {

            }
        });

       

        // Listening to News Feed button click
        btn_lectnotes.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Lect_notes.class);
				startActivity(i);
			}
		});
        
       // Listening Friends button click
        btn_assignments.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Assignments.class);
				startActivity(i);
			}
		});
        
        // Listening Messages button click
        btn_event.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Events.class);
				startActivity(i);
			}
		});
        
        // Listening to Places button click
        btn_syllabus.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Syllabus.class);
				startActivity(i);
			}
		});
        
        // Listening to Events button click
        btn_settings.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Settings.class);
				startActivity(i);
			}
		});
        
        // Listening to Photos button click
        btn_help.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View view) {
				// Launching News Feed Screen
				Intent i = new Intent(getApplicationContext(), Help.class);
				startActivity(i);
			}
		});

    }
}


