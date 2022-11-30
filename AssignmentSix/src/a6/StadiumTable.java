/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StadiumTable extends AbstractTable<StadiumRow> {

	// DATA MEMBERS
	// private int rowCount = getRowCount();
	// private List<AbstractRow> stadiumFullTable = getFullTable();
	private int numColumns = 4;
	private String expectedFileType = "Stadium";

	// CLASS METHODS
	// addRow method adds a row to the Stadium Table
	public void addRow(String stadiumName, String cityId, String teamName, String capacity) {

		StadiumRow singleRow = new StadiumRow(stadiumName, cityId, teamName, capacity);
		try {
			fullTable.add(singleRow);
			sortTable();
		}

		catch (java.lang.ArrayIndexOutOfBoundsException oob) {
			oob.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"Your table is full. You should remove a row prior to adding additional data.", "Over 100 rows...",
					JOptionPane.ERROR_MESSAGE);
		} finally {

		}

	}

	// IMPLEMENT ABSTRACT METHODS
	// Load the table file provided by the user
	public void loadTableFromFile(String fileName) {
		Scanner inFile = null;
		try {
			inFile = new Scanner(new FileReader(fileName));
			try {

				setTableHeader(inFile.nextLine());

				while (inFile.hasNextLine()) {
					String Line = inFile.nextLine();
					String[] rowElements = splitStringComma(Line);

					if (rowElements.length != numColumns) {
						throw new InvalidFileStructureException(fileName, numColumns, expectedFileType);
					}

					addRow(rowElements[0], rowElements[1], rowElements[2], rowElements[3]);

				}

				sortTable();
			}

			catch (java.util.NoSuchElementException emptyFile) {
				JOptionPane.showMessageDialog(null, "Your file is empty. Please load a different file.", "Empty File",
						JOptionPane.ERROR_MESSAGE);
				emptyFile.printStackTrace();
			}

			catch (InvalidFileStructureException fse) {
				JOptionPane.showMessageDialog(null, fse.getMessage(),
						"Invalid Menu Selection or Unexpected File Structure", JOptionPane.ERROR_MESSAGE);
			}

			finally {
				if (inFile != null)
					inFile.close();
			}
		}

		catch (java.io.FileNotFoundException fnfex) {
			JOptionPane.showMessageDialog(null,
					"Your file cannot be located. Please check your file name or file location.", "File Not Found",
					JOptionPane.ERROR_MESSAGE);
			fnfex.printStackTrace();
		} finally {
		}

	}

	// Save the table file
	public void saveTable(String fileName) throws FileNotFoundException {
		PrintWriter outFile = null;

		try {
			String[] validateFileName = splitFileName(fileName);

			if (validateFileName.length != 2) {
				throw new FileExtensionException(fileName);
			}

			outFile = new PrintWriter(fileName);
			if (getTableHeader() == null) {
				setTableHeader("Stadiums: Stadium name, City id, Team name, capacity");
				outFile.println(getTableHeader() + "\n");
			}

			else {
				outFile.println(getTableHeader() + "\n");
			}

			for (int i = 0; i < fullTable.size(); i++) {
				outFile.println(fullTable.get(i));
			}
		} catch (FileExtensionException ext) {
			JOptionPane.showMessageDialog(null, ext.getMessage(), "Invalid File Name", JOptionPane.ERROR_MESSAGE);
		}

		finally {
			if (outFile != null) {
				outFile.flush();
				outFile.close();
			}
		}

	}

	// removeRow removes a row from the Stadium Table when user provides the cityId
	public void removeRow(String cityId) {
		int rowId = searchRow(cityId);
		fullTable.remove(rowId);
		// setRowCount(rowCount - 1);
	}

	// Displays the output of the row to the user in a String
	public String findRow(String cityId) {
		return displayRow(searchRow(cityId));
	}

	// Searches rows in the Stadium Table - Sequential Search
	public int searchRow(String cityId) {
		String userInputId = cityId;
		// String output = "Row Not Found.";
		boolean found = false;
		int loc = 0;
		AbstractRow getTableRow;

		while (loc < fullTable.size() && !found) {
			getTableRow = fullTable.get(loc);
			String getTableRowString = getTableRow.toString();
			String[] split = splitStringComma(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId))
				found = true;
			else
				loc++;
		}
		if (found)
			return loc;
		else
			return -1;
	}

	@Override
	public void sortTable() {
		final int length = fullTable.size();
		StadiumRow compRow1;
		StadiumRow compRow2;
		for (int counter = 0; counter < length - 1; counter++) {
			for (int index = 0; index < length - 1 - counter; index++) {
				compRow1 = (StadiumRow) fullTable.get(index);
				compRow2 = (StadiumRow) fullTable.get(index + 1);
				if (compRow1.compareTo(compRow2) > 0) {
					StadiumRow temp = new StadiumRow(compRow1.getStadiumName(), compRow1.getStadiumCityId(),
							compRow1.getTeamName(), compRow1.getStadiumCapcity());
					fullTable.set(index, compRow2);
					fullTable.set(index + 1, temp);
					// testing things
					// System.out.println(stadiumFullTable.toString());

				}
			}
		}
	}

}
