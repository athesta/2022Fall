
# Purpose

A lot of things can go wrong when we run a program. The challenge is to keep the program going despite errors so that we can execute as much of the program as possible without causing any more problems.

In this assignment, we will use Exceptions to handle as many possible errors that may occur when using the Assignment 3 program. We want our Assignment 4 program to accomplish everything the Assignment 3 program can and be as resilient as possible; ideally, our Assignment 4 program will never crash.

# Instructions

* First, write a Word document named Assign3CrashReport with a list of all the possible ways your Assignment 3 program can crash. What bad inputs (e.g. bad filenames, file contents, user inputs) can cause the program to crash or malfunction?

* Make a complete copy of your Assignment 3 program and rename the main class `Assign4Main.java`

* Next, use custom Exception classes (there's no limit to how many you can have) to handle each possible error so that your program tries to recover from every bad input.

* In a second document named Assign4ExceptionTests, list each Exception class you created and what problem it solves.

# Testing Your Code

Test your code so that it is as resilient as possible. Use different text input files you create on your own with:

* Different sets of words
* Different number of lines
* Boundary conditions such as an empty file

In your Assign4ExceptionTests document, explain how you tested your code; what inputs did you use and how did each input test your code?

# Submission Instructions

Once you are done with the assignment, submit a single .jar file containing:

* All source code (.java files) needed for the program to work
* Input files needed to test the program
* An Assign3CrashReport document
* An Assign4ExceptionTests document

This will be one .jar file, but within that, each class should be in a separate .java file. Add comments at the top of each .java file showing your name and email.