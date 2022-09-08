package edu.uwex.apc390.lesson1_3;

/*
 * RefactorEDone - this code is a refactored version of RefactorE
 *               - we made the parameter list smaller by using a class.
 */
public class RefactorEDone {
	private static float areaOfTriangle( final TriangleA t ) {
		float temp = t.getAx() * (t.getBy() - t.getCy()) +
					 t.getBx() * (t.getCy() - t.getAy()) +
					 t.getCx() * (t.getAy() - t.getBy());
		return Math.abs( temp );
	}
	public static void main(String[] args) {
		TriangleA t = new TriangleA(15, 15, 23, 30, 50, 25);
		float area = areaOfTriangle( t );
		System.out.println("Area of our triangle is: " + area );
	}
}