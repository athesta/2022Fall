package edu.uwex.apc390.lesson1_2;

/**
 * JavaSyntax1 - Primitive data types and Reference data types.
 *
 */
public class JavaSyntax1 {

	public static void main(String[] args) {
		// ints are primitive data types
		int i = 5;
		int j = i;
		System.out.println( "i is " + i + " and j is " + j );
		// increment i and check the values in i and j
		i = i + 1;
		System.out.println( "After incrementing i, i is " + i + " and j is " + j );
		
		// An instance of Count is an object - a reference data type
		Count c = new Count( 5 );
		Count d = c;
		System.out.println( "c is " + c + " and d is " + d );
		// increment c and check the values in c and d
		// Unlike with ints, c and d refer to the same object.
		c.increment();
		System.out.println( "After incrementing c, c is " + c + " and d is " + d );
	}

}
