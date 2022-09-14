package tables;

import java.io.*;
import java.util.*;

public class TextTable {

	//Data Members
	private String headerInfo;
	// A private data member: an array of 100 TableRow objects.
	private TableRow[] fullTable = new TableRow[100];
	private int numRows = 0;


	//loads the table file given the file name as a String
	public void loadTableFromFile(String fileName) {
		
		try {
			Scanner inFile = new Scanner (new FileReader(fileName));
			
				headerInfo = inFile.nextLine();
				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String split[] = Line.split("\\s+");
					String number = split[0];
					String name = split[1];
					String value = split[2];
					addRow(number, name, value);
				}
				
				System.out.println(headerInfo + " " + numRows);
				
			
			
			
			
			inFile.close();
		} catch (java.io.FileNotFoundException fnfex) {
			System.err.println("Your file cannot be located. Please check your file name or file location.");
		}
	}

	
	
	public void saveTableToFile(String fileName) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(fileName);
		outFile.flush();
		outFile.close();
	}

	public void addRow(String number, String name, String value) {
		TableRow[] singleRow = new TableRow[3];
		//still need to figure this out....
		singleRow[0] = number;
		singleRow[1] = name;
		singleRow[2] = value;
		
	}

	public void removeRow(String number) {
		// TODO Auto-generated method stub
		
	}

	public String findRow(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
