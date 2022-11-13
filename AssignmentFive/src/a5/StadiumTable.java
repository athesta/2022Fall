/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StadiumTable extends AbstractTable<AbstractRow> {

	// DATA MEMBERS
	private int rowCount = getRowCount();
	private List<AbstractRow> fullTable = getAbFullTable();
	private int numColumns = 4;
	private String expectedFileType = "Stadium";

	// CLASS METHODS
	// addRow method adds a row to the Stadium Table
	public void addRow(String stadiumName, String cityId, String teamName, String capacity) {

		StadiumRow singleRow = new StadiumRow(stadiumName, cityId, teamName, capacity);
		try {
			fullTable.add(singleRow);
			rowCount++;
			setRowCount(rowCount);
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
			} catch (java.util.NoSuchElementException emptyFile) {
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

			for (int i = 0; i < getRowCount(); i++) {
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
		String userInputId = cityId;

		
		for (int i = 0; i < rowCount; i++) {
			AbstractRow getTableRow = fullTable.get(i);
			String getTableRowString = getTableRow.toString();
			String[] split = splitStringComma(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId)) {
				fullTable.remove(i);
				rowCount--;
				setRowCount(rowCount);
			}
		}
	}

	// finds the row(s) in the stadium table based off of the CityID
	public String findRow(String cityId) {
		String userInputId = cityId;
		String output = "Row Not Found.";

		
		for (int i = 0; i < rowCount; i++) {
			AbstractRow getTableRow = fullTable.get(i);
			String getTableRowString = getTableRow.toString();
			String[] split = splitStringComma(getTableRowString);

			if (split[1].equalsIgnoreCase(userInputId))
				output = getTableRowString;
		}

		return output;
	}



}
