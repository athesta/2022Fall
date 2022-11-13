/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a5;

import java.io.FileNotFoundException;
import java.util.*;

public abstract class AbstractTable <T> extends AbstractRow {

	// DATA MEMBERS
	private String tableHeader;
	//private AbstractRow[] abFullTable = new AbstractRow[100];
	//private List<T> abFullTable = new ArrayList<>();
	private T abFullTable2;
	private int rowCount = 0;

	// GETTERS
	public String getTableHeader() {
		return tableHeader;
	}

	public T getAbFullTable() {
		return abFullTable2;
	}

	public int getRowCount() {
		return rowCount;
	}

	// SETTERS
	public void setTableHeader(String tableHeader) {
		this.tableHeader = tableHeader;
	}

	public void setAbFullTable(T abFullTable2) {
		this.abFullTable2 = abFullTable2;
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
