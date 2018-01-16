// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Assignment Operators
// >MetaDescription: 'Java Assignment Operators'
// >MetaKeywords: 'Java Assignment Operators example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: assignment-operators
// >---

// ># Assignment Operators
// >* Simplest assignment operators is EQUAL TO **=** it assigns the value 
// >  of the operand on its right to the operand on its left.
// >* Advanced assignment operators, Change value and assign
// >  * += Add and assign
// >  * -= Subtract and assign
// >  * *= Multiply and assign
// >  * /= Divide and assign
// >  * %= Get Modulus and assign
// >  * <<= Left Shift
// >  * &gt;&gt;= Right Shift

// >```
package tinitiate.basics;

public class AssignmentOperators {

   public static void main(String[] args) {

      int i = 5;
      
      // Add value of right-operand to the left-operand
      // assign to left-operand
      i += 10;  // Same as  i=i+10
      System.out.println("i += 10: " + i );

      // Subtract value of right-operand to the left-operand
      // assign to left-operand
      i = 5;
      i -= 1;   // Same as  i=i-1
      System.out.println("i -= 1: " + i );

      // Multiply value of right-operand to the left-operand
      // assign to left-operand
      i = 5;
      i *= 2;   // Same as  i=i*2
      System.out.println("i *= 1: " + i );
      
      // Divide value of right-operand to the left-operand
      // assign to left-operand
      i = 10;
      i /= 2;   // Same as  i=i/2
      System.out.println("i /= 2: " + i );
      
      // Modulus value of right-operand to the left-operand
      // assign to left-operand
      i = 10;
      i %= 3;   // Same as  i=i%3
      System.out.println("i %= 3: " + i );

      // Right Shift value of right-operand to the left-operand
      // assign to left-operand
      i = 80;
      i >>= 3;   // Same as  i=i/2^3
      System.out.println("i >>= 3: " + i );
      
      // Left Shift value of right-operand to the left-operand
      // assign to left-operand
      i = 10;
      i <<= 3;   // Same as  i=i*2^3
      System.out.println("i >>= 3: " + i );      

   }
}
// >```

// > >OUTPUT
// > * i += 10: 15
// > * i -= 1: 4
// > * i *= 1: 10
// > * i /= 2: 5
// > * i %= 3: 1
// > * i >>= 3: 10
// > * i >>= 3: 80
