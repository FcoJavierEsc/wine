package model;

import java.util.List;

public class Wine {

	    private int mImage;
	    private List <String> mGrapes ;
	    private String mName;
	    private String mURL;
	    private String mWypeWine;
	    private String mWinehouse;
	    private int mRating;
	    
	    
	    
	    
		public Wine(int image, String name, String uRL, String wypeWine,
				String winehouse, int rating) {
			super();
			mImage = image;
			mName = name;
			mURL = uRL;
			mWypeWine = wypeWine;
			mWinehouse = winehouse;
			mRating = rating;
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
		public String getWypeWine() {
			return mWypeWine;
		}
		public void setWypeWine(String wypeWine) {
			mWypeWine = wypeWine;
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
