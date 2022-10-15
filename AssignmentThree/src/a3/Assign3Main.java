package a3;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;


/**
 * <p> Title: APC 390 Assignment #3</p>
 * <p> Description: Interactive Table builder. Assign3Main
 *     - modifying Assign1Main to use inheritance, polymorphism, & abstract classes </p>
 * <p> Copyright: Copyright (c) 2021 </p>
 * <p> Company: UWRF </p>
 * 
 * @author Anthony Varghese
 * @version 1.0
 * 
 * @author Jennifer Swofford
 * swoffordj@uwplatt.edu
 * 
 */



public class Assign3Main {
	static final int LOAD_CITY = 1, SAVE_CITY = 2, ADD_ROW_CITY = 3, REMOVE_ROW_CITY = 4, FIND_ROW_CITY = 5, LOAD_STADIUM = 6, SAVE_STADIUM = 7, ADD_ROW_STADIUM = 8, REMOVE_ROW_STADIUM = 9, FIND_ROW_STADIUM = 10, QUIT = 11;

	static final String welcomeMessage = "This program implements an interactive table builder.\n"
			+ "You can add new rows or remove rows from tables.\n"
			+ "You can also load a table from a file or save a current\n"
			+ "table to a file.\n";
	static final String promptMessage = "What would you like to do?\n"
			+ "Please enter the number corresponding to the action you would like:\n"
			+ "   " + LOAD_CITY + ": Load a City table from a file\n"
			+ "   " + SAVE_CITY + ": Save current City table to a file\n"
			+ "   " + ADD_ROW_CITY + ": Add a row to the City table\n"
			+ "   " + REMOVE_ROW_CITY + ": Remove a row from the City table\n"
			+ "   " + FIND_ROW_CITY + ": Find a City table row\n"
			+ "   " + LOAD_STADIUM + ": Load a Stadium table from a file\n"
			+ "   " + SAVE_STADIUM + ": Save current Stadium table to a file\n"
			+ "   " + ADD_ROW_STADIUM + ": Add a row to the Stadium table\n"
			+ "   " + REMOVE_ROW_STADIUM + ": Remove a row from the Stadium table\n"
			+ "   " + FIND_ROW_STADIUM + ": Find a Stadium table row\n"
			+ "   " + QUIT + ": Quit\n";

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Jennifer Swofford");
		JOptionPane.showMessageDialog(null, welcomeMessage);
		CityTable cityInfo = new CityTable();
		StadiumTable stadiumInfo = new StadiumTable();

		int userSelection = 0;
		while (userSelection != QUIT) {
					
			userSelection = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
			if (userSelection<6 ) {	
			processSelectionCity(cityInfo, userSelection);}
			
			else if (userSelection>=6) {
				processSelectionStadium(stadiumInfo, userSelection);
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
			String city = JOptionPane.showInputDialog("Please enter the city you want to add to the table");
			String cityId = JOptionPane.showInputDialog("Please enter the ID for " + city);
			String population = JOptionPane.showInputDialog("Please enter the population for " + city);
			mytable.addRow(city, cityId, population); 
			break;
		case REMOVE_ROW_CITY:
			city = JOptionPane
					.showInputDialog("Please enter the city name in the row you want to remove from the table");
			mytable.removeRow(city); 
			break;
		case FIND_ROW_CITY:
			cityId = JOptionPane.showInputDialog("Please enter the City Id in the row you want to find.");
			JOptionPane.showMessageDialog(null, mytable.findRow(cityId)); 
			break;
		//case QUIT:
			//JOptionPane.showMessageDialog(null, "Have a nice day");
			//break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}

	private static void processSelectionStadium(StadiumTable mytable, int userSelection) throws FileNotFoundException {
		switch (userSelection) {
		case LOAD_STADIUM:
			String fileName = JOptionPane.showInputDialog("Please enter the name of the text file to load");
			System.out.println("Opening the file '" + fileName + "'.");
			mytable.loadTableFromFile(fileName);
			break;
		case SAVE_STADIUM:
			fileName = JOptionPane.showInputDialog("Please enter the name of the text file to which to save");
			mytable.saveTable(fileName);
			break;
		case ADD_ROW_STADIUM:
			String stadiumName = JOptionPane.showInputDialog("Please enter the Stadium Name you want to add to the table");
			String cityId = JOptionPane.showInputDialog("Please enter the City ID for " + stadiumName);
			String teamName = JOptionPane.showInputDialog("Please enter the team that plays at " + stadiumName);
			String capacity = JOptionPane.showInputDialog("Please enter the total capcity for " + stadiumName);
			mytable.addRow(stadiumName, cityId, teamName, capacity); 
			break;
		case REMOVE_ROW_STADIUM:
			stadiumName = JOptionPane
					.showInputDialog("Please enter the Stadium Name you want to remove from the table");
			mytable.removeRow(stadiumName); 
			break;
		case FIND_ROW_STADIUM:
			cityId = JOptionPane.showInputDialog("Please enter the City Id for the Stadium(s) you want to find.");
			JOptionPane.showMessageDialog(null, mytable.findRow(cityId)); 
			break;
		case QUIT:
			JOptionPane.showMessageDialog(null, "Have a nice day");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}
	
}
