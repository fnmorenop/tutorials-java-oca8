/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p036_garbage_collection;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class GarbageCollection {
    /**
     * Garbage collection refers to the process of automatically freeing memory
     * on the heap by deleting objects that are no longer reachable in your
     * program. There are many different algorithms for garbage collection, but
     * you don’t need to know any of them for the exam. You do need to know that
     * System.gc() is not guaranteed to run, and you should be able to recognize
     * when objects become eligible for garbage collection. 
     * 
     * Java provides a method called System.gc(). Now you might think
     * from the name that this tells Java to run garbage collection. Nope! It
     * meekly suggests that now might be a good time for Java to kick off a
     * garbage collection run. Java is free to ignore the request. 
     * 
     * The more interesting part of garbage collection is when the memory
     * belonging to an object can be reclaimed. Java waits patiently until the
     * code no longer needs that memory. An object will remain on the heap until
     * it is no longer reachable. An object is no longer reachable when one of
     * two situations occurs: 
     * 
     * ■ The object no longer has any references pointing to it. 
     * ■ All references to the object have gone out of scope.
     */
    
    /**
     * Objects vs. References
     * 
     * Do not confuse a reference with the object that it refers to; they are
     * two different entities. The reference is a variable that has a name and
     * can be used to access the contents of an object. A reference can be
     * assigned to another reference, passed to a method, or returned from a
     * method. All references are the same size, no matter what their type is. 
     * 
     * An object sits on the heap and does not have a name. Therefore, you have
     * no way to access an object except through a reference. Objects come in
     * all different shapes and sizes and consume varying amounts of memory. An
     * object cannot be assigned to another object, nor can an object be passed
     * to a method or returned from a method. It is the object that gets garbage
     * collected, not its reference.
     * 
     * Take a look at: Objects_vs_References.png
     */
    
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        System.out.printf("%n one = %s%n", one);
        System.out.printf(" two = %s%n", two);
        
        one = two;
        System.out.printf("%n----- one = two -----%n");
        System.out.printf(" one = %s%n", one);
        System.out.printf(" two = %s%n", two);
        
        String three = one;
        System.out.printf("%n---- three = one ----%n");
        System.out.printf(" one = %s%n", one);
        System.out.printf(" two = %s%n", two);
        System.out.printf(" three = %s%n", three);
        
        one = null;
        System.out.printf("%n---- one = null ----%n");
        System.out.printf(" one = %s%n", one);
        System.out.printf(" two = %s%n", two);
        System.out.printf(" three = %s%n", three);
    }
}
