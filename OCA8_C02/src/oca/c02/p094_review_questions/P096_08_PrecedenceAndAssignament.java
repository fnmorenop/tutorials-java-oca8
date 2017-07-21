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
public class P096_08_PrecedenceAndAssignament {
    public static void main(String[] args) {
/**
8. What is the output of the following code snippet?

3: boolean x = true, z = true;
4: int y = 20;
5: x = (y != 10) ^ (z=false);
6: System.out.println(x+", "+y+", "+z);

A. true, 10, true
B. true, 20, false
C. false, 20, true
D. false, 20, false
E. false, 20, true
F. The code will not compile because of line 5.
 */
        
/**
 * B.
 */
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println(x + ", " + y + ", " + z);
    }
}
