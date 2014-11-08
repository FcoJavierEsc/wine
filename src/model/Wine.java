package model;

import java.util.LinkedList;
import java.util.List;

public class Wine {

	    private int mImage;
	    private List <String> mGrapes ;
	    private String mName;
	    private String mURL;
	    private String mTypeWine;
	    private String mWinehouse;
	    private String mNotes;
	    private int mRating;
	    
	    
	    
	    
		public Wine(int image, String name, String uRL, String wypeWine,
				String winehouse, int rating, String notes) {
			super();
			mImage = image;
			mName = name;
			mURL = uRL;
			mTypeWine = wypeWine;
			mWinehouse = winehouse;
			mRating = rating;
			mGrapes = new LinkedList<String>();
			mNotes = notes;
		}
		
		public void addGrape (String grape){
			mGrapes.add(grape);
		}
		
		public int getImage() {
			return mImage;
		}
		public void setImage(int image) {
			mImage = image;
		}
		public List<String> getGrapes() {
			return mGrapes;
		}
		public void setGrapes(List<String> grapes) {
			mGrapes = grapes;
		}
		public String getName() {
			return mName;
		}
		public void setName(String name) {
			mName = name;
		}
		public String getURL() {
			return mURL;
		}
		public void setURL(String uRL) {
			mURL = uRL;
		}
		public String getTypeWine() {
			return mTypeWine;
		}
		public void setTypeWine(String typeWine) {
			mTypeWine = typeWine;
		}
		public String getNotes() {
			return mNotes;
		}

		public void setNotes(String notes) {
			mNotes = notes;
		}

		public String getWinehouse() {
			return mWinehouse;
		}
		public void setWinehouse(String winehouse) {
			mWinehouse = winehouse;
		}
		public int getRating() {
			return mRating;
		}
		public void setRating(int rating) {
			mRating = rating;
		}
	    
	    
	  
	    
	    
	    	
}
