package edu.uwex.apc390.lesson1_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * HugeMain - Read in numbers from a file and print them in sorted order.
 * This class has a wall of code in the main method - not a good way to write code.
 * 
 */
public class HugeMain {
	
	public static int[] nums = new int[5];
	
	public static void main(String[] args) throws FileNotFoundException {
		// Get the name of a file from a user
		System.out.print("Enter the name of a file: ");
		Scanner console = new Scanner( System.in );
		String fn = "src/" + console.nextLine() + ".txt";
		
		// Read 5 numbers from the file the user specified.
		System.out.println("Reading from " + fn);
		File file = new File(fn);
		Scanner fileIn = new Scanner(file);
		String s = null;
		int n = 0;
		while ( fileIn.hasNext() && n < 5) {
			s=fileIn.nextLine();
			nums[n] = Integer.parseInt(s);
			System.out.println( "  " + nums[n] );
			n++;
		}
		fileIn.close(); 
		console.close();
		
		// Sort the numbers and print them.
		for (n=0; n<nums.length; n++) {
			for (int k=1; k<(nums.length-n); k++) {
				if (nums[k-1] > nums[k]) {
					int t = nums[k-1];
					nums[k-1] = nums[k];
					nums[k]   = t;
				}
			}
		}
		System.out.println("The numbers are: " + Arrays.toString(nums));
	}
}
