---
YamlDesc: CONTENT-ARTICLE
Title: Java multithreading volatile variables
MetaDescription: multithreading volatile variables
MetaKeywords: multithreading volatile variables
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-volatile-variables
---

# [Volatile Variables](multithreading-volatile-variables.html)
* **Volatile** in multithreading indicates that the a variable's value will 
  be modified by different threads.
* Values of volatile variables will never be cached in the thread-cache
* All reads and writes associated with the variable will go straight 
  to **main memory**
* Volatile variables can be visualized as a variable in a synchronized block.
* Static Vs Volatile variables:
* **Static**: 
 * Only one copy of the variable.
 * No matter what different threads do to the variable, there is only 
   ONE version in the memory.
* **Volatile**:
 * All threads have their own copy of the variable, with value derived 
   from the main memory. Same value across all threads.


## Demonstration of java volatile variables
* There are TWO classes in the program
* The **VolatileThreadSafe class** provides the data that is needed for example
* The `Volatile Variable` **counter** its Method `addFiveToCounter()` add 5 
  to the variable.
* The Public `class ThreadVolatileVariable` creates three threads of the 
  `VolatileThreadSafe`, And calls the `addFiveToCounter()` in the Thread `run()`
* This adds 5 to the `Volatile Variable` **counter** in all the three threads
* The output shows the same 5 to all `Volatile Variable` **counter**, this 
  proves that the `Volatile Variable` **counter**  is a independent 
  copy in all threads.
```
package tinitiate.java.multithreading;

// VolatileThreadSafe class provides the data that is needed for example
class VolatileThreadSafe {

    // Counter volatile variable
    volatile int counter = 0;
    // Method to increment the value

    public void addFiveToCounter()  throws InterruptedException {
        // Adding 5 to the counter 
        counter=+5;
        System.out.println("ThreadSafe addFiveToCounter: " + counter);
    }
}


public class ThreadVolatileVariable extends Thread {
    
    VolatileThreadSafe CommonVolTest;
    // Constructor, to use the Common object "CommonvolTest" across all 
    // the threads, with this.CommonvolTest, rather than each thread using a new 
    // instance of the object CommonvolTest
    // Constructor
    public ThreadVolatileVariable(VolatileThreadSafe volTest) {
        this.CommonVolTest = volTest;
    }

    public void run () {
        try {
            CommonVolTest.addFiveToCounter();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main method, execution starts here  
    public static void main (String[] args) throws InterruptedException  {

        System.out.println("Volatile Variable test");
             
        try {
            VolatileThreadSafe CommonObjectVTS = new VolatileThreadSafe();
            ThreadVolatileVariable T1 = new ThreadVolatileVariable(CommonObjectVTS);
            ThreadVolatileVariable T2 = new ThreadVolatileVariable(CommonObjectVTS);
            ThreadVolatileVariable T3 = new ThreadVolatileVariable(CommonObjectVTS);

            T1.start();
            T2.start();
            T3.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }    
    }
}
```