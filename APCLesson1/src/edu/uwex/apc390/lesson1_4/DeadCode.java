package edu.uwex.apc390.lesson1_4;

public class DeadCode {
	private static final int BIG = 100;
	public static void main(String[] args) {
		int number = 10;
		if (isBig(number))
			System.out.println(" " + number + " is big!" );
		
	}

	private static boolean isBig(int number) {
		if (number > BIG)
			return true;
		else
			return false;
// Dead code below: uncomment the next line to see the error:
		// System.out.println("Number is neither big nor small!");
	}
}
