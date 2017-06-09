/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p019_order_of_initialization;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class Chick {
    /**
     * When writing code that initializes fields in multiple 
     * places, you have to keep track of the order of 
     * initialization. We’ll add some more rules to the order
     * of initialization in Chapters 4 and 5. In the meantime, 
     * you need to remember: 
     * 
     * ■ Fields and instance initializer blocks are run in 
     * the order in which they appear in the file.
     * 
     * ■ The constructor runs after all fields and instance
     * initializer blocks have run.
     */
    
    /**
     * Order matters for the fields and blocks of code. You can’t refer
     * to a variable before it has been initialized:
     */
    // { System.out.println(name); } // DOES NOT COMPILE
    { System.out.println("1: Instance initializer block: setting name: Fluffy"); }
    private String name = "Fluffy";
    { System.out.println("1: Instance initializer block: setting field"); }
    { System.out.println("1: Instance initializer block: Fluffy: "+name); }
    
    public Chick() {
        System.out.println("2: Constructor block: setting constructor");
        System.out.println("2: Constructor block: setting name");
        name = "Tiny";
        System.out.println("2: Constructor block: set name");
        { System.out.println("2: Constructor block:  name in Block: "+name); }
        System.out.println("2: Constructor block:  name: "+name);
    }
    
    { System.out.println("1: Instance initializer block: Intermediary block"); }
    
    public static void main(String[] args) {
        System.out.println("3: Main method: setting main method");
        System.out.println("3: Main method: declaring chick variable");
        Chick chick;
        System.out.println("3: Main method: declared chick variable");
        System.out.println("3: Main method: instantiating chick variable");
        chick = new Chick();
        System.out.println("3: Main method: instantiated chick variable");
        System.out.println("3: Main method: getting chick.name variable: "+chick.name); 
    }
    
    { System.out.println("1: Instance initializer block: Last block"); }
    
    /**
     * Let’s look at what’s happening here. We start with the main() method 
     * because that’s where Java starts execution. On line 49, we call the 
     * constructor of Chick. Java creates a new object. First it initializes
     * name to "Fluffy" on line 28. Next it executes the print statements. 
     * Once all the fields and instance initializers have run, Java 
     * returns to the constructor. Line 35 changes the value of name to
     * "Tiny". At this point, the constructor is done executing and 
     * goes back to the print statement on line 50.
     */
}
