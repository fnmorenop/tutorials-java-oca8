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
public class P098_17_TheDoWhileStatement {
    public static void main(String[] args) {
/**
What is the output of the following code snippet?

3: boolean keepGoing = true;
4: int result = 15, i = 10;
5: do {
6:  i--;
7:  if(i==8) keepGoing = false;
8:  result -= 2;
9: } while(keepGoing);
10: System.out.println(result);

A. 7
B. 9
C. 10
D. 11
E. 15
F. The code will not compile because of line 8.
 */
/**
 * D.
 */
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if (i == 8) {
                keepGoing = false;
            }
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
    }
}
