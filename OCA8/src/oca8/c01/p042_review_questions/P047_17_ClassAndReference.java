/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca8.c01.p042_review_questions;

/**
 * Which of the following are true? (Choose all that apply) 
 * 
 * public class Bunny {
 *  public static void main(String[] args) { 
 *      Bunny bun = new Bunny(); } } 
 * 
 * A. Bunny is a class. 
 * B. bun is a class. 
 * C. main is a class. 
 * D. Bunny is a reference to an object. 
 * E. bun is a reference to an object. 
 * F. main is a reference to an object. 
 * G. None of the above.
 */
/**
 * A. E
 */

class Bunny {

    public static void main(String[] args) {
        Bunny bun = new Bunny();
        System.out.printf("%n bun = %s%n", bun);
        System.out.printf("%n Bunny.class = %s%n", Bunny.class);
//        Bunny2 bun2 = new Bunny2();
//        System.out.printf("%n bun2 = %s%n", bun2);
//        System.out.printf("%n Bunny2.class = %s%n", Bunny2.class);
    }
}

public class P047_17_ClassAndReference {
    
//    public static void main(String[] args) {
//        Bunny bun = new Bunny();
//        System.out.printf("%n bun = %s%n", bun);
//        System.out.printf("%n Bunny.class = %s%n", Bunny.class);
//    }
}

//class Bunny2 {
//
//    public static void main(String[] args) {
//        Bunny2 bun = new Bunny2();
//        System.out.printf("%n bun = %s%n", bun);
//        System.out.printf("%n Bunny.class = %s%n", Bunny.class);
//    }
//}