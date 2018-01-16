// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Bitwise Operators
// >MetaDescription: 'Java Bitwise Operators'
// >MetaKeywords: 'Java Bitwise Operators example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: bitwise-operators
// >---

// ># Bitwise Operators
// >* Bitwise AND
// >* Bitwise OR
// >* Bitwise XOR
// >* Bitwise COMPLIMENT

// >```
package tinitiate.basics;

public class BitwiseOperators {

   public static void main(String[] args) {

      int i = 66;
      int j = 55;

      // BINARY of i and j
      System.out.println("i BINARY: " + Integer.toBinaryString(i));
      System.out.println("j BINARY: " + Integer.toBinaryString(j));

      
      // AND, Perform AND on each bit of i and j
      System.out.println(i&j);
      
      
      // OR, Perform OR on each bit of i and j
      System.out.println(i|j);
      
      // XOR, Perform XOR on each bit of i and j
      System.out.println(i^j);
      
      // Compliment of i and j,  Perform compliment on each bit of i and j
      System.out.println(~i);
      System.out.println(~j);
   }
}
// >```

// > >OUTPUT
// > * i BINARY: 1000010
// > * j BINARY: 110111
// > * 2
// > * 119
// > * 117
// > * -67
// > * -56
