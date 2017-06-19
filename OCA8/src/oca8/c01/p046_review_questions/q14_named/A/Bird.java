/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Directory Path: 
 * <workspace-path>\workspace\tutorials-java-oca8\OCA8\src\oca8\c01\p044_review_questions\q14_named\A\Bird.java
 * 
 * Compilation directory: 
 * <workspace-path>\workspace\tutorials-java-oca8\OCA8\src\
 */

//package OCA8.src.oca8.c01.p044_review_questions.q14_named.a; // INCORRECT PACKAGE
//package OCA8.src.oca8.c01.p044_review_questions.q14_named.A; // INCORRECT PACKAGE
//package oca8.c01.p044_review_questions.q14_named.a; // DIFFERENT PACKAGE NAME
package oca8.c01.p046_review_questions.q14_named.A; // CORRECT INSERT
//package a ; // INCORRECT PACKAGE
//package A; // INCORRECT PACKAGE



public class Bird {
    public static void main(String[] args) {
        System.out.printf("%n ClassName = %s%n", "Bird");
        Bird bird = new Bird();
        System.out.printf("%n Bird.class.toString = %s%n", Bird.class.toString());
        System.out.printf("%n bird = %s%n", bird);
    }
}
