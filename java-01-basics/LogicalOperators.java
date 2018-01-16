// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Logical Operators
// >MetaDescription: 'Java Logical Operators'
// >MetaKeywords: 'Java Logical Operators example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: logical-operators
// >---

// ># Logical Operators
// >* Logical Operators or conditional operators performs AND and OR operations 
// >  between two boolean expressions.
// >* && Conditional-AND
// >  * Returns TRUE when both the expressions being compared are TRUE.
// >  * Returns FALSE when either one or both the expressions being 
// >    compared are FALSE.
// >
// >* || Conditional-OR
// >  * Returns TRUE when both or one of the expressions being
// >    compared are TRUE.
// >  * Returns FALSE when both the expressions being compared are FALSE.
// >
// >* ! NOT Operator
// >  * Returns the inverse of the expressions, FALSE for TRUE 
// >    and TRUE for FALSE.

// >```
package tinitiate.basics;

public class LogicalOperators {

   public static void main(String[] args) {

      int i=1;  
      int j=2;  
      int k=3;  

      // Logical AND
      System.out.println(i<j && i<k);   // true AND true is true
      System.out.println(i>j && i>k);   // false AND false is false
      System.out.println(i>j && i<k);   // false AND true is false
      System.out.println(i<j && i>k);   // true AND false is false
      
      // Logical OR
      System.out.println(i<j || i<k);   // true OR true is true
      System.out.println(i>j || i>k);   // false OR false is false
      System.out.println(i>j || i<k);   // false OR true is true
      System.out.println(i<j || i>k);   // true OR false is true
      
      // Logical NOT
      System.out.println(!(i<j));       // !(TRUE) is FALSE
      System.out.println(!(i>j));       // !(FALSE) is TRUE
   }
}
// >```
// > >OUTPUT
// > * true
// > * false
// > * false
// > * false
// > * true
// > * false
// > * true
// > * true
