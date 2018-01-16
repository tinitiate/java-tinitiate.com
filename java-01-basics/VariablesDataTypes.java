// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java variables and datatypes
// >MetaDescription: 'java variables and datatypes'
// >MetaKeywords: 'java variables and datatypes example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: variables-datatypes
// >---

// ># Java Variables
// >* Variables are containers that store data
// >* Variables have a name and a datatype associated with them.

// >## Java DataTypes
// >* DataTypes are the type of data that can be assigned to a variable,
// >  Common datatypes are Strings, Numbers, Bytes, Date..
// >* The Data Type of a variable determines;
// >   * The memory required by the variable.
// >   * The range of values it can store. (Max and Min values)
// >   * The operations that can be performed using the variable.
// >     Mathematical Operations, String Operations, Logical Operations .. 

// >### int: The int data type is a 32-bit signed two's complement integer. 
// >* Minimum value of -2,147,483,648 
// >* Maximum value of 2,147,483,647 (inclusive). 
// >* For larger value range, use long.

// >### long: The long data type is a 64-bit signed two's complement integer. 
// >* minimum value of -9,223,372,036,854,775,808 and 
// >* maximum value of 9,223,372,036,854,775,807 (inclusive).
// >* Alternate to INT for longer ranges of values.

// >### float: The float data type is a single-precision 32-bit IEEE 754 floating point. 
// >* use a float (instead of double) if you need to save memory in large arrays 
// >  of floating point numbers. 
// >* For Currency use the java.math.BigDecimal class instead.

// >### double: The double data type is a double-precision 64-bit IEEE 754 floating point.
// >* Do not use double data type for precise values, such as currency.

// >### short: The short data type is a 16-bit signed two's complement integer. 
// >* Minimum value of -32,768 
// >* Maximum value of 32,767 (inclusive).

// >### char: The char data type is a single 16-bit Unicode character.
// >* minimum value of '\u0000' (or 0) 
// >* maximum value of '\uffff' (or 65,535 inclusive).


// >### byte: The byte data type is an 8-bit signed two's complement integer.
// >* Minimum value of -128 
// >* Maximum value of 127 (inclusive). 
// >* The byte data type is memory efficient, better if used with in large 
// >  arrays, saves memory. 
// >* Byte can be used in place of int.

// >### boolean: The boolean data type has only two possible values: true and false. 
// >* Uses for simple flags that use true/false conditions.
// >* boolean data type represents one bit of information.

// >```
package tinitiate.basics;

// Import Built-In package for Date
import java.util.Date;

public class VariablesDataTypes   {

      // Main Method
      public static void main(String[] args)   {

         // Topic 1.
         // Numeric DataTypes
         // =================
         
         // Integers (Numbers without the decimal "." in them
         int a=100;
         System.out.println("Value of variable a: " + a);
         
         // Floating-point literals in Java are set to double by default.
         // For a float literal, "F" or "f" must be appended to the constant.
         float f=7.1f; // Appended "f" to make it work
         double d= .991;
         // Printing Float / Double Values
         System.out.println("Value of f and d are: "+ f + " and " + d);


         // Topic 2.
         // String DataType
         // ===============
         String s;
         s = "Welcome to TINITIATE.COM";
         System.out.println(s);

         
         // Topic 3.
         // Byte DataTypes
         // ==============
         byte b;
         int p=233;

         // Type Casting in Java
         b = (byte) p;
         System.out.println("Byte Value of p is: " + b);

         
         // Topic 4.
         // Date DataTypes
         // set to the current system date
         // ==============================
         Date DateNow = new Date();
         System.out.println(DateNow);
   }
}
// >```
// > >OUTPUT
// > * Value of variable a: 100
// > * Value of f and d are: 7.1 and 0.991
// > * Welcome to TINITIATE.COM
// > * Byte Value of p is: -23
// > * Fri Jul 21 16:36:25 EDT 2017

