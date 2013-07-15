package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class CompsAssignment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comps_assignment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comps_assignment, menu);
		
		String fyca = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_1_comp.php\">F.Y.B.Tech</a></html>";
		String syca = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_2_comp.php\">S.Y.B.Tech</a></html>";
		String tyca = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_3_comp.php\">T.Y.B.Tech</a></html>";
		String lastca = "<html><a href=\"http://www.vjtidashboard.uphero.com/asst_4_comp.php\">.B.Tech</a></html>";
		TextView t25 = (TextView) findViewById(R.id.text25);
		t25.setText(Html.fromHtml(fyca));
	    t25.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t26 = (TextView) findViewById(R.id.text26);
		t26.setText(Html.fromHtml(syca));
	    t26.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t27 = (TextView) findViewById(R.id.text27);
		t27.setText(Html.fromHtml(tyca));
	    t27.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t28 = (TextView) findViewById(R.id.text28);
		t28.setText(Html.fromHtml(lastca));
	    t28.setMovementMethod(LinkMovementMethod.getInstance());
		return true;
	}

}
