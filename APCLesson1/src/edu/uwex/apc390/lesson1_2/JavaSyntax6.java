package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax5 - Control flow - if and switch statements
 */
public class JavaSyntax6 {
	public static void main(String[] args) {
		int i = -2;
		int j = 9;
		System.out.println("if statements:");
		if (i > j)
			System.out.println("   i is larger than j.");
		else
			System.out.println("   i is not larger than j.");
		if (j > 0) {
			System.out.println("   j is a positive number.");
		} else if (j < 0) {
			System.out.println("   j is a negative number.");
		}

		System.out.println("switch statement:");
		switch (j - i) {
		case 0:
			System.out.println("   j and i are the same.");
			break;
		case 1:
			System.out.println("   j is one larger than i.");
			break;
		case 11:
			System.out.println("   j is larger than i by 11.");
			break;
		default:
			System.out.println("   i is " + i + " and j is " + j );
		}
	}
}