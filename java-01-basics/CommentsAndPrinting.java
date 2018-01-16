// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java comments and printing to console
// >MetaDescription: 'java comments and printing to console'
// >MetaKeywords: 'java comments and printing to console example code, tutorials'
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: comments-printing
// >---


// ># Comments and printing to console
// >* **COMMENTS** are free text statements in a code file.
// >* They are ignored by the compiler and will not affect the 
// >  program output or working in any way.
// >* Java supports single line and multi line comments.
// >* Comments are constructs that are ignored by the java compiler
// >* SINGLE LINE and MULTI LINE comments are supported by java
// >* **PRINT** to the screen (console) is done using
// >  * System.out.println --> LN ADDs a line break after the print.
// >  * System.out.print --> NO-LN DOES NOT ADD a line break after the print.
// >```
package tinitiate.basics;

// This is a SINGLE LINE comment

/* This
   is a
   MULTI-LINE comment
 */

public class CommentsAndPrinting {
   
   public static void main(String[] args) {
      
      // System.out.println --> LN Prints this text and ADDs a line break
      System.out.println("Technical");
      System.out.println("Initiate");

      // System.out.print --> NO-LN Prints this text and DOES NOT ADD a 
      // line break
      System.out.print("Technical");
      System.out.print("Initiate");
      
      // Printing a Line Break
      System.out.print("\n");
      
      System.out.print("NO-printLN This is a statement after the line break");
   }
}
// >```

// >>OUTPUT
// >* Technical
// >* Initiate
// >* TechnicalInitiate
// >* NO-printLN This is a statement after the line break
