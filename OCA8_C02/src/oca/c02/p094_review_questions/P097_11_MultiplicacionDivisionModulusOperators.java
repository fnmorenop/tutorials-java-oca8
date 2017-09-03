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
public class P097_11_MultiplicacionDivisionModulusOperators {
    public static void main(String[] args) {
/**
11. What is the output of the following code?

1: public class ArithmeticSample {
2: public static void main(String[] args) {
3: int x = 5 * 4 % 3;
4: System.out.println(x);
5: }}
 
A. 2
B. 3
C. 5
D. 6
E. The code will not compile because of line 3.
 */
        
/**
 * A. 
 */
        ArithmeticSample.main(null);
        
    }
}

class ArithmeticSample {

    public static void main(String[] args) {
        int x = 5 * 4 % 3;
        System.out.println(x);
    }
}
