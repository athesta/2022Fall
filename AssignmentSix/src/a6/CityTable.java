/*
 * Author: Jennifer Swofford
 * Email:  jswofford@uwplatt.edu
 * 
 */

package a6;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

public class CityTable extends AbstractTable<CityRow> {

	// DATA MEMBERS
	// private List<CityRow> cityFullTable = getAbFullTable();
	private int numColumns = 3;
	private String expectedFileType = "City";

	// CLASS METHODS
	public void addRow(String city, String cityId, String population) {
		CityRow singleRow = new CityRow(city, cityId, population);
		try {

			fullTable.add(singleRow);
			sortTable();

		}

		catch (java.lang.ArrayIndexOutOfBoundsException oob) {
			oob.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"Your table is full. You should remove a row prior to adding additional data.", "Over 100 rows...",
					JOptionPane.ERROR_MESSAGE);
		}

		finally {

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

					addRow(rowElements[0], rowElements[1], rowElements[2]);
				}

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
				setTableHeader("My Cities: City, city id, population in millions");
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

	// Removes a row from the City Table
	public void removeRow(String cityId) {
		int rowId = searchRow(cityId);
		fullTable.remove(rowId);
		// setRowCount(rowCount - 1);

	}

	// findRow is calls concrete method 'displayRow'
	// This displays the output of the row to the user in a String
	public String findRow(String cityId) {
		return displayRow(searchRow(cityId));
	}

	// Searches rows in the City Table - Sequential Search
	// returns the index of the row location
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

	// Sorts the Table - I'm calling this in the addRow and loadTableFromFile
	// methods
	public void sortTable() {
		// [[La Crosse, 01, 5000], [West Salem, 13, 2000]]
		final int length = fullTable.size();
		CityRow compRow1;
		CityRow compRow2;
		for (int counter = 0; counter < length - 1; counter++) {
			for (int index = 0; index < length - 1 - counter; index++) {
				compRow1 = (CityRow) fullTable.get(index);
				compRow2 = (CityRow) fullTable.get(index + 1);
				if (compRow1.compareTo(compRow2) > 0) {
					CityRow temp = new CityRow(compRow1.getCityName(), compRow1.getCityCityId(),
							compRow1.getPopulation());
					fullTable.set(index, compRow2);
					fullTable.set(index + 1, temp);
					// testing things
					// System.out.println(cityFullTable.toString());

				}

			}
		}
	}

	// will join the table, and will save the joined tables as a txt file named
	// 'JoinedTables.txt'
	public CityStadiumTable joinTables(StadiumTable o) {
		CityStadiumTable cityStadium = new CityStadiumTable();
		Map<String, StadiumRow> smap = new HashMap<>();

		if (o.fullTable.size() <= 0) {
			JOptionPane.showMessageDialog(null, "Your stadium table is empty. Add rows to your stadium table.");
		} else if (fullTable.size() <= 0) {
			JOptionPane.showMessageDialog(null, "Your city table is empty. Add rows to your city table.");
		}
		for (AbstractRow x : o.fullTable) {
			StadiumRow sr = (StadiumRow) x;
			for (AbstractRow y : fullTable) {
				CityRow cr = (CityRow) y;

				if (sr.getStadiumCityId().compareTo(cr.getCityCityId()) == 0) {
					smap.put(sr.getStadiumCityId(), sr);
				}
			}
		}

		for (AbstractRow y : fullTable) {
			CityRow cr = (CityRow) y;
			if (smap.containsKey(cr.getCityCityId())) {
				cityStadium.addRow(cr.getCityName(), cr.getPopulation(), cr.getCityCityId(),
						smap.get(cr.getCityCityId()).getStadiumName(), smap.get(cr.getCityCityId()).getTeamName(),
						smap.get(cr.getCityCityId()).getStadiumCapcity());
			}
		}

		if (cityStadium.fullTable.size() > 0) {
			try {
				cityStadium.saveTable("JoinedTables.txt");
				JOptionPane.showMessageDialog(null, "Joined Table saved as JoinedTables.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else JOptionPane.showInternalMessageDialog(null, "No matches found across the city & stadium tables.\n");
		return cityStadium;

	}

	@Override
	public void removeDuplicateRows() {
		sortTable();
		CityRow comp1;
		CityRow comp2;
		int removedRowCount = 0;
		for (int counter = 0; counter < fullTable.size() - 1; counter++) {
			for (int index = 0; index < fullTable.size() - 1 - counter; index++) {
				comp1=(CityRow) fullTable.get(index);
				comp2=(CityRow) fullTable.get(index+1);
				if(comp1.compareTo(comp2)==0) {
					JOptionPane.showMessageDialog(null, "Removing " + fullTable.get(index).toString());
					fullTable.remove(index);
					removedRowCount++;
				}
		}
		}
		JOptionPane.showMessageDialog(null, "Duplicate Row Search Complete. " + removedRowCount + " rows removed.");
		
	}

}
