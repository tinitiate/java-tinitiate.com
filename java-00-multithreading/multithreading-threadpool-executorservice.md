---
YamlDesc: CONTENT-ARTICLE
Title: Java multithreading threadpool executorservice
MetaDescription: Java multithreading threadpool executorservice
MetaKeywords: Java multithreading, threadpool, executorservice
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-threadpool-executorservice.md
---

# Multithreading Threadpool with ExecutorService
* ExecutorService framework provides a mechanism to create a pool of threads,
  and assign tasks to a thread from the pool.
* ExecutorService can execute parallel tasks from both Runnable and Callable.
* ExecutorService Object will not be automatically destroyed, Once all the 
  tasks are exceuted it be  alive and wait for new work to do.
* An explicit Shutdown call is needed to end the ExecutorService.
* Executer service can create `newSingleThreadExecutor` to run a single thread pool.
* Executer service can create `newFixedThreadPool` to run multiple thread pool.


## Demonstration of Threadpool with ExecutorService using Runnable
* The following program demonstrates creating Runnable Objects and executing 
  them using a pool of threads with ExecutorService.
* The class `Runnable3SecTask` has a method `MyMethod()`, this takes 3 
  seconds to execute.
* THREE objects of the `Runnable3SecTask` class are created in the 
  `ExecutorServiceThreadPoolRunnable` class, And the ExecutorService executes 
  the same Objects method `MyMethod()` three times in Parallel.
* Executer service creates a single thread pool using `newSingleThreadExecutor` 
  and executes the method `MyMethod()` from the runnable.
* Executer service can create `newFixedThreadPool` to run multiple thread pool.
* Executer service creates a multiple thread pool using `newFixedThreadPool` 
  and executes the method `MyMethod()` from the runnable.
```
package tinitiate.java.multithreading;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// This Class Provides data for our test. 
// This prints a message every second with the data consumer information.
class Runnable3SecTask implements Runnable {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    Integer ThreadID;

    // Constructor to accept the Thread ID
    public Runnable3SecTask(int ThreadID) { this.ThreadID = ThreadID; }

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
    public void run() {
        try {
            MyMethod();
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}


// CLASS ExecutorServiceThreadPoolRunnable
// =======================================
// 1. This Class Runs the Method MyMethod() from the Class Runnable3SecTask
//    This Class create TWO threads
// 2. This demonstrates the Start and End time of the TWO threads are  
//    the same proving the are running in parallel, enabled by the 
//    Runnable Interface.
public class ExecutorServiceThreadPoolRunnable {

    public static void main (String[] args) throws InterruptedException, ExecutionException {

        // This variable captures the return from call()
        Integer X;

        // Creating A Single Thread Executor
        // Create Runnable Object of Runnable3SecTask Class
        Runnable R1 = new Runnable3SecTask(1);
        Runnable R2 = new Runnable3SecTask(2);
        Runnable R3 = new Runnable3SecTask(3);

        // Using the ExecutorService create a Single Thread Pool with only 1 Thread 
        ExecutorService SingleThread = Executors.newSingleThreadExecutor();
        SingleThread.execute(R1);
        
        // Using the ExecutorService create a Thread Pool with 2 Threads 
        ExecutorService ThreadExecutor = Executors.newFixedThreadPool(3);

        
        // Calling the submit(Callable Object), To submit the Task for execution
        // This DOESNT get the call() methods return
        ThreadExecutor.execute(R2);
        ThreadExecutor.execute(R3);


        // ShutDown the Thread once done Using The Executor
        // Once the Application is done using the ExecutorService
        // It must ShutDown, To prevent the threads for running for ever.
        // The active threads inside this ExecutorService prevents the JVM from shutting down.
        // Alternatively use shutdownNow(), to stop all threads and pooled tasks immediately 
        SingleThread.shutdown();
        ThreadExecutor.shutdown();
    }
}
```


## Demonstration of Threadpool with ExecutorService using Callable
* The following program demonstrates creating Runnable Objects and executing 
  them using a pool of threads with ExecutorService.
* The class `Runnable3SecTask` has a method `MyMethod()`, this takes 3 
  seconds to execute.
* THREE objects of the `Runnable3SecTask` class are created in the 
  `ExecutorServiceThreadPoolRunnable` class, And the ExecutorService executes 
  the same Objects method `MyMethod()` three times in Parallel.
* Executer service creates a single thread pool using `newSingleThreadExecutor` 
  and executes the method `MyMethod()` from the runnable.
* Executer service can create `newFixedThreadPool` to run multiple thread pool.
* Executer service creates a multiple thread pool using `newFixedThreadPool` 
  and executes the method `MyMethod()` from the runnable.
```
package tinitiate.java.multithreading;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// This Class Provides data for our test. 
// This prints a message every second with the data consumer information.
class Callable3SecTask implements Callable {

    // This variable stores the Caller of the Thread which runs the MyMethod()
    Integer ThreadID;

    // Constructor to accept the Thread ID
    public Callable3SecTask(int ThreadID) { this.ThreadID = ThreadID; }

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


// CLASS ExecutorServiceThreadPoolCallable
// =======================================
// 1. This Class Runs the Method MyMethod() from the Class Callable3SecTask
//    This Class create TWO threads
// 2. This demonstrates the Start and End time of the TWO threads are  
//    the same proving the are running in parallel, enabled by the 
//    Runnable Interface.
public class ExecutorServiceThreadPoolCallable {

    public static void main (String[] args) throws InterruptedException, ExecutionException {


        // This variable captures the return from call()
        Integer X;

        // Creating A Single Thread Executor
        // Create Callable Object of Runnable3SecTask Class
        Callable C1 = new Callable3SecTask(1);
        Callable C2 = new Callable3SecTask(2);
        Callable C3 = new Callable3SecTask(3);


        // Using the ExecutorService create a Thread Pool with 3 Threads 
        ExecutorService ThreadExecutor = Executors.newFixedThreadPool(3);

        
        // Calling the submit(Callable Object), To submit the Task for execution
        // This DOESNT get the call() methods return
        ThreadExecutor.submit(C1);
        ThreadExecutor.submit(C2);

        // Use the Following to Submit the task and read the call() 
        // methods return using get()
        X = (Integer) ThreadExecutor.submit(C3).get();
        System.out.println("Obtaining ThreadID using get() method of the ThreadExecuter: " + X);
        

        // ShutDown the Thread once done Using The Executor
        // Once the Application is done using the ExecutorService
        // It must ShutDown, To prevent the threads for running for ever.
        // The active threads inside this ExecutorService prevents the JVM from shutting down.
        // Alternatively use shutdownNow(), to stop all threads and pooled tasks immediately 
        ThreadExecutor.shutdown();
    }
}
```


## Demonstration of Interface Future
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