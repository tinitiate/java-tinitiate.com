---
YamlDesc: CONTENT-ARTICLE
Title: Java Static and Final keywords
MetaDescription: Java Static and Final keywords
MetaKeywords: Java Static Variables, Static block, Static methods and Final keywords example code, tutorials
Author: Venkata Bhattaram / tinitiate.com
ContentName: static-final
---

# Java Static keyword
* In Java declaring a Variable, Block, Method or Class **STATIC** makes them 
  accessable without an Object.
* **Accessable without an Object** means they (Variable, Block, Method or Class)
   are common and remain unchanged across all Instances or Objects.
* Static or being available to all objects is possible because Memory allocation
  for **STATIC** happens only once, i.e. Initial Class loading to memory.

  
## Java Static Variable
* A variable declared `static` makes it available to all instance of the Class
* Below is a demonstration of variable A being same on Object1 and Object2
* Value to the Static variable A is assigned in `Object1` and `Object2`
* The Static Variable A can directly be accessed as A or 
  CLASS-NAME.VARIABLE, in this case StaticVariableDemo.A
```
package tinitiate.java.basics;

public class StaticVariableDemo {

    static int A;

    public static void main(String[] args) {

        StaticVariableDemo Object1 = new StaticVariableDemo();
        StaticVariableDemo Object2 = new StaticVariableDemo();
        
        // Assign value to A in Object1
        Object1.A = 100;
        System.out.println(Object1.A);

        // See the same value in Object2
        System.out.println(Object2.A);
        
        // The Static Variable A can directly be accessed as A or 
        // CLASS-NAME.VARIABLE, StaticVariableDemo.A
        System.out.println(A);
        System.out.println(StaticVariableDemo.A);
        
    }
}
```


## Java Static Block
* Java static blocks are code wrapped in the keyword `static` usually used 
  class data initialization.
* Static Blocks are executed only once, They are executed automatically 
  when the Class is invoked.
* In the below demonstration, there is a static block and a message from it 
  runs only once even though tow objects are created.
```
package tinitiate.java.basics;

public class StaticBlockDemo {

    static int A;
    int B;

    // Static Block
    // this executes only ONCE, automatically when the class is invoked
    // Usually used to initialize data
    static {
        A = 1;
        System.out.println("Class Loaded: Static Block Executed");
    }

    public StaticBlockDemo() {
        System.out.println("Constructor: Object Created");
    }

    public static void main(String args[]) {

        // Although we have two objects, static block is executed only once.
        StaticBlockDemo Object1 = new StaticBlockDemo();
        StaticBlockDemo Object2 = new StaticBlockDemo();
    }
}
```


## Java Static Method
* Java Static Methods can directly be called without an Object,
  They can also be accessed through an Object.
* Static Methods can call other static methods.
* Java Static Method `cannot access` **NON STATIC Class Member Fields**
* They can access static data, directly without an Object.
* They cannot access the `this` and `super` members of a class.
```
package tinitiate.java.basics;

public class StaticMethodDemo {

    int A;

    public static void StaticMethod() {
        System.out.println("Message from StaticMethod");
    }

    public static void main(String[] args) {

        // Call Static method directly without creating an Object
        StaticMethod();
        
        // Create Static method from an Object
        StaticMethodDemo Object1 = new StaticMethodDemo();

        Object1.StaticMethod();
        
    }
}
```

## Java Static Class
* Java Static Class Can only be created as **Nested Classes**,
* Nested Classes are Class with-in a Class. They can either be Static or Non Static.
* Only Nested Classes can be static, `Outer class **CANNOT** be static`
* Nested Static Class cannot Access Main Class Non Static Members directly
* Nested Static Class can Access Main Class Static Members directly
* Interstingly Nested Non Static Class can access Outer Class Non 
  static members directly !
