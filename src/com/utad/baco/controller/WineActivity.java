package com.utad.baco.controller;

import com.utad.baco.R;
import com.utad.baco.model.Wine;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class WineActivity extends ActionBarActivity {

	private Wine mWine = null;
	private ImageView mwineImage = null;

	// private Wine valdelacasa = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mWine = new Wine(
				R.drawable.vegaval,
				"Vegaval",
				"http://mail.google.com",
				"Miguel Calatay",
				"Tinto",
				3,
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum velit, feugiat non rhoncus non, tempus non ex. Phasellus finibus, orci accumsan porta blandit, dui lacus rutrum sapien, nec pellentesque purus felis non erat. Donec nisl ante, placerat at varius nec, varius ac arcu. Donec ac odio velit. Cras in consequat erat. Morbi tincidunt blandit est, eget elementum lacus pretium a. Cras sollicitudin metus et nunc euismod, at aliquam mi facilisis. Vivamus non suscipit dolor. Donec sed ligula porta, tempor massa nec, ornare lacus. Integer pellentesque placerat mauris eu vehicula.Cras ipsum augue, sollicitudin vitae neque ut, volutpat ullamcorper sem. Mauris molestie laoreet lectus. Proin tempor nisl nec sem iaculis, sit amet porttitor magna vestibulum. Nulla id sem lacinia, luctus turpis eu, ultricies mauris. Integer mattis nisi a malesuada tincidunt. Sed diam leo, rhoncus et porttitor a, luctus quis est. Donec dapibus auctor neque, eu ullamcorper mi volutpat in. Maecenas eget blandit tortor, eget euismod leo. Integer ullamcorper mauris ut rutrum consectetur. Nullam eget ipsum eget risus placerat porttitor quis nec velit.Nam fermentum massa eget sollicitudin scelerisque. Etiam eleifend arcu et dolor blandit, sed eleifend magna mollis. Duis ut eleifend nisi. In hendrerit varius commodo. Nam ac iaculis nunc. Pellentesque eget tortor egestas, tristique arcu ac, accumsan leo. Praesent porta, purus sit amet vulputate vestibulum, tortor magna iaculis odio, id interdum est ligula venenatis risus. In at dictum nunc. Aenean eget diam euismod, pellentesque ante ac, finibus dui.Cras eros enim, sodales vel condimentum in, fringilla at nunc. Suspendisse potenti. Praesent sit amet tristique est. Mauris ac nisi eget massa eleifend congue ut id diam. Aenean erat lacus, varius eget nisl nec, pharetra ultricies orci. Cras tempor id dui at rhoncus. Integer sit amet turpis tincidunt, mollis velit a, dictum sapien. Cras lorem odio, consectetur eget egestas quis, rhoncus ultrices quam. Donec mattis arcu sed placerat feugiat. Ut eget aliquet lacus, sit amet tincidunt urna. Nulla risus tellus, lobortis accumsan dapibus non, malesuada quis risus. Praesent at mauris euismod, laoreet felis non, malesuada velit. In molestie lacus neque.Fusce quis massa neque. Sed egestas felis turpis, sit amet suscipit orci pharetra a. Fusce pulvinar nec tellus nec fringilla. Duis faucibus massa quis enim tincidunt varius. Maecenas dapibus mauris ac hendrerit malesuada. Cras vitae purus eu quam accumsan rhoncus ac ac est. Pellentesque enim leo, ultrices at diam vitae, posuere condimentum erat. Aenean aliquam ornare sapien, non dictum urna elementum a. Quisque quis est nec enim interdum condimentum ac ac libero. Curabitur eget nisl at dolor placerat pharetra id in ante. Duis pellentesque nisi ligula, in consectetur enim ullamcorper nec. Aliquam congue porta dui, in rhoncus augue.");
		mWine.addGrape("Mencia");
		mWine.addGrape("Tinta");

		TextView wineName = (TextView) findViewById(R.id.txt_winename);
		wineName.setText(mWine.getName());

		TextView wineType = (TextView) findViewById(R.id.txt_typewine);
		wineType.setText(mWine.getTypeWine());

		TextView wineHouse = (TextView) findViewById(R.id.txt_winehouse);
		wineHouse.setText(mWine.getWinehouse());

		TextView wineNotes = (TextView) findViewById(R.id.txt_wine_notes);
		wineNotes.setText(mWine.getNotes());

		mwineImage = (ImageView) findViewById(R.id.wine_image);
		mwineImage.setImageResource(mWine.getImage());

		LinearLayout grapesContainer = (LinearLayout) findViewById(R.id.grapes);

		TextView titulo = (TextView) findViewById(R.id.txt_listgrapes);
		// titulo.setTypeface(null,Typeface.BOLD_ITALIC);

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

		// valdelacasa = new Wine (
		// R.drawable.valdelacasa,"Val de la Casa","http://mail.google.es/ValdelaCasa",
		// "Angel Sanlucar","Rosado",4);
		// valdelacasa.addGrape("Mencia");
		//
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		Log.v("U-TAD", "Pulsado ffffff");
		Intent webIntent = new Intent(this, WebActivity.class);
		Log.v("U-TAD", mWine.getURL());
		webIntent.putExtra(WebActivity.EXTRA_URL, mWine.getURL());
		startActivity(webIntent);
	}

}
