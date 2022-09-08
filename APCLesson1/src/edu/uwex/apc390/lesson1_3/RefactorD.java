package edu.uwex.apc390.lesson1_3;

/*
 * RefactorD - this code is not bad but we can make it better
 */
public class RefactorD {
	public static int size;
	public static int check;
	public static void main(String[] args) {
		size = 1;
		System.out.println("Starting size is " + size );
		check = 17;

		if (size > 3) {
			size = size + check;
		} else 
			size = 10;

		System.out.println(" The size is now " + size );

		if (size > 3) {
			size = size + check;
		} else 
			size = 10;
		System.out.println(" The size is now " + size );
	}
}
