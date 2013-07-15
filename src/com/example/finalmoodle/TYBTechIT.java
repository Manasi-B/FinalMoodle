package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class TYBTechIT extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tybtech_it);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tybtech_it, menu);
		String at = "<html><a href=\"https://www.dropbox.com/sh/tpo18svtncb5orr/mgQp6bUnrO\">Automata Theory</a></html>";
		String cn = "<html><a href=\"https://www.dropbox.com/sh/cp9vnz2kz18lxby/useMe5Hg_u\">Computer Networks</a></html>";
		String dbs = "<html><a href=\"https://www.dropbox.com/sh/kpignq98kv9lj1m/Rh9PoyDBAp\">Database Systems</a></html>";
		String os = "<html><a href=\"https://www.dropbox.com/sh/xl2y4czwztwhc9k/jtVcUKf8Ak\">Operating system</a></html>";
		String se = "<html><a href=\"https://www.dropbox.com/sh/j15mxprv6d6vrsa/iAWcYCDb-G\">Software Engineering</a></html>";
		String ai = "<html><a href=\"https://www.dropbox.com/sh/vka38syl1ytpaas/6a35yN3Z1B\">Artificial Intellegience</a></html>";
		String mc = "<html><a href=\"https://www.dropbox.com/sh/3ox353e9cbrodc4/ujzB4WCP2u\">Mobile Computing</a></html>";
		String oose = "<html><a href=\"https://www.dropbox.com/sh/3vtje73borp98yv/dPuCPdkU-i\">oose</a></html>";
		String spm = "<html><a href=\"https://www.dropbox.com/sh/hj2otns05wbjh0w/qntwvNt_u4\">Software Project Management</a></html>";
		String wt = "<html><a href=\"https://www.dropbox.com/sh/zh5dipyxygddhtm/myRj3TbTvk\">Web Technology</a></html>";
		TextView t90 = (TextView) findViewById(R.id.text90);
		t90.setText(Html.fromHtml(se));
	    t90.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t91 = (TextView) findViewById(R.id.text91);
		t91.setText(Html.fromHtml(cn));
	    t91.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t92 = (TextView) findViewById(R.id.text92);
		t92.setText(Html.fromHtml(at));
	    t92.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t93 = (TextView) findViewById(R.id.text93);
		t93.setText(Html.fromHtml(os));
	    t93.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t94 = (TextView) findViewById(R.id.text94);
		t94.setText(Html.fromHtml(dbs));
	    t94.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t95 = (TextView) findViewById(R.id.text95);
		t95.setText(Html.fromHtml(spm));
	    t95.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t96 = (TextView) findViewById(R.id.text96);
		t96.setText(Html.fromHtml(mc));
	    t96.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t97 = (TextView) findViewById(R.id.text97);
		t97.setText(Html.fromHtml(oose));
	    t97.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t98 = (TextView) findViewById(R.id.text98);
		t98.setText(Html.fromHtml(wt));
	    t98.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t99 = (TextView) findViewById(R.id.text99);
		t99.setText(Html.fromHtml(oose));
	    t99.setMovementMethod(LinkMovementMethod.getInstance());
            TextView t100 =(TextView) findViewById(R.id.text100);
		t100.setText(Html.fromHtml(ai));
	    t100.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}
