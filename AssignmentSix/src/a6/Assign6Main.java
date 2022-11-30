package a6;

import java.io.*;

import javax.swing.JOptionPane;

/**
 * <p>
 * Title: APC 390 Assignment #3
 * </p>
 * <p>
 * Description: Interactive Table builder. Assign3Main - modifying Assign1Main
 * to use inheritance, polymorphism, & abstract classes
 * </p>
 * <p>
 * Copyright: Copyright (c) 2021
 * </p>
 * <p>
 * Company: UWRF
 * </p>
 * 
 * @author Anthony Varghese
 * @version 1.0
 * 
 * @author Jennifer Swofford swoffordj@uwplatt.edu
 * 
 */

public class Assign6Main {
	static final int LOAD_CITY = 1, SAVE_CITY = 2, ADD_ROW_CITY = 3, REMOVE_ROW_CITY = 4, FIND_ROW_CITY = 5,
			LOAD_STADIUM = 6, SAVE_STADIUM = 7, ADD_ROW_STADIUM = 8, REMOVE_ROW_STADIUM = 9, FIND_ROW_STADIUM = 10,
			JOIN = 11, QUIT = 12;

	static final String welcomeMessage = "This program implements an interactive table builder for City or Stadium information.\n"
			+ "You can add new rows or remove rows from tables.\n"
			+ "You can also load a table from a file or save a current\n" + "table to a file.\n";
	static final String promptMessage = "What would you like to do?\n"
			+ "Please enter the number corresponding to the action you would like:\n\n" + " City Table Commands:\n"
			+ "   " + LOAD_CITY + ": Load a table of city information from a file\n" + "   " + SAVE_CITY
			+ ": Save the table of  city information to a file\n" + "   " + ADD_ROW_CITY
			+ ": Add a new entry to the city table\n" + "   " + REMOVE_ROW_CITY
			+ ": Remove an entry from the city table\n" + "   " + FIND_ROW_CITY
			+ ": Find city information by city identifier\n\n" + " Stadium Table Commands:\n" + "   " + LOAD_STADIUM
			+ ": Load a table of stadium information from a file\n" + "   " + SAVE_STADIUM
			+ ": Save the table of stadium information to a file\n" + "   " + ADD_ROW_STADIUM
			+ ": Add a new entry to the stadium table\n" + "   " + REMOVE_ROW_STADIUM
			+ ": Remove an entry from the stadium table\n" + "   " + FIND_ROW_STADIUM
			+ ": Find stadium information by stadium identifier\n\n" + "   " + JOIN
			+ ": Combine a table of cities and stadiums that share city ID\n\n" + "   " + QUIT + ": Quit\n";

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Jennifer Swofford");
		JOptionPane.showMessageDialog(null, welcomeMessage);
		CityTable cityInfo = new CityTable();
		StadiumTable stadiumInfo = new StadiumTable();

		int userSelection = 0;
		while (userSelection != QUIT) {

			userSelection = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
			if (userSelection < 6) {
				processSelectionCity(cityInfo, userSelection);
			}

			else if (userSelection >= 6 && userSelection < 11) {
				processSelectionStadium(stadiumInfo, userSelection);
			} else if (userSelection >= 11) {
				processSelectionJoin(stadiumInfo, cityInfo, userSelection);
			}
		}
	}

	private static void processSelectionCity(CityTable mytable, int userSelection) throws FileNotFoundException {
		switch (userSelection) {
		case LOAD_CITY:
			String fileName = JOptionPane.showInputDialog("Please enter the name of the text file to load");
			System.out.println("Opening the file '" + fileName + "'.");
			mytable.loadTableFromFile(fileName);
			break;
		case SAVE_CITY:
			fileName = JOptionPane.showInputDialog("Please enter the name of the text file to which to save");
			mytable.saveTable(fileName);
			break;
		case ADD_ROW_CITY:
			String city = JOptionPane.showInputDialog("Please enter the name of the city you want to add to the table");
			String cityId = JOptionPane.showInputDialog("Please enter the ID for " + city);
			String population = JOptionPane.showInputDialog("Please enter the population for " + city);
			mytable.addRow(city, cityId, population);
			break;
		case REMOVE_ROW_CITY:
			cityId = JOptionPane
			.showInputDialog("Please enter the city identifier for the row you want to remove from the table");
			mytable.removeRow(cityId);
			break;
		case FIND_ROW_CITY:
			cityId = JOptionPane.showInputDialog("Please enter the city identifier of the city you want to find.");
			// int intId = Integer.parseInt(cityId);
			JOptionPane.showMessageDialog(null, mytable.findRow(cityId));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}

	private static void processSelectionStadium(StadiumTable mytable, int userSelection) throws FileNotFoundException {
		switch (userSelection) {
		case LOAD_STADIUM:
			String fileName = JOptionPane.showInputDialog("Please enter the name of the text file to load.");
			System.out.println("Opening the file '" + fileName + "'.");
			mytable.loadTableFromFile(fileName);
			break;
		case SAVE_STADIUM:
			fileName = JOptionPane.showInputDialog("Please enter the name of the text file to which to save");
			mytable.saveTable(fileName);
			break;
		case ADD_ROW_STADIUM:
			String stadiumName = JOptionPane
			.showInputDialog("Please enter the name of the stadium you want to add to the table");
			String cityId = JOptionPane.showInputDialog("Please enter the City ID for " + stadiumName);
			String teamName = JOptionPane.showInputDialog("Please enter the team that plays at " + stadiumName);
			String capacity = JOptionPane.showInputDialog("Please enter the total capcity for " + stadiumName);
			mytable.addRow(stadiumName, cityId, teamName, capacity);
			break;
		case REMOVE_ROW_STADIUM:
			cityId = JOptionPane.showInputDialog(
					"Please enter the city identifier of the stadium you want to remove from the table");
			mytable.removeRow(cityId);
			break;
		case FIND_ROW_STADIUM:
			cityId = JOptionPane.showInputDialog("Please enter the city identifier of the stadium you want to find.");
			JOptionPane.showMessageDialog(null, mytable.findRow(cityId));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}

	private static void processSelectionJoin(StadiumTable myTable1, CityTable myTable2, int userSelection)
			throws FileNotFoundException {
		switch (userSelection) {
		case JOIN:
			JOptionPane.showMessageDialog(null, "Attempting to join tables..");
			myTable2.joinTables(myTable1);
			break;
		case QUIT:
			JOptionPane.showMessageDialog(null, "Have a nice day");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}
}
