/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

public abstract class AbstractRow {
	
	//Abstract methods to implement in subclasses
	public abstract boolean equals(String input);
	public abstract String toString();
	public abstract String getCityId();
	public abstract String getCityName();
	public abstract String getPopulation();

}
