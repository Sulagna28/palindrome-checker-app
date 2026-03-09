# Palindrome Checker App (Java)

## Project Overview

The **Palindrome Checker App** is a console-based Java application developed to demonstrate different algorithms and data structures used to validate whether a given string is a palindrome.

A palindrome is a word, phrase, or sequence that reads the same forward and backward.

Example:

* madam
* racecar
* level
* civic

This project demonstrates multiple approaches to solving the palindrome problem while strengthening core **Java programming, data structures, and object-oriented programming concepts**.

---

# Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# Features

* Console-based interaction
* Multiple palindrome checking algorithms
* Performance comparison of different methods
* Demonstration of data structures and OOP design patterns

---

# Use Cases Implemented

## UC1 – Application Entry & Welcome Message

Displays the application name and version when the program starts.

Concepts:

* Class
* Main method
* Static keyword
* Console output

---

## UC2 – Hardcoded Palindrome Check

Checks whether a string is a palindrome using character comparison.

Concepts:

* String
* Conditional statements
* Basic palindrome logic

---

## UC3 – Reverse String Palindrome Check

Reverses the string using a loop and compares it with the original.

Concepts:

* Loop
* String concatenation
* equals() method

---

## UC4 – Character Array Based Palindrome Check

Converts the string to a character array and compares elements using the two-pointer technique.

Concepts:

* char[]
* Array indexing
* Two-pointer technique

---

## UC5 – Stack Based Palindrome Check

Uses a **Stack (LIFO)** data structure to reverse characters and check palindrome.

Concepts:

* Stack
* push()
* pop()

---

## UC6 – Queue + Stack Based Palindrome Check

Demonstrates the difference between **FIFO and LIFO** by using both Queue and Stack.

Concepts:

* Queue
* Stack
* Data structure comparison

---

## UC7 – Deque Based Optimized Palindrome Check

Uses a **Deque (Double Ended Queue)** to compare characters from both ends.

Concepts:

* Deque
* removeFirst()
* removeLast()

---

## UC8 – Singly Linked List Palindrome Check

Converts the string into a **linked list** and checks palindrome by reversing the second half.

Concepts:

* Singly Linked List
* Fast and slow pointer
* In-place reversal

---

## UC9 – Recursion Based Palindrome Check

Uses recursion to compare characters from the start and end of the string.

Concepts:

* Recursion
* Base condition
* Call stack

---

## UC10 – Ignore Spaces and Case Palindrome Check

Normalizes the input string by removing spaces and converting to lowercase.

Concepts:

* String preprocessing
* Regular expressions

---

## UC11 – Encapsulation Based Palindrome Checker

Encapsulates the palindrome logic inside a reusable class.

Concepts:

* Encapsulation
* Single Responsibility Principle

---

## UC12 – Strategy Pattern Palindrome Checker

Implements the **Strategy Design Pattern** to dynamically choose different palindrome algorithms.

Concepts:

* Interface
* Polymorphism
* Strategy Pattern

---

## UC13 – Performance Comparison of Algorithms

Compares execution time of different palindrome algorithms using `System.nanoTime()`.

Concepts:

* Algorithm comparison
* Performance analysis

---

# Example Output

```
Enter text: Race Car

Processed Input: racecar
Is Palindrome? : true
```

---

# How to Run the Project

Navigate to the source folder:

```
cd src
```

Compile Java file:

```
javac UseCaseXPalindromeCheckerApp.java
```

Run the program:

```
java UseCaseXPalindromeCheckerApp
```

Replace **X** with the required use case number.

Example:

```
java UseCase5PalindromeCheckerApp
```

---

# Author

Sulagna

GitHub Repository:
https://github.com/Sulagna28/palindrome-checker-app
