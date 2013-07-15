package com.example.finalmoodle;


import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class CompsSyllabus extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comps_syllabus);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
				getMenuInflater().inflate(R.menu.comps_syllabus, menu);
		String fyc = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/FYBTECH_SYllabus_2009_2010.pdf\">F.Y.B.Tech</a></html>";
		String syc = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/old_syllabus/COMP_SYBTech.pdf\">S.Y.B.Tech</a></html>";
		String tyc = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/T_Y_B_Tech_computer.pdf\">T.Y.B.Tech</a></html>";
		String lastc = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/old_syllabus/COMP_Final_BTech.pdf\">.B.Tech</a></html>";
		TextView t15 = (TextView) findViewById(R.id.text15);
		t15.setText(Html.fromHtml(fyc));
	    t15.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t16 = (TextView) findViewById(R.id.text16);
		t16.setText(Html.fromHtml(syc));
	    t16.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t17 = (TextView) findViewById(R.id.text17);
		t17.setText(Html.fromHtml(tyc));
	    t17.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t18 = (TextView) findViewById(R.id.text18);
		t18.setText(Html.fromHtml(lastc));
	    t18.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}

