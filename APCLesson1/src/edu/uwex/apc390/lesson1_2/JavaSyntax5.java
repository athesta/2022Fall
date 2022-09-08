package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax5 - Operators and expressions.
 */
public class JavaSyntax5 {
	public static void main(String[] args) {
		// Operators
		System.out.println("Java operators");
		int a = 2;
		int b = a + 5;
		System.out.println("  a is " + a + "\n  b (a + 5) is " + b);
		int c = b++ - a;
		System.out.println("  b is now "   + b + "\n  c (b++ - a) is " + c );
		int d = c / 2;
		int e = b * 3;
		System.out.println("  d (c/2) is " + d + "\n  e (b*3) is " + e );
		
		// Java operator precedence rules
		System.out.println("Java has precedence rules for operators");
		int f =  10 -  4  * 2;
		// We can force a certain order in evaluation by using parentheses
		int g =  10 - (4  * 2);
		int h = (10 -  4) * 2;
		System.out.println("  f is " + f + ", g is " + g + ", h is " + h );

		if ( (f == g) && ( f == h ) )
			System.out.println("   The order of multiplication and subtraction does not matter.");
		else
			System.out.println("   The order of multiplication and subtraction does matter.");
		if ( f == g ) {
			System.out.println("   Multiplication has higher precedence than subtraction.");
		} else if ( f == h ) {
			System.out.println("   Subtraction has higher precedence.");
		}
	}
}