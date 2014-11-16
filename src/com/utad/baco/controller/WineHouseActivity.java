package com.utad.baco.controller;

import java.util.ArrayList;
import java.util.List;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.utad.baco.model.Wine;

import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class WineHouseActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wine_house);
		TabHost tabHost = getTabHost();
		Intent vegavalIntent = new Intent(this, WineActivity.class);
		TabSpec tabVegaval = tabHost.newTabSpec("Vegaval");
		tabVegaval.setIndicator("Vegaval");
		tabVegaval.setContent(vegavalIntent);
		Intent BembibreIntent = new Intent(this, WineActivity.class);
		TabSpec tabBembibre = tabHost.newTabSpec("Bembibre");
		tabBembibre.setIndicator("Bembibre");
		tabBembibre.setContent(BembibreIntent);
		tabHost.addTab(tabVegaval);
		tabHost.addTab(tabBembibre);
	}

	private static List<Wine> mListWine = null;
	private TabHost mTabHost = null;

	//@Override
	protected void onCreateAAA(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wine_house);

		if (mTabHost == null) {
			mTabHost = getTabHost();
		}

		if (mListWine != null) {
			while (mListWine.size() != 0) {
				mListWine.remove(0);
			}
			mListWine = null;
		}

		if (mListWine == null) {
			mListWine = new ArrayList<Wine>();
			Wine lWine = new Wine(
					R.drawable.vegaval,
					"Vegaval",
					"http://www.vegaval.com",
					"Miguel Calatayud",
					"Tinto",
					3,
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum velit, feugiat non rhoncus non, tempus non ex. Phasellus finibus, orci accumsan porta blandit, dui lacus rutrum sapien, nec pellentesque purus felis non erat. Donec nisl ante, placerat at varius nec, varius ac arcu. Donec ac odio velit. Cras in consequat erat. Morbi tincidunt blandit est, eget elementum lacus pretium a. Cras sollicitudin metus et nunc euismod, at aliquam mi facilisis. Vivamus non suscipit dolor. Donec sed ligula porta, tempor massa nec, ornare lacus. Integer pellentesque placerat mauris eu vehicula.Cras ipsum augue, sollicitudin vitae neque ut, volutpat ullamcorper sem. Mauris molestie laoreet lectus. Proin tempor nisl nec sem iaculis, sit amet porttitor magna vestibulum. Nulla id sem lacinia, luctus turpis eu, ultricies mauris. Integer mattis nisi a malesuada tincidunt. Sed diam leo, rhoncus et porttitor a, luctus quis est. Donec dapibus auctor neque, eu ullamcorper mi volutpat in. Maecenas eget blandit tortor, eget euismod leo. Integer ullamcorper mauris ut rutrum consectetur. Nullam eget ipsum eget risus placerat porttitor quis nec velit.Nam fermentum massa eget sollicitudin scelerisque. Etiam eleifend arcu et dolor blandit, sed eleifend magna mollis. Duis ut eleifend nisi. In hendrerit varius commodo. Nam ac iaculis nunc. Pellentesque eget tortor egestas, tristique arcu ac, accumsan leo. Praesent porta, purus sit amet vulputate vestibulum, tortor magna iaculis odio, id interdum est ligula venenatis risus. In at dictum nunc. Aenean eget diam euismod, pellentesque ante ac, finibus dui.Cras eros enim, sodales vel condimentum in, fringilla at nunc. Suspendisse potenti. Praesent sit amet tristique est. Mauris ac nisi eget massa eleifend congue ut id diam. Aenean erat lacus, varius eget nisl nec, pharetra ultricies orci. Cras tempor id dui at rhoncus. Integer sit amet turpis tincidunt, mollis velit a, dictum sapien. Cras lorem odio, consectetur eget egestas quis, rhoncus ultrices quam. Donec mattis arcu sed placerat feugiat. Ut eget aliquet lacus, sit amet tincidunt urna. Nulla risus tellus, lobortis accumsan dapibus non, malesuada quis risus. Praesent at mauris euismod, laoreet felis non, malesuada velit. In molestie lacus neque.Fusce quis massa neque. Sed egestas felis turpis, sit amet suscipit orci pharetra a. Fusce pulvinar nec tellus nec fringilla. Duis faucibus massa quis enim tincidunt varius. Maecenas dapibus mauris ac hendrerit malesuada. Cras vitae purus eu quam accumsan rhoncus ac ac est. Pellentesque enim leo, ultrices at diam vitae, posuere condimentum erat. Aenean aliquam ornare sapien, non dictum urna elementum a. Quisque quis est nec enim interdum condimentum ac ac libero. Curabitur eget nisl at dolor placerat pharetra id in ante. Duis pellentesque nisi ligula, in consectetur enim ullamcorper nec. Aliquam congue porta dui, in rhoncus augue.");
			lWine.addGrape("Mencia");
			lWine.addGrape("Verdejo");
			lWine.addGrape("Tempranillo");

			mListWine.add(lWine);
			lWine = new Wine(
					R.drawable.valdelacasa,
					"Valdelacasa",
					"http://www.bodegasfrontaura.com/es/vinos/dominio-de-valdelacasa/",
					"Val de la casa",
					"Tinto",
					4,
					"PRODUCTO MUY CONSOLIDADO EN EL MERCADO, CON UNA CRIANZA DE 6 MESES EN ROBLE FRANCÉS. MUY EXPRESIVO E INTENSO EN NARIZ CON AROMAS DE FRUTOS ROJOS, LAVANDA Y REGALIZ ENTRE OTROS.");
			lWine.addGrape("Tinta de Toro");

			mListWine.add(lWine);
			// Intent mIntent[] = new Intent[mListWine.size()];
			// int i = 0;
			for (Wine rWine : mListWine) {
				anotherIntent(new Intent(this, WineActivity.class), rWine);
			}

			// for (Intent lIntent : mIntent) {
			// startActivity(lIntent);
			// }
		}

	}

	private void anotherIntent(Intent wineIntent, Wine pWine) {

		// wineIntent.putExtra(WineActivity.SHOW_WINE, pWine.toString());
		TabSpec tabwine = mTabHost.newTabSpec(pWine.getName());
		tabwine.setIndicator(pWine.getName());
		tabwine.setContent(wineIntent);
		mTabHost.addTab(tabwine);

		// startActivity(wineIntent);

	}
}
