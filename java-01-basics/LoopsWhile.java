// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java while loop
// >MetaDescription: java while loop
// >MetaKeywords: java while loop example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: while-loop
// >---

// ># [Java while loop](while-loop.html)
// >* The while statement iterates block of code-statements **only when** 
// >  the condition in the while statement is true.
// >* **JAVA WHILE LOOP** syntax
// >    * while(condition is true) 
// >    * { block of code-statements }
// >>

// >```
package tinitiate.basics;

public class LoopsWhile {

   public static void main(String[] args) {

      // WHILE LOOP
      // ==========
      
      // Create a counter
      // Here the counter is in decremented
      int whileloop_counter = 5;
      
      while(whileloop_counter > 0)
      {
         System.out.println("while Loop Counter Value: " + whileloop_counter);
         whileloop_counter--;
      }
      
      // INFINITE WHILE LOOP
      // ===================
      // while(true) {}
      // OR
      // while (1==1) { }

   }
}
// >```