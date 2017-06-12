/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p024_reference_types;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class ReferenceTypes {
    /**
     * A reference type refers to an object (an instance of a class). 
     * Unlike primitive types that hold their values in the memory 
     * where the variable is allocated, references do not hold the 
     * value of the object they refer to. Instead, a reference 
     * “points” to an object by storing the memory address where 
     * the object is located, a concept referred to as a pointer. 
     * Unlike other languages, Java does not allow you to learn 
     * what the physical memory address is. You can only use the 
     * reference to refer to the object.
     */
    public static void main(String[] args) {
        java.util.Date today;
        /**
         * The today variable is a reference of type Date and can only
         * point to a Date object.
         */
        String greeting;
        /**
         * The greeting variable is a reference that can only point to
         * a String object. 
         */
        
        /** 
        * A value is assigned to a reference in one of two ways:
        * 
        * ■ A reference can be assigned to another object of the same type. 
        * ■ A reference can be assigned to a new object using the new keyword.
        */
        today = new java.util.Date();
        greeting = "How are you?";
        /**
         * The today reference now points to a new Date object in memory, 
         * and today can be used to access the various fields and methods
         * of this Date object. Similarly, the greeting reference points
         * to a new String object, "How are you?". The String and Date 
         * objects do not have names and can be accessed only via their
         * corresponding reference.
         */
        System.out.printf("%n today = %s%n", today);
        System.out.printf("%n greeting = %s%n", greeting);
        /**
         * Take a look at: ObjectMemoryAccessedViaReference.png.
         */
    }
     
    
}
