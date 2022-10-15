package a3;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;
import tables.*;

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
	static final int LOAD = 1, SAVE = 2, ADD_ROW = 3, REMOVE_ROW = 4, FIND_ROW = 5, QUIT = 6;

	static final String welcomeMessage = "This program implements an interactive table builder.\n"
			+ "You can add new rows or remove rows from tables.\n"
			+ "You can also load a table from a file or save a current\n"
			+ "table to a file.\n";
	static final String promptMessage = "What would you like to do?\n"
			+ "Please enter the number corresponding to the action you would like:\n"
			+ "   " + LOAD + ": Load a table from a file\n"
			+ "   " + SAVE + ": Save current table to a file\n"
			+ "   " + ADD_ROW + ": Add a row to the current table\n"
			+ "   " + REMOVE_ROW + ": Remove a row from the current table\n"
			+ "   " + FIND_ROW + ": Find a row\n"
			+ "   " + QUIT + ": Quit\n";

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Jennifer Swofford");
		JOptionPane.showMessageDialog(null, welcomeMessage);
		CityTable cityInfo = new CityTable();

		int userSelection = 0;
		while (userSelection != QUIT) {
			userSelection = Integer.parseInt(JOptionPane.showInputDialog(promptMessage));
			processSelection(cityInfo, userSelection);
		}
	}

	private static void processSelection(CityTable mytable, int userSelection) throws FileNotFoundException {
		switch (userSelection) {
		case LOAD:
			String fileName = JOptionPane.showInputDialog("Please enter the name of the text file to load");
			System.out.println("Opening the file '" + fileName + "'.");
			mytable.loadTableFromFile(fileName);
			break;
		case SAVE:
			fileName = JOptionPane.showInputDialog("Please enter the name of the text file to which to save");
			mytable.saveTable(fileName);
			break;
		case ADD_ROW:
			String city = JOptionPane.showInputDialog("Please enter the city you want to add to the table");
			String cityId = JOptionPane.showInputDialog("Please enter the ID for " + city);
			String population = JOptionPane.showInputDialog("Please enter the population for " + city);
			mytable.addRow(city, cityId, population); //fix this later mytable.addRow(number, name, value)
			break;
		case REMOVE_ROW:
			city = JOptionPane
					.showInputDialog("Please enter the name in the row you want to remove from the table");
			mytable.removeRow(); //fix this later mytable.removeRow(number)
			break;
		case FIND_ROW:
			cityId = JOptionPane.showInputDialog("Please enter the name in the row you want to find.");
			JOptionPane.showMessageDialog(null, mytable.findRow()); //fix this later JOptionPane.showMessageDialog(null, mytable.findRow(name));
			break;
		case QUIT:
			JOptionPane.showMessageDialog(null, "Have a nice day");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Invalid Input");
		}
	}
}
