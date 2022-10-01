package as2;

import java.io.PrintStream;

public class Cast {
	static PrintStream syso = System.out;

	public static void main(String[] args) {
		syso.println("Jennifer Swofford");
		int seasonf = 1;
		int season2 = 2;
		Role r1 = new Role("Leslie Knope", "Amy Poehler", seasonf);
		Role r2 = new Role("Ron Swanson", "Nick Offerman", seasonf);
		Role r3 = new Role("Ben Wyatt", "Adam Scott", season2);

		// instantiate the Cast List for TV Show Parks & Rec
		CastList parksAndRec = new CastList();

		// Adds the 3 roles to the Cast List
		parksAndRec.addRole(r1);
		parksAndRec.addRole(r2);
		parksAndRec.addRole(r3);

		// Prints out the CastList
		syso.println(parksAndRec);

		/*
		 * Some Additional testing I did to fill the array, overflow the array, delete a
		 * role, and add a new role to the list after deleting.
		 */
//		Role r4 = new Role("April Ludgate", "Aubrey Plaza", seasonf);
//		Role r5 = new Role("Harris", "Harris Wittels", season2);
//		Role r6 = new Role("Tom Haverford", "Aziz Ansari", seasonf);
//		parksAndRec.addRole(r4);
//		parksAndRec.addRole(r5);
//		parksAndRec.addRole(r6); // Overflow the array to show error handling of addRole
//		syso.println("\n\n" + parksAndRec);
//		parksAndRec.deleteRole(r2);// Remove role from middle of the cast list
//		syso.println(parksAndRec); // Print list post-deletion//
//		parksAndRec.addRole(r6);
//		syso.println("\n\n" + parksAndRec); // Print list after adding another role

	}

}
