package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class BTechComps extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.btech_comps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.btech_comps, menu);
		String amp = "<html><a href=\"https://www.dropbox.com/sh/anlh92swzti1q7h/1PYz91ahOk\">Advanced Microprocessor</a></html>";
						String is = "<html><a href=\"https://www.dropbox.com/sh/9rikionobnqj4tv/kIJfakF3SR\">Intelligent Systems</a></html>";
						String imp = "<html><a href=\"https://www.dropbox.com/sh/jwcnepz81kmzhaj/uDDfnyUjnN\">Image Processing</a></html>";
						String dsp = "<html><a href=\"https://www.dropbox.com/sh/4r6wmj8tshmy44m/hFqhmJ54JT\">Digital Signal Processing</a></html>";
						String dcomp = "<html><a href=\"https://www.dropbox.com/sh/nmcnl7e56y0da8p/s8pNcO0aU7\">Distributed Computing</a></html>";
						String ms = "<html><a href=\"https://www.dropbox.com/sh/ocfszea7b3azwda/jmqoUmeG6B\">Multimedia System</a></html>";
						String pp1 = "<html><a href=\"https://www.dropbox.com/sh/as5gtfn8umcstma/SNVyqNmK-4\">Parallel Processing</a></html>";
						String ssec = "<html><a href=\"https://www.dropbox.com/sh/ahaogf0jb59ozcr/iwz9KXg2ib\">System Security</a></html>";

						TextView t121 = (TextView) findViewById(R.id.text121);
						t121.setText(Html.fromHtml(amp));
					    t121.setMovementMethod(LinkMovementMethod.getInstance());
						TextView t122 = (TextView) findViewById(R.id.text122);
						t122.setText(Html.fromHtml(is));
					    t122.setMovementMethod(LinkMovementMethod.getInstance());
					    TextView t123 = (TextView) findViewById(R.id.text123);
						t123.setText(Html.fromHtml(dsp));
					    t123.setMovementMethod(LinkMovementMethod.getInstance());
					   
					    TextView t125 = (TextView) findViewById(R.id.text125);
						t125.setText(Html.fromHtml(imp));
					    t125.setMovementMethod(LinkMovementMethod.getInstance());
						TextView t126 = (TextView) findViewById(R.id.text126);
						t126.setText(Html.fromHtml(ssec));
					    t126.setMovementMethod(LinkMovementMethod.getInstance());
						TextView t127 = (TextView) findViewById(R.id.text127);
						t127.setText(Html.fromHtml(dcomp));
					    t127.setMovementMethod(LinkMovementMethod.getInstance());
					     TextView t128 = (TextView) findViewById(R.id.text128);
						t128.setText(Html.fromHtml(ms));
					    t128.setMovementMethod(LinkMovementMethod.getInstance());
				     	     TextView t129 = (TextView) findViewById(R.id.text129);
						t129.setText(Html.fromHtml(pp1));
					    t129.setMovementMethod(LinkMovementMethod.getInstance());
					    return true;
					}
				}