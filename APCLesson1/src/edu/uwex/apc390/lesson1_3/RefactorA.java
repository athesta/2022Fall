package edu.uwex.apc390.lesson1_3;

/*
 * RefactorA - this code is not bad but we can make it better
 */
public class RefactorA {
	private static float computeArea(float radius) {
		float y = 3.1415f * radius * radius;
		return y;
	}
	public static void main(String[] args) {
		float rad = 7.1f;
		float ar  = computeArea( rad );
		System.out.println("The area of a circle with radius " + rad + " is " + ar );
	}
}
