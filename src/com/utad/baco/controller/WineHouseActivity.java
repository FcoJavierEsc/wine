package com.utad.baco.controller;

import java.io.Serializable;

import com.utad.baco.model.Wine;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class WineHouseActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wine_house);

		TabHost tabHost = getTabHost();

		Wine mWine = new Wine(
				R.drawable.vegaval,
				"Vegaval",
				"http://www.vegaval.com/es/",
				"Miguel Calatayud",
				"Tinto",
				3,
				"Uvas autóctonas españolas y variedades internacionales perfectamente integradas en nuestro entorno");
		mWine.setmGrapes1("Mencia");
		mWine.setmGrapes2("Garnacha");
		mWine.setmGrapes3("Tempranillo");

		
		tabIntentPut(this, tabHost, mWine);

		mWine = new Wine(
				R.drawable.valdelacasa,
				"valdelacasa",
				"http://www.bodegasfrontaura.com/es/vinos/dominio-de-valdelacasa/",
				"Miguel Calatay",
				"Tinto",
				4,
				"PRODUCTO MUY CONSOLIDADO EN EL MERCADO, CON UNA CRIANZA DE 6 MESES EN ROBLE FRANCÉS. MUY EXPRESIVO E INTENSO EN NARIZ CON AROMAS DE FRUTOS ROJOS, LAVANDA Y REGALIZ ENTRE OTROS.");
		mWine.setmGrapes1("Tinta de Toro");

		tabIntentPut(this, tabHost, mWine);

	}

	private void tabIntentPut(Context theContext, TabHost theTab, Wine theWine) {

		Intent theWineIntent = new Intent(theContext, WineActivity.class);
		theWineIntent
				.putExtra(WineActivity.WINE_TO_USE, (Serializable) theWine);
		TabSpec tabtheWine = theTab.newTabSpec(theWine.getName());
		tabtheWine.setIndicator(theWine.getName());
		tabtheWine.setContent(theWineIntent);

		theTab.addTab(tabtheWine);
	}
}
