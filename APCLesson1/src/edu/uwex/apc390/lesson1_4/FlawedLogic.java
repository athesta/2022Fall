package edu.uwex.apc390.lesson1_4;

public class FlawedLogic {

	public static void main(String[] args) {
		int score = 50;
		FlawedLogic fl = new FlawedLogic();
		System.out.println(" For a score of " + score + " the grade will be " + fl.grade(score));

		score = 95;
		System.out.println(" For a score of " + score + " the grade will be " + fl.grade(score));
	}
	public String grade(int score) {
		String grade = "X";
		if (score < 60) grade = "F";
		else if (score < 70) grade = "D";
		else if (score < 80) grade = "C";
		else if (score < 90) grade = "B";
		else grade = "A";
		
		return grade;
	}
}