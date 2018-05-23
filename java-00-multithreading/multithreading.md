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
*

## [Thread Class](multithreading-thread-class.html)
* Thread class provides methods to create, run and handle inter-thread 
  communication perform operations on a thread. The Thread class implements the
  Runnable interface.
* A JAVA Thread is a lightweight processes (Object), which can be executed in 
  parallel with other object calls.
* Demonstrations and code examples for Thread Class and Dynamic Thread Count.
* `Example Code:` [Thread Class](multithreading-thread-class.html)


## [Runnable interface]()
*


## [Callable interface]()
* 


## [ThreadPool]()
*


## [ThreadSafe Collections]()
* 


## [Volatile Variables]()
*

