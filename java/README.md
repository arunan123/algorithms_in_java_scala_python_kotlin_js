# algorithmdb
The Aim of this project is to provide a collection of reusable Algorithms which can be used effectively in different scenarios.  Algorithm implementations are in Java. Objective here is to implement algorithms which should be more efficient than the JDK implementation and also to create a platform for the researchers who works on Data Mining, Encryption algorithms, ect.. to collaborate and contribute to this project.

# Features
Reusable codes
Tested the Algorithm implementations with different set of datas and provided the statistics in the header comment, so that developers can choose and reuse the algorithm which solve their business problem

This project is Migrated from sourceforge. It is 7 Year old project (https://sourceforge.net/projects/algorithmdb/)

# For Developers who want to contribute to the project

# Software Prerequisites 
GIT client 
JDK8
JUnit 4
An IDE (Eclipse or IntelliJ Idea)

# Knowledge Prerequisites
Sound knowledge in Core Java and OOPS
Knowledge about writing JUnit test cases
Familiarity with GIT

# For Every Java Implementation, follow this format:
Add the following license details  in the header of the Java classes,
/**
 * Copyright [2017] [Arunan R]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author [Your Name]
 * @date   [Today's date]
 */


Also add a comment in the header which describes the algorithm and also add the performance details of your implementation in the following format, e.g.

Algorithm Definition:
Bubble Sort is a simple sorting algorithm, which will steep through a list of elements and compares two elements and swaps them if they are not in order, until no further swaps needed.

Performance Review:

 This implementation has tested with the following data
----------------------------------------------------------------------
    Input     | Time taken in Milliseconds |Time taken in Nanoseconds
----------------------------------------------------------------------
   Sequence   | 10 ms                      | 1200 ns
   numbers    |                            |
   from       |                            |
   1 to 10000 |                            |
If you are Implementing a Data Structure, please describe it and add the complexity for all operations.

Example,
 * ------------------------------------------------------------------------
 * This is an implementation of a doubly linked list where it stores the 
 * elements in the Natural sorted order. Class didn't implement the List 
 * interface, since the elements inserted should be comparable
 * 
 * Adding an element    : Linear
 * Remove Max element   : Linear
 * Size of the LL       : Constant
 * Peek for Max element : Constant
 * ------------------------------------------------------------------------


Write descriptive comment of your implementation.
If you are writing an algorithm, Implement the marker interface Algorithm in your implementation
Implement the appropriate Existing interface in your implementation, if available.
Add your Algorithm implementation in an appropriate category i.e.
Appropriate package. If your algorithm category doesn’t exists then
Create a package for that.
E.g. If you write a compression algorithm then create a package,
         com.algorithmdb.algorithms.compression inside the src folder;
        For writing the test case for the same algorithm create a package,
         com.algorithmdb.algorithms.compression.test inside the test folder
Write JUNIT Test Case for your implementations and add that class in
The appropriate package. While committing the source code, please commit both implementation and test cases.
Please dont commit incomplete implementations. Commit only working code.
Minimize the usage of Java APIs, so that we can measure the performance 
without depending on the Java API implementations. If you want a Data 
Structures then try to create a custom Data Structure Or use the existing DS in our repository.
If you use the Java Data structure implementation then add that code in the repository inside the package with oracle license, Example, if you use BlockedDeque in your implementation (Get the BlockedDeque source code from Open JDK and add it in the below package)
        com.openjdk.sourcecode



If you have any queries then feel free to write me arunan.healtheworld@gmail.com
