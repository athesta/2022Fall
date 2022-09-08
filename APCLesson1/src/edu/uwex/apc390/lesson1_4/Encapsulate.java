package edu.uwex.apc390.lesson1_4;

class Person {
	private String name;

	public Person(String name) {
		super();
		setName( name );
	}
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Encapsulate {
	public static void main(String[] args) {
		Person p = new Person ("Penny");
		System.out.println(" p is " + p );
		// ...
		somemethod();
		// ... 
		System.out.println(" p is " + p );
	}

	private static void somemethod() {
		//p.setName("Jan");
	}

}
