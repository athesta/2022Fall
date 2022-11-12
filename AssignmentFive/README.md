
# Purpose

Java programmers everywhere tend to use the classes and interfaces in the Java collections packages rather than writing their own code for "container" classes. These classes and interfaces are excellent examples of object-oriented programming—they use encapsulation, information hiding, inheritance, polymorphism, and generics—and using them usually makes our own programs better!

In this assignment, we will refactor the code from Assignment 4 to use Java collections classes and interfaces.

# Instructions

* Make a complete copy of your Assignment 4 program and rename the main class "Assign5Main.java"

* Refactor the `AbstractTable` class to use (instead of an array of `AbstractRows`) a container class that implements either a `List<>` (e.g. `ArrayList<>`) or `Set<>` (e.g. `HashSet<>`) interfaces to store `AbstractRow` objects.

HINT: You may want to "genericize" your `AbstractTable` class and use a Java generics parameter that extends `AbstractRow`. You can use polymorphism with Java generics parameters!


* Refactor the `CityTable` and `StadiumTable` classes to use `ArrayList<>` or `HashSet<>` objects instead of an array to store all the `AbstractRow`, `CityRow`, or `StadiumRow` objects.

When using Java Collections classes, remember to "Program to the Interface, not the Class!"

# Testing Your Code

Test your code so that it is as resilient as possible. Use different text input files you create on your own with:

* Different sets of words
* Different number of lines
* Boundary conditions such as an empty file or larger files than previous assignments could handle.

Create an `Assign5Tests` document in which you explain:

* How you tested your code
* What inputs you used
* How each input tested your code

# Submission Instructions

Once you are done with the assignment, submit a single .jar file containing:

* All source code (.java files) needed for the program to work
* Input files needed to test the program
* An `Assign5Tests` document

This will be one .jar file, but within that, each class should be in a separate .java file. Add comments at the top of each .java file showing your name and email.

# Rubric Requirements

Valid Jar file with working code. 

* Jar file submitted should have all needed .java files and all input files. All code should compile without errors and run without errors.

AbstractRow abstract class, Concrete CityRow and StadiumRow classes

Refactored AbstractTable abstract class, CityTable and StadiumTable concrete classes, and Main class refactored

Use List or Set data member: Program to the interface

- Comments explaining code
- Good formatting of source code
- No extraneous or unnecessary code
- Good encapsulation: private data members
- Constructor(s) & methods
- Handle bad inputs using Exceptions so your program can recover from bad inputs;

Either: - Refactored again to use a HashMap data member; Or - Describe how to use a Map class and its benefits.

List of all the possible ways your old code can crash List of inputs that can cause your program to crash List of Exception classes and the problems solved Inputs you used to test your code.

Assign5Tests document:

- List of all the possible ways your code can crash
- List of inputs that can cause your program to crash
- List of Exception classes and the problems solved
- Inputs you used to test your code
- Explain Inputs you used to test your code and how each input tested some part of your code

Tests:
- empty input file 
- file with just 1 line 
- file with 100 lines 
- file with 120 lines 
- file with a line with partial or empty row 
- file with a line with extra data in row 
- add a row 
- remove a row 
- find a row 
- save entire table to a file
