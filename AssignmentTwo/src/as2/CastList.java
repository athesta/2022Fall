package as2;

public class CastList {

	/*
	 * Data Members
	 */

	private Role[] roles = new Role[5];
	private int roleCount = 0;

	/*
	 * Constructors
	 */

	public CastList() {

	}

	public CastList(Role[] arrayofRoles) {
		for (int i = roleCount; i < roles.length; i++)
			this.roles[i] = arrayofRoles[i];
	}

	/*
	 * Methods
	 */

	// Adds a role to the cast
	public void addRole(Role newRole) {
		try {
			roles[roleCount] = newRole;
			roleCount++;
		} catch (java.lang.ArrayIndexOutOfBoundsException fnfex) {
			System.err.println("There is a limit of five cast members per cast list. Your cast list is full.");
		}
	}

	// Removes a role from the Cast List when the user indicates the role object
	// they're removing
	// Reorders the cast list to move nulls to the end of the array
	public void deleteRole(Role removeRole) {
		String roleToDelete = removeRole.toString();

		for (int i = 0; i < roleCount; i++) {
			Role removeCast = roles[i];
			String existingRole = removeCast.toString();

			if (existingRole.equals(roleToDelete)) {
				roles[i] = null;
				roleCount--;
			}
		}

		for (int j = 0; j < roles.length; j++) {
			if (roles[j] == null) {
				for (int k = j + 1; k < roles.length; k++) {
					roles[k - 1] = roles[k];
				}
				roles[roles.length - 1] = null;
				break;
			}
		}

	}

	// toString
	// Will display the Current Role Count of the entire Cast, and the full cast
	// list
	public String toString() {
		String roleInfo = "\n";
		for (int i = 0; i < roleCount; i++) {
			roleInfo += roles[i] + "\n";
		}
		return "Number of roles in the cast: " + roleCount + "\n" + roleInfo;
		// Arrays.toString(roles);

	}

}
