/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p042_review_questions;

/**
 *Given the following class, which of the following calls print out Blue Jay?
 * (Choose all that apply) 
 * 
 * public class P045_08_Console { 
 *  public static void main(String[] name) { 
 *      System.out.println(name[1]); } } 
 * 
 * A. java oca8.c01.p042_review_questions.P045_08_Console Sparrow Blue Jay 
 * B. java oca8.c01.p042_review_questions.P045_08_Console Sparrow "Blue Jay" 
 * C. java oca8.c01.p042_review_questions.P045_08_Console Blue Jay Sparrow 
 * D. java oca8.c01.p042_review_questions.P045_08_Console "Blue Jay" Sparrow 
 * E. java oca8.c01.p042_review_questions.P045_08_Console.class Sparrow "Blue Jay" 
 * F. java oca8.c01.p042_review_questions.P045_08_Console.class "Blue Jay" Sparrow 
 * G. Does not compile.
 */
/**
 * B.
 */
/**
 * Test path
 * 
 * <workspace-path>\workspace\tutorials-java-oca8\OCA8\build\classes
 * 
 * Java command: 
 * 
 * java oca8.c01.p042_review_questions.P045_08_Console 
 */
public class P045_08_Console {
    public static void main(String[] name) {
        System.out.println(name[1]);
    }
}
/**
 * java oca8.c01.p042_review_questions.P045_08_Console Sparrow Blue Jay // Blue
 * java oca8.c01.p042_review_questions.P045_08_Console Sparrow "Blue Jay" // Blue Jay
 * java oca8.c01.p042_review_questions.P045_08_Console Blue Jay Sparrow  // Jay
 * java oca8.c01.p042_review_questions.P045_08_Console "Blue Jay" Sparrow // Sparrow
 * java oca8.c01.p042_review_questions.P045_08_Console.class Sparrow "Blue Jay" // DOESN'T RUN
 * java oca8.c01.p042_review_questions.P045_08_Console.class "Blue Jay" Sparrow // DOESN'T RUN
 */