```
package tinitiate.java.basics;

// Outer or Main level Class
public class StaticClassDemo {

    // Class Members
    int A;

    static public int Get100() {
        return 100;
    }
    
    public int GetOne() {
        return 1;
    }
    
    // Nested Static Class
    static class StaticNested {
        
        // * Nested Static Class Members
        // * Nested Static Class cannot Access Outer Class Non Static Members 
        //   Directly
        // * Here the "StaticClassDemo" members "A" "GetOne" cannot be 
        //   accessed by Nested Static Class StaticNested.
        // * Only the Static Get100() can be accessed directly.
        int SN1 = Get100();
    }

    // Nested Non Static Class
    class NonStaticNested {

        // * Nested Non Static Class Members
        // * Nested Non Static Class can Access Outer Class 
        //   "StaticClassDemo" methods directly
        int NSN1 = GetOne();
    }
}
```


# Java Final
* Java Final keyword when applied to a Field, means Once a value is assigned 
  to a **FIELD** Then it cannot be changed.
* Final Variables is whose value remains same through out the instance of a class
* Final variable cannot be modified, Once assigned a value for a given instance.
* Final methods cannot be overridden, But OverRidden methods can be final.
* Final class cannot be inherited. 
* Final variables that are declared and not initialized are called as
  blank final variables.
* Blank final variables require constructors to initialize it.
* Once initialized the Final variable's value wont change, 
* Its like a constant value for every instance.


## Java Final Field
* Java Final keyword when applied to a Field, means Once a value is assigned 
  to a **FIELD** Then it cannot be changed.
* Final Variables is whose value remains same through out the instance of a class
* Final variable cannot be modified, Once assigned a value for a given instance.
```
package tinitiate.java.basics;

public class FinalVariableDemo {

    // Final Fields
    final int A;
    
    // Use a Constructor to set value for A
    public FinalVariableDemo(int A) {
        this.A = A;
    }
    
    public static void main(String[] args) {

        FinalVariableDemo Obj1 = new FinalVariableDemo(100);
        System.out.println(Obj1.A);
    }
}
```

## Java Final Method
* Final methods cannot be overridden, But OverRidden methods can be final.
```
package tinitiate.java.basics;

class FinalMethods {

    // Final Method
    public final void MyMethod() {
        System.out.println("Message from Method:MyMethod");
    }
}

public class FinalMethodDemo extends FinalMethods {
    
    // Cannot OverRide !
    // void MyMethod() {
    //     System.out.println("Message from Method:MyMethod");
    // }
}
```

## Java Final Class
* Final class cannot be inherited. 
* Final variables that are declared and not initialized are called as
  blank final variables.
* Blank final variables require constructors to initialize it.
* Once initialized the Final variable's value wont change, 
* Its like a constant value for every instance.
```
package tinitiate.java.basics;

final class FinalClass {

     int A;
     public void MyMethod() { }
}

// This will result in Error as Final Class cannot be Inherited
public class FinalClassDemo extends FinalClass {

}
```


## Java Static Final
* A variable can be declared as `static final`
* It Must be assigned value in the declaration itself
* `static final double pi = 3.17;`
```
package tinitiate.java.basics;

public class StaticFinalDemo {

    static final double pi = 3.17;

    public static void main(String[] args) {

        System.out.println(pi);
    }
}
```


### Java Final vs Immutable
* **FINAL** The object cannot be changed.
* **FINAL** ensures that the address of the object remains the same.
* **IMMUTABLE** The contents of the object cannot be changed.
* **IMMUTABLE** dictates that the state of the object cannot be changed once created.
* **FINAL** is just a keyword whereas **IMMUTABLE** is a pattern.


### Java Static vs Final
* **FINAL**
* A Variable declared as "final", Value of that variable remains constant.
* Final variables once assigned values cannot be changed.
* Final is useful when variable value must be fixed during the program lifecycle.
* "STATIC"
* Static Variables, Methods can be accessed without creating class Objects
* Java Static Class Can only be created as **Nested Classes**,
* Nested Classes are Class with-in a Class. They can either be Static or Non Static.
* Only Nested Classes can be static, `Outer class **CANNOT** be static`
* Nested Static Class cannot Access Main Class Non Static Members directly
* Nested Static Class can Access Main Class Static Members directly
* Interstingly Nested Non Static Class can access Outer Class Non 
  static members directly !
