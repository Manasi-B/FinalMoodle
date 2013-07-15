package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class BTechIT extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.btech_it);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.btech_it, menu);

String dm = "<html><a href=\"https://www.dropbox.com/sh/kxv6gvk2iwvcpn5/wWfnp42pge\">Data mining</a></html>";
String dsys = "<html><a href=\"https://www.dropbox.com/sh/o62wjax5jbz5at3/bfBDdkDv1A\">Distributed System</a></html>";
String pp = "<html><a href=\"https://www.dropbox.com/sh/qw7okxxal2q9fwi/lmzkab6jhP\">Parallel Processing</a></html>";
String soa = "<html><a href=\"https://www.dropbox.com/sh/h4dgr3zz6nu43mg/nqrBq-U7MN\">Service Oriented Architecture</a></html>";
String cc = "<html><a href=\"https://www.dropbox.com/sh/bwxjjhg87u9wrxk/R7TXHIY7s5\">Cloud Computing</a></html>";
String ns = "<html><a href=\"https://www.dropbox.com/sh/0vr7dtmei25vb16/7vSvKWl6dA\">Network Security</a></html>";
String es = "<html><a href=\"https://www.dropbox.com/sh/sjc71hz7buwc29b/wR4Acoua2a\">Embedded System</a></html>";
String ism = "<html><a href=\"https://www.dropbox.com/sh/708idnqd6giou4w/IbtsVMQksd\">IT Service Management</a></html>";

TextView t112 = (TextView) findViewById(R.id.text112);
t112.setText(Html.fromHtml(dm));
t112.setMovementMethod(LinkMovementMethod.getInstance());
TextView t113 = (TextView) findViewById(R.id.text113);
t113.setText(Html.fromHtml(dsys));
t113.setMovementMethod(LinkMovementMethod.getInstance());
TextView t114 = (TextView) findViewById(R.id.text114);
t114.setText(Html.fromHtml(pp));
t114.setMovementMethod(LinkMovementMethod.getInstance());
TextView t115 = (TextView) findViewById(R.id.text115);
t115.setText(Html.fromHtml(soa));
t115.setMovementMethod(LinkMovementMethod.getInstance());

TextView t117 = (TextView) findViewById(R.id.text117);
t117.setText(Html.fromHtml(cc));
t117.setMovementMethod(LinkMovementMethod.getInstance());
TextView t118 = (TextView) findViewById(R.id.text118);
t118.setText(Html.fromHtml(ns));
t118.setMovementMethod(LinkMovementMethod.getInstance());
TextView t119 = (TextView) findViewById(R.id.text119);
t119.setText(Html.fromHtml(es));
t119.setMovementMethod(LinkMovementMethod.getInstance());
TextView t120 = (TextView) findViewById(R.id.text120);
t120.setText(Html.fromHtml(ism));
t120.setMovementMethod(LinkMovementMethod.getInstance());
return true;
}
}


