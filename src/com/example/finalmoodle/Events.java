package com.example.finalmoodle;

 
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;
 
public class Events extends Activity {
    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.events);
        
        @SuppressWarnings("deprecation")
		SlidingDrawer slidingDrawer = (SlidingDrawer) findViewById(R.id.slidingDrawer2);
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

            	
            	TextView dashboardScreen = (TextView) findViewById(R.id.link_to_dashboard);
            	 
                // Listening to register new account link
                dashboardScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Dashboard.class);
                        startActivity(i);
                    }
                });
                
                TextView eventsScreen = (TextView) findViewById(R.id.link_to_events);
           	 
                // Listening to register new account link
                eventsScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Events.class);
                        startActivity(i);
                    }
                });
                
                TextView helpScreen = (TextView) findViewById(R.id.link_to_help);
                
             	 
                // Listening to register new account link
                helpScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Help.class);
                        startActivity(i);
                    }
                });
                
                TextView lect_notesScreen = (TextView) findViewById(R.id.link_to_lect_notes);
                
           	 
                // Listening to register new account link
                lect_notesScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Lect_notes.class);
                        startActivity(i);
                    }
                });
              
                TextView settingsScreen = (TextView) findViewById(R.id.link_to_settings);
                
             	 
                // Listening to register new account link
                settingsScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Settings.class);
                        startActivity(i);
                    }
                });

                TextView assignmentsScreen = (TextView) findViewById(R.id.link_to_assignments);
                
            	 
                // Listening to register new account link
                assignmentsScreen.setOnClickListener(new View.OnClickListener() {
         
                    public void onClick(View v) {
                        // Switching to Register screen
                        Intent i = new Intent(getApplicationContext(), Assignments.class);
                        startActivity(i);
                    }
                });
                

            }
        });

        slidingDrawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {

            
            public void onDrawerClosed() {

            }
        });

       


        slidingDrawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {

            
            public void onDrawerClosed() {

            }
        });
 
        TextView it_assignmentScreen = (TextView) findViewById(R.id.link_to_it_event);
 
        // Listening to register new account link
        it_assignmentScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to IT screen
                Intent i = new Intent(getApplicationContext(), ITEvent.class);
                startActivity(i);
            }
        });
        
        TextView comps_assignmentScreen = (TextView) findViewById(R.id.link_to_comps_event);
        
        // Listening to forget password link
        comps_assignmentScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), CompsEvent.class);
                startActivity(i);
            }
        });
        
    }
}
