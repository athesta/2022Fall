package a4;

public class InvalidFileStructureException extends Exception{
	private String fileName;
	private int columnCount;
	private String fileType;
	
	public InvalidFileStructureException() {
		super();
		this.fileName = "FileName.txt";
		this.columnCount = 0;
		this.fileType = "City or Stadium";
		
		
	}

	public InvalidFileStructureException(String usersFile, int tableColumns, String fileType) {
			
		super("Your menu selection indicates you are working with a " + fileType + " file."
				+ "\nThe "+ usersFile + " is either not a " + fileType + " file or has formatting issues that need to be addressed."
				
				+ "\n\n Proper Formattings for a " + fileType + " file:"
				+ "\n     A table header is present in the first row."
				+ "\n     The table row data begins on line 2 of the file. There is no blank rows between the header & the table rows."
				+ "\n     The table rows are represented by a string of " + tableColumns + " elements."
				+ "\n     The " + tableColumns + " elmements are separated by a comma and a space. (Example: element1, element2,...)"
				+ "\n\n***NOTE: If you did not intend to work with a " + fileType + " file, please select the appropriate menu option.***"
				
				);
		this.fileName=usersFile;
		this.columnCount = tableColumns;
		this.fileType=fileType;
		printStackTrace();
	}



}
