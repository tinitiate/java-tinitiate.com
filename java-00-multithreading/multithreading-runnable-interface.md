---
YamlDesc: CONTENT-ARTICLE
Title: Java MultiThreding
MetaDescription: Java MultiThreding
MetaKeywords: Java MultiThreding
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-runnable-interface.md
---


# Runnable interface
* The Runnable interface is has a single method run(), this method doesn’t
  accept any parameters and does not return any values.
* Using Runnable Interface for launching threads, is suitable for situations
  where the result of the thread execution is not important, such as logging,
  Listening to incoming events.
* Runnable is often used to provide the code that a thread should run, But
  **RUNNABLE INTERFACE DOESNT CREATE OR RUNS AS THREADS**.
  It's just an object with a run() method.
* To Run the Thread, Runnable Implemented Class uses Thread Class to **Start** 
  the Threads. **Do not use run() method to start a thread**.


## Runnable Interface Demonstration
* The following program has a Class **Task3Seconds** this has a Method
  **MyMethod()**, it takes 3 seconds to run this method.
* The Class **Task3Seconds** implements the **Runnable** Interface
  And it implements the **run()** method.
* The Class with the **Main Method** in this program is the **RunnableInterfaceDemo**
  Class, This will Create TWO objects of the **Task3Seconds** Class and
  Runs the **MyMethod()** from the TWO objects in **PARALLEL**,
* Using the **.run()** method the Object is executed, this will run the
  method in parallel.
* The Timings printed to the screen, Start and End time of the TWO threads are
  the same proving the are running in parallel, enabled by the Runnable Interface
```
package tinitiate.java.multithreading;

import java.util.*;

// This Class Provides data for our test.
// This prints a message every second with the data consumer information.
class Task3Seconds implements Runnable{

    // This variable stores the Caller of the Thread which runs the MyMethod()
    int ThreadID;

    // Constructor to accept the Thread ID
    public Task3Seconds(int ThreadID) { this.ThreadID = ThreadID; }

    // 1. This method takes 3 Seconds to execute
    // 2. This is the Method with the Business Logic and this will be tested
    //    and made to be run twice parallel
    public void MyMethod() throws InterruptedException {

        System.out.println("MyMethod() " + this.ThreadID + ", Start Time " + new Date());
        Thread.sleep(3000);
        System.out.println("MyMethod() " + this.ThreadID + ", End Time: " + new Date());
    }


    // The run() method that is overRidden
    // It must have the Exception handler for the InterruptedException
    @Override
    public void run() {
        try {
            MyMethod();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


// 1. This Class Runs the Method MyMethod() from the Class Task3Seconds
//    This Class create TWO threads
// 2. This demonstrates the Start and End time of the TWO threads are
//    the same proving the are running in parallel, enabled by the
//    Runnable Interface.
public class RunnableInterfaceDemo {

    public static void main (String[] args) throws InterruptedException {

        // Create the Object of the Thread Class
        Task3Seconds t3sThread1 = new Task3Seconds(1);
        Task3Seconds t3sThread2 = new Task3Seconds(1);

        // Use Thread Class to kick off the Thread
        Thread thread1 = new Thread(t3sThread1);
        thread1.start();

        Thread thread2 = new Thread(t3sThread2);
        thread2.start();
    }
}
```


## Dynamic Number of Threads using Runnable Interface
* The following program demonstrates creation of Dynamic Number of Threads
  using Runnable Interface.
* The following program has a Class **TaskThreeSec** this has a Method
  **MyMethod()**, it takes 3 seconds to run this method.
* The Class **TaskThreeSec** implements the **Runnable Interface** And it 
  overrides the **run()** method.
* The Class with the **Main Method** in this program is the **RunnableInterfaceDynamic**
  Class, This has a for loop with a counter set to 5, and this will **DYNAMICALLY** 
  launch 5 threads of the object of the **TaskThreeSec** Class and Runs 
  the **MyMethod()**  with 5 threads in **PARALLEL**.
* Using the **.start()** method the Object is executed, this will run the
  method in parallel.
```
package tinitiate.java.multithreading;

import java.util.*;

// This Class Provides data for our test.
// This prints a message every second with the data consumer information.
class TaskThreeSec implements Runnable {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    int ThreadID;

    // Constructor to accept the Thread ID
    public TaskThreeSec(int ThreadID) { this.ThreadID = ThreadID; }

    // 1. This method takes 3 Seconds to execute
    // 2. This is the Method with the Business Logic and this will be tested
    //    and made to be run twice parallel
    public void MyMethod() throws InterruptedException {

        System.out.println("MyMethod() " + this.ThreadID + ", Start Time " + new Date());
        Thread.sleep(3000);
        System.out.println("MyMethod() " + this.ThreadID + ", End Time: " + new Date());
    }


    // The run() method, It must have the Exception handler
    // for the InterruptedException
    @Override
    public void run() {
        try {
            MyMethod();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


// 1. This Class Runs the Method MyMethod() from the Class TaskThreeSec
//    This Class create 5 Threads (This Thread count is defined by the for Loop)
// 2. This demonstrates the Start and End time of the TWO threads are  
//    the same proving the are running in parallel, enabled by the 
//    Runnable Interface.
public class RunnableInterfaceDynamic {

    public static void main (String[] args) throws InterruptedException {

        // Create 5 Objects (Threads of the Method "MyMethod()"
        for(int t = 1; t <= 5; t++) {

            // Create the Object of the Thread Class
            TaskThreeSec ThreadObj = new TaskThreeSec(t);

            // Use Thread Class to kick off the Thread
            Thread thread = new Thread(ThreadObj);
            thread.start();
        }
    }

}
```