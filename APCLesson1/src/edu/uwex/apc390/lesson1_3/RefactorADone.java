package edu.uwex.apc390.lesson1_3;

/*
 * RefactorADone - this code is a refactored version of RefactorA
 *               - We used descriptive names.
 */
public class RefactorADone {
	private static float computeArea(float radiusCircle) {
		float areaCircle = 3.1415f * radiusCircle * radiusCircle;
		return areaCircle;
	}
	public static void main(String[] args) {
		float radius = 7.1f;
		float area   = computeArea( radius );
		System.out.println("The area of a circle with radius " + radius + " is " + area );
	}
}
