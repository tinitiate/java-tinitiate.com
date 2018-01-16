// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java introduction
// >MetaDescription: 'java introduction program structure'
// >MetaKeywords: 'java introduction program, basics, structure example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: java-introduction
// >---


// ># Java Introduction
// >* Here we will see the structure of a very simple java program
// >* Bare minimum required statements for a program to run.
// >* Writing code in java is a TWO step process;
// >  * STEP 1.
// >  * Write the code in ".JAVA" file or the source file
// >  * STEP 2.
// >  * Compile the ".JAVA" file into the ".CLASS" file using the "javac command"
// >* To run the code, execute the ".CLASS" file NOT the ".JAVA" code using the
// >  "java command".


// >## What is a Package and why is it needed?
// >* A Java package is a mechanism for organizing Java classes
// >* Typically the "Java source file" or the ".java" files are placed in the
// >  directory whose name reflects the name of the package name.
// >* Since they act as DIRECTORIES of files, it allows the classes to download
// >  faster as a group rather than one at a time.
// >* Its common practice to typically use packages to organize java code
// >  belonging to the same category or providing similar functionality.


// >## What is a java Main Method
// >* Before we talk about "main" method, we need to understand how to enter 
// >  into a java program.
// >* An application can have many ".java" files, BUT its important to know 
// >  where to start or the first program or piece of code that will execute.
// >* Lets assume there are 3 ".java" files in a project One of them would have
// >  a "main" method ,the main method is the method that's defined to be 
// >  called at the start of an application.
// >* Important features of the "main" method are;
// >* "main" method is PUBLIC:
// >  This is necessary because main() is called by the JVM before object creation.
// >* "main" method is STATIC:
// >   Since it is static it can be directly invoked via the class with out
// >   having to create an Object of the class.
// >* Main method as one input parameter of type string array
// >    * It can accept a array of string values
// >    * This array is the mechanism through which the runtime system passes 
// >      information to your application.


// >```
// Package

package tinitiate.basics;

// Class
public class JavaIntro {

    // Main Method
    public static void main(String[] args) {

        // Code in Main method
        System.out.println("Welcome to tinitiate.com java tutorials");
   } // End of Main Method

} // End of Class
// >```

// >```
// >---- CONSOLE OUTPUT ----

//>```