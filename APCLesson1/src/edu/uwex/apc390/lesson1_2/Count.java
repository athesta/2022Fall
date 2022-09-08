package edu.uwex.apc390.lesson1_2;

public class Count{
	private int count;
	public Count(int c) {
		this.count = c; 
	}
	public void increment() {
		count = count + 1; 
	}
	public String toString() {
		return "" + count; 
	}
};