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


## Thread Class Thread Synchronization
* **Thread Synchronization** is the mechanism used by multiple Java Threads 
  that carry out completely independent tasks, to `share a common resource`.
* Synchronization is the process to provide effective and `THREAD SAFE`
  communication amongst threads by sharing access to fields and objects references.
* Synchronization provides a thread to get exclusive access to a shared resource.
* Synchronization provides mutual exclusion on resource usage.


### Demonstration of Thread Synchronization
* The below class demonstrates Thread Synchronization VS NON Thread Synchronization
* Here we create a **Common Shared Resource** which is the `data`
* The `data` is updated with a series of X or Y depending on the method used
* The methods `sync_append_X()` and `sync_append_Y()` are Synchronized, 
  One using the **Synchronized Method** and **Synchronized Block**,
  Which means, when called in a thread they execute one after another.
* This can be seen in the **OUTPUT** the XXXs and YYYs are in order 
  when the Synchronized methods are executed.
* The methods `non_sync_append_X()` and `non_sync_append_Y()` are Synchronized, 
  Which means, when called in a thread they execute one after another.
* This can be seen in the **OUTPUT** the XXXs and YYYs are NOT in order 
  when the Non Synchronized methods are executed.
```
package tinitiate.java.multithreading;


class SyncMethods {

    // ===============
    // Shared Resource
    // ===============
    static String data = "";


    // ====================
    // Synchronized Methods
    // ====================

    // Synchronized Method: sync_append_X()
    // This method Appends letter X to the 'data' shared variable
    synchronized public void sync_append_X() throws InterruptedException { 
        for(int i = 0; i < 51; i++) {
            data = data + "X";
            Thread.sleep(10);
        }
    }    

    // Method with Synchronized Block: sync_append_Y() 
    // This method Appends letter Y to the 'data' shared variable
    public void sync_append_Y() throws InterruptedException {

        // synchronized Block using the "synchronized" KeyWord
        synchronized(this) {
            for(int i = 0; i < 51; i++) {
                data = data + "Y";
                Thread.sleep(10);
            }
        }
    }


    // ========================
    // Non Synchronized Methods
    // ========================
    
    // Non Synchronized Method non_sync_append_X() 
    public void non_sync_append_X() throws InterruptedException {
        for(int i = 0; i < 51; i++) {
            data = data + "X";
            Thread.sleep(10);
        }
    }
    
    // Non Synchronized Method non_sync_append_Y() 
    public void non_sync_append_Y() throws InterruptedException {
        for(int i = 0; i < 51; i++) {
            data = data + "Y";
            Thread.sleep(10);
        }
    }

}



public class ThreadClassSynchronizationDemo {

    public static void main(String[] args) {

        // Create the Object of the Thread Class
        SyncMethods Obj = new SyncMethods();

        new Thread() {
            public void run() {
                try { Obj.sync_append_X(); }
                catch (InterruptedException e) {}
            }
        }.start();
       
        new Thread() {
            public void run() {
                try { Obj.sync_append_Y(); }
                catch (InterruptedException e) {}
            }
        }.start();
        
        
        // Wait for 4 Secs
        try { Thread.sleep(4000); } catch (InterruptedException e) {}
        System.out.println("Sync: " + Obj.data);
        

        // Clear data variable
        Obj.data = "";

        new Thread() {
            public void run() {
                try { Obj.non_sync_append_X(); }
                catch (InterruptedException e) {}
            }
        }.start();

        
        new Thread() {
            public void run() {
                try { Obj.non_sync_append_Y(); }
                catch (InterruptedException e) {}
            }
        }.start();
        
        // Wait for 4 Secs
        try { Thread.sleep(4000); } catch (InterruptedException e) {}
        System.out.println("Non Sync: " + Obj.data);

    }
}
```



## Thread Class Thread Communication
* Java provides mechanisms for threads to communicate with each other, this is
  useful where there are parent-child threads, event-based operations among 
  multiple threads.
* Thread Communication helps solve problem of polling, which is continously 
  looking to wait for an event in inter-thread communication.
* wait(): This method tells the calling thread to give up the monitor and
          go to sleep until some other thread enters the same monitor 
          and calls notify().
* notify(): This method wakes up the first thread that called wait() on 
            the same object.
* notifyAll(): This method wakes up all the threads that called wait()
               on the same object. The highest priority thread will run first.
* **Synchronized** Keyword 
 * This enables different threads reading and writing to the same variables
   ,objects and resources.
 * In a multithreaded environment when each thread try to access a common or 
   a shared resource such as a Variable or Object The **Synchronized** Keyword 
   will enable this.

   
### Demonstration of Thread Communication using Thread Class
* The following code has **TWO** classes **EvenOrOdd** and **ThreadCommunication**
* Class **EvenOrOdd**
  * This has two methods `EvenOddChecker` this checks if the given number 
    is Even or ODD while the the method `RandomNumber` supplies that 
    number by using Random.
  * Both the methods are **Synchronized**
* Class **ThreadCommunication**
  * thi

```
package tinitiate.java.multithreading;

import java.util.Random;

// Class with following methods
// RandomNumber()
// Generates a number and stores to the Class variable CurrNumber 

// EvenOdd Class
// This Synchronized method EvenOddChecker checks if the number generated by 
// the Random Number method
class EvenOrOdd extends Thread {

    // Common Variables used and changed by both threads
    boolean flag = true;
    static int CurrNumber = 0;
    int counter = 0;
    
    // RandomNumber
    // This function generates a RandomNumber and assigns to the CurrNumber
    synchronized void RandomNumber() throws InterruptedException {

        if (flag) {
            Random rNum = new Random();
            CurrNumber = rNum.nextInt(1000);
    
            System.out.println("Generated Number: " + CurrNumber);
            flag = false;
            wait();
        }
    }


    // EvenOddChecker
    // this checks if the given number is Even or ODD while the the 
    // method RandomNumber
    synchronized void EvenOddChecker() throws InterruptedException {

        if (!flag) {
            if (CurrNumber%2 == 0) {
                System.out.println("EvenOddChecker: " + CurrNumber + " is EVEN.");
            } else {
                System.out.println("EvenOddChecker: " + CurrNumber + " is ODD.");
            }
            flag = true;
            notifyAll();
        }    
    }
}


// ThreadCommunication Class
// This Class runs the methods RandomNumber and EvenOddChecker of the 
// EvenOrOdd in separate threads.
public class ThreadCommunication extends Thread {

    public static void main(String[] args) throws InterruptedException {

        // Create the Object of the Thread Class
        EvenOrOdd Obj = new EvenOrOdd();
        
        // Launch Thread for RandomNumber()
        // ================================
        new Thread() {
        public void run() {
            while (true) {
                try { Obj.RandomNumber(); Obj.counter++;  } catch (InterruptedException e) {}
                if (Obj.counter == 5) { break; }
            }
        }
        }.start();

        // Launch Thread for EvenOddChecker()
        // ==================================
        new Thread() {
        public void run() {
            while (true) {
                try { Obj.EvenOddChecker(); } catch (InterruptedException e) {}
                if (Obj.counter == 5) { break; }
            }
        }
        }.start();

    }
}
```
