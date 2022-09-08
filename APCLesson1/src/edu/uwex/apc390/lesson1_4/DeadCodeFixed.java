package edu.uwex.apc390.lesson1_4;

public class DeadCodeFixed {
	private static final int BIG = 100;
	public static void main(String[] args) {
		int number = 10;
		if (isBig(number))
			System.out.println(" " + number + " is big!" );
		
	}

	private static boolean isBig(int number) {
		return (number > BIG);
	}
}
