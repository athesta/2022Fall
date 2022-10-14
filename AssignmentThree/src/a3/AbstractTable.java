/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

public abstract class AbstractTable {
	
	private String header;
	private AbstractRow[] abFullTable = new AbstractRow [100];
	private int rowCount;
	
	public abstract void loadTableFromFile (String fileName);
	public abstract void saveTable (String fileName);

}
