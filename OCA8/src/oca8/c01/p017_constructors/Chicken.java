/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p017_constructors;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Chicken {
    /**
     * The purpose of a constructor is to initialize fields, 
     * although you can put any code in there. Another way
     * to initialize fields is to do so directly on the line
     * on which they’re declared.
     */
    int numEggs = 0; // initialize on line
    
    String name;
    public Chicken() {
        name = "Duke";// initialize in constructor
    }
    
    /**
     * For most classes, you don’t have to code a constructor
     * —the compiler will supply a “do nothing” default
     * constructor for you. There’s one scenario that requires
     * you to declare a constructor that you’ll learn about in
     * Chapter 5.
     */
}
