/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p018_1_reading_and_writing_object_fields;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Swan {
    
    /**
     * It’s possible to read and write instance variables
     * directly from the caller.
     */
    int numberEggs;// instance variable
    
    public static void main(String[] args) {
        
        Swan mother = new Swan();
        
        mother.numberEggs = 1; // set variable
        /**
         * Writing to a variable is known as setting it. 
         * This class sets numberEggs to 1.
         */
        
        System.out.println(mother.numberEggs); // read variable
        /**
         * Reading a variable is known as getting it. The class
         * gets numberEggs directly to print it out. 
         */
    }
}
