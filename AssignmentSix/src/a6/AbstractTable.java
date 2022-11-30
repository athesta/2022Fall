/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.io.FileNotFoundException;
import java.util.*;

public abstract class AbstractTable <T extends AbstractRow> {

	// DATA MEMBERS
	private String tableHeader;
	List<AbstractRow> fullTable = new ArrayList<>(); 
	private int rowCount = 0;

	// GETTERS
	public String getTableHeader() {
		return tableHeader;
	}

	public List<AbstractRow> fullTable() {
		return fullTable;
	}

	public int getRowCount() {
		return rowCount;
	}

	// SETTERS
	public void setTableHeader(String tableHeader) {
		this.tableHeader = tableHeader;
	}

	public void setFullTable(List<AbstractRow> fullTable) {
		this.fullTable = fullTable;
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
	
	// displays the row content in a user-friendly format
	public String displayRow(int searchResults) {
		String results;
		if (searchResults == -1) {
			results = "Row not found";
			return results;}
		else return fullTable.get(searchResults).toString();
	}
	
	//
	
	// ABSTRACT METHODS REQUIRED IN SUBCLASSES
	public abstract void loadTableFromFile(String fileName);

	public abstract void saveTable(String fileName) throws FileNotFoundException;

	public abstract void removeRow(String cityId);

	public abstract int searchRow(String cityId);
	
	public abstract void sortTable();
	
	
}
