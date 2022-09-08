package edu.uwex.apc390.lesson1_1;

import java.time.Year;

//Indenting like this is much better - easier to read!

public class GoodIndenting {
	public static void main(String[] args) {
		int year = Year.now().getValue();
		System.out.print("The year is: " + year);
		if ( year % 4 == 0 )
			System.out.println(" and this is a leap year!");
		else
			System.out.println(" and this is not a leap year!");
	}
}
