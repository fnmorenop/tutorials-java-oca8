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
public class P097_14_UnaryOperators {
    public static void main(String[] args) {
/**
What is the output of the following code snippet?

3: int c = 7;
4: int result = 4;
5: result += ++c;
6: System.out.println(result);

A. 8
B. 11
C. 12
D. 15
E. 16
F. The code will not compile because of line 5.
 */
/**
 * C.
 */
        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);
    }
}
