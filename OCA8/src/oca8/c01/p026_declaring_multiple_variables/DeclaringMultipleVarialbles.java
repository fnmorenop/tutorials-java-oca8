/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oca8.c01.p026_declaring_multiple_variables;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class DeclaringMultipleVarialbles {
    public static void main(String[] args) {
        /**
         * You can also declare and initialize multiple variables in 
         * the same statement.
         */
        
        String s1, s2;
        String s3 = "yes", s4 = "no";
        
        /**
         * You can declare many variables in the same declaration as
         * long as they are all of the same type. You can also initialize 
         * any or all of those values inline. In the previous example, we
         * have two initialized variables: s3 and s4. The other two 
         * variables remain declared but not yet initialized.
         */
        
//        System.out.printf("%n s1 = %s%n", s1); // does not compile not initialized
//        System.out.printf("%n s2 = %s%n", s2); // does not compile not initialized
        System.out.printf("%n s3 = %s%n", s3);
        System.out.printf("%n s4 = %s%n", s4);
        
        /**
         * This is where it gets tricky. Pay attention to tricky things! 
         * The exam will attempt to trick you. Again, how many variables 
         * do you think are declared and initialized in this code?
         */
        
        int i1, i2, i3 = 0;
        
//        System.out.printf("%n i1 = %,d%n", i1); // does not compile not initialized
//        System.out.printf("%n i2 = %,d%n", i2); // does not compile not initialized
        System.out.printf("%n i3 = %,d%n", i3);
        
        /**
         * As you should expect, three variables were declared: i1, i2,
         * and i3. However, only one of those values was initialized: 
         * i3. The other two remain declared but not yet initialized.
         * That’s the trick. Each snippet separated by a comma is a 
         * little declaration of its own. The initialization of i3 only
         * applies to i3. It doesn't have anything to do with i1 or i2 
         * despite being in the same statement.
         */
        
//        int num, String value; // DOES NOT COMPILE
        
        /**
         * This code doesn't compile because it tries to declare 
         * multiple variables of different types in the same statement.
         * The shortcut to declare multiple variables in the same 
         * statement only works when they share a type.
         */
        
        boolean b1, b2;
        String s5 = "1", s6;
//        double d1, double d2; // does not compile bad declaration
        int i4; int i5;
//        int i6; i7; // does not compile bad declaration
        
        /**
         * The first statement is legal. It declares two variables 
         * without initializing them. The second statement is also 
         * legal. It declares two variables and initializes only 
         * one of them. The third statement is not legal. Java does
         * not allow you to declare two different types in the same
         * statement. Wait a minute! Variables d1 and d2 are the same
         * type. They are both of type double. Although that’s true, 
         * it still isn't allowed. If you want to declare multiple 
         * variables in the same statement, they must share the same
         * type declaration and not repeat it. double d1, d2; would
         * have been legal.
         * The fourth statement is legal. Although int does appear 
         * twice, each one is in a separate statement. A semicolon 
         * (;) separates statements in Java. It just so happens 
         * there are two completely different statements on the same
         * line. The fifth statement is not legal. Again, we have two
         * completely different statements on the same line. The 
         * second one is not a valid declaration because it omits the 
         * type. When you see an oddly placed semicolon on the exam, 
         * pretend the code is on separate lines and think about 
         * whether the code compiles that way. In this case, we have
         * the following:
         */
        
        int i6;
        int i7;
        int i8;
//        i9;// DOES NOT COMPILE
        
    }
}
