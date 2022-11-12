/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a5;

public class CityRow extends AbstractRow {
	
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




}
