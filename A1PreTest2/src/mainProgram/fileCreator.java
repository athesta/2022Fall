/*
 * Purpose
You will be building code collaboratively to practice how to use string methods. By working collaboratively, you can help each other figure out how to write programs correctly. To prepare for this discussion, it might help to review Chapter 4, (pp. 223–230).

Instructions
As a group, we will write a program to correctly read in a file containing a list of songs and write it out to another file.

A “songs.txt”  Download “songs.txt”file of the following form is supplied.
We will do this one line of code at a time.
 */

package mainProgram;

import java.io.*;
import java.util.Scanner;

import files.*;
import splittingstrings.*;

public class fileCreator {

	public static void main(String[] args)throws java.io.FileNotFoundException, java.io.IOException {
		String input = "songs.txt";
		String output = "songsout.txt";
		//String songTilte, songArtist, songLength;
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new FileReader(input));
		PrintWriter outFile = new PrintWriter(output);
		
		while (scanner.hasNextLine()) {
			outFile.println(scanner.nextLine());
		
		}
		outFile.close();	

	}

}
