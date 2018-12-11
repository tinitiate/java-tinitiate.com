---
YamlDesc: CONTENT-ARTICLE
Title: Java MultiThreding
MetaDescription: Java MultiThreding Callable Interface
MetaKeywords: Java MultiThreding Callable Interface
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreding-callable-interface
---

# Callable Interface
* The Callable Interface has a single method `call()`, and this can return a 
  value, it is similar to Runnable Interface's `run()` method.
* The Callable interface uses Generics, so it can return any type of Object.
  and can also throw a checked exception.
* Callable on its own cannot run in parallel or execute as a thread, And it is 
  not supported by the Thread Class.
* Callable Interface `call()` method is supported by `ExecutorService`
* The `ExecutorService` accepts `Callable objects` and runs them 
  using `submit()` method.
  
  
  
## Callable Interface Demonstration
* The following program has a Class **Job3Seconds** this has a Method
  **MyMethod()**, it takes 3 seconds to run this method.
* The Class **Job3Seconds** implements the **Callable** Interface
  And it implements the **call()** method, It returns the ThreadID passed.
* The Class with the **Main Method** in this program is the **CallableInterfaceDemo**
  Class, This will Create THREE objects of the **Job3Seconds** Class and
* To Run the `Objects call()` in parallel, here we create and use ExecutorService 
  Object, With a ThreadPool of size THREE.
* Steps for running a callable-interfacein parallel
    * Step 1. Creating Three Objects of Callable for the **Job3Seconds** Class
    * Step 2. Create an ExecutorService Object with a Pool of THREE
    * Step 3. Using the `submit()` method run each the thread in parallel.
```
package tinitiate.java.multithreading;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// This Class Provides data for our test. 
// This prints a message every second with the data consumer information.
class Job3Seconds implements Callable {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    Integer ThreadID;

    // Constructor to accept the Thread ID
    public Job3Seconds(int ThreadID) { this.ThreadID = ThreadID; }

    // 1. This method takes 3 Seconds to execute
    // 2. This is the Method with the Business Logic and this will be tested 
    //    and made to be run multiple times in parallel
    // 3. The parallel runs can be validated by the Start Time and End Time of 
    //    the executing threads, they will be the same time overlaps for 
    //    multiple threads, thus proving that the threads are running in parallel
    public void MyMethod() throws InterruptedException {

        System.out.println("MyMethod() " + this.ThreadID + ", Start Time " + new Date());
        Thread.sleep(3000);
        System.out.println("MyMethod() " + this.ThreadID + ", End Time: " + new Date());
    }


    // 1. The run() method that is overRidden
    //    It must have the Exception handler for the InterruptedException
    @Override
    public Integer call() {
        try {
            MyMethod();
        } catch (InterruptedException e) { e.printStackTrace(); }
        return this.ThreadID;
    }
}


// 1. This Class Runs the Method MyMethod() from the Class Job3Seconds
//    This Class create TWO threads
// 2. This demonstrates the Start and End time of the TWO threads are  
//    the same proving the are running in parallel, enabled by the 
//    Runnable Interface.
public class CallableInterfaceDemo {

    public static void main (String[] args) throws InterruptedException, ExecutionException {

        // This variable captures the return from call()
        Integer X;

        // Creating A Single Thread Executor
        // Create Callable Object of Job3Seconds Class
        Callable C1 = new Job3Seconds(1);
        Callable C2 = new Job3Seconds(2);
        Callable C3 = new Job3Seconds(3);


        // Using the ExecutorService create a Thread Pool with 3 Threads 
        ExecutorService ThreadExecutor = Executors.newFixedThreadPool(3);

        
        // Calling the submit(Callable Object), To submit the Task for execution
        ThreadExecutor.submit(C1);
        ThreadExecutor.submit(C2);
        
        // If we want to capture the return from call(), use the get()
        X = (Integer) ThreadExecutor.submit(C3).get();
        System.out.println(X);


        // ShutDown the Thread once done Using The Executor
        // Once the Application is done using the ExecutorService
        // It must ShutDown, To prevent the threads for running for ever.
        // The active threads inside this ExecutorService prevents the JVM from shutting down.
        // Alternatively use shutdownNow(), to stop all threads and pooled tasks immediately 
        ThreadExecutor.shutdown();
    }
}
```


## Callable Interface Future
* The Future Object is used to get the execution details of a Callable Thread
 * Future get() method is used to get the `returned result from call()`
 * Future overloaded get() with wait time, can wait for the Thread to complete 
   to get the `returned result from call()`
 * Future cancel() method is used to cancel the a Callable thread. 
 * Future isDone() and isCancelled() methods can check status of a Callable thread.
* The ExecutorService.submit() immediately returns a `Future Object`.
* Future is just interface. the implementation FutureTask, can also be used on 
  a `Callable Object` to use in Thread instead of ExecutorService
```
package tinitiate.java.multithreading;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

//This Class Provides data for our test. 
//This prints a message every second with the data consumer information.
class Job2Secs implements Callable {

 // This variable stores the Caller of the Thread which runs the MyMethod()
 Integer ThreadID;

 // Constructor to accept the Thread ID
 public Job2Secs(int ThreadID) { this.ThreadID = ThreadID; }

 // 1. This method takes 2 Seconds to execute
 // 2. This is the Method with the Business Logic and this will be tested 
 //    and made to be run multiple times in parallel
 // 3. The parallel runs can be validated by the Start Time and End Time of 
 //    the executing threads, they will be the same time overlaps for 
 //    multiple threads, thus proving that the threads are running in parallel
 public void MyMethod() throws InterruptedException {

     System.out.println("MyMethod() " + this.ThreadID + ", Start Time " + new Date());
     Thread.sleep(2000);
     System.out.println("MyMethod() " + this.ThreadID + ", End Time: " + new Date());
 }


 // 1. The run() method that is overRidden
 //    It must have the Exception handler for the InterruptedException
 @Override
 public Integer call() {
     try {
         MyMethod();
     } catch (InterruptedException e) { e.printStackTrace(); }
     return this.ThreadID;
 }
}


public class CallableInterfaceFuture {

    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // This variable captures the return from call()
        Integer X;

        // Creating A Single Thread Executor
        // Create Callable Object of Job3Seconds Class
        Callable C1 = new Job2Secs(1);
        Callable C2 = new Job2Secs(2);
        Callable C3 = new Job2Secs(3);


        // =====================================
        // 1. RUN USING CALLABLE ExecutorService
        // =====================================

        // Using the ExecutorService create a Thread Pool with 3 Threads 
        ExecutorService ThreadExecutor = Executors.newFixedThreadPool(3);

        
        // Calling the submit(Callable Object), To submit the Task for execution
        ThreadExecutor.submit(C1);
        ThreadExecutor.submit(C2);
        
        // If we want to capture the return from call(), use the get()
        X = (Integer) ThreadExecutor.submit(C3).get();
        System.out.println(X);

        ThreadExecutor.shutdown();
        
        
        // =====================================
        // 2. RUN USING CALLABLE ExecutorService
        // =====================================
        
        FutureTask FT1 = new FutureTask(C1);
        FutureTask FT2 = new FutureTask(C2);
        FutureTask FT3 = new FutureTask(C3);
        
        
        // As it implements Runnable, create Thread
        // with FutureTask
        Thread t1 = new Thread(FT1);
        t1.start();
        Thread t2 = new Thread(FT2);
        t2.start();
        Thread t3 = new Thread(FT3);
        t3.start();
     
        // If we want to capture the return from Future, using the get()
        X = (Integer) FT2.get();
        System.out.println(X);
    }
}
```
