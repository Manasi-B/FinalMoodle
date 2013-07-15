package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class FYBtech extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fybtech);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fybtech, menu);
		String ac = "<html><a href=\"https://www.dropbox.com/sh/i3gl3l3aza3q6gq/Drt-OSxm9c\">Applied chemistry</a></html>";
		String ap = "<html><a href=\"https://www.dropbox.com/sh/a7124jt4m8dfkrx/kmR5kgr4Rw\">Applied Physics</a></html>";
		String am = "<html><a href=\"https://www.dropbox.com/sh/sk33cqki8s4wsn7/NOTnx3cGPf\">Applied Mathematics</a></html>";
		String bee = "<html><a href=\"https://www.dropbox.com/sh/0becsha8s2785a5/dl5sPvlK-Y\">BEE</a></html>";
		String cp = "<html><a href=\"https://www.dropbox.com/sh/bmjy64i6mk8vgxv/cTCo9raD_W\">Computer Programming</a></html>";
		String ac2 = "<html><a href=\"https://www.dropbox.com/sh/1woypn9m7ze3894/Wy3iOHyKGz\">Applied ChemistryII</a></html>";
		String ap2 = "<html><a href=\"https://www.dropbox.com/sh/ej6rr3a5axo3wjd/QAcln4acWg\">Applied PhysicsII</a></html>";
		String am2 = "<html><a href=\"https://www.dropbox.com/sh/fg9gwv7nmhe4k65/K9NzZFYp3-\">Applied MathematicsII</a></html>";
		String amech = "<html><a href=\"https://www.dropbox.com/sh/ai01xsi9u7ozwi1/fz1d5RzkVU\">Applied Mechanics</a></html>";
		String ed = "<html><a href=\"https://www.dropbox.com/sh/6ls1zpgfytzu4ma/yy_NPHS8xP\">Engineering Graphics</a></html>";
		TextView t50 = (TextView) findViewById(R.id.text50);
		t50.setText(Html.fromHtml(ac));
	    t50.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t51 = (TextView) findViewById(R.id.text51);
		t51.setText(Html.fromHtml(ap));
	    t51.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t52 = (TextView) findViewById(R.id.text52);
		t52.setText(Html.fromHtml(am));
	    t52.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t53 = (TextView) findViewById(R.id.text53);
		t53.setText(Html.fromHtml(bee));
	    t53.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t54 = (TextView) findViewById(R.id.text54);
		t54.setText(Html.fromHtml(cp));
	    t54.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t55 = (TextView) findViewById(R.id.text55);
		t55.setText(Html.fromHtml(ac2));
	    t55.setMovementMethod(LinkMovementMethod.getInstance());
		TextView t56 = (TextView) findViewById(R.id.text56);
		t56.setText(Html.fromHtml(ap2));
	    t56.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t57 = (TextView) findViewById(R.id.text57);
		t57.setText(Html.fromHtml(am2));
	    t57.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t58 = (TextView) findViewById(R.id.text58);
		t58.setText(Html.fromHtml(amech));
	    t58.setMovementMethod(LinkMovementMethod.getInstance());
	    TextView t59 = (TextView) findViewById(R.id.text59);
		t59.setText(Html.fromHtml(ed));
	    t59.setMovementMethod(LinkMovementMethod.getInstance());
	    return true;
	}
}
