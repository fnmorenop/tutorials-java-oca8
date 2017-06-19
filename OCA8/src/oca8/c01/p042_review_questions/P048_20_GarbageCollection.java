/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * What is true about the following code? (Choose all that apply) 
 * 
 * public class Bear { 
 *  protected void finalize() { 
 *      System.out.println("Roar!"); } 
 * 
 *  public static void main(String[] args) { 
 *      Bear bear = new Bear();
 *      bear = null; System.gc(); } } 
 * 
 * A. finalize() is guaranteed to be called. 
 * B. finalize() might or might not be called 
 * C. finalize() is guaranteed not to be called. 
 * D. Garbage collection is guaranteed to run. 
 * E. Garbage collection might or might not run. 
 * F. Garbage collection is guaranteed not to run. 
 * G. The code does not compile.
 */
/**
 * B. E.
 */
public class P048_20_GarbageCollection {
    
}


class Bear {

    @Override
    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        System.out.printf("%n bear = %s%n", bear);
        bear = null;
        System.out.printf("%n bear = %s%n", bear);
        System.gc();
        System.out.println("System.gc()");
    }
}
