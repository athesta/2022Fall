
# Purpose

Whenever we have a collection of objects, it is very likely that we may have to:

* Search for things in that collection
* Sort that collection in a way that is easy for users to view

Although the `java.util` package has sort methods, it is important for us to know how such methods work; there are times when we have to perform operations like sort that are not available in java.util.

In databases, it is common to perform a JOIN operation on two input tables to combine them in specific ways to obtain a third, larger, table. Although join operations are available in SQL databases, there are times when it is more efficient to perform such a join operation in Java. `java.util` does not have a join operation but there are classes in the `java.util` package that can help us perform a join operation. We are only concerned with the Natural Inner Join operation on two input tables.

In this assignment, we will refactor the code from Assignment 5 to add ways to sort and search each table. We will also "join" two tables to get a third table called a join table.

# Instructions
## Your Tasks

* Make a complete copy of your Assignment 5 program and call the main class "Assign6Main.java".

* In addition to the things users were able to do in assignment 5, in this assignment, allow the user to sort each of the two tables by id or name. 

* Should also allow sorting of `CityTable` by population

* Should also allow sorting of `StadiumTable` by capacity

* Allow users to remove duplicate rows in each table

* Allow user to join the two current tables to give you a 3rd table with 5 columns: id, city name, city population, stadium name, and stadium capacity

* You will have to set up new classes to help set up the third table: a `CityStadiumTable` class and a `CityStadiumRow` class with the appropriate data members and methods to accomplish this.

* Once a join result is created, the user should be able to save the join table to an output file.

## Implementation Details

### Search

* Add a `search` method in each of the two Table classes: `CityTable` and `StadiumTable`. Alternatively, you can add a single `search` method in the common superclass, `AbstractTable`.

* The input to the `search` method should be the id of the row that we are looking for.

* The `search` method should return the index into the `ArrayList` where the row was found or else a negative value.

* You can implement either a linear search or a binary search or both.

* Refactor the existing `findRow` and `removeRow` methods in each Table class use this new search method.

### Sort

* Add a `sort` method in each of the two Table classes: `CityTable` and `StadiumTable`. Alternatively, you can add a single `sort` method in the common superclass, `AbstractTable`.

* Implement your own sorting method—one of the three we discussed in the lectures: Selection sort, Insertion sort, or Bubble sort.

* You can use the `Collections.sort()` methods to test your results but you do not get any credit for just using the `Collections.sort()` methods.

* The `CityRow` and `StadiumRow` classes should both implement `java.lang.Comparable<>` and `java.util.Comparator<>` to be able to compare the id data member so that you can sort a table by row ids.

* To be able to sort by the other data members, create separate classes (at least 2 for each Row class) that each implement `java.util.Comparator<>` as discussed in the lectures.

### Join
* Implement a join method in the `CityTable` class that will take as input a `StadiumTable` class and produce as output a Natural Inner Join table—an instance of the `CityStadiumTable` class. Each row in the `CityStadiumTable` class will be an instance of the `CityStadiumRow` class.

* The `join` method should perofrm a Natural Inner join using the "id" as the key.

Suppose we have the following table of cities:

| City         | ID | Pop. |
|--------------|----|------|
| Philadelphia | 23 | 1.58 |
| Foxboro      | 20 | 0.02 |
| Seattle      | 19 | 0.77 |
| Chicago      | 18 | 2.68 |

...and this table of stadiums: 

| Stadium          | ID | Team Name  | Cap. |
|------------------|----|------------|------|
| Gillette Stadium | 20 | Revolution | 68756| 
| Lumen Field      | 19 | Sounders   | 68740|
| Soldier Field    | 18 | Fire       | 63500|
| Yankee Stadium   | 17 | New York   | 49642|

The join operation should find rows in each table that satisfy a condition. We will use a "natural Inner Join" operation on the "id" field of each table as the key. When we get a row in the city table in which the id matches one in the stadium table, we combine the tow rows into a bigger row in the result table. Do not include rows that do not have matching ids:

|City        | ID | Staidum          | Team Name  | Cap. |
|------------|----|------------------|------------|------|
| Foxboro    | 20 | Gillette Stadium | Revolution | 68756|
| Seattle    | 19 | Lumen Field      | Sounders   | 68740|
| Chicago    | 18 | Soldier Field    | Fire       | 63500|

# Testing Your Code

Test your code so that it is as resilient as possible.

Test with: 
* Different sets of words
* Different number of lines
* Boundary conditions such as an empty file

Create an `Assign6Tests` document, explain:
* How you tested your code
* What inputs you used
* How each input tested specific parts of your code
* How you tested the `search`, `sort`, and `join` methods

# Submission Instructions

Once you are done with the assignment, submit a single .jar file containing:
* All source code (.java files) needed for the program to work
* Input files needed to test the program
* An Assign6Tests document


# Rubric Requirements

## First Criteria
* Valid Jar file with working code
* Jar file submitted should have all needed .java files and all input files. All code should compile without errors and run without errors.

## Second Criteria
AbstractRow abstract class, concrete CityRow, StadiumRow, and CityStadiumRow classes
Class code:
* Separate .java files
* Comments explaining code
* Good formatting of source code
* No extraneous or unnecessary code
* Good encapsulation: private data members, abstract methods and implementation, Constructor(s) needed if data members are present
* Inheritance: should extend `AbstractRow`, implement/override inherited abstract methods
* Implement the `Comparable<>` and `Comparator<>` interfaces

## Third Criteria
`AbstractTable` abstract class, `CityTable`, `StadiumTable`, and `CityStadiumTable` concrete classes, and Main class modified for new menu options

Use List, Set, or Map data member: Program to the interface
* New operations to remove duplicates, sort, and join tables implemented in main method

## Fourth Criteria
This criterion is linked to a Learning OutcomeNew methods in AbstractTable abstract class, CityTable and StadiumTable concrete classes, and Main class
* Sort the List or Set in alphabetical order of the first word using one of these three sorting methods:Selection sort, Insertion sort, Bubble sort
* Search using linear or binary search.
* Join method to join two input tables to produce a 3rd table
* Handle bad inputs using Exceptions so your program can recover from bad inputs

## Fifth Criteria
### Testing
Assign6Tests document explaining Inputs you used to test your code and how each input tested some part of your code

### Tests
* Empty input file
* file with 1 line
* file with 100 lines
* file with 120 lines
* file with partial or empty row
* file with a line with extra data
* add a row
* remove a row
* find a row
* remove duplicate rows
* sort rows
* join two tables into one
* save entire table to a file



