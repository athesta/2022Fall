/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.util.*;

public class StadiumRow<T> extends AbstractRow implements Comparator<T>, Comparable<T>{
	
	//Data Members
	private String[] rowStadium = new String [4];
	
	//Constructor
	public StadiumRow(String stadiumName, String cityId, String teamName, String capacity) {
		rowStadium[0] = stadiumName;
		rowStadium[1] = cityId;
		rowStadium[2] = teamName;
		rowStadium[3] = capacity;
	}

	
	//IMPLEMENT ABSTRACT METHODS
	//Equals method checks if two rows are the same
	//unsure what to use this for?
	public boolean equals(String input) {
		if (rowStadium[0]==input)
			return true;
		return false;
	}
	
	//toString method
	public String toString() {
		return String.join(", ", rowStadium); 
	}

	//From Comparator
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	//From Comparable
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getCityId() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getCityName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getPopulation() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
