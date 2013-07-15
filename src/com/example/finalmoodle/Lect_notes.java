package com.example.finalmoodle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.View;
import android.widget.SlidingDrawer;
import android.widget.TextView;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;


public class Lect_notes extends Activity {
	 private View fybtech_compsScreen;

	/** Called when the activity is first created. */
    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lect_notes);
        
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
        
        
       
        
        TextView fybtechScreen = (TextView) findViewById(R.id.link_to_fybtech);
        
        // Listening to forget password link
        fybtechScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), FYBtech.class);
                startActivity(i);
            }
        });
        
 TextView sybtech_itScreen = (TextView) findViewById(R.id.link_to_sybtech_it);
        
        // Listening to forget password link
        sybtech_itScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), SYBTechIT.class);
                startActivity(i);
            }
        });
        
 TextView tybtech_itScreen = (TextView) findViewById(R.id.link_to_tybtech_it);
        
        // Listening to forget password link
        tybtech_itScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), TYBTechIT.class);
                startActivity(i);
            }
        });
        
 TextView btech_itScreen = (TextView) findViewById(R.id.link_to_btech_it);
        
        // Listening to forget password link
        btech_itScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), BTechIT.class);
                startActivity(i);
            }
        });
 TextView fybtech_compsScreen = (TextView) findViewById(R.id.link_to_fybtech_comps);
        
        // Listening to forget password link
        fybtech_compsScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), FYBTechComps.class);
                startActivity(i);
            }
        });

 TextView sybtech_compsScreen = (TextView) findViewById(R.id.link_to_sybtech_comps);
        
        // Listening to forget password link
        sybtech_compsScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), SYBTechComps.class);
                startActivity(i);
            }
        });
        
 TextView tybtech_compsScreen = (TextView) findViewById(R.id.link_to_tybtech_it);
        
        // Listening to forget password link
        tybtech_compsScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), TYBTechComps.class);
                startActivity(i);
            }
        });
        
 TextView btech_compsScreen = (TextView) findViewById(R.id.link_to_btech_it);
        
        // Listening to forget password link
        btech_compsScreen.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
                // Switching to forget screen
                Intent i = new Intent(getApplicationContext(), BTechComps.class);
                startActivity(i);
            }
        });
    }
}
