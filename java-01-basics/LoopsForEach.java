// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java for each loop
// >MetaDescription: java for each loop
// >MetaKeywords: java for each loop example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: for-each-loop
// >---

// ># [Java For Each Loop](for-each-loop.html)
// >* The foreach loop, added in Java 5, also called as "enhanced for loop
// >* It is used with java arrays or collections, where the loop reads each element,
// >   one after the other.
// >>

// >```
package tinitiate.basics;

public class LoopsForEach {

   public static void main(String[] args) {
      
      // FOR EACH LOOP
      // =============
      
      // Read array elements using FOR EACH loop
      int[] myArr = {11, 22, 33, 44};
      
      for (int i : myArr) {
          System.out.println(i);
      }
      
      // Read every char in a String using for each with toCharArray()
      for (char c: "TINITIATE".toCharArray()) {
         System.out.println(c);
      }

   }
}
// >```