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
public class P097_12_EqualityOperator {
    public static void main(String[] args) {
/**
What is the output of the following code snippet?

3: int x = 0;
4: String s = null;
5: if(x == s) System.out.println("Success");
6: else System.out.println("Failure");
 
A. Success
B. Failure
C. The code will not compile because of line 4.
D. The code will not compile because of line 5.
 */
        
/**
 * B. --> D.
 */
        int x = 0;
        String s = null;
//        if (x == s) { // Doesn't compile - Incompatible types
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }
    }
}
