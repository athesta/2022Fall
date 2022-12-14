package a6.disc;

import java.util.*;


class ARow { //city row
	private String name;
	private int zip;
	public ARow(String n, int z) {
		name = n;
		zip  = z;
	}
	public String getName() {
		return name;
	}
	
	public int getZip() {
		return zip;
	}
	
}

class BRow { //stadium row
	private String name;
	private int    area;
	public BRow(String n, int a) {
		name = n;
		area = a;
	}
	public String getName() {
		return name;
	}
	
	public int getArea() {
		return area;
	}
	
}

class CRow { //citystadium row
	private String name;
	private int    zip;
	private int    area;
	public CRow(String n, int z, int a) {
		name = n;
		zip  = z;
		area = a;
	}
	
	public String toString() {
		return name + " " + zip + " " + area;
		}
	
}

public class A6Disc {

	public static void main(String[] args) {
		// Set up Table a
		List<ARow> a = new ArrayList<>(); //city table
		/* Table a stores zip codes:
		 *   Adell	53001
		 *   Clyman	53016
		 *   Lomira	53048
		 */
		a.add( new ARow("Adell",  53001 ));
		a.add( new ARow("Clyman", 53016 ));
		a.add( new ARow("Lomira", 53048 ));
		
		// Set up Table b
		List<BRow> b = new ArrayList<>(); //stadium table
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
		
		Map<String, BRow> bmap = new HashMap<>(); //stadium map <String, StadiumRow>

		for (BRow br : b) {//stadium row/stdaium table
			for (ARow ar : a) {//city row/city table
				if (br.getName().compareTo(ar.getName()) == 0) {
					bmap.put(br.getName(), br);
				}
			}
		}
		
		// Do a join
		
		/*
		 * Output should be Table a JOIN Table b:
		 *   Adell	53001	920
		 *   Clyman	53016	921
		 */
		// Ready for the join
		List<CRow> c = new ArrayList<>();
		for(ARow ar : a){
		     if(bmap.containsKey(ar.getName())) {
		          c.add(new CRow(ar.getName(), ar.getZip(), bmap.get(ar.getName()).getArea()));
		     }
		}
		
		System.out.println( "Join is: ");
		for (CRow cr:c) {
			System.out.println(cr);
		}
	}

}
