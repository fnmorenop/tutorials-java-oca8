/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p018_2_instance_initializer_blocks;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class InstanceInitializerBlocks {
    /**
     * When you learned about methods, you saw braces ({}). 
     * The code between the braces is called a code block. 
     * Sometimes this code is called being inside the braces. 
     * Anywhere you see braces is a code block.
     */
    public static void main(String[] args) {
        /**
         * Sometimes code blocks are inside a method. These 
         * are run when the method is called. Other times, 
         * code blocks appear outside a method.
         */
        { System.out.println("Feathers"); }
        {}
    }
    { System.out.println("Snowy"); }
    /**
     * There are six code blocks and three instance 
     * initializer. Counting code blocks is easy: you just
     * count the number of pairs of braces. If there aren’t 
     * the same number of open ({) and close (}) braces, 
     * the code doesn’t compile. It doesn’t matter that one
     * set of braces is inside the main() method—it still 
     * counts.
     */
    
    /**
     * When counting instance initializers, keep in mind that
     * it does matter whether the braces are inside a method.
     * There’s only three pair of braces outside a method. 
     * Line 29, 46 and 47 are instance initializer.
     */
    { System.out.println("Snowy2"); }
    { System.out.println("Snowy3"); }
}
