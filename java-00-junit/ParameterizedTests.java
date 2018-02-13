// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: java junit parameterized testing
// >MetaDescription: junit-parameterized-testing
// >MetaKeywords: jUnit tutorials annotations, bulk testing, parameterized testing, java code testing test cases example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: junit-parameterized-testing
// >---

// ># JUnit Parameterized tests 
// >* JUnit 4 introduced the feature of Parameterized testing,
// >* This enables us to run the same test with different values 
// >  as test parameters.
// >* This is ideal to perform volume or bulk testing for testing same 
// >  component with different values.
// >* Each test accepts different inputs and expected results.
// >* This example demonstrated Bulk Testing using both parameterized and 
// >  non parameterized jUnit testing.
// >```
package tinitiate.junit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class ParameterizedTests {

   // ===============================================================
   //             BULK / VOLUME - PARAMETERIZED TESTING
   // ===============================================================

   // === Step 1 ===
   // ** CREATE TESTING VARIABLES **
   // 1. Declare variables that are needed to be passed to 
   //    Method which needs to be tested.
   // 2. The variables include the inputs required by the METHOD, the 
   //    expected output or return values
   // 3. Also create the Object of the class, of the method that needs 
   //    to be tested.
   // ===============================================================
   int testinput_num1;
   int testinput_num2;
   int testinput_result;
   Calc objCalc; // Object of the Class method that needs to be tested.


   // === Step 2 ===
   // ** CREATE CONSTRUCTOR **
   // 1. Create constructor to with parameters that have test inputs and 
   //    expected output. Of the Method that needs to be tested.
   // 2. In the case of testing Calc.mul method, the inputs are num1, num2
   //    and the expected output is "num1 * num2"
   // ===============================================================
   public ParameterizedTests(int num1, int num2, int mul_result) {

      // These are required by method inputs
      this.testinput_num1   = num1;
      this.testinput_num2   = num2;
      // This is expected output
      this.testinput_result = mul_result;
   }


   // === Step 3 ===
   // ** Before Object "Initializes the Class method object **
   // 1. Create constructor to with parameters that have test inputs and 
   //    expected output. Of the Method that needs to be tested.
   // 2. In the case of testing Calc.mul method, the inputs are num1, num2
   //    and the expected output is "num1 * num2"
   // ===============================================================
   @Before
   public void initialize() {
      objCalc = new Calc();
   }


   // === Step 4 ===
   // ** CREATE DATA SET FOR BULK TESTING **
   // 1. Create a collection of objects with data as required.
   // 2. The data set is of THREE values in the order "testinput_num1", 
   //    "testinput_num2" and "testinput_result". This is a ROW of data.
   // 3. In the below dataset there are FIVE rows of data.
   // 4. The "@Parameterized.Parameters" annotation is called by the @Test.
   // ===============================================================
   @Parameterized.Parameters
   public static Collection CalcMulData() {
       return Arrays.asList(new Object[][] {
            { 2, 1, 2  },
            { 3, 2, 6  },
            { 4, 3, 12 },
            { 5, 4, 20 },
            { 6, 5, 30 }
         });
   }


   // === Step 5 ===
   // ** RUN BULK TESTING **
   // 1. Create a collection of objects with data as required.
   // 2. The "@Test" annotation 
   // ===============================================================
   @Test
   public void BulkParameterizedTest() {
      assertEquals(testinput_result, objCalc.mul(testinput_num1, testinput_num2));
      System.out.println("Expected Result: " + testinput_result 
                         + " - Got Result: " + objCalc.mul(testinput_num1, testinput_num2));
   }

   
   
   // ===============================================================
   // Bulk/Volume Non Parameterized Testing
   // ===============================================================
   // 1. Create multiple "assertEquals" statements, with different 
   //    expected Outputs and Testing Inputs.
   // 2. The multiple "assertEquals" execute one after the another to
   //    perform the bulk testing.
   // ===============================================================
   @Test
   public void BulkNormalTest() {

      // Adder Class Object
      Calc obj = new Calc();

      // Test with multiple test cases
      assertEquals(200, obj.mul(10, 20));
      assertEquals(4, obj.mul(2, 2));
      assertEquals(9, obj.mul(3, 3));
   }
}
// >```
