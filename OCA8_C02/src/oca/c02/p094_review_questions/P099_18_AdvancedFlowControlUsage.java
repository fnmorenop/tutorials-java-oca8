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
public class P099_18_AdvancedFlowControlUsage {
    public static void main(String[] args) {
/**
What is the output of the following code snippet?

3: int count = 0;
4: ROW_LOOP: for(int row = 1; row <=3; row++)
5:  for(int col = 1; col <=2 ; col++) {
6:      if(row * col % 2 == 0) continue ROW_LOOP;
7:      count++;
8:  }
9: System.out.println(count);

A. 1
B. 2
C. 3
D. 4
E. 6
F. The code will not compile because of line 6.
 */
/**
 * C. --> B.
 */
        int count = 0;
        ROW_LOOP: for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 2; col++) {
                    System.out.printf("%n row = %d%n", row);
                    System.out.printf(" col = %d%n", col);
                    System.out.printf(" row * col %% 2 = %d%n", (row * col % 2));
                    System.out.printf(" count = %d%n", count);
                if (row * col % 2 == 0) {
                    continue ROW_LOOP;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
