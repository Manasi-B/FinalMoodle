package com.example.finalmoodle;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class SYBTechComps extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sybtech_comps);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sybtech_comps, menu);

		String emc = "<html><a href=\"https://www.dropbox.com/sh/m4sa3p1iahihq5v/JmnQ-WrnlT\">Engineering Mathematics-I</a></html>";
		String itc = "<html><a href=\"https://www.dropbox.com/sh/vovvvtsm1moyp48/CfBV6iEDoZ\">Information Theory And Coding</a></html>";
		String cpc = "<html><a href=\"https://www.dropbox.com/sh/ar4i05tlwt2j1tv/EMXPjeB8D8\">Computer Programming-II</a></html>";
		String os = "<html><a href=\"https://www.dropbox.com/sh/pvbrmzc18x8rwl3/iPyt-f1XPy\">Operating System</a></html>";
		String evc = "<html><a href=\"https://www.dropbox.com/sh/1nmkgd06ftuf8kr/rPekEQobhj\">Environmental Studies</a></html>";



		String em2c = "<html><a href=\"https://www.dropbox.com/sh/k7xkllfxe1d4a48/pnH1z2JuVf\">Engineering Mathematics-II</a></html>";
		String ecsc = "<html><a href=\"https://www.dropbox.com/sh/21gyl23sl1s30mc/KPZ8P49nO2\">Electronics And Communication System</a></html>";
		String coamc = "<html><a href=\"https://www.dropbox.com/sh/zsxomj1699qcur8/BXpaV0R3Ju\">Computer Organization, Assembly And Maintainance</a></html>";
		String tcpc = "<html><a href=\"https://www.dropbox.com/sh/xc13kqzg7vtffpu/9aon6LFDg3\">TCP/IP Suit</a></html>";
		String dsc = "<html><a href=\"https://www.dropbox.com/sh/hf975yb141aa1vh/mEIL8AgVfj\">Data Structure And Algorithms</a></html>";



		TextView t81 = (TextView) findViewById(R.id.text81);
		t81.setText(Html.fromHtml(emc));
	    t81.setMovementMethod(LinkMovementMethod.getInstance());

		TextView t82 = (TextView) findViewById(R.id.text82);
		t82.setText(Html.fromHtml(itc));
	    t82.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t83 = (TextView) findViewById(R.id.text83);
		t83.setText(Html.fromHtml(cpc));
	    t83.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t84 = (TextView) findViewById(R.id.text84);
		t84.setText(Html.fromHtml(os));
	    t84.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t85 = (TextView) findViewById(R.id.text85);
		t85.setText(Html.fromHtml(evc));
	    t85.setMovementMethod(LinkMovementMethod.getInstance());

		TextView t86 = (TextView) findViewById(R.id.text86);
		t86.setText(Html.fromHtml(em2c));
	    t86.setMovementMethod(LinkMovementMethod.getInstance());

		TextView t87 = (TextView) findViewById(R.id.text87);
		t87.setText(Html.fromHtml(ecsc));
	    t87.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t88 = (TextView) findViewById(R.id.text88);
		t88.setText(Html.fromHtml(coamc));
	    t88.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t89 = (TextView) findViewById(R.id.text89);
		t89.setText(Html.fromHtml(tcpc));
	    t89.setMovementMethod(LinkMovementMethod.getInstance());

	    TextView t90 = (TextView) findViewById(R.id.text90);
		t90.setText(Html.fromHtml(dsc));
	    t90.setMovementMethod(LinkMovementMethod.getInstance());
	
	    return true;
	}
}