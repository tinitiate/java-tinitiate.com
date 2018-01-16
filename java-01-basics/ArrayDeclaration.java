// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java Array Declaration
// >MetaDescription: java Array Declaration, Initializing, Declaration, Null Reference
// >MetaKeywords: java Array Declaration, Initializing, Declaration, Null Reference, example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: array-declaration
// >---

// ># Java Array Declaration
// >* Array is declared as [ ] --> Square Brackets
// >* Array elements are declared as ( ) --> Curve Brackets
// >* Creating an Array, Data Type followed by square brackets[],
//    creates an array. 
// >* Initializing an Array, is assigning values to the array.
// >* Java Array Declaration and Initialization.
// >* Java Array Null Reference array,
// >  * By default java initializes the array according declared datatype.
// >  * If the array is of type int or any numeric types, then it is 
// >    initialized to 0.
// >  * If the array is of type boolean, then it is initialized to false.
// >  * For all others it is initialized to null.

// >```
package tinitiate.basics;

public class ArrayDeclaration {

   public static void main(String[] args) {

    // Creating an array, Uninitialized Array
    // ======================================
    // Here we demonstrate with an int datatype
    int[] intArray = null;


    // Initializing an Array
    // =====================
    // Note the array "intArray" is already created.
    intArray[0] = 100;
    intArray[1] = 200;
    

    // Declaration and Initialization
    // ==============================
    int[] intArray_DI = {100, 200, 300};
    

    // Null Reference
    // ==============
    int[] intArray_NR = new int[3];
    // is same as 
    // int[] intArray_NR = { 0, 0, 0 };

   }
}
// >```