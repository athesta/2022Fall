package as2;

public class Role {
	//Data Members
	private String name;
	private Actor  actor;
	private int    startseason;
	
	//Constructor
	public Role( String n, String a, int start){
		name = n;
		actor = new Actor( a );
		startseason = start;
	}
	
	//Methods
	 
	
	//toString prints out the role information in the following format:
	//Role [name=RoleFirstName RoleLastName, season number Actor[name=ActorFirstName ActorLastName]]
	//ex: Role [name=Ben Wyatt, 2 Actor [name=Adam Scott]]
	public String toString() {
		return "Role [name=" + name + ", " + startseason + " " + actor +  "]";
	}
}
