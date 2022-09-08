package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax4 - Arrays.
 */
public class JavaSyntax4 {
	public static void main(String[] args) {
		// An array of primitive data types
		int[] a = new int[3];
		a[0] = 10;
		a[1] = -5;
		a[2] = 2;

		// An array of reference data types
		Count[] counts = new Count[3];
		counts[0] = new Count(10);
		counts[1] = new Count(-5);
		counts[2] = new Count( 2);
		
	}
}
