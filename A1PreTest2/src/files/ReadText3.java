package files;

/**
 * ReadText3 - read a text file using a java.util.Scanner object
 * 
 * @author tony
 *
 */
public class ReadText3 {

	private static String input1 = "song8s.txt";

	public static void main(String[] args) {
		System.out.println("Opening the file '" + input1 + "'.");

		try {
			java.io.File file = new java.io.File(input1);
			java.util.Scanner scanner = new java.util.Scanner( file );

			String linein = "";
			while ((linein = scanner.nextLine()) != null) {
				System.out.println(linein);
			}

			scanner.close();

		} catch (java.io.FileNotFoundException fnfex) {
			System.err.println(fnfex.getMessage());
		} 
	}
}
