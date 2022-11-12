package a5;

public class FileExtensionException extends Exception {
	
	private String fileName;

	public FileExtensionException() {
		super();
		this.fileName = "FileName.txt";
	}

	public FileExtensionException(String usersInputFileName) {
		super("You entered an invalid filename: "+ usersInputFileName
				+ "\n\nTo save a table to a file, you must include the file name and file extension."
				+ "\nFile names should only contain a single '.' to separate the file name from the file extension."
				+"\n     Example: FileName.txt");
		this.fileName=usersInputFileName;
		printStackTrace();
	}
	
	

}
