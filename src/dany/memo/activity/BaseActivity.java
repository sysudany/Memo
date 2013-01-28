package dany.memo.activity;

import dany.memo.R;
import dany.memo.R.layout;
import dany.memo.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_base, menu);
		return true;
	}

}
