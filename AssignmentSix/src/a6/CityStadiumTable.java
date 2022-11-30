package a6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import javax.swing.JOptionPane;

public class CityStadiumTable extends AbstractTable<CityStadiumRow> {

	// private List<CityStadiumRow> citySadiumTable = new ArrayList();

	public void addRow(String cityName, String cityPopulation, String cityId, String stadium, String teamName,
			String capacity) {
		CityStadiumRow joinedSingleRow = new CityStadiumRow(cityName, cityPopulation, cityId, stadium, teamName,
				capacity);
		fullTable.add(joinedSingleRow);
		sortTable();

	}

	@Override
	public void loadTableFromFile(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveTable(String fileName) throws FileNotFoundException {

		PrintWriter outFile = null;
		try {
			String[] validateFileName = splitFileName(fileName);

			if (validateFileName.length != 2) {
				throw new FileExtensionException(fileName);
			}

			outFile = new PrintWriter(fileName);
			if (getTableHeader() == null) {
				setTableHeader("Combined Info: City, Population, City id, Stadium Name, Team Name, Capacity");
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

	@Override
	public void removeRow(String cityId) {
		// TODO Auto-generated method stub

	}

	@Override
	public int searchRow(String cityId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sortTable() {
		final int length = fullTable.size();
		CityStadiumRow compRow1;
		CityStadiumRow compRow2;
		for (int counter = 0; counter < length - 1; counter++) {
			for (int index = 0; index < length - 1 - counter; index++) {
				compRow1 = (CityStadiumRow) fullTable.get(index);
				compRow2 = (CityStadiumRow) fullTable.get(index + 1);
				if (compRow1.compareTo(compRow2) > 0) {
					CityStadiumRow temp = new CityStadiumRow(compRow1.getJoinCityName(),
							compRow1.getJoinCityPopulation(), compRow1.getJoinCityId(), compRow1.getJoinStadium(),
							compRow1.getJoinTeamName(), compRow1.getJoinCapacity());
					fullTable.set(index, compRow2);
					fullTable.set(index + 1, temp);

				}

			}

		}
	}

	@Override
	public void removeDuplicateRows() {
		// TODO Auto-generated method stub
		
	}
}