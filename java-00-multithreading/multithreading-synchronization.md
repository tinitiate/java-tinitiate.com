---
YamlDesc: CONTENT-ARTICLE
Title: Java MultiThreding Synchronization
MetaDescription: Java MultiThreding Synchronization
MetaKeywords: Java MultiThreding Thread Synchronization
Author: Venkata Bhattaram / tinitiate.com
ContentName: multithreading-synchronization
---

# Thread Synchronization
* **Thread Synchronization** is the mechanism used by multiple Java Threads 
  that carry out completely independent tasks, to `share a common resource`.
* Synchronization is the process to provide effective and `THREAD SAFE`
  communication amongst threads by sharing access to fields and objects references.
* Synchronization provides a thread to get exclusive access to a shared resource.
* Synchronization provides mutual exclusion on resource usage.


## Demonstration of Thread Synchronization
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