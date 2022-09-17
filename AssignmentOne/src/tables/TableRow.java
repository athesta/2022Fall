package tables;

import java.util.*;

public class TableRow {
	


	//Data Members
	private String[] rowData = new String [3];
	
	


	//Constructor
	public TableRow(String number, String name, String value) {
		rowData[0] = number;
		rowData[1] = name;
		rowData[2] = value;
	}
		


	public String toString() {
		 
		 return String.join(" ", rowData); 
		 
	}
	

	
	
}
