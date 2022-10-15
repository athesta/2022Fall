/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class StadiumTable extends AbstractTable {
	
	private int rowCount = getRowCount();
	private AbstractRow [] fullTable = getAbFullTable();		
	
	//Class methods
	//addRow method adds a row to the Stadium Table
	public void addRow(String stadiumName, String cityId, String teamName, String capacity) {
		StadiumRow singleRow = new StadiumRow(stadiumName, cityId, teamName, capacity);
		try {
			fullTable[rowCount] = singleRow;
			rowCount++;
			setRowCount(rowCount);

			//QA/Validation : 
			//System.out.println (" TEST: Array for Row " + rowCount +": \n");
			//System.out.println(singleRow.toString());
			//System.out.println("\n ENDTEST");

		}
		
		catch (java.lang.ArrayIndexOutOfBoundsException fnfex){
			System.err.println("Your table is full. You should remove a row prior to adding additional data.");
		}

	}
	
	//removeRow removes a row from the Stadium Table when user provides the Stadium Name
	public void removeRow(String stadiumName) {
		String userInputStadium = stadiumName;
		
		for (int i=0; i<rowCount && fullTable[i] != null; i++) {
			AbstractRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String [] split = splitString(getTableRowString);

			if (split[0].equalsIgnoreCase(userInputStadium)) {
				fullTable[i] = null;
				rowCount--;
				setRowCount(rowCount);
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
		//System.out.println(Arrays.toString(fullTable)); System.out.println("\nNumber of rows:" + rowCount);
		
	}

	//finds the row(s) in the stadium table based off of the CityID
	public String findRow(String cityId) {
		String userInputId=cityId;
		String output = "Row Not Found.";

		for (int i=0; i<rowCount &&  fullTable[i] != null; i++) {
			AbstractRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String [] split = splitString(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId))
				output= getTableRowString;
		}

		return output;
	}

	//IMPLEMENT ABSTRACT METHODS
	//Load the table file provided by the user
	public void loadTableFromFile(String fileName) {
		try {
			Scanner inFile = new Scanner (new FileReader(fileName));
			try {
				
				setTableHeader(inFile.nextLine());

				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String [] rowElements = splitString(Line);
					addRow(rowElements[0], rowElements[1], rowElements[2], rowElements[3]);

					//QA/Validation Testing during implementation
					System.out.println("TEST HEADER: " + getTableHeader() + " \nTEST CURRENT ROW #: " + getRowCount());
					System.out.println(Arrays.deepToString(getAbFullTable()));
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
	
	//Save the table file
	public void saveTable(String fileName) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(fileName);
		outFile.println(getTableHeader() + "\n");
		
		for (int i = 0; i < getRowCount() && fullTable[i] != null; i++) {
			outFile.println(fullTable[i]);							
		}

		outFile.flush();
		outFile.close();
	}

}
