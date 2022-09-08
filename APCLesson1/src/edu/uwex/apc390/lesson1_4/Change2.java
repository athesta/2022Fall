package edu.uwex.apc390.lesson1_4;

public class Change2 {
	private static String[] counts = { "First", "second" };
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++)
			print2args( args, i, counts );
		System.out.println("done!");
	}
	private static void print2args(String[] a, int index, String[] counts) {
		if ( ( index > (counts.length-1)) && (a[index] != null) )
			System.out.println( "  ... " );
		else
			System.out.println( "  " + counts[index] + " arg is " + a[index] );
	}
}
