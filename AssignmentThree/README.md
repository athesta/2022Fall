# Requirements

## Purpose

In this assignment, we will look at handling two kinds of tables stored in text files. We will use a class for each kind of table. Because there will be similarities between these two classes, we will use an abstract class to represent those things that are common to the two. We will use inheritance, polymorphism, and abstract classes in this assignment.

Your objective is to be able to write a Java program that can:

* Read a table of data from a file with comma separated values
* Store the table in an array of row objects in memory
* Store a table of row objects into a file so that the file can be read back in
* Add new rows to an existing array of rows
* Search for a row in an array of rows, remove an existing row from an array
* Use inheritance, polymorphism, and abstract classes

## Instructions

Start with your Assign1Main.java file from Assignment #1 or use the starter file provided in that assignment. This class has a main method which is where your program execution should start.

Rename the class Assign3Main and change the file name to match the new class name. Put this file in a new package named “a3”.

Make sure the Assign3Main class prints out your name using System.out when the program runs; it should be the first thing your program should print when it starts.

Look at the material on Inheritance (Lesson 3), Polymorphism (Lesson 4) and Abstract Classes (Lesson 5).

## Your Tasks

Create six new classes in the a3 package:
* An abstract class named AbstractTable
* Concrete classes, CityTable and StadiumTable, that each extend AbstractTable
* Another abstract class named AbstractRow
* Concrete classes named CityRow and StadiumRow that each extend AbstractRow

Keep reading for more details.

## Implementation Details

Refactor the main method in Assign3Main.java to use some of these new classes instead of TextTable.

### City Table/Stadium Table

Modify your program to be able to read two types of files: City table files or Stadium table files depending on what the user wants to do.
* A City table file should have this structure:

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; `My Cities: City, city id, population in millions`

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  `Philadelphia, 23, 1.58`

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; `San Antonio, 24, 1.57`

*   &nbsp; Note that, as in Assignment 1, the first line has header information. After that first line, each line contains details regarding a single city including the city name, an integer for the city id, and a floating point number representing the city population in millions separated by commas.

* A Stadium table file should have this structure:

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; `Stadiums: Stadium name, City id, Team name, capacity`

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  `Mercedes-Benz Stadium, 21, Atlanta United, 	71000`

&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; `Gillette Stadium,	20,	Revolution,	68756`

* &nbsp; As with the city table, the first line has header information. After that first line, each line contains details regarding a single stadium including the name of the stadium, a city id, the name of the city, and a number representing the stadium capacity separated by commas.

* Sample cities.txt and stadia.txt files are provided.  We can assume there will be a maximum of 101 lines in any input file.

### Program Details

Our program should allow the user to: 

* Keep track of one city table and one stadium table at all times
* Load a file like the ones provided (make sure to try your program out on files you create yourself).
* Save the current city or stadium table (including the header) to a file the user specifies. Note that we should be able to read back any file that we save to.
* Add a new line to an existing table or an empty table
* Remove an entire existing row in a table with the row chosen based on the city id.
* Check the table if data exist for a particular city id

### Classes

Each class should be in a separate .java file. Add comments at the top of each .java file showing your name and email.

The general idea of the Table and Row classes is the same as Assignment #1 except that we will need a `CityTable` class, a `StadiumTable` class and an `AbstractTable` class with all the common features. 

Your `AbstractTable` class should have these **data members**:

* A `private` String data member: for the header information – a single line.
* A `private` data member: an array of 100 AbstractRow objects.
* A `private` data member: an int that tracks how many of the 100 locations in the array are occupied.

And these `public abstract` **methods**:

* `void loadTableFromFile(String fileName)`
* `void saveTable(String fileName)`

Each of your concrete Table classes will need the following `public` **methods**:

* `void addRow( … )` to create a new Row from the inputs and add it to the array
* `void removeRow( … )` to find a row whose id matches the input and remove it from the array; then move all the Row objects that come after it up one place in the array.
* `String findRow( … )` to look for a row with the matching input id and return a String representation of the row.

Your `AbstractRow` class should have at least one `public abstract` equals method that should be overridden in the concrete Row classes `CityRow` and `StadiumRow`.

Each of your concrete Row classes will need:

* `private` data members to represent the contents of each row in an input file
* `public` constructors and one or more equals methods.

Include explanations of which methods you chose to make abstract in a TestResults file (more details below).

## Testing Your Code

Test your code with different text files you create on your own with:

* Different sets of words
* Different number of lines
* Boundary conditions such as an empty file

## Submission Instructions

Once you are done with the assignment, submit a single .jar file containing:

* All source code (.java files) needed for the program to work
* Input files needed to test the program
* A TestResults file

This will be one .jar file, but within that, each class should be in a separate .java file. Add comments at the top of each .java file showing your name and email.