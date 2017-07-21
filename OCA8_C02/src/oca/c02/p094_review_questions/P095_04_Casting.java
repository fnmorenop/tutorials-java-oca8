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
public class P095_04_Casting {
/**
What change would allow the following code snippet to compile? (Choose all that apply)

3: long x = 10;
4: int y = 2 * x;

A. No change; it compiles as is.
B. Cast x on line 4 to int.
C. Change the data type of x on line 3 to short.
D. Cast 2 * x on line 4 to int.
E. Change the data type of y on line 4 to short.
F. Change the data type of y on line 4 to long.
 */
    
/**
 * B. C. D. F.
 */
    public static void main(String[] args) {
        
        A : {
            long x = 10;
//            int y = 2 * x; // DOESN'T COMPILE - LOOSY CONVERSION LONG TO INT
        }
        B : {
            long x = 10;
            int y = 2 * (int) x;
        }
        C : {
            short x = 10;
            int y = 2 * x;
        }
        D : {
            long x = 10;
            int y = (int) (2 * x);
        }
        E : {
            long x = 10;
//            short y = 2 * x; // DOESN'T COMPILE - LOOSY CONVERSION LONG TO SHORT
        }
        F : {
            long x = 10;
            long y = 2 * x;
        }
    }
}
