---
YamlDesc: CONTENT-ARTICLE
Title: Java Multithreading Vs Sequential
MetaDescription: Java Multithreading Vs Sequential
MetaKeywords: Java Multithreading Vs Sequential example
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-sequential-vs-thread
---

# Java Code Execution Thread vs Sequential
* Code can be executed in sequential or in parallel,
* Sequential execution is typically where one method is executed after another 
  in the order of the methods being called.
* Parallel or Multithreaded execution enables the running of methods in 
  parallel, multiple methods at the same time.


## Java Code Execution Thread vs Sequential Example
* Below example demonstrates the execution of a set of methods in a Sequential 
  execution manner and the same set of methods being executed in parallel.
* There are Two Classes,
   * `TheProcess` Class, This has the methods that are executed
   * `SequentialParallelDemo` Class demonstrates the difference between 
     sequential and Parallel Execution
* Class `TheProcess` Has TWO Methods, each taking 2 seconds to complete,
  upon calling this class'es Object from Main method of SequentialParallelDemo,
  it takes FOUR seconds to complete the methods, when executed in sequence,
  But when the same methods are executed in parallel they take TWO seconds.
* The SequentialParallelDemo Class, Creates 2 Separate objects one each for 
  Parallel and Sequential execution.
```
package tinitiate.java.multithreading;

import java.util.Date;

// Class: TheProcess
// Methods: step1() and step2()
// Each method takes TWO seconds to execute
class TheProcess {

    public static void step1()  throws InterruptedException {
        System.out.println("STEP 1 Start of the Program Step execution. " + new Date());
        Thread.sleep(2000);
        System.out.println("STEP 1 End of the Program Step execution. " + new Date());
    }

    public static void step2()  throws InterruptedException {
        Date stime = new Date();
        System.out.println("STEP 2 Start of the Program Step execution. " + stime);
        Thread.sleep(2000);
        Date etime = new Date();
        System.out.println("STEP 2 End of the Program Step execution. " + etime);
    }
}


// SequentialParallelDemo Class
// Creates 2 Separate objects one each for Parallel and Sequential execution
public class SequentialParallelDemo {

    public static void main(String args[])  throws InterruptedException {

        // Create an Object of "TheProcess Class
        TheProcess ObjTP = new TheProcess();
        

        // SEQUENTIAL EXECUTION
        // ====================
        // 1. Call the Step1 and Step2 methods, one after the another.
        // 2. Both the methods takes FOUR seconds to execute.
        ObjTP.step1();
        ObjTP.step2();
        
        // Pause for 4 Seconds
        Thread.sleep(4000);

        // PARALLEL or MULTITHREAD'ED EXECUTION
        // ====================================
        new Thread( 
                new Runnable() {
                    public void run() {
                        try {
                            ObjTP.step1();
                        } catch (Exception e) {}
                    }
                }
           ).start();

        
        new Thread( 
                new Runnable() {
                    public void run() {
                        try {
                            ObjTP.step2();
                        } catch (Exception e) {}
                    }
                }
           ).start();

    }    
}
```
