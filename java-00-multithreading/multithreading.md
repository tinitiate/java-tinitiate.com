---
YamlDesc: CONTENT-ARTICLE
Title: Java MultiThreading
MetaDescription: Java MultiThreading
MetaKeywords: Java MultiThreading
Author: Venkata Bhattaram / tinitiate.com
ContentName: java-multithreading
---

# JAVA Threads
* A **java Thread** is a lightweight process (Object), which can be executed in
  parallel with other object calls.
* Threads exist within a process. Atleast one thread can be created for an 
  object [Data + Methods]
* Just like a JAVA Object, Every thread has operates with its own memory cache.
* Comparing **Thread vs Process**
  * A process consists of multiple sub-processes, which usually are indivisible 
    or it doesnt make business sense to further break them down.
  * A thread can be considered as a sub-process of a process, which could be 
    run in-parallel with another sub-process
* An ideal Business Problem which could  have Threads is, A process with a set 
  of Tasks, Some of which can be run in parallel, and some run sequential,
  Its up to the developer to choose what TASKs should be run as threads and 
  what should not.


## [Sequential vs Parallel Execution](multithreading-thread-class.html)
* Code can be executed in sequential or in parallel,
* Sequential execution is typically where one method is executed after another 
  in the order of the methods being called.
* Parallel or Multithreaded execution enables the running of methods in 
  parallel, multiple methods at the same time.


## [Thread Class](multithreading-thread-class.html)
* Thread class provides methods to create, run and handle inter-thread 
  communication perform operations on a thread. The Thread class implements the
  Runnable interface.
* A JAVA Thread is a lightweight processes (Object), which can be executed in 
  parallel with other object calls.
* Demonstrations and code examples for Thread Class and Dynamic Thread Count.
* `Example Code:` [Thread Class](multithreading-thread-class.html)


## [Runnable interface](multithreading-runnable-interface.html)
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

  
## [Thread Synchronization](multithreading-synchronization.html)
* **Thread Synchronization** is the mechanism used by multiple Java Threads 
  that carry out completely independent tasks, to `share a common resource`.
* Synchronization is the process to provide effective and `THREAD SAFE`
  communication amongst threads by sharing access to fields and objects references.
* Synchronization provides a thread to get exclusive access to a shared resource.
* Synchronization provides mutual exclusion on resource usage.


## [Thread Communication](multithreading-thread-communication.html)
* Java provides mechanisms for threads to communicate with each other, this is
  useful where there are parent-child threads, event-based operations among 
  multiple threads.
* Thread Communication helps solve problem of polling, which is continously 
  looking to wait for an event in inter-thread communication.


## [Callable interface](multithreading-callable-interface.html)
* The Callable Interface has a single method `call()`, and this can return a 
  value, it is similar to Runnable Interface's `run()` method.
* The Callable interface uses Generics, so it can return any type of Object.
  and can also throw a checked exception.
* Callable on its own cannot run in parallel or execute as a thread, And it is 
  not supported by the Thread Class.
* Callable Interface `call()` method is supported by `ExecutorService`
* The `ExecutorService` accepts `Callable objects` and runs them 
  using `submit()` method.


## [Thread Pool ExecutorService](multithreading-threadpool-executor.html)
* ExecutorService framework provides a mechanism to create a pool of threads,
  and assign tasks to a thread from the pool.
* ExecutorService can execute parallel tasks from both Runnable and Callable.
* ExecutorService Object will not be automatically destroyed, Once all the 
  tasks are exceuted it be  alive and wait for new work to do.
* An explicit Shutdown call is needed to end the ExecutorService.
* Executer service can create `newSingleThreadExecutor` to run a single thread pool.
* Executer service can create `newFixedThreadPool` to run multiple thread pool.


## [Atomic Variables](multithreading-atomic-variables.html)
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


## [Volatile Variables](multithreading-volatile-variables.html)
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


## Thread Fork-Join



## Thread Safe Collections



