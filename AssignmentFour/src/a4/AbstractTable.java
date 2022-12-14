/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a4;

import java.io.FileNotFoundException;

public abstract class AbstractTable {

	// DATA MEMBERS
	private String tableHeader;
	private AbstractRow[] abFullTable = new AbstractRow[100];
	private int rowCount = 0;

	// GETTERS
	public String getTableHeader() {
		return tableHeader;
	}

	public AbstractRow[] getAbFullTable() {
		return abFullTable;
	}

	public int getRowCount() {
		return rowCount;
	}

	// SETTERS
	public void setTableHeader(String tableHeader) {
		this.tableHeader = tableHeader;
	}

	public void setAbFullTable(AbstractRow[] abFullTable) {
		this.abFullTable = abFullTable;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	// CONCRETE METHODS USED BY THE SUBCLASSES
	// Splits a String of X elements separated by spaces
	public String[] splitStringComma(String stringName) {
		String split[] = stringName.split("[,]\\s+");
		return split;
	}
	
	// Splits a String of X elements separated by a period
	public String[] splitFileName(String stringName) {
		String split[] = stringName.split("\\.");
		return split;
	}
	

	// ABSTRACT METHODS REQUIRED IN SUBCLASSES
	public abstract void loadTableFromFile(String fileName);

	public abstract void saveTable(String fileName) throws FileNotFoundException;

	public abstract void removeRow(String cityId);

	public abstract String findRow(String cityId);

}
