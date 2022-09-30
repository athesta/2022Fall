package as2;
import java.io.PrintStream;
public class Cast {
	static PrintStream syso = System.out;
	public static void main(String[] args) {
		syso.println("Jennifer Swofford"); 
		int seasonf = 1;
		int season2 = 2;
		Role  r1 = new Role("Leslie Knope", "Amy Poehler",   seasonf);
		Role  r2 = new Role("Ron Swanson",  "Nick Offerman", seasonf);
		Role  r3 = new Role("Ben Wyatt",    "Adam Scott",    season2);

		//syso.println(r1);
		// syso.println(r2);
		// syso.println(r3);
		
		CastList fullCast = new CastList();
		//CastList [] arrayThing = new CastList[3];
		//arrayThing[0] = new CastList(null);
		//fullCast.addRoletoList("Leslie Knope", "Amy Poehler", season2);
		fullCast.addRoletoList(r1.getName(), r1.getActor().getName(), r1.getStartseason());
		System.out.println(fullCast);
		fullCast.addRoletoList("Ron Swanson",  "Nick Offerman", seasonf);
		System.out.println(fullCast);
		fullCast.addRoletoList("Ben Wyatt",    "Adam Scott",    season2);
		System.out.println(fullCast);
		fullCast.addRoletoList("Ben Wyatt",    "Adam Scott",    season2);
		System.out.println(fullCast);
		fullCast.addRoletoList("Ben Wyatt",    "Adam Scott",    season2);
		System.out.println(fullCast);
		fullCast.addRoletoList("Ben Wyatt",    "Adam Scott",    season2);
		//System.out.println(Arrays.toString(fullCast));
		System.out.println(fullCast);
		
		
	}

}
