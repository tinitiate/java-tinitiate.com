// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java do while loop
// >MetaDescription: java do while loop
// >MetaKeywords: java do while loop example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: do-while-loop
// >---

// ># [Java do while loop](do-while-loop.html)
// >* The **do while loop** iterates block of code-statements and further iterations
// >  **only when** the condition in the while statement is true.
// >* So the **do while** loop executes atleast once before exiting the loop.
// >* The condition to proceed with the iteration is **AFTER** the code iteration.
// >* **JAVA DO WHILE LOOP** syntax
// >    * do { block of code-statements }
// >    * while(condition is true);
// >>

// >```
package tinitiate.basics;

public class LoopsDoWhile {

   public static void main(String[] args) {
      
      // DO WHILE LOOP
      // =============
      // Code Executes BEFORE the condition in the while is checked
      int dowhileloop_counter=5;
      
      do {

           System.out.println("Do while loop_counter Value: " + dowhileloop_counter);
           dowhileloop_counter--;

      } while(dowhileloop_counter>0);
   }
}
// >```