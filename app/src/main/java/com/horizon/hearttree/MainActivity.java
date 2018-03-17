package com.horizon.hearttree;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.horizon.hearttree.heart.TreeView;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		final View view = new TreeView(this);
		LinearLayout ll_tree = (LinearLayout) findViewById(R.id.ll_tree);
		ll_tree.addView(view);
		ll_tree.setOnLongClickListener(new View.OnLongClickListener(){

				@Override
				public boolean onLongClick(View p1) {
					finish();
					return true;
				}
			});
    }
}
