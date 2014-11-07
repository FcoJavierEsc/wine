package com.utad.baco;

import model.Wine;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {
    
	private Wine vegaval = null;
	private Wine valdelacasa = null;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vegaval = new Wine ( R.drawable.vegaval,"Vegaval","http://mail.google.es/Vegaval", "Miguel Calatay","Tinto",5);
        valdelacasa = new Wine ( R.drawable.valdelacasa,"Val de la Casa","http://mail.google.es/ValdelaCasa", "Angel Sanlucar","Rosado",4); 
    }
    
    public void changeImage(View v){

          	
    	 	ImageView wineImage = (ImageView) findViewById(R.id.wine_image);
    	
    	    if (R.id.btn_vegaval==v.getId()) {
    	    	 wineImage.setImageResource(R.drawable.vegaval);
    	    }
    	    else {
            wineImage.setImageResource(R.drawable.valdelacasa);
    	    }
    }

}
