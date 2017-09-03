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
public class P095_05_ForEachStatement {
/**
What is the output of the following code snippet?

3: java.util.List<Integer> list = new java.util.ArrayList<Integer>();
4: list.add(10);
5: list.add(14);
6: for(int x : list) {
7: System.out.print(x + ", ");
8: break;
9: }

A. 10, 14,
B. 10, 14
C. 10,
D. The code will not compile because of line 7.
E. The code will not compile because of line 8.
F. The code contains an infinite loop and does not terminate.
 */
    
/**
 * C.
 */
    public static void main(String[] args) {
        
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }
}
