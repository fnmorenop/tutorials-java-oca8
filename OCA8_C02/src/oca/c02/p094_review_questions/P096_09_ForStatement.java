/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p094_review_questions;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P096_09_ForStatement {
    public static void main(String[] args) {
/**
9. How many times will the following code print "Hello World"?

3: for(int i=0; i<10 ; ) {
4: i = i++;
5: System.out.println("Hello World");
6: }

A. 9
B. 10
C. 11
D. The code will not compile because of line 3.
E. The code will not compile because of line 5.
F. The code contains an infinite loop and does not terminate.
 */
        
/**
 * A. --> F.
 */
        {
            int initialValue = 10;
            int finalValue = initialValue++;
            System.out.printf("%n finalValue = %s%n", finalValue);
            System.out.printf(" initialValue = %s%n", initialValue);
            initialValue = initialValue++;
            System.out.printf(" initialValue = %s%n", initialValue);
            initialValue = initialValue++;
            System.out.printf(" initialValue = %s%n", initialValue);
            
            for (int i = 0; i < 10;) {
                i = i++;
                System.out.println("");
                System.out.println("Hello World "+i);
            }
        }
    }
}
