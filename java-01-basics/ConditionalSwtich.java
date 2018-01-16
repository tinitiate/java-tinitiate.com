// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java switch case statement
// >MetaDescription: java switch case statement
// >MetaKeywords: java switch case statement, example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: switch-statement
// >---

// ># Switch Statement
// >* Unlike the if-then-else statements, the switch statement can have a number of 
// >  possible execution paths in a single check of conditions.
// >* Switch statement checks for matching value of the given "switch variable" against 
// >  a set of case-values. And for each case being true the condition is executed.
// >* Switch statement can be seen as an if else ladder
// >```
package tinitiate.basics;

public class ConditionalSwtich {

   public static void main(String[] args) {

      // SWITCH STATEMENT
      // ================
      
      // Input number
      int val=15;  
      
      // Switch Statement evaluating the input variable "val"
      switch(val) {
         // CASE is similar to if, the following statement is
         // if (val == 5) then print message
         case 5:  System.out.println("5");
         // The Break exits the switch upon successful encounter 
         // of the input value
         break;  
         case 10: System.out.println("10");
         break;  
         case 15: System.out.println("15");
         break;  
         case 20: System.out.println("20");
         break;
         // The default is same as else in 'if else' 
         default: System.out.println("val is someother number");
      }

   }
}
// >```