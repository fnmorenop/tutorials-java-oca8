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
public class P094_03_VariablesAssignation {
/**
What is the output of the following application?

1: public class CompareValues {
2:  public static void main(String[] args) {
3:      int x = 0;
4:      while(x++ < 10) {}
5:      String message = x > 10 ? "Greater than" : false;
6:      System.out.println(message+","+x);
7:  }
8: }

A. Greater than,10
B. false,10
C. Greater than,11
D. false,11
E. The code will not compile because of line 4.
F. The code will not compile because of line 5.
 */
    
/**
 * F.
 */
    
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
        }
//        String message = x > 10 ? "Greater than" : false; // DOESN'T COMPILE - IMCOMPATIBLES TYPES - BOOLEAN TO STRING
//        System.out.println(message + "," + x);
    }
    
}
