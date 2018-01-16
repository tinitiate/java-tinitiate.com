// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Arithmetic Operators
// >MetaDescription: 'Java Arithmetic Operators'
// >MetaKeywords: 'Java Arithmetic Operators example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: arithmetic-operators
// >---


// ># Arithmetic Operators
// >* Arithmetic operators are basic mathematical operations 
// >  that can be performed on variables,
// >* Java Arithmetic operators are
// >     * Addition A+B
// >     * Subtraction A-B
// >     * Multiplication A*B
// >     * Division (Gets quotient) A/B
// >     * Modulus (Gets reminder) A%B
// >     * Increment [increase value of operand] A++
// >     * Decrement [decrease the value of operand] A--

// >```
package tinitiate.basics;

public class ArithmeticOperators {

   public static void main(String[] args) {
      
      int num1=10;
      int num2=5;
      int result;

      // Addition
      result=num1+num2;
      System.out.println("Addition result: " + result);

      // Subtraction
      result=num1-num2;
      System.out.println("Subtraction result: " + result);
      
      // Multiplication
      result=num1*num2;
      System.out.println("Multiplication result: " + result);

      // Division (Gets quotient)
      result=num1/num2;
      System.out.println("Division result: " + result);

      // Modulus (Gets reminder)
      result=num1%num2;
      System.out.println("Modulus result: " + result);
      
      // Increment
      int i = 10;
      
      // Post-Increment
      i++;
      System.out.println("i's value post-increment: " + i);
      
      // Pre-Increment
      ++i;
      System.out.println("i's value pre-increment: " + i);
      
      // Decrement      
      int j = 100;
      // Post-Decrement
      j--;
      System.out.println("j's value post-decrement: " + j);

      // Pre-Decrement
      --j;
      System.out.println("j's value pre-decrement: " + j);

   }
}

// >```
// > >OUTPUT
// > * Addition result: 15
// > * Subtraction result: 5
// > * Multiplication result: 50
// > * Division result: 2
// > * Modulus result: 0
// > * i's value post-increment: 11
// > * i's value pre-increment: 12
// > * j's value post-decrement: 99
// > * j's value pre-decrement: 98
