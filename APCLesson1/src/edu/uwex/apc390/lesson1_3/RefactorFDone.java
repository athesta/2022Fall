package edu.uwex.apc390.lesson1_3;

/*
 * RefactorFDone - this code is a refactored version of RefactorE using TriangleB
 *               - we made the areaOfTriangle method a method in TriangleB!
 */
public class RefactorFDone {
	public static void main(String[] args) {
		TriangleB t = new TriangleB(15, 15, 23, 30, 50, 25);
		float area = t.areaOfTriangle();
		System.out.println("Area of our triangle is: " + area );
	}
}