package edu.uwex.apc390.lesson1_2;

public class FinalVariables {

	private static int test( int x) {
		x = 1;
		return x + 10;
	}

	private static int testfinal( final int x) {
		return x + 10;
	}

	public static void main(String[] args) {
		int p = 20, q = 20;
		int r = test( p );
		int s = testfinal( q );
		System.out.println(" p is " + p + ", q is " + q + ", r is " + r + ", and s is " + s );
	}

}
