package com.utad.baco;

import model.Wine;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    
	private Wine vegaval = null;
	//private Wine valdelacasa = null;
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vegaval = new Wine ( R.drawable.vegaval,"Vegaval","http://mail.google.es/Vegaval", 
        		"Miguel Calatay","Tinto",3,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum velit, feugiat non rhoncus non, tempus non ex. Phasellus finibus, orci accumsan porta blandit, dui lacus rutrum sapien, nec pellentesque purus felis non erat. Donec nisl ante, placerat at varius nec, varius ac arcu. Donec ac odio velit. Cras in consequat erat. Morbi tincidunt blandit est, eget elementum lacus pretium a. Cras sollicitudin metus et nunc euismod, at aliquam mi facilisis. Vivamus non suscipit dolor. Donec sed ligula porta, tempor massa nec, ornare lacus. Integer pellentesque placerat mauris eu vehicula.Cras ipsum augue, sollicitudin vitae neque ut, volutpat ullamcorper sem. Mauris molestie laoreet lectus. Proin tempor nisl nec sem iaculis, sit amet porttitor magna vestibulum. Nulla id sem lacinia, luctus turpis eu, ultricies mauris. Integer mattis nisi a malesuada tincidunt. Sed diam leo, rhoncus et porttitor a, luctus quis est. Donec dapibus auctor neque, eu ullamcorper mi volutpat in. Maecenas eget blandit tortor, eget euismod leo. Integer ullamcorper mauris ut rutrum consectetur. Nullam eget ipsum eget risus placerat porttitor quis nec velit.Nam fermentum massa eget sollicitudin scelerisque. Etiam eleifend arcu et dolor blandit, sed eleifend magna mollis. Duis ut eleifend nisi. In hendrerit varius commodo. Nam ac iaculis nunc. Pellentesque eget tortor egestas, tristique arcu ac, accumsan leo. Praesent porta, purus sit amet vulputate vestibulum, tortor magna iaculis odio, id interdum est ligula venenatis risus. In at dictum nunc. Aenean eget diam euismod, pellentesque ante ac, finibus dui.Cras eros enim, sodales vel condimentum in, fringilla at nunc. Suspendisse potenti. Praesent sit amet tristique est. Mauris ac nisi eget massa eleifend congue ut id diam. Aenean erat lacus, varius eget nisl nec, pharetra ultricies orci. Cras tempor id dui at rhoncus. Integer sit amet turpis tincidunt, mollis velit a, dictum sapien. Cras lorem odio, consectetur eget egestas quis, rhoncus ultrices quam. Donec mattis arcu sed placerat feugiat. Ut eget aliquet lacus, sit amet tincidunt urna. Nulla risus tellus, lobortis accumsan dapibus non, malesuada quis risus. Praesent at mauris euismod, laoreet felis non, malesuada velit. In molestie lacus neque.Fusce quis massa neque. Sed egestas felis turpis, sit amet suscipit orci pharetra a. Fusce pulvinar nec tellus nec fringilla. Duis faucibus massa quis enim tincidunt varius. Maecenas dapibus mauris ac hendrerit malesuada. Cras vitae purus eu quam accumsan rhoncus ac ac est. Pellentesque enim leo, ultrices at diam vitae, posuere condimentum erat. Aenean aliquam ornare sapien, non dictum urna elementum a. Quisque quis est nec enim interdum condimentum ac ac libero. Curabitur eget nisl at dolor placerat pharetra id in ante. Duis pellentesque nisi ligula, in consectetur enim ullamcorper nec. Aliquam congue porta dui, in rhoncus augue.");
        vegaval.addGrape("Mencia");
        vegaval.addGrape("Tinta");
        
        TextView wineName = (TextView) findViewById(R.id.txt_winename);
        wineName.setText(vegaval.getName());
        
        TextView wineType = (TextView) findViewById(R.id.txt_typewine);
        wineType.setText(vegaval.getTypeWine());
        
        TextView wineHouse = (TextView) findViewById(R.id.txt_winehouse);
        wineHouse.setText(vegaval.getWinehouse());
        
        TextView wineNotes = (TextView) findViewById(R.id.txt_wine_notes);
        wineNotes.setText(vegaval.getNotes());
        
        ImageView wineImage =(ImageView) findViewById(R.id.wine_image);
        wineImage.setImageResource(vegaval.getImage());
        
        LinearLayout grapesContainer = (LinearLayout)findViewById(R.id.grapes);
        
        TextView titulo = (TextView)findViewById(R.id.txt_listgrapes);
        //titulo.setTypeface(null,Typeface.BOLD_ITALIC);
        
        for (String grape : vegaval.getGrapes()){
        	TextView text= new TextView (this);
        	    text.setText(grape);
        	    LinearLayout.LayoutParams  params=new  LinearLayout.LayoutParams(
        	    		LinearLayout.LayoutParams.MATCH_PARENT,
        	    		LinearLayout.LayoutParams.WRAP_CONTENT);
           text.setLayoutParams(params);
           grapesContainer.addView(text);
           
        	    
        }
        
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating);
        
        ratingBar.setProgress(vegaval.getRating());
        
        
        
//        valdelacasa = new Wine ( R.drawable.valdelacasa,"Val de la Casa","http://mail.google.es/ValdelaCasa", "Angel Sanlucar","Rosado",4); 
//    valdelacasa.addGrape("Mencia");
//        
    }
    
   

}
