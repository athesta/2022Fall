package edu.uwex.apc390.lesson1_3;

/*
 * RefactorE - this code computes the area of a triangle. We can make it better
 */
public class RefactorE {
	private static float areaOfTriangle(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
		float temp = Ax * (By - Cy) +
				     Bx * (Cy - Ay) + 
				     Cx * (Ay - By);
		return Math.abs( temp );
	}
	public static void main(String[] args) {
		TriangleA t = new TriangleA(15, 15, 23, 30, 50, 25);
		float area = areaOfTriangle( t.getAx(), t.getAy(),
									 t.getBx(), t.getBy(),
									 t.getCx(), t.getCy());
		System.out.println("Area of our triangle is: " + area );
	}
}