package com.utad.baco.controller;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends ActionBarActivity {
	private WebView mBrowser;
	public static final String EXTRA_URL = "com.utad.baco.controller.EXTRA_URL";

	private static final String CURRENT_URL = "com.utad.baco.controller.CURRENT_URL";
	private static final int MENU_RELOAD = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_web);

		// 1) accedo a las vistas
		mBrowser = (WebView) findViewById(R.id.browser);
		final ProgressBar loading = (ProgressBar) findViewById(R.id.loading);

		// 2) Creo el modelo

		String url = getIntent().getStringExtra(EXTRA_URL);
		// 3) cargo la página web del modelo
		Log.v("FRANCISCO", url);
		mBrowser.setWebViewClient(new WebViewClient() {

			@Override
			public void onPageStarted(WebView view, String url, Bitmap favicon) {
				super.onPageStarted(view, url, favicon);
				loading.setVisibility(View.VISIBLE);
			}

			@Override
			public void onPageFinished(WebView view, String url) {
				super.onPageFinished(view, url);
				// loading.setVisibility(View.INVISIBLE);
				loading.setVisibility(View.GONE);
			}

		});
		if ((savedInstanceState != null)
				&& savedInstanceState.containsKey(CURRENT_URL)) {
			mBrowser.loadUrl(savedInstanceState.getString(CURRENT_URL));
		} else {
			mBrowser.loadUrl(url);
		}

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {

		super.onSaveInstanceState(outState);

		String currentURL = mBrowser.getUrl();
		outState.putString(CURRENT_URL, currentURL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);

		MenuItem reload = menu.add(Menu.NONE, MENU_RELOAD, 0, R.string.reload);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		boolean defaultValue = super.onOptionsItemSelected(item);

		if (item.getItemId() == MENU_RELOAD) {
			mBrowser.reload();
			return true;

		} else
			return defaultValue;
	}

}
