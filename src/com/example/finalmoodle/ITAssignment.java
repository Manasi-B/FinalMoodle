package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class ITAssignment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.it_assignment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.itassignment, menu);
		String fya = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_1.php\">F.Y.B.Tech</a></html>";
		String sya= "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_2.php\">S.Y.B.Tech</a></html>";
		String tya = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_3.php\">T.Y.B.Tech</a></html>";
		String lasta = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_4.php\">.B.Tech</a></html>";
		TextView t21 = (TextView) findViewById(R.id.text21);
		t21.setText(Html.fromHtml(fya));
	    t21.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t22 = (TextView) findViewById(R.id.text22);
		t22.setText(Html.fromHtml(sya));
	    t22.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t23 = (TextView) findViewById(R.id.text23);
		t23.setText(Html.fromHtml(tya));
	    t23.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t24 = (TextView) findViewById(R.id.text24);
		t24.setText(Html.fromHtml(lasta));
	    t24.setMovementMethod(LinkMovementMethod.getInstance());
		return true;
	}

}
