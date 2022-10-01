package as2;

public class Actor {
	
	//Data Members
	private String name;
	
	//Constructor
	public Actor( String n){
		name = n;
	}
	
	//Methods
	
	//toString prints out the actor name in the following format:
	//Actor [name = Amy Poehler]
	public String toString() {
		return "Actor [name=" + name + "]";
	}

	
}
