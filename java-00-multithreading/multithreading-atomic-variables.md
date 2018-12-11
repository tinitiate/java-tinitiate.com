---
YamlDesc: CONTENT-ARTICLE
Title: Java Atomic Variables
MetaDescription: Java Atomic Variables
MetaKeywords: Java Atomic Variables
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-atomic-variables.md
---

# Atomic Variables
* Atomic Types are an alternative to "synchronized".
* Atomic Types can be used for variables, in scenarios where we would want to 
  avoid the impact of unnecessary synchronization.
* Alternatives to variable type synchronization:
  * `AtomicInteger` for `Integer`
  * `AtomicLong` for `Long`
  * `AtomicBoolean` for `Boolean`
  * `AtomicIntegerArray`
  * `AtomicLongArray`
  * `AtomicReference`
  
  
## Demonstration of Atomic Variables, using AtomicInteger
* This Class Demonstrates variable value increment of Integer Values, 
  One using Atomic (ai variable) and one without atomic (i variable)
* The 
* This Class has the Methods and Member Variables:
* UsingAtomic() and "AtomicInteger ai"
  Demonstrates the Synchronized (ThreadSafe) Counter-increment
* NotUsingAtomic() and "Integer i"
  Demonstrates the Regular counter (NonThreadSafe) Counter-increment
* Run() and "String what_to_run",determines which Method is to be called by the 
  Thread()
* The Main() Method,Executes the variable increment using `UsingAtomic()`
  and `NotUsingAtomic()` methods of the `JavaConcurrencyAtomic class`
 And runs them as Threads THREE times.
* The expected result is
  * **For Non-Atomic**
  * Create 3 Threads and test with, Non-Atomic Variable method
  * Expected Result order is 1,2,3
  * But since this is not Thread Safe, Result order may vary, not necessarily
   (1,2,3) could be (2,1,3) ..
  * **For Atomic**
  * Create 3 Threads and test with, Atomic Variable method
  * Expected Results are 1,2,3
  * Since This is Thread Safe Results should always be in the order: 1,2,3 
```
package tinitiate.java.multithreading;

import java.util.concurrent.atomic.*;

public class JavaConcurrencyAtomic extends Thread {

    String what_to_run;

    // Declare an Atomic Integer (Thread Safe)
    AtomicInteger ai = new AtomicInteger(0);

    // This Method Increments the variable "ai"
    public void UsingAtomic() {
        System.out.println("UsingAtomic Increment: " + ai.incrementAndGet());
    }

    // Declare an regular Integer (Not Thread Safe)
    Integer i = 0;
    // This Method Increments the variable "i"
    public void NotUsingAtomic() {
        i++;
        System.out.println("NotUsingAtomic Increment: " + i);
    }

    public void run() {
        // This determines which method to run
        if(what_to_run == "UsingAtomic")
        {
            UsingAtomic();
        }
        // This determines which method to run
        if(what_to_run == "NotUsingAtomic")
        {
            NotUsingAtomic();
        }
    }

    // Constructor to select the method to Run at execution time.
    public JavaConcurrencyAtomic(String what_to_run) {
        this.what_to_run = what_to_run;
    }

    public static void main(String[] args) {
        /**
         *  Create 3 Threads and test with, Non-Atomic Variable method
         *  Expected Results are 1,2,3
         *  But since this is not Thread Safe, Results may Vary
         */
        Runnable NonAtomicRun = new JavaConcurrencyAtomic("NotUsingAtomic");
        Thread NonAtomicThread1 = new Thread(NonAtomicRun);
        Thread NonAtomicThread2 = new Thread(NonAtomicRun);
        Thread NonAtomicThread3 = new Thread(NonAtomicRun);
        NonAtomicThread1.start();
        NonAtomicThread2.start();
        NonAtomicThread3.start();

        /**
         *  Create 3 Threads and test with, Atomic Variable method
         *  Expected Results are 1,2,3
         *  Since This is Thread Safe Results should be in the order: 1,2,3 
         */
        Runnable AtomicRun = new JavaConcurrencyAtomic("UsingAtomic");
        Thread AtomicThread1 = new Thread(AtomicRun);
        Thread AtomicThread2 = new Thread(AtomicRun);
        Thread AtomicThread3 = new Thread(AtomicRun);
        AtomicThread1.start();
        AtomicThread2.start();
        AtomicThread3.start();
    }
}
```