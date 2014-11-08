package com.utad.baco;

import model.Wine;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		  Wine vegaval;
		   setContentView(R.layout.activity_web);
		   
		   
		   // 1) accedo a las vistas
		   WebView browser = (WebView) findViewById(R.id.browser);
		   final ProgressBar loading=(ProgressBar) findViewById(R.id.loading);
		   
		   
			   // 2) Creo el modelo
		   
		   vegaval = new Wine ( R.drawable.vegaval,"Vegaval","http://www.vegaval.com/es", 
	        		"Miguel Calatay","Tinto",3,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum velit, feugiat non rhoncus non, tempus non ex. Phasellus finibus, orci accumsan porta blandit, dui lacus rutrum sapien, nec pellentesque purus felis non erat. Donec nisl ante, placerat at varius nec, varius ac arcu. Donec ac odio velit. Cras in consequat erat. Morbi tincidunt blandit est, eget elementum lacus pretium a. Cras sollicitudin metus et nunc euismod, at aliquam mi facilisis. Vivamus non suscipit dolor. Donec sed ligula porta, tempor massa nec, ornare lacus. Integer pellentesque placerat mauris eu vehicula.Cras ipsum augue, sollicitudin vitae neque ut, volutpat ullamcorper sem. Mauris molestie laoreet lectus. Proin tempor nisl nec sem iaculis, sit amet porttitor magna vestibulum. Nulla id sem lacinia, luctus turpis eu, ultricies mauris. Integer mattis nisi a malesuada tincidunt. Sed diam leo, rhoncus et porttitor a, luctus quis est. Donec dapibus auctor neque, eu ullamcorper mi volutpat in. Maecenas eget blandit tortor, eget euismod leo. Integer ullamcorper mauris ut rutrum consectetur. Nullam eget ipsum eget risus placerat porttitor quis nec velit.Nam fermentum massa eget sollicitudin scelerisque. Etiam eleifend arcu et dolor blandit, sed eleifend magna mollis. Duis ut eleifend nisi. In hendrerit varius commodo. Nam ac iaculis nunc. Pellentesque eget tortor egestas, tristique arcu ac, accumsan leo. Praesent porta, purus sit amet vulputate vestibulum, tortor magna iaculis odio, id interdum est ligula venenatis risus. In at dictum nunc. Aenean eget diam euismod, pellentesque ante ac, finibus dui.Cras eros enim, sodales vel condimentum in, fringilla at nunc. Suspendisse potenti. Praesent sit amet tristique est. Mauris ac nisi eget massa eleifend congue ut id diam. Aenean erat lacus, varius eget nisl nec, pharetra ultricies orci. Cras tempor id dui at rhoncus. Integer sit amet turpis tincidunt, mollis velit a, dictum sapien. Cras lorem odio, consectetur eget egestas quis, rhoncus ultrices quam. Donec mattis arcu sed placerat feugiat. Ut eget aliquet lacus, sit amet tincidunt urna. Nulla risus tellus, lobortis accumsan dapibus non, malesuada quis risus. Praesent at mauris euismod, laoreet felis non, malesuada velit. In molestie lacus neque.Fusce quis massa neque. Sed egestas felis turpis, sit amet suscipit orci pharetra a. Fusce pulvinar nec tellus nec fringilla. Duis faucibus massa quis enim tincidunt varius. Maecenas dapibus mauris ac hendrerit malesuada. Cras vitae purus eu quam accumsan rhoncus ac ac est. Pellentesque enim leo, ultrices at diam vitae, posuere condimentum erat. Aenean aliquam ornare sapien, non dictum urna elementum a. Quisque quis est nec enim interdum condimentum ac ac libero. Curabitur eget nisl at dolor placerat pharetra id in ante. Duis pellentesque nisi ligula, in consectetur enim ullamcorper nec. Aliquam congue porta dui, in rhoncus augue.");
	        vegaval.addGrape("Mencia");
	        vegaval.addGrape("Tinta");
	        
	        // 3) cargo la página web del modelo
	        
	        browser.setWebViewClient(new WebViewClient(){

				@Override
				public void onPageStarted(WebView view, String url,
						Bitmap favicon) {
					// TODO Auto-generated method stub
					super.onPageStarted(view, url, favicon);
					loading.setVisibility(View.VISIBLE);
				}

				@Override
				public void onPageFinished(WebView view, String url) {
					// TODO Auto-generated method stub
					super.onPageFinished(view, url);
					//loading.setVisibility(View.INVISIBLE);
					loading.setVisibility(View.GONE);
				}
	        	   
	        });
	        
	        browser.loadUrl(vegaval.getURL());
	
	}
	
	
	

}
