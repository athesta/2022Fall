package edu.uwex.apc390.lesson1_3;

/*
 * TriangleB - stores the integer coordinates of a triangle and computes its area
 */
public class TriangleB {
	private int Ax, Ay, Bx, By, Cx, Cy;
	public TriangleB( int Ax, int Ay, int Bx, int By, int Cx, int Cy ) {
		this.Ax = Ax;
		this.Ay = Ay;
		this.Bx = Bx;
		this.By = By;
		this.Cx = Cx;
		this.Cy = Cy;
	}
	public float areaOfTriangle( ) {
		float temp = Ax * (By - Cy) +
					 Bx * (Cy - Ay) +
					 Cx * (Ay - By);
		return Math.abs( temp );
	}

	public int getAx() {
		return Ax;
	}
	public int getAy() {
		return Ay;
	}
	public int getBx() {
		return Bx;
	}
	public int getBy() {
		return By;
	}
	public int getCx() {
		return Cx;
	}
	public int getCy() {
		return Cy;
	}
}
