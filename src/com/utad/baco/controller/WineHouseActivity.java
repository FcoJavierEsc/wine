package com.utad.baco.controller;

import com.utad.baco.R;
import com.utad.baco.R.layout;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class WineHouseActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wine_house);
		
		TabHost tabHost = getTabHost();
		
		Intent vegavalIntent = new Intent(this,WineActivity.class);
		TabSpec tabVegaval = tabHost.newTabSpec("Vegaval");
		tabVegaval.setIndicator("Vegaval");
		tabVegaval.setContent(vegavalIntent);
		
		
		Intent BembibreIntent = new Intent(this,WineActivity.class);
		TabSpec tabBembibre = tabHost.newTabSpec("Bembibre");
		tabBembibre.setIndicator("Bembibre");
		tabBembibre.setContent(BembibreIntent);
		
		
		
		tabHost.addTab(tabVegaval);
		tabHost.addTab(tabBembibre);
	}
}
