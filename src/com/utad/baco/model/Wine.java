package com.utad.baco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Wine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4531991697349185301L;
	private int mImage;
	private String mGrapes1;
	private String mGrapes2;
	private String mGrapes3;
	private String mGrapes4;
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
		mGrapes1 = "";
		mGrapes2 = "";
		mGrapes3 = "";
		mGrapes4 = "";
		mNotes = notes;
	}

	
	
	public String getmGrapes1() {
		return mGrapes1;
	}



	public void setmGrapes1(String mGrapes1) {
		this.mGrapes1 = mGrapes1;
	}



	public String getmGrapes2() {
		return mGrapes2;
	}



	public void setmGrapes2(String mGrapes2) {
		this.mGrapes2 = mGrapes2;
	}



	public String getmGrapes3() {
		return mGrapes3;
	}



	public void setmGrapes3(String mGrapes3) {
		this.mGrapes3 = mGrapes3;
	}



	public String getmGrapes4() {
		return mGrapes4;
	}



	public void setmGrapes4(String mGrapes4) {
		this.mGrapes4 = mGrapes4;
	}



	public int getImage() {
		return mImage;
	}

	public void setImage(int image) {
		mImage = image;
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