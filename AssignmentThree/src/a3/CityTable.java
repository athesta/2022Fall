/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CityTable extends AbstractTable {
	
	private int rowCount = getRowCount();
	private AbstractRow [] fullTable = getAbFullTable();
	
	public void addRow(String city, String cityId, String population) {
		CityRow singleRow = new CityRow(city, cityId, population);
		
		try {
			fullTable[rowCount] = singleRow;
			rowCount++;
			setRowCount(rowCount);

			//QA/Validation : 
			System.out.println (" TEST: Array for Row " + rowCount +": \n");
			System.out.println(singleRow.toString());
			System.out.println("\n ENDTEST");

		}
		
		catch (java.lang.ArrayIndexOutOfBoundsException fnfex){
			System.err.println("Your table is full. You should remove a row prior to adding additional data.");
		}

	}

	public void removeRow() {

	}

	public String findRow() {
		String row = "hi";
		return row;
	}

	
	public void loadTableFromFile(String fileName) {
		try {
			Scanner inFile = new Scanner (new FileReader(fileName));
			try {
				
				setTableHeader(inFile.nextLine());

				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String [] rowElements = splitString(Line);
					addRow(rowElements[0], rowElements[1], rowElements[2]);

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
