/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * What does the following code output? 
 * 
 * 1: public class Salmon { 
 * 2:   int count;
 * 3:   public void Salmon() { 
 * 4:       count = 4; 
 * 5:   } 
 * 6:   public static void main(String[] args) { 
 * 7:       Salmon s = new Salmon(); 
 * 8:       System.out.println(s.count); 
 * 9:   } } 
 * 
 * A. 0 
 * B. 4 
 * C. Compilation fails on line 3.
 * D. Compilation fails on line 4. 
 * E. Compilation fails on line 7. 
 * F. Compilation fails on line 8.
 */
/**
 * A.
 */

class Salmon {

    int count;

    public void Salmon() {
        count = 4;
    }

    public static void main(String[] args) {
        Salmon s = new Salmon();
//        System.out.println(s.count);
        System.out.printf("%n s.count = %d%n", s.count);
    }
}


public class P049_21_Constructors {
    
}

