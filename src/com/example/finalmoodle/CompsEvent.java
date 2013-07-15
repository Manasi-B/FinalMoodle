package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class CompsEvent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comps_event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comps_event, menu);
		String fyce = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_1_comp.php\">F.Y.B.Tech</a></html>";
		String syce = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_2_comp.php\">S.Y.B.Tech</a></html>";
		String tyce = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_3_comp.php\">T.Y.B.Tech</a></html>";
		String lastce = "<html><a href=\"http://www.vjtidashboard.uphero.com/events_4_comp.php\">.B.Tech</a></html>";
		TextView t35 = (TextView) findViewById(R.id.text25);
		t35.setText(Html.fromHtml(fyce));
	    t35.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t36 = (TextView) findViewById(R.id.text36);
		t36.setText(Html.fromHtml(syce));
	    t36.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t37 = (TextView) findViewById(R.id.text37);
		t37.setText(Html.fromHtml(tyce));
	    t37.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t38 = (TextView) findViewById(R.id.text38);
		t38.setText(Html.fromHtml(lastce));
	    t38.setMovementMethod(LinkMovementMethod.getInstance());
		return true;
	}

}
