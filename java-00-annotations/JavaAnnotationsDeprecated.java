// >---
// >YamlDesc: CONTENT-ARTICLE
// >Title: Java Deprecated Annotation
// >MetaDescription: java annotations @Deprecated
// >MetaKeywords: java annotations @Deprecated example code, tutorials
// >Author: Venkata Bhattaram / tinitiate.com
// >ContentName: deprecated-annotation
// >---

// >## JAVA DEPRICATED Annotation
// >* @Deprecated, Annotation will warn when we use a Deprecated class, method or 
// >  attribute as deprecated Which means it must not be used anymore,
// >  The annotation must be set just above the target method/attribute

// >```
package tinitiate.java.annotations;

// Class Deprecated
public class JavaAnnotationsDeprecated {

    // Adder Method [Not Intended to be Used]
    // 1. This has the Annotation "@Deprecated"
    // 2. This indicates that the following method, Must not be used
    // 3. Using this method will not raise an ERROR but will create a warning
    @Deprecated
    public static int Adder(int number1, int number2 ) {
        
        int result;
        result = number1 + number2;
        return result;
    }

    // NewAdder Method 
    // 1. No Annotation for this Method
    // 2. The functionality is same as the Adder Method 
    public static int NewAdder(int number1, int number2 ) {

        return number1 + number2;
    }

    // Main Method
    public static void main(String[] args) {
        
        // The Compiler will warn or the IDE will strikeOut on the Method name
        // As we are using a deprecated method.
        // The Code runs though but its just that the compiler warns that
        // we are using a code version that is decommissioned.
        System.out.println(Adder(10,20));

        // The Compiler will Not warn for this code
        System.out.println(NewAdder(10,20));
    }
}
// >```
