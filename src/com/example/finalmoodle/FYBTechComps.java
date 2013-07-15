package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class FYBTechComps extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fybtech_comps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fybtech_comps, menu);
		String acc = "<html><a href=\"https://www.dropbox.com/sh/qn851po1y307eyq/gmXeU32uV4\">Applied chemistry</a></html>";
		String apc = "<html><a href=\"https://www.dropbox.com/sh/682dthrkolguaa1/7xkX551yWt\">Applied Physics</a></html>";
		String amcc = "<html><a href=\"https://www.dropbox.com/sh/nh6nu5e2hzvnj8j/0JK_CNPa5v\">Applied Mathematics</a></html>";
		String beec = "<html><a href=\"https://www.dropbox.com/sh/vb2lj1e7ka0sv1p/68iOyS5peo\">BEE</a></html>";
		String cpc = "<html><a href=\"https://www.dropbox.com/sh/2nmw1t68evljmq8/G5N074dTpc\">Computer Programming</a></html>";
		String acc2 = "<html><a href=\"https://www.dropbox.com/sh/maytsga2kna0d2a/U3RMWrsPsP\">Applied ChemistryII</a></html>";
		String apc2 = "<html><a href=\"https://www.dropbox.com/sh/4rmqkn3a2twq9a3/k7d8Vi22rA\">Applied PhysicsII</a></html>";
		String amc2 = "<html><a href=\"https://www.dropbox.com/sh/qbw34rg35ypj565/SCh-cpjjzk\">Applied MathematicsII</a></html>";
		String amechc = "<html><a href=\"https://www.dropbox.com/sh/juz42j6ryyzc4z9/SS3QF3BNZB\">Applied Mechanics</a></html>";
		String edc = "<html><a href=\"https://www.dropbox.com/sh/q4pyvi4o55muz26/zhTp6rZrUC\">Engineering Graphics</a></html>";
		TextView t60 = (TextView) findViewById(R.id.text60);
		t60.setText(Html.fromHtml(acc));
	    t60.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t61 = (TextView) findViewById(R.id.text61);
		t61.setText(Html.fromHtml(apc));
	    t61.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t62 = (TextView) findViewById(R.id.text62);
		t62.setText(Html.fromHtml(amcc));
	    t62.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t63 = (TextView) findViewById(R.id.text63);
		t63.setText(Html.fromHtml(beec));
	    t63.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t64 = (TextView) findViewById(R.id.text64);
		t64.setText(Html.fromHtml(cpc));
	    t64.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t65 = (TextView) findViewById(R.id.text65);
		t65.setText(Html.fromHtml(acc2));
	    t65.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t66 = (TextView) findViewById(R.id.text66);
		t66.setText(Html.fromHtml(apc2));
	    t66.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t67 = (TextView) findViewById(R.id.text67);
		t67.setText(Html.fromHtml(amc2));
	    t67.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t68 = (TextView) findViewById(R.id.text68);
		t68.setText(Html.fromHtml(amechc));
	    t68.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t69 = (TextView) findViewById(R.id.text69);
		t69.setText(Html.fromHtml(edc));
	    t69.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}
