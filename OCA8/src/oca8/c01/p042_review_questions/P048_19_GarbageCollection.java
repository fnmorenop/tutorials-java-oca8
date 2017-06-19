/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * Suppose we have a class named Rabbit. Which of the following statements are
 * true? (Choose all that apply) 
 * 
 * 1: public class Rabbit { 
 * 2:   public static void main(String[] args) { 
 * 3:       Rabbit one = new Rabbit(); 
 * 4:       Rabbit two = new Rabbit(); 
 * 5:       Rabbit three = one; 
 * 6:       one = null; 
 * 7:       Rabbit four = one; 
 * 8:       three = null; 
 * 9:       two = null; 
 * 10:      two = new Rabbit(); 
 * 11:      System.gc(); 
 * 12:  } }
 * 
 * A. The Rabbit object from line 3 is first eligible for garbage collection
 * immediately following line 6. 
 * 
 * B. The Rabbit object from line 3 is first eligible for garbage collection 
 * immediately following line 8. 
 * 
 * C. The Rabbit object from line 3 is first eligible for garbage collection immediately
 * following line 12. 
 * 
 * D. The Rabbit object from line 4 is first eligible for garbage collection 
 * immediately following line 9. 
 * 
 * E. The Rabbit object from line 4 is first eligible for garbage collection 
 * immediately following line 11. 
 * 
 * F. The Rabbit object from line 4 is first eligible for garbage collection
 * immediately following line 12.
 */
/**
 * B. D. 
 */
public class P048_19_GarbageCollection {
    
    // 03: one -> Rabbit_1
    // 04: two -> Rabbit_2
    // 05: three -> one -> Rabbit_1
    // 06: one -> null
    // 07: four -> one -> null
    // 08: three -> null
    // 09: two -> null
    // 10: two -> Rabbit_3
    
}
