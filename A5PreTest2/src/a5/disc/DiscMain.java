package a5.disc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class DiscMain {
	public static void main(String[] args) {
		System.out.println("A5 Discussion ...");
		Integer i1 = 2000;
		Integer i2 = 3005;
		String  s1 = "This is not a number";
		String  s2 = "4003";
		
		Vector mylist = new Vector();
		mylist.add( i1 );
		mylist.add( i2 );
		mylist.add( s1 );
		mylist.add( s2 );
		mylist.add( i1 );
		mylist.add( i2 );
		mylist.add( s1 );
		mylist.add( s2 );
		
		System.out.println(" List contains:");
		for (Object o : mylist)
			System.out.println( "  " + o );
		System.out.println();
		
		
		HashSet myset = new HashSet( mylist );
		System.out.println(" Set contains:");
		for (Object o : myset)
			System.out.println( "  " + o );
		System.out.println();
		
		HashMap mymap = new HashMap();
		mymap.put(i1, s1);
		mymap.put(i2, s1);
		mymap.put(s2, i2);
		mymap.put(s1, i1);
		
		Set keys = mymap.keySet();
		System.out.println(" Map keys are:");
		for ( Object k : keys)
			System.out.println( "  " + k );
		System.out.println();
		
		System.out.println("... done!");
	}
}
