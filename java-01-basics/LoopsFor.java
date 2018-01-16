// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java for loop
// >MetaDescription: java for loop nested for loop for loop decrement
// >MetaKeywords: java for loop nested for loop for loop decrement example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: for-loop
// >---

// ># [Java For Loop](for-loop.html)
// >* Iterate of code-statements over a range of values.
// >* There are three basic values that are required for perform the **FOR LOOP**
// >* Each iteration is increased by the count of **increment**
// >* **initialization**
// >    * Start with value, where the increment counter starts.
// >* **termination**
// >    * End at value, where the increment counter stops.
// >* **increment**
// >    * Value of increment of the increment counter, this is invoked after an iteration.
// >*
// >* **JAVA FOR LOOP** syntax
// >  * for (initialization; termination; increment) {
// >  * code-statements
// >  * }
// >* The code-statements execute until the "termination" value encounters
// >>

// >## For Loop Increment and Decrement
// >* In the for loop syntax we can change the increment to the decrement by 
// >*  using the -- operator
// >* The use of -- operator will create a reverse loop functionality.
// >* More like a count down.

// >## Nested For Loop
// * Nested loops are embedding loops one with in another.

// >>

// >```
package tinitiate.basics;

public class LoopsFor {

   public static void main(String[] args) {

      // FOR LOOP
      // ========
      
      // Print TINITIATE FIVE Times
      // initialization; int i = 0 
      // termination;  i <= 5
      // increment i++
      for(int i = 0; i<=5; i++) {
         System.out.println("TINITIATE");
      }
      
      // Print Increment values of the for loop
      for(int i = 0; i<=5; i++) {
         System.out.println("Increment - Current Iteration value of i: " + i);
      }
      
      // Print Decrement values of the for loop
      // initialization; int i = 0 
      // termination;  i <= 5
      // decrement i--
      for(int i = 5; i>=1; i--) {
         System.out.println("Decrement - Current Iteration value of i: " + i);
      }
      
      
      // Nested For Loop
      // ===============
      System.out.println("Nested for loops");
      
      // OUTER FOR LOOP
      for (int i = 0; i < 3; i++) {

         // INNER FOR LOOP
         for (int y = 0; y < 3; y++) {
             System.out.print(i + "," + y);
         }
         // print a new line after every inner loop
         System.out.println();
         
         
      // Infinite Loop
      // =============

      // Infinite for Loop, This will run forever, DO NOT RUN this, the only 
      // way to stop this is to terminate the program
      // This is a loop that never exits.
      // CODE: [Intentionally Commented.]
      // for ( ; ; ) { }

     }
   }
}
// >```
// >  OUTPUT
// >* TINITIATE
// >* TINITIATE
// >* TINITIATE
// >* TINITIATE
// >* TINITIATE
// >* TINITIATE
// >* Increment - Current Iteration value of i: 0
// >* Increment - Current Iteration value of i: 1
// >* Increment - Current Iteration value of i: 2
// >* Increment - Current Iteration value of i: 3
// >* Increment - Current Iteration value of i: 4
// >* Increment - Current Iteration value of i: 5
// >* Decrement - Current Iteration value of i: 5
// >* Decrement - Current Iteration value of i: 4
// >* Decrement - Current Iteration value of i: 3
// >* Decrement - Current Iteration value of i: 2
// >* Decrement - Current Iteration value of i: 1
// >* Nested for loops
// >* 0,00,10,2
// >* 1,01,11,2
// >* 2,02,12,2
