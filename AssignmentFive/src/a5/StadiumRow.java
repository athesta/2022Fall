/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a5;

public class StadiumRow extends AbstractRow {
	
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

	
}
