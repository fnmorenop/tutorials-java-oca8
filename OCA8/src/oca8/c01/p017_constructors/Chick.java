/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p017_constructors;

import java.util.Random;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Chick {
    /**
     * First you declare the type that you’ll be creating (Random) 
     * and give the variable a name (r). This gives Java a place
     * to store a reference to the object. Then you write new 
     * Random() to actually create the object.
     */
    Random r = new Random();
    /**
     * Random() looks like a method since it is followed by
     * parentheses. It’s called a constructor, which is a special
     * type of method that creates a new object.
     */
    public Chick(){
        /**
         * There are two key points to note about the constructor:
         * the name of the constructor matches the name of the
         * class, and there’s no return type.
         */
        System.out.println("in constructor");
    }
    
    public void Chick() { } // NOT A CONSTRUCTOR
    /**
     * When you see a method name beginning with a capital 
     * letter and having a return type, pay special attention
     * to it. It is not a constructor since there’s a return
     * type (void). It’s a regular method that won’t be called when
     * you write new Chick().
     */
}
