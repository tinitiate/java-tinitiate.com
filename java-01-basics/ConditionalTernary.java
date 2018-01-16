// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java ternary operator
// >MetaDescription: 'java conditional statements, if else, switch case statement, ternary operator'
// >MetaKeywords: 'java conditional statements, if else, switch case statement, ternary operator, example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: ternary-operator
// >---

// ># Ternary Operator
// >* Ternary Operator is similar to the **if then else** condition, the syntax explained:
// >* (IF-CONDITION)?(EXECUTE-THIS-IF-TRUE):(EXECUTE-THIS-IF-FALSE)
// >* Consider the Get lower of the TWO values:
// >  * leastVal = (val1 < val2) ? val1 : val2;

// >```
package tinitiate.basics;

public class ConditionalTernary {

   public static void main(String[] args) {
      
      // TERNARY OPERATOR
      // ================
      int num1 = 10;
      int num2 = 20;
      int leastVal;
      
      // (IF-CONDITION)?(EXECUTE-THIS-IF-TRUE):(EXECUTE-THIS-IF-FALSE)
      leastVal = (num1 < num2) ? num1 : num2;
      System.out.println("Least Value of num1 and num2: " + leastVal);

   }
}
// >```