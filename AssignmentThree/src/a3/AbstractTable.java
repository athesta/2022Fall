/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

import java.io.FileNotFoundException;

public abstract class AbstractTable {
	
	//Data members
	private String tableHeader;
	private AbstractRow[] abFullTable = new AbstractRow [100];
	private int rowCount=0;
	

	public String getTableHeader() {
		return tableHeader;
	}
	
	public AbstractRow[] getAbFullTable() {
		return abFullTable;
	}
	
	public int getRowCount() {
		return rowCount;
	}
	
	public void setTableHeader(String tableHeader) {
		this.tableHeader = tableHeader;
	}
	
	public void setAbFullTable(AbstractRow[] abFullTable) {
		this.abFullTable = abFullTable;
	}
	
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	
	
	public abstract void loadTableFromFile (String fileName);
	public abstract void saveTable (String fileName) throws FileNotFoundException;
	
	//Splits a String of 3 values separated by spaces
	public String[] splitString(String stringName) {
		String split[] = stringName.split("[\\s,\\s]+");
		return split;

	}

}
