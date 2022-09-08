package edu.uwex.apc390.lesson1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ModularCode - Read in numbers from a file and print them in sorted order.
 * This class is a rewrite of the "HugeMain" class.
 * 
 * In this version, the code is broken up into separate tasks.
 * The advantage of doing this is to make the code more readable.
 *
 */
public class ModularCode {
	private static final int ARRAY_SIZE = 5;

	public static void main(String[] args) throws FileNotFoundException {	
		String fn = getUserFileName(); // Get the name of a file from a user

		// Read ARRAY_SIZE numbers from the file that the user specified.
		int[] numbers = readNumbersFromFile( fn, ModularCode.ARRAY_SIZE );
		
		sortNumbers( numbers ); // Sort the numbers and print them.
		System.out.println("The numbers are: " + Arrays.toString(numbers));
	}
	
	/**
	 * getUserFileName - Get the name of a file as a String from a user
	 * 
	 * The user does not have to type in the complete path or the file extension.
	 * @return name of a file as a string 
	 */
	private static String getUserFileName(){
		System.out.print("Enter the name of a file: ");
		
		Scanner console = new Scanner( System.in );
		String fn = "src/" + console.nextLine() + ".txt";
		System.out.println("Reading from " + fn);
		
		console.close();
		return fn;
	}
	
	/**
	 * readNumbersFromFile - Take file name from the user and use it to open a file
	 *    and then read SIZE numbers from that file. 
	 * @param fn
	 * @param SIZE
	 * @return array of integers
	 * @throws FileNotFoundException
	 */
	private static int[] readNumbersFromFile( String fn, final int SIZE )
			throws FileNotFoundException {
		// Set up a correctly sized array
		int[] result = new int[SIZE];
		
		// Get ready to read from the file.
		File file = new File(fn);
		Scanner fileIn = new Scanner(file);
		
		int n = 0;
		// Keep reading while the file has more numbers and 
		//   we have not filled the array.
		while ( fileIn.hasNext() && n < SIZE) {
			// Read in the number as a String and convert it to an int
			String s = fileIn.nextLine();
			result[n] = Integer.parseInt(s);
			
			// Print out each number read
			System.out.println( "  " + result[n] );
			n++;
		}
		fileIn.close();

		return result;
	}

	/**
	 * sortNumbers - sort the numbers in the the input array
	 * @param numbers
	 */
	private static void sortNumbers( int[] numbers ) {
		final int N = numbers.length;
		
		// Scan the entire array
		for (int i=0; i<N; i++) {
			// If any two numbers are not in the right order, swap them.
			for (int j=1; j<(N-i); j++) {
				int previous = numbers[j-1];
				int current  = numbers[j];
				if (previous > current) {
					numbers[j-1] = current;
					numbers[j]   = previous;
				}
			}
		}
	}
}
