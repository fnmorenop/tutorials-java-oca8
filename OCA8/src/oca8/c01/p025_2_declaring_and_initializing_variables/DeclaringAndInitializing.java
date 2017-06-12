/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p025_2_declaring_and_initializing_variables;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class DeclaringAndInitializing {
    public static void main(String[] args) {
        /**
        * A variable is a name for a piece of memory that stores 
        * data. When you declare a variable, you need to state 
        * the variable type along with giving it a name. For 
        * example, the following code declares two variables. 
        * One is named zooName and is of type String. The other
        * is named numberAnimals and is of type int.
        */
       String zooName;
       int numberAnimals;
       /**
        * Now that we’ve declared a variable, we can give it a value. 
        * This is called initializing a variable. To initialize a 
        * variable, you just type the variable name followed by an 
        * equal sign, followed by the desired value:
        */
       zooName = "The Best Zoo";
       numberAnimals = 100;
       
        System.out.printf("%n zooName = %s%n", zooName);
        System.out.printf("%n numberAnimals = %,d%n", numberAnimals);
        
        /**
         * Since you often want to initialize a variable right away,
         * you can do so in the same statement as the declaration. 
         * For example, here we merge the previous declarations and 
         * initializations into more concise code:
         */
        
        String zooName2 = "The Best Zoo";
        int numberAnimals2 = 100;
        
        System.out.printf("%n zooName2 = %s%n", zooName2);
        System.out.printf("%n numberAnimals2 = %,d%n", numberAnimals2);
    }
}
