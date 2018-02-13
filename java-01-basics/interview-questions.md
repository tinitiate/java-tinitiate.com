# Java Object Oriented Programming Interview Questions
---

## What is Object Oriented Programming?
* Its a concept of programming, where all functionality is handled as an Object
  (instance of a Class). The Class is a collection of Fields(Attributes) and 
  Methods.

## What are the major features of Object Oriented Programming ?
* Abstraction, Encapsulation, Inheritance and Polymorphism.

## What is Abstraction?
* Abstraction is a feature of a Class in Object Oriented Programming, where 
 the class has public and private fields and methods.
* The Public Fields and methods are the ones that are exposed to other classes,
  And the private ones are hidden, of internal class usage only.

## What is Encapsulation?
* Encapsulation is the process of combining fields(data) and methods(functions)
  into a single unit called class. usually the Fields and methods are co-related
  by a purpose.
* Abstraction and encapsulation are complementary by nature
* Abstraction focuses on access to Fields and Methods.
* Encapsulation focuses on the implementation of the Class.

## How can java implement Encapsulation?
* By creating a Class, This has Fields and Methods

## What is Inheritance?
* Inheritance is a feature of Object Oriented Programming, which enables a 
  Parent Class methods and fields (collectively called as members) to be
  accessed by Child class.

## How can java implement Inheritance?
* Using the Extends Keyword, Refer to a Parent Class

## What is composition?
* Composition is the object-oriented programming feature, where an object 
  contains a 'call' to another class object.

## How can java implement Composition?
* Create another Class Object as Class Member

## What is Polymorphism?
* A Single entity exhibiting multiple properties

## How can java implement Polymorphism?
* In Java, polymorphism is achieved through method overloading in same class or 
  overriding when using Inheritance.

## Class
* Class is a collection of Fields and Methods, collectively called as 
  Class Members.

## Objects
* A Runtime Instantiation of a Class, All values assigned to member fields of a
  class are ready to be used, in this form.

## Objects properties
* 

## Objects Compare = vs .equals
* 

## Objects Clone / Copy
*


## What is a Constructor
* Its a Class Member and works as Method, But always returns a new instance of 
  the class it belongs to.
* Constructor automatically executes when a new Class Object is created.
* Constructor with parameters can be used to create objects where the
  object declaration would require same parametersto be used as the constructor.

## What are the various types of constructors?
* Default Constructor, It has no parameters, only creates a new class instance.
* Parametric Constructor, It has no parameters and creates a new class instance.
* Copy Constructor, It creates a new object copy of an existing object.

## What is a copy constructor?
* This type of Constructor creates a new object as a copy of an existing object.

### Final vs Static
* 

## this Keyword
* "this" is used to refer to class fields and methods of the "current" instance 
* of that class. The CURRENT INSTANCE is the instance when ever an object is 
* created, to refer to that Objects class members, "this" keyword can be used.
* Rather than calling the Object.<member>

## Why is Java Main() method static?
* To avoid the ambiguity of class initialization, A "Static method" provides a 
* great mechanism to get started. And this has been adopted to be the starting 
* point to the class (More so for a project).

## Impact of main() method made non static.
> If the main method is made non-static then at runtime exception
> “NoSuchMethodError” is raised.

3. What does the “static” keyword mean ? Can you override private or static method in Java ?
The static keyword denotes that a member variable or method can be accessed, without requiring an instantiation of the class to which it belongs. A user cannot override static methods in Java, because method overriding is based upon dynamic binding at runtime and static methods are statically binded at compile time. A static method is not associated with any instance of a class so the concept is not applicable.

4. Can you access non static variable in static context ?
A static variable in Java belongs to its class and its value remains the same for all its instances. A static variable is initialized when the class is loaded by the JVM. If your code tries to access a non-static variable, without any instance, the compiler will complain, because those variables are not created yet and they are not associated with any instance.


## What is the difference between an Interface and an Abstract class ?
* 

## What is Final
*

## Static Vs Final
*

## What are pass by reference and pass by value ?
*

## Java Inheritance Questions
---
## Does Java support multiple inheritance ?
* Java does not support multiple inheritance.
* Each class is able to extend only on one class,
* Java can implement more than one interfaces, though.

## Can you instantiate an object for a class that has a subclass overriding all the constructors of its base class?
* 
Class A has 2 constructors, a default constructor and a parameterized constructor.
Class B inherits Class A and overrides both constructors.
Can you create an instance of Class A? If no, why? If yes, what are the conditions?
Yes you can instantiate class A under the following conditions:
If the constructors are private then it cannot be instantiated outside class A.
If the constructors are protected then A cannot be instantiated outside class A or B.
If the constructors are public then A can be instantiated anywhere in the program.
If the constructors are default visibility then A can be instantiated anywhere in the owning package.