package edu.uwex.apc390.lesson1_3;

/*
 * TriangleA - stores the integer coordinates of a triangle
 */
public class TriangleA {
	private int Ax, Ay, Bx, By, Cx, Cy;
	public TriangleA( int Ax, int Ay, int Bx, int By, int Cx, int Cy ) {
		this.Ax = Ax;
		this.Ay = Ay;
		this.Bx = Bx;
		this.By = By;
		this.Cx = Cx;
		this.Cy = Cy;
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
