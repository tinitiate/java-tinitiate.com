---
YamlDesc: CONTENT-ARTICLE
Title: Java MultiThreding
MetaDescription: Java MultiThreding
MetaKeywords: Java MultiThreding
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-thread-class
---

# Thread Class
* Thread class provides methods to create, run and handle inter-thread 
  communication perform operations on a thread. The Thread class implements the
  Runnable interface.
* A JAVA Thread is a lightweight processes (Object), which can be executed in parallel
  with other object calls.
* Threads exist within a process. Atleast one thread can be created for an object [Data + Methods]
* Just like a JAVA Object, Every thread has operates with its own memory cache.
* Consider an Problem, with list of Tasks,
  Some tasks can be run in parallel and some in sequence, Its up to the developer to choose
  what TASKs should be run as threads and what should not.
* Extend the Class that needs to run in parallel to use THREAD.
* Define the Method run(), This is called as part of the thread.
* start() starts the thread, performs the actions mentioned in the run() method.
* IMPORTANT NOTE, CODE actions in run() and start thread using start(), 
  calling run() doesn't start the thread.
* The join(), waits for the threads to complete.
  Using the join, will execute all the statements after the threads complete execution,
  helping in some serial-execution when using threads.
* isAlive() method returns true if the called thread is still running, Else returns false.    


## Thread Class Demonstration
* The following program has a Class **Project3Seconds** this has a Method 
  **MyMethod()**, it takes 3 seconds to run this method.
* The Class **Project3Seconds** extends the **Thread** Class
* And it overrides the **run()** method.
* The Class with the **Main Method** in this program is the **ThreadClassDemo** 
  Class, This will Create TWO objects of the **Project3Seconds** Class and
  Runs the **MyMethod()** from the TWO objects in **PARALLEL**, 
* Using the **.start()** method the Object is executed, this will run the 
  method in parallel.
```
package tinitiate.java.multithreading;

import java.util.*;

// This Class Provides data for our test. 
// This prints a message every second with the data consumer information.
class Project3Seconds extends Thread {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    int ThreadID;

    // Constructor to accept the Thread ID
    public Project3Seconds(int ThreadID) { this.ThreadID = ThreadID; }

    // 1. This method takes 3 Seconds to execute
    // 2. This is the Method with the Business Logic and this will be tested 
    //    and made to be run twice parallel
    public void MyMethod() throws InterruptedException {

        System.out.println("MyMethod() " + this.ThreadID + ", Start Time " + new Date());
        Thread.sleep(3000);
        System.out.println("MyMethod() " + this.ThreadID + ", End Time: " + new Date());
    }

    
    // 1. The run() method, It must have the Exception handler 
    //    for the InterruptedException
    @Override
    public void run() {
        try {
            MyMethod();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


// 1. This Class Runs the Method MyMethod() from the Class Project3Seconds
//    This Class create 5 Threads (This Thread count is defined by the for Loop)
// 2. This demonstrates the Start and End time of the TWO threads are  
//    the same proving the are running in parallel, enabled by the 
//    Runnable Interface.
public class ThreadClassDemo {

    public static void main (String[] args) throws InterruptedException {

        // Create the Object of the Thread Class
        Project3Seconds Thread1 = new Project3Seconds(1);
        Thread1.start();
        Project3Seconds Thread2 = new Project3Seconds(2);
        Thread2.start();

        // Print this message if the Thread is still Alive
        if ( Thread1.isAlive()) {
            System.out.println("Thread1 running [isAlive()]."); }

        if ( Thread2.isAlive()) {
            System.out.println("Thread2 running [isAlive()]."); }

        // Wait Thread1 and Thread2 to Finish Using join()
        Thread1.join();
        Thread2.join();
    }
}
```


## Dynamic Number of Threads using Thread Class
* The following program demonstrates creation of Dynamic Number of Threads 
  using Thread Class.
* The following program has a Class **ThreeSecJob** this has a Method 
  **MyMethod()**, it takes 3 seconds to run this method.
* The Class **ThreeSecJob** extends the **Thread** Class And it overrides 
  the **run()** method.
* The Class with the **Main Method** in this program is the **ThreadClassDynamic** 
  Class, This has a for loop with a counter set to 5, and this will launch 
  5 threads of the object of the **ThreeSecJob** Class and Runs the **MyMethod()** 
  with 5 threads in **PARALLEL**. 
* Using the **.start()** method the Object is executed, this will run the 
  method in parallel.
```
package tinitiate.java.multithreading;

import java.util.*;

// This Class Provides data for our test. 
// This prints a message every second with the data consumer information.
class ThreeSecJob extends Thread {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    int ThreadID;

    // Constructor to accept the Thread ID
    public ThreeSecJob(int ThreadID) { this.ThreadID = ThreadID; }

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


// This Class Runs the Method MyMethod() from the Class Project3Seconds
// This Class create TWO threads
public class ThreadClassDynamic {

    public static void main (String[] args) throws InterruptedException {

        // Create 5 Objects (Threads of the Method "MyMethod()"   
        for(int t = 1; t <= 5; t++) {
            // Create the Object of the Thread Class
            ThreeSecJob ThreadObj = new ThreeSecJob(t);
            ThreadObj.start();
        }

    }
}

```
