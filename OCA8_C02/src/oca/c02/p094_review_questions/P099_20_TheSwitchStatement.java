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
public class P099_20_TheSwitchStatement {
    public static void main(String[] args) {
/**
What is the result of the following code snippet?

3: final char a = 'A', d = 'D';
4: char grade = 'B';
5: switch(grade) {
6:  case a:
7:  case 'B': System.out.print("great");
8:  case 'C': System.out.print("good"); break;
9:  case d:
10: case 'F': System.out.print("not good");
11: }

A. great
B. greatgood
C. The code will not compile because of line 3.
D. The code will not compile because of line 6.
E. The code will not compile because of lines 6 and 9.
 */
/**
 * E. --> B.
 */
        final char a = 'A', d = 'D';
        char grade = 'B';
//        grade = d;
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }
}
