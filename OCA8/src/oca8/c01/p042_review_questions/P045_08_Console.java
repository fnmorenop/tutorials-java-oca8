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
 * A. java P045_08_Console Sparrow Blue Jay 
 * B. java P045_08_Console Sparrow "Blue Jay" 
 * C. java P045_08_Console Blue Jay Sparrow 
 * D. java P045_08_Console "Blue Jay" Sparrow 
 * E. java P045_08_Console.class Sparrow "Blue Jay" 
 * F. java P045_08_Console.class "Blue Jay" Sparrow 
 * G. Does not compile.
 */
public class P045_08_Console {
    public static void main(String[] name) {
        System.out.println(name[1]);
    }
}
