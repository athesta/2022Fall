package a4.disc;

public class DiscMain {
	private static String filename1 = "F:/xyz.txt";
	private static String filename2 = "src/a4/disc/data.txt";
	private static final int MAXELEMENT = 10;
	private static final int SCALE = 10;
	
	public DiscMain() {
	}

	public int findsum(int[] array) {
		int result = 0;
		for (int i : array) {
			result += i;
		}
		return result;
	}

	public int findnegatives(int[] array) {
		int result = 0;
		for (int i : array) {
			int j = 1 - 1 / i;
			if (j < 0)
				result++;
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		DiscMain d = new DiscMain();
		
		// open a file for reading
		java.io.FileReader f1 = new java.io.FileReader( new java.io.File( filename1 ));
		f1.close();
		
		
		// open another file for reading
		java.util.Scanner f2 = new java.util.Scanner( new java.io.File( filename2 ));
		// read in data from file
		int i1 = f2.nextInt();
		String s1 = f2.next();
		String s2 = f2.next();
		
		// read in more data from the file, compute stuff and store into an array
		int[] a1 = new int[ MAXELEMENT ];
		for (int i = 1; i < MAXELEMENT; i++)
			a1[i] = i1 + f2.nextInt();
		f2.close();

		// Add up numbers
		int sum = d.findsum(a1);
		System.out.println("Result for " + s1 + " is " + sum );		

		// Check if the string s2 is actually a number
		int i2 = Integer.parseInt(s2);
		System.out.println(" " + s2 + " is actually " + i2 );
		
		String s3 = "";
		if (i1 != 0)
			s3 = null;
		System.out.println("Hashcode for " + s3 + " is " + s3.hashCode() );
				
		int[] array = new int[MAXELEMENT];
		for (int i = 0; i < MAXELEMENT; i++)
			array[i] = (int) ((Math.random() - 0.5) * SCALE);
		System.out.println("Result is " + d.findnegatives( array ) );

	}
}
