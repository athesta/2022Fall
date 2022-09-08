package edu.uwex.apc390.lesson1_3;

/*
 * RefactorDDone - this code is a refactored version of RefactorD
 *               - we made the scopes of variables smaller.
 */
public class RefactorDDone {
	public static void main(String[] args) {
		int size = 1;
		System.out.println("Starting size is " + size );
		size = modify( size );
		System.out.println(" The size is now " + size );
		size = modify( size );
		System.out.println(" The size is now " + size );
	}
	private static int modify(final int input) {
		if (input > 3) {
			final int CHECK = 17;
			return input + CHECK;
		} else 
			return 10;
	}
}
