package com.example.finalmoodle;


import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class ITSyllabus extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.it_syllabus);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.itsyllabus, menu);
		String fy = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/FYBTECH_SYllabus_2009_2010.pdf\">F.Y.B.Tech</a></html>";
		String sy = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/S_Y_B_Tech_Information_Tech._syllabus.pdf\">S.Y.B.Tech</a></html>";
		String ty = "<html><a href=\"http://www.vjti.ac.in/images/Academic_Syllabus/UG/T_Y_B_Tech_IT.pdf\">T.Y.B.Tech</a></html>";
		String last = "<html><a href=\"http://attachment.fbsbx.com/file_download.php?id=119043788303260&eid=ASspmQliyNNCad0LfFM-pNZ7f-LUEdhp3OjnPGISG8WfztV0rKRpbG3fN1oDg_DQBGk&ext=1371408395&hash=AStahUNrHrIOFXqk\">.B.Tech</a></html>";
		TextView t11 = (TextView) findViewById(R.id.text11);
		t11.setText(Html.fromHtml(fy));
	    t11.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t12 = (TextView) findViewById(R.id.text12);
		t12.setText(Html.fromHtml(sy));
	    t12.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t13 = (TextView) findViewById(R.id.text13);
		t13.setText(Html.fromHtml(ty));
	    t13.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t14 = (TextView) findViewById(R.id.text14);
		t14.setText(Html.fromHtml(last));
	    t14.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}