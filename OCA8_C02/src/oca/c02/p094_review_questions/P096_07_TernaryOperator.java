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
public class P096_07_TernaryOperator {
/**
What is the output of the following code?

1: public class TernaryTester {
2:  public static void main(String[] args) {
3:      int x = 5;
4:      System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
5: }}

A. 5
B. 4
C. 10
D. 8
E. 7
F. The code will not compile because of line 4.
 */
    
/**
 * D.
 */
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}
