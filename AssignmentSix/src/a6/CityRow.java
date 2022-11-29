/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.util.*;

public class CityRow extends AbstractRow implements Comparator<CityRow>, Comparable<CityRow> {

	// Data Members
	private String[] rowCity = new String[3];

	// Constructor
	public CityRow(String city, String cityId, String population) {
		rowCity[0] = city;
		rowCity[1] = cityId;
		rowCity[2] = population;

	}

	// Getters & Setters public String[] getRowCity() { return rowCity; }

	public void setRowCity(String[] rowCity) {
		this.rowCity = rowCity;
	}

	public String getCityId() {
		return rowCity[1];
	}
	
	public String getCityName() {
		return rowCity[0];
	}
	
	public String getPopulation() {
		return rowCity[2];
	}

	// Override Abstract methods
	// toString
	public String toString() {
		return String.join(", ", rowCity);
	}

	// Equals method - unsure what to use this for?

	public boolean equals(String input) {
		if (rowCity[1] == input)
			return true;
		else
			return false;
	}

	// From Comparator
	@Override
	public int compare(CityRow o1, CityRow o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	// From Comparable
	@Override
	public int compareTo(CityRow o) {
		return 0;
	}

}
