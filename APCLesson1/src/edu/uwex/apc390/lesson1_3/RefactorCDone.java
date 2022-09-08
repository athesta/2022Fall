package edu.uwex.apc390.lesson1_3;

/*
 * RefactorCDone - this code is a refactored version of RefactorA
 *               - In addition to descriptive names and replacing a "magic number",
 *               -  we made variables and method parameters "final"
 */
public class RefactorCDone {
	private static float computeArea(final float radiusCircle) {
		final float areaCircle = (float) Math.PI * radiusCircle * radiusCircle;
		return areaCircle;
	}
	public static void main(String[] args) {
		final float radius = 7.1f;
		final float area   = computeArea( radius );
		System.out.println("The area of a circle with radius " + radius + " is " + area );
	}
}
