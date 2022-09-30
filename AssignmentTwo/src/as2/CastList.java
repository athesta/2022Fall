package as2;

public class CastList {
	
	//Data Members
	private Role[] roles;
	
	public CastList() {
		 roles = new Role[5];
	}
	
	//methods
	public void addRoleToCast(Role [] r) {
		
	}
	
	
	
	//ToString
	public String toString() {
		String roleInfo = null;
		for (Role r: roles) 
			if (r != null)
			roleInfo = r +"\n";	
		return roleInfo;
	}
}
