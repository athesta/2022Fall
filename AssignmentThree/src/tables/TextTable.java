package tables;

import java.io.*;
import java.util.*;

public class TextTable {

	//Data Members
	private String headerInfo;
	private TableRow[] fullTable = new TableRow[100];
	private int numRows=0;


	//loads the table file with fileName as a string.
	public void loadTableFromFile(String fileName) {

		try {
			Scanner inFile = new Scanner (new FileReader(fileName));
			try {
				headerInfo = inFile.nextLine();

				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String [] rowElements = splitString(Line);
					addRow(rowElements[0], rowElements[1], rowElements[2]);

					//QA/Validation Testing during implementation
					//System.out.println("TEST HEADER: " + headerInfo + " TEST CURRENT ROW #: " + numRows);
					//System.out.println(Arrays.deepToString(fullTable));
				}
			}
			catch(java.util.NoSuchElementException fnfex) {
				System.err.println("Your file is empty. Please load a different file.");
			}
			inFile.close();
		}

		catch (java.io.FileNotFoundException fnfex) {
			System.err.println("Your file cannot be located. Please check your file name or file location.");
		}
	}

	//Saves the table to a file and places in the AssignmentOne directory
	public void saveTableToFile(String fileName) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(fileName);

		outFile.println(headerInfo + "\n");
		for (int i = numRows-numRows; i < numRows && fullTable[i] != null; i++) {
			outFile.println(fullTable[i]);							
		}

		outFile.flush();
		outFile.close();
	}

	//Adds a row to the table and increments the row count
	public void addRow(String number, String name, String value) {

		TableRow singleRow = new TableRow(number, name, value);
		try {
			fullTable[numRows] = singleRow;
			numRows++;

			//QA/Validation : 
			//System.out.println (" TEST: Array for Row " + numRows +": \n");
			System.out.println(singleRow.toString());
			//System.out.println("\n ENDTEST");

		}
		catch (java.lang.ArrayIndexOutOfBoundsException fnfex){
			System.err.println("Your table is full. You should remove a row prior to adding additional data.");
		}
	}

	//removes a row from the list, decrements the row count, and goes on to re-order 
	public void removeRow(String number) {
		String userInputNum = number;

		for (int i=0; i<numRows && fullTable[i] != null; i++) {
			TableRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String [] split = splitString(getTableRowString);

			if (split[0].equalsIgnoreCase(userInputNum)) {
				fullTable[i] = null;
				numRows--;
			}
		}


		for (int j=0; j<fullTable.length; j++){ 
			if (fullTable[j]==null) {
				for (int k=j+1; k < fullTable.length; k++){
					fullTable[k-1] = fullTable[k];
				}
				fullTable[fullTable.length-1] = null;
				break;
			}
		}
		//QA/Validation output
		//System.out.println(Arrays.toString(fullTable)); System.out.println("\nNumber of rows:" + numRows);
	}


	//finds a Row in the table
	public String findRow(String name) {
		String userInputName=name;
		String output = "Row Not Found.";

		for (int i=0; i<numRows &&  fullTable[i] != null; i++) {
			TableRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String [] split = splitString(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputName))
				output= getTableRowString;
		}

		return output;

	}

	//Splits a String of 3 values separated by spaces
	public String[] splitString(String stringName) {
		String split[] = stringName.split("\\s+");
		return split;

	}

}
