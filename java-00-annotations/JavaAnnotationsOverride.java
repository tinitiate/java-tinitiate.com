// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Override Annotation
// >MetaDescription: java annotations @Override
// >MetaKeywords: java annotations @Override example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: override-annotation
// >---

// >## JAVA OVERRIDE Annotation
// >* @Override, is used in Inheritance when we want to force the usage of Parent 
// >  Class Method which has the same name as a Method in the Child Class 
// >  Annotation forces the Developer to use the METHOD that will warn when we 
// >  use a Non existent method in Parent Class as 
// >* an suspecting to be an overRide method, with the Annotation ofcourse.
// >```
package tinitiate.java.annotations;

// Create a ParentClass
class ParentClass {

    public final int ParentsMoney = 1000;
    
    // Method "getSomeMoney()"
    // 1. This is a Method in the ParentClass
    // 2. A method with the same name exists in the Child class
    public int getSomeMoney() {
        // Get 10% of parents money
        return (ParentsMoney*10/100);
    }
}

// Class Inheriting from ParentClass
public class JavaAnnotationsOverride extends ParentClass {

    // Override Annotation
    // The @Overrided directs the compiler to use this method over the 
    // method from the ParentClass. 
    @Override
    public int getSomeMoney() {
        // Get 20% of parents money
        return (ParentsMoney*20/100);
    }

    // The below if unCommented will cause an error while compilation
    // as there is a @Override annotation and  there is no method with the name
    // getLittleMoney() in the parent class
    // *************************************************************************
    // @Override
    // public int getLittleMoney() {
    //     // Get 20% of parents money
    //     return ParentsMoney*(20/100);
    // }

    // The above block will be valid if the @Override is not used
    
    // Main Method
    public static void main(String[] args) {
        JavaAnnotationsOverride obj = new JavaAnnotationsOverride();
        System.out.println(obj.getSomeMoney());
    }
}
// >```
