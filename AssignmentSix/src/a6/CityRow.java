/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.util.*;

public class CityRow<T> extends AbstractRow implements Comparator<T>, Comparable<T> {
	
	//Data Members
	private String[] rowCity = new String [3];
	
	//Constructor
	public CityRow(String city, String cityId, String population) {
		rowCity[0] = city;
		rowCity[1] = cityId;
		rowCity[2] = population;
	}
	
	
	//Getters & Setters
	public String[] getRowCity() {
		return rowCity;
	}

	public void setRowCity(String[] rowCity) {
		this.rowCity = rowCity;
	}

	//Override Abstract methods
	//toString
	public String toString() {
		return String.join(", ", rowCity); 
	}
	
	//Equals method - unsure what to use this for?
	public boolean equals(String input) {
		if (rowCity[1]==input)
			return true;
		else return false;
			}

	//From Comparator
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	//From Comparable
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}




}
