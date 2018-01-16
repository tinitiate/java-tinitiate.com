// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java continue statement
// >MetaDescription: java continue statement
// >MetaKeywords: java continue statement example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: continue-statement
// >---

// ># [Java loop continue statement](continue-statement.html)
// >* The **CONTINUE** statement exits the current iteration, when encountered in a 
// >  loop.
// >* The difference between **BREAK** and **CONTINUE** is 
// >    * **BREAK** exit the loop.
// >    * **CONTINUE** exit only the current iteration.
// >>

// >```
package tinitiate.basics;

public class LoopsContinue {

   public static void main(String[] args) {

      // CONTINUE STATEMENT
      // ==================
      
      // Check the value of j in every iteration if it is less than 
      // or equal than FIVE.
      int x = 1;
      
      while (x <=5 ) {

         // Increment value of x by one in every iteration
         x++;
         // Prints the text Apples Oranges Grapes
         System.out.println(x + " Apples");
         System.out.println(x + " Oranges");
         
         // Exit the loop if the value of j is 3
         if (x==3) {
            continue;
         }
         
         // NOTE THE "GRAPES" WILL NOT BE PRINTED ONLY FOR 3
         // as the loop iteration exits when x = 3
         // the loop starts execution from the loop start.
         // this is because the continue ONLY terminates the CURRENT loop 
         // iteration and not the loop itself
         System.out.println(x + " grapes");
         
      }
   }
}
// >```

// >> OUTPUT
// >* 2 Apples
// >* 2 Oranges
// >* 2 grapes
// >* 3 Apples
// >* 3 Oranges
// >* 4 Apples
// >* 4 Oranges
// >* 4 grapes
// >* 5 Apples
// >* 5 Oranges
// >* 5 grapes
// >* 6 Apples
// >* 6 Oranges
// >* 6 grapes
