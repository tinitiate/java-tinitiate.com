// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java break statement
// >MetaDescription: java break statement
// >MetaKeywords: java break statement example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: break-statement
// >---

// ># [Java loop break statement](break-statement.html)
// >* **BREAK** statement is a loop control mechanism, when encountered in a 
// >  loop the "break" exits the loop.
// >* The **Break** is also used in the switch statement to exit the **switch clause**
// >>

// >```
package tinitiate.basics;

public class LoopsBreak {

   public static void main(String[] args) {

      // BREAK STATEMENT
      // ===============
      
      // LOOP FIVE TIMES
      for(int i=1; i<=5; i++) {

         System.out.println("Current i Value: " + i);

         // THE BREAK will exit the loop here,
         // SO ONLY "Current i Value: 1" will be printed
         break;  // This will not print FIVE times, will only print once !
      }
      
      // Break in while loop
      
      int x =1;

      // Check the value of j in every iteration if it is less than 
      // or equal than FIVE.
      while (x <=5 ) {
         
         System.out.println("Current x Value: " + x);
         
         // Increment value of x by one in every iteration
         x++;
         
         // Exit the loop if the value of j is 3
         if (x==3) {
            break;
         }   
      }
      
   }
}
// >```