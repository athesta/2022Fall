package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax2 - Primitive data types: ints, floats, longs, and doubles.
 *
 */
public class JavaSyntax2 {
	public static void main(String[] args) {
		int i = 5;
		int j = i + 10;
		System.out.println( "i is " + i + " and j is " + j );
		
		long l = -22;
		long m = l + 7;
		System.out.println( "l is " + l + " and m is " + m );
		
		float f = 7.5f;
		float g = f + 1;
		System.out.println( "f is " + f + " and g is " + g );
		
		double d = -7.51;
		double e = d + 1;
		System.out.println( "d is " + d + " and e is " + e );
		
		
		f = i;
		// error if we try: i = f;
		i = (int) f;
		// error if we try: i = g;
		i = Math.round( g );

		f = i + l; // i is promoted to long to do the addition
		d = i;
		d = f + i; // i is promoted to float to do the addition
		// error if we try: f = d;
		
		d = d + l; // l is promoted to double to do the addition
		// error if we try: g = e;
		// error if we try: j = Math.round( d );		
		j = Math.round( (float) d );		
		m = Math.round( d + e );
		
		System.out.println( "After conversions: " );
		System.out.println( "   i is " + i + " and j is " + j );
		System.out.println( "   l is " + l + " and m is " + m );
		System.out.println( "   f is " + f + " and g is " + g );
		System.out.println( "   d is " + d + " and e is " + e );

		Float fo = Float.valueOf( f ); // Convert f to an object.
		System.out.println( "\n   The Float object fo has the value " + fo );
	}
}
