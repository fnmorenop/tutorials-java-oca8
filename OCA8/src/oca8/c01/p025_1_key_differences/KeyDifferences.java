/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p025_1_key_differences;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class KeyDifferences {
    /**
     * There are a few important differences you should know between 
     * primitives and reference types. First, reference types can be
     * assigned null, which means they do not currently refer to an 
     * object. Primitive types will give you a compiler error if you
     * attempt to assign them null. In this example, value cannot 
     * point to null because it is of type int:
     */
    
//    int value = null; // DOES NOT COMPILE
    String s = null;
    
    /**
     * reference types can be used to call methods when they do not 
     * point to null. Primitives do not have methods declared on 
     * them. In this example, we can call a method on reference 
     * since it is of a reference type. You can tell length is a 
     * method because it has () after it. The following line is 
     * gibberish. No methods exist on len because it is an int 
     * primitive. Primitives do not have methods.
     */
    
    String reference = "hello";
    int len = reference.length();
//    int bad = len.length(); // DOES NOT COMPILE
    
    /**
     * Finally, notice that all the primitive types have lowercase 
     * type names. All classes that come with Java begin with 
     * uppercase. You should follow this convention for classes you
     * create as well.
     */
}
