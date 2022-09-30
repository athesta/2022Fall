package as2;
public class CastList {

	// Data Members
	private Role[] roles = new Role[5];
	private int roleCount = 0;

	// Constructor
	
	public CastList() {
		// for (int i = roleCount; i < roles.length; i++) {
		// 	Role roleInfo = new Role(null, null, 0);
		// 	roles[i] = roleInfo;

		// }
	}

	public CastList(Role[] bumblebees) {
		//forloop here
		this.roles[i] = bumblebees[i];
		
	}



	// methods
	public void addRoletoList(String name, String actor, int season) {
		Role addRole = new Role(name, actor, season);
		try {
			roles[roleCount] = addRole;
			roleCount++;
		} catch (java.lang.ArrayIndexOutOfBoundsException fnfex) {
			System.err.println("There is a limit of five cast members per cast list. Your cast list is full.");
		}

	}
	
	public void removeRoleFromList() {
		
	}

	// ToString
	public String toString() {
		String roleInfo = "\n";
		for (int i = 0; i < roleCount; i++) {
			roleInfo += roles[i] + "\n";
		}
		return "Current Role Count: " + roleCount + "\n" + roleInfo;
		// Arrays.toString(roles);

	}

}
