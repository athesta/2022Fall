package a6.disc;

import java.util.*;


class ARow {
	private String name;
	private int zip;
	public ARow(String n, int z) {
		name = n;
		zip  = z;
	}
	public String getName() {
		return name;
	}
	
}

class BRow {
	private String name;
	private int    area;
	public BRow(String n, int a) {
		name = n;
		area = a;
	}
	public String getName() {
		return name;
	}
	
	
}

class CRow {
	private String name;
	private int    zip;
	private int    area;
	public CRow(String n, int z, int a) {
		name = n;
		zip  = z;
		area = a;
	}
}

public class A6Disc {

	public static void main(String[] args) {
		// Set up Table a
		List<ARow> a = new ArrayList<>();
		/* Table a stores zip codes:
		 *   Adell	53001
		 *   Clyman	53016
		 *   Lomira	53048
		 */
		a.add( new ARow("Adell",  53001 ));
		a.add( new ARow("Clyman", 53016 ));
		a.add( new ARow("Lomira", 53048 ));
		
		// Set up Table b
		List<BRow> b = new ArrayList<>();
		/* Table b stores area codes:
		 *   Adell		920
		 *   Clyman		921
		 *   Waukesha	262
		 */
		b.add( new BRow("Adell",  920 ));
		b.add( new BRow("Clyman", 921 ));
		b.add( new BRow("Waukesha", 262 ));

		// Use a map to store elements of table b that need to be joined
		// - only add a row from b if the city name appears in a
		// Map<String,BRow> bmap = new HashMap<>();
			
		for (BRow br : b) {

		}
		
		// Do a join
		
		/*
		 * Output should be Table a JOIN Table b:
		 *   Adell	53001	920
		 *   Clyman	53016	921
		 */
		// Ready for the join
		List<CRow> c = new ArrayList<>();
		
		System.out.println( "Join is: " + c );
	}

}
