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
public class P098_15_TheWhileStatement {
    public static void main(String[] args) {
/**
What is the output of the following code snippet?

3: int x = 1, y = 15;
4: while x < 10
5: y––;
6: x++;
7: System.out.println(x+", "+y);

A. 10, 5
B. 10, 6
C. 11, 5
D. The code will not compile because of line 3.
E. The code will not compile because of line 4.
F. The code contains an infinite loop and does not terminate.
 */
/**
 * F. --> E.
 */
        int x = 1, y = 15;
//        while x < 10 // Doesn't compile -- "(" Expected
//        y––;
        x++;
        System.out.println(x+", "+y);
    }
}
