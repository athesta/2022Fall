/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

public abstract class CityRow extends AbstractRow {
	
	private String[] rowCity = new String [3];
	
	public CityRow(String city, String cityId, String population) {
		rowCity[0] = city;
		rowCity[1] = cityId;
		rowCity[2] = population;
	}
	
	public void equals() {
		
	}

}
