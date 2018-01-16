// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java conditional if then else statement
// >MetaDescription: java conditional if then else statement nested if else
// >MetaKeywords: java conditional if then else statement, example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: if-else-statement
// >---

// ># IF THEN ELSE Statement
// >* **if-then** statement, controls program execution of a code section only if the 
// >  "IF" condition is evaluated to be true.
// >* **if-then-else** statement, controls program execution of a code section only if the 
// >  "IF" condition is evaluated to be true and "ELSE" condition is evaluated 
// >  if the "IF" condition to be false.
// >* **Nested if-then-else**  Embedding an "if or else" statement inside another 
// >  "if or else if".

// >```
package tinitiate.basics;

public class ConditionalIfElse {

   public static void main(String[] args) {

      // IF THEN STATEMENT
      // =================
      
      // THIS IS THE CONDITION
      if (100 < 200) {
         
         // CODE TO EXECUTE IF CONDITION IS TRUE
         System.out.println("100 < 200");

      }

      
      // IF THEN ELSE STATEMENT
      // ======================
      
      // THIS IS THE CONDITION
      if (300 < 200) {

         // CODE TO EXECUTE IF CONDITION IS TRUE
         System.out.println("300 is less than 200");
      }
      else {
         // CODE TO EXECUTE IF CONDITION IS FALSE
         System.out.println("300 is greater than 200");
      }

      
      // MULTIPLE IF THEN ELSE STATEMENT
      // ================================
      // THIS IS THE CONDITION
      if (300 < 200) {

         // CODE TO EXECUTE IF CONDITION IS TRUE
         System.out.println("300 is less than 200");
      }
      // ANOTHER CONDITION
      else if (300 < 250 ) {
         // CODE TO EXECUTE IF ANOTHER CONDITION IS TRUE
         System.out.println("300 is less than 250");
      }
      else {
         // CODE TO EXECUTE IF CONDITION IS FALSE
         System.out.println("300 is greater than 200");
      }
 

      // NESTED IF ELSE STATEMENT
      // ========================
      // THIS IS THE CONDITION
      int num = 100;
      
      if (num==99) {

         // CODE TO EXECUTE IF CONDITION IS TRUE
         System.out.println("num is 99");
      }
      else {
         if (num/2 == 0){
            System.out.println("num/2 is 0");
         }
         else {
            System.out.println("num/2 is not 0");
         }
      }   
   }
}
// >```
// >> OUTPUT
// >*100 < 200
// >*300 is greater than 200
// >*300 is greater than 200
// >*num/2 is not 0
