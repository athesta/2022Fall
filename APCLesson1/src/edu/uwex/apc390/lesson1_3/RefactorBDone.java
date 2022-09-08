package edu.uwex.apc390.lesson1_3;

/*
 * RefactorBDone - this code is a refactored version of RefactorA
 *               - In addition to descriptive names, we replaced a "magic number"
 */
public class RefactorBDone {
	private static float computeArea(float radiusCircle) {
		float areaCircle = (float) Math.PI * radiusCircle * radiusCircle;
		return areaCircle;
	}
	public static void main(String[] args) {
		float radius = 7.1f;
		float area   = computeArea( radius );
		System.out.println("The area of a circle with radius " + radius + " is " + area );
	}
}
