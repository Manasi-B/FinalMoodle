package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class ITEvent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.it_event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.itevent, menu);
		
		String fye = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_1.php\">F.Y.B.Tech</a></html>";
		String sye= "<html><a href=\"http://www.vjtidashboard.uphero.com/events_2.php\">S.Y.B.Tech</a></html>";
		String tye = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_3.php\">T.Y.B.Tech</a></html>";
		String laste = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_4.php\">.B.Tech</a></html>";
		TextView t31 = (TextView) findViewById(R.id.text31);
		t31.setText(Html.fromHtml(fye));
	    t31.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t32 = (TextView) findViewById(R.id.text32);
		t32.setText(Html.fromHtml(sye));
	    t32.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t33 = (TextView) findViewById(R.id.text33);
		t33.setText(Html.fromHtml(tye));
	    t33.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t34 = (TextView) findViewById(R.id.text34);
		t34.setText(Html.fromHtml(laste));
	    t34.setMovementMethod(LinkMovementMethod.getInstance());
		return true;
	}

}
