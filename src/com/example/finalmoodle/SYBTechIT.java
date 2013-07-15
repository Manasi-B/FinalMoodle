package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class SYBTechIT extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sybtech_it);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sybtech_it, menu);
		String em = "<html><a href=\"https://www.dropbox.com/sh/or30fhs2a86yyle/5ROhlX9bqk\">Engineering Mathematics-I</a></html>";
		String ds = "<html><a href=\"https://www.dropbox.com/sh/ytwkc3c64r6rqnx/7L0MWZBy1l\">Discrete Structure</a></html>";
		String pce = "<html><a href=\"https://www.dropbox.com/sh/1f7vwtk79g7dbot/FQad-a8XFR\">Principle Of Communication Engineering</a></html>";
		String dgs = "<html><a href=\"https://www.dropbox.com/sh/e6ce9luq9stho75/H19TTsXcat\">Digital System</a></html>";
		String dsa = "<html><a href=\"https://www.dropbox.com/sh/e9d49g4vrglygim/mNgBs92FTe\">Data Structure And Algorithm</a></html>";
		String ev = "<html><a href=\"https://www.dropbox.com/sh/qtpftjbb13bpyij/QsyXc5_FJU\">Environmental Studies</a></html>";

		String em2 = "<html><a href=\"https://www.dropbox.com/sh/jljqnkcmcefxe49/qqq8e319YN\">Engineering Mathematics-II</a></html>";
		String coa = "<html><a href=\"https://www.dropbox.com/sh/iqx6ijsnzp9kmim/Fqv62o1Oir\">Computer Organization And Architecture</a></html>";
		String mco = "<html><a href=\"https://www.dropbox.com/sh/5zo140ankq254x1/mX0vnU6tJG\">Microprocessor And Microcontroller</a></html>";
		String db = "<html><a href=\"https://www.dropbox.com/sh/r0jkhmluzavz3hy/jtVh-wkVSD\">Database Application</a></html>";
		String ss = "<html><a href=\"https://www.dropbox.com/sh/d7nizkdamo0njdv/WJirgzg-at\">System Software</a></html>";


		TextView t70 = (TextView) findViewById(R.id.text70);
		t70.setText(Html.fromHtml(em));
	    t70.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t71 = (TextView) findViewById(R.id.text71);
		t71.setText(Html.fromHtml(ds));
	    t71.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t72 = (TextView) findViewById(R.id.text72);
		t72.setText(Html.fromHtml(pce));
	    t72.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t73 = (TextView) findViewById(R.id.text73);
		t73.setText(Html.fromHtml(dgs));
	    t73.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t74 = (TextView) findViewById(R.id.text74);
		t74.setText(Html.fromHtml(dsa));
	    t74.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t75 = (TextView) findViewById(R.id.text75);
		t75.setText(Html.fromHtml(ev));
	    t75.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t76 = (TextView) findViewById(R.id.text76);
		t76.setText(Html.fromHtml(em2));
	    t76.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t77 = (TextView) findViewById(R.id.text77);
		t77.setText(Html.fromHtml(coa));
	    t77.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t78 = (TextView) findViewById(R.id.text78);
		t78.setText(Html.fromHtml(mco));
	    t78.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t79 = (TextView) findViewById(R.id.text79);
		t79.setText(Html.fromHtml(db));
	    t79.setMovementMethod(LinkMovementMethod.getInstance());
	TextView t80 = (TextView) findViewById(R.id.text80);
		t80.setText(Html.fromHtml(ss));
	    t80.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}