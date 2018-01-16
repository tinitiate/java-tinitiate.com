// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Relational Operators
// >MetaDescription: 'Java Relational Operators'
// >MetaKeywords: 'Java Relational Operators example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: relational-operators
// >---

// ># Relational Operators
// >* They retrun TRUE or FALSE based on the result of the relational condition
// >* "==" **Equal to**
// >* "!=" **Not equal to**
// >* ">" **Greater than**
// >* "<" **Less than**
// >* ">=" **Greater than or equal to**
// >* "<=" **Less than or equal to**

// >```
package tinitiate.basics;

public class RelationalOperators {

   public static void main(String[] args) {

      // Variables 
      boolean result;
      
      // Assign values to 9
      int n1=1;
      int n2=9;

      // == Equal to
      result = n1==n2;
      System.out.println("Condition n1==n2 is: " + result);

      // != Not equal to
      result=n1!=n2;
      System.out.println("Condition n1!=n2 is: " + result);

      // > Greater than
      result=n1>n2;
      System.out.println("Condition n1>n2 is: " + result);

      // < Less than
      result=n1<n2;
      System.out.println("Condition n1<n2 is: " + result);

      // >= Less than or equal to
      result=n1<=n2;
      System.out.println("Condition n1<=n2 is: " + result);

      // >= Greater than or equal to
      result=n1>=n2;
      System.out.println("Condition n1<=n2 is: " + result);

   }
}
// >```

// > >OUTPUT
// > * Condition n1==n2 is: false
// > * Condition n1!=n2 is: true
// > * Condition n1>n2 is: false
// > * Condition n1<n2 is: true
// > * Condition n1<=n2 is: true
// > * Condition n1<=n2 is: false
