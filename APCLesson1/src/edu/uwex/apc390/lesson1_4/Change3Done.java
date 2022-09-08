package edu.uwex.apc390.lesson1_4;

public class Change3Done {
	private static String[] counts = { "First", "second" };
	public static void main(String[] args) {
		for (int i=0; i<args.length; i++)
			System.out.println( print2args( args, i, counts ) );
		System.out.println("done!");
	}
	private static String print2args(String[] a, int index, String[] counts) {
		if ( ( index > (counts.length-1)) && (a[index] != null) )
		    return "  ... ";
		else
			return "  " + counts[index] + " arg is " + a[index];
	}
}
