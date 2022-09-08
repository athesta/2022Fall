package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax5 - Control flow - loops
 */
public class JavaSyntax7 {
	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[2] = 75; ar[4] = -10;
		
		// Print out the elements of the array 3 different ways.
		
		System.out.println("while loop:");
		int i=0;
		while (i < ar.length)
			System.out.print("  ar[" + i + "] is " + ar[i++] + " ");

		System.out.println("\n\nfor loop:");
		for (int j=0; j<ar.length; j++) 
			System.out.print("  ar[" + j + "] is " + ar[j] + " ");
		
		System.out.println("\n\nenhanced for loop:");
		i=0; // re-initialize for next loop
		for (int x : ar)
			System.out.print("  ar[" + i++ + "] is " + x + " ");
	}
}