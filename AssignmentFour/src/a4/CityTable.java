/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CityTable extends AbstractTable {

	// DATA MEMBERS
	private int rowCount = getRowCount();
	private AbstractRow[] fullTable = getAbFullTable();

	// CLASS METHODS
	public void addRow(String city, String cityId, String population) {
		CityRow singleRow = new CityRow(city, cityId, population);
		try {

			fullTable[rowCount] = singleRow;
			rowCount++;
			setRowCount(rowCount);

			// QA/Validation :
			// System.out.println (" TEST: Array for Row " + rowCount +": \n");
			// System.out.println(singleRow.toString());
			// System.out.println("\n ENDTEST");

		}

		catch (java.lang.ArrayIndexOutOfBoundsException fnfex) {
			System.err.println("Your table is full. You should remove a row prior to adding additional data.");
		}
	}

	// IMPLEMENT ABSTRACT METHODS
	// Load the table file provided by the user
	public void loadTableFromFile(String fileName) {
		try {
			Scanner inFile = new Scanner(new FileReader(fileName));
			try {

				setTableHeader(inFile.nextLine());

				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String[] rowElements = splitString(Line);
					addRow(rowElements[0], rowElements[1], rowElements[2]);

					// QA/Validation Testing during implementation
					System.out.println("TEST HEADER: " + getTableHeader() + " \nTEST CURRENT ROW #: " + getRowCount());
					System.out.println(Arrays.deepToString(getAbFullTable()));
				}
			} catch (java.util.NoSuchElementException fnfex) {
				System.err.println("Your file is empty. Please load a different file.");
			}
			inFile.close();
		}

		catch (java.io.FileNotFoundException fnfex) {
			System.err.println("Your file cannot be located. Please check your file name or file location.");
		}
	}

	// Save the table file
	public void saveTable(String fileName) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(fileName);
		if (getTableHeader() == null) {
			setTableHeader("My Cities: City, city id, population in millions");
			outFile.println(getTableHeader() + "\n");
		}

		else {
			outFile.println(getTableHeader() + "\n");
		}

		for (int i = 0; i < getRowCount() && fullTable[i] != null; i++) {
			outFile.println(fullTable[i]);
		}

		outFile.flush();
		outFile.close();

	}

	// Removes a row from the City Table
	public void removeRow(String cityId) {
		String userInputId = cityId;

		for (int i = 0; i < rowCount && fullTable[i] != null; i++) {
			AbstractRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String[] split = splitString(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId)) {
				fullTable[i] = null;
				rowCount--;
				setRowCount(rowCount);
			}
		}

		for (int j = 0; j < fullTable.length; j++) {
			if (fullTable[j] == null) {
				for (int k = j + 1; k < fullTable.length; k++) {
					fullTable[k - 1] = fullTable[k];
				}
				fullTable[fullTable.length - 1] = null;
				break;
			}
		}

	}

	// Finds a row in the City Table
	public String findRow(String cityId) {
		String userInputId = cityId;
		String output = "Row Not Found.";

		for (int i = 0; i < rowCount && fullTable[i] != null; i++) {
			AbstractRow getTableRow = fullTable[i];
			String getTableRowString = getTableRow.toString();
			String[] split = splitString(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId))
				output = getTableRowString;
		}

		return output;
	}

}
