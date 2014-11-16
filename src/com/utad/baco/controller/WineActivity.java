package com.utad.baco.controller;

import com.utad.baco.model.Wine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class WineActivity extends ActionBarActivity {

	
	public final static String SHOW_WINE = "com.utad.baco.wine";
	
	private Wine mWine = null;
	private ImageView mwineImage = null;

	// private Wine valdelacasa = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wine);
		

		TextView wineName = (TextView) findViewById(R.id.txt_winename);
		wineName.setText(mWine.getName());

		TextView wineType = (TextView) findViewById(R.id.txt_winetype);
		wineType.setText(mWine.getTypeWine());

		TextView wineHouse = (TextView) findViewById(R.id.txt_winehouse);
		wineHouse.setText(mWine.getWinehouse());

		TextView wineNotes = (TextView) findViewById(R.id.txt_winenotes);
		wineNotes.setText(mWine.getNotes());

		mwineImage = (ImageView) findViewById(R.id.wine_image);
		mwineImage.setImageResource(mWine.getImage());

		LinearLayout grapesContainer = (LinearLayout) findViewById(R.id.listgrapes);

		for (String grape : mWine.getGrapes()) {
			TextView text = new TextView(this);
			text.setText(grape);
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
					LinearLayout.LayoutParams.MATCH_PARENT,
					LinearLayout.LayoutParams.WRAP_CONTENT);
			text.setLayoutParams(params);
			grapesContainer.addView(text);

		}

		RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);

		ratingBar.setProgress(mWine.getRating());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		boolean def = super.onOptionsItemSelected(item);

		if (item.getItemId() == R.id.action_settings) {
			Intent setttingsIntent = new Intent(this, SettingsActivity.class);
			startActivityForResult(setttingsIntent,
					SettingsActivity.REQUEST_SELECTED_SCALETYPE);
			def = true;
		}

		return def;
	}

	@Override
	protected void onActivityResult(int requestCode, int resul, Intent intent) {

		super.onActivityResult(requestCode, resul, intent);

		if (requestCode == SettingsActivity.REQUEST_SELECTED_SCALETYPE
				&& resul == RESULT_OK) {

			int optionSelection = intent.getIntExtra(
					SettingsActivity.OPTION_SELECTED, -1);

			if (optionSelection != -1
					&& optionSelection == SettingsActivity.OPTION_NORMAL) {
				// imagen scale type estirado

				mwineImage.setScaleType(ScaleType.FIT_CENTER);

			} else if (optionSelection != -1
					&& optionSelection == SettingsActivity.OPTION_FIT)
				mwineImage.setScaleType(ScaleType.CENTER);

		}
	}

	public void showWeb(View bt) {
		Intent webIntent = new Intent(this, WebActivity.class);
		webIntent.putExtra(WebActivity.EXTRA_URL, mWine.getURL());
		startActivity(webIntent);
	}

}
