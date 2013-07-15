package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class TYBTechComps extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tybtech_comps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tybtech_comps, menu);
		String se1 = "<html><a href=\"https://www.dropbox.com/sh/s2z02g685332ubw/ZXDc6yGNSO\">software Engineering</a></html>";
		String mpmc1 = "<html><a href=\"https://www.dropbox.com/sh/cqo9izeypcbgf8y/h5WT94TC7m\">MPMC</a></html>";
		String jnp = "<html><a href=\"https://www.dropbox.com/sh/gxreq3v394sx491/twil1ZbrBx\">Jave net programming</a></html>";
		String db1 = "<html><a href=\"https://www.dropbox.com/sh/ckimnesibfeys6u/LuWSYlAyJY\">Database Systems</a></html>";
		String sp = "<html><a href=\"https://www.dropbox.com/sh/6regx29a6ykjwk6/-zDbvuZ7tl\">System programming</a></html>";
		String wt1 = "<html><a href=\"https://www.dropbox.com/sh/i02aiswr0sgq0w5/d3RNpcOi5o\">Web technology</a></html>";
		String oose1 = "<html><a href=\"https://www.dropbox.com/sh/itlm60tr6mq010s/6LKybWEkDA\">OOSE</a></html>";
		String sec = "<html><a href=\"https://www.dropbox.com/sh/9r3v2gfkebadcye/pLGyj_69-m\">Network Security and privacy</a></html>";
		String isms = "<html><a href=\"https://www.dropbox.com/sh/h5irah0tcnpdsu9/fbQ0t0mkN7\">ISMS</a></html>";
		String hpc = "<html><a href=\"https://www.dropbox.com/sh/1c8m9uz77ixbp5q/TS5Yh0j3GD\">High performance comuting</a></html>";
		TextView t101 = (TextView) findViewById(R.id.text101);
		t101.setText(Html.fromHtml(mpmc1));
	    t101.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t102 = (TextView) findViewById(R.id.text102);
		t102.setText(Html.fromHtml(se1));
	    t102.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t103 = (TextView) findViewById(R.id.text103);
		t103.setText(Html.fromHtml(sp));
	    t103.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t104 = (TextView) findViewById(R.id.text104);
		t104.setText(Html.fromHtml(jnp));
	    t104.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t105 = (TextView) findViewById(R.id.text105);
		t105.setText(Html.fromHtml(db1));
	    t105.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t106 = (TextView) findViewById(R.id.text106);
		t106.setText(Html.fromHtml(oose1));
	    t106.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t107 = (TextView) findViewById(R.id.text107);
		t107.setText(Html.fromHtml(isms));
	    t107.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t108 = (TextView) findViewById(R.id.text108);
		t108.setText(Html.fromHtml(wt1));
	    t108.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t109 = (TextView) findViewById(R.id.text109);
		t109.setText(Html.fromHtml(sec));
	    t109.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t110 = (TextView) findViewById(R.id.text110);
		t110.setText(Html.fromHtml(hpc));
	    t110.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}



