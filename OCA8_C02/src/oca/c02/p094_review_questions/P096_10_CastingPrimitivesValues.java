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
public class P096_10_CastingPrimitivesValues {
/**
What is the output of the following code?

3: byte a = 40, b = 50;
4: byte sum = (byte) a + b;
5: System.out.println(sum);

A. 40
B. 50
C. 90
D. The code will not compile because of line 4.
E. An undefined value.
 */
    
/**
 * D.
 */
    
    public static void main(String[] args) {
        byte a = 40, b = 50;
//        byte sum = (byte) a + b; // Doesn't compile. Loose convertion
//        System.out.println(sum);
    }
    
    
}
