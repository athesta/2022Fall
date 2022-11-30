/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.util.*;

public class StadiumRow extends AbstractRow implements Comparator<StadiumRow>, Comparable<StadiumRow> {

	// Data Members
	private String[] rowStadium = new String[4];

	// Constructor
	public StadiumRow(String stadiumName, String cityId, String teamName, String capacity) {
		rowStadium[0] = stadiumName;
		rowStadium[1] = cityId;
		rowStadium[2] = teamName;
		rowStadium[3] = capacity;
	}

	// Getters & Setters

	public String getStadiumName() {
		return rowStadium[0];
	}

	public String getStadiumCityId() {
		return rowStadium[1];
	}

	public String getTeamName() {
		return rowStadium[2];
	}

	public String getStadiumCapcity() {
		return rowStadium[3];
	}

	// IMPLEMENT ABSTRACT METHODS
	// Equals method checks if two rows are the same
	// unsure what to use this for?
	public boolean equals(String input) {
		if (rowStadium[0] == input)
			return true;
		return false;
	}

	// toString method
	public String toString() {
		return String.join(", ", rowStadium);
	}

	@Override
	public int compareTo(StadiumRow o) {
		int cityIdCompare = this.rowStadium[1].compareToIgnoreCase(o.getStadiumCityId());
		return cityIdCompare;
	}

	@Override
	public int compare(StadiumRow o1, StadiumRow o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
