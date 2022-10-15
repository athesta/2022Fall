/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

public class StadiumRow extends AbstractRow {
	
	private String[] rowStadium = new String [4];
	
	
	public StadiumRow(String stadiumName, String cityId, String teamName, String capacity) {
		rowStadium[0] = stadiumName;
		rowStadium[1] = cityId;
		rowStadium[2] = teamName;
		rowStadium[4] = capacity;
	}

	public void equals() {
		
	}
	
}
