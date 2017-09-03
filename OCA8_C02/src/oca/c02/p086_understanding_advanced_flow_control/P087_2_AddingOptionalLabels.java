/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p086_understanding_advanced_flow_control;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P087_2_AddingOptionalLabels {
    public static void main(String[] args) {
        String message;
/**
One thing we skipped when we presented if-then statements, switch statements, and
loops is that they can all have optional labels. A label is an optional pointer to the head of a
statement that allows the application flow to jump to it or break from it. It is a single word
that is proceeded by a colon (:). For example, we can add optional labels to one of the previous
examples:

int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
    INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
        System.out.print(mySimpleArray[i]+"\t");
    }
    System.out.println();
}
 */
        {
            message = "---- ADDING OPTIONAL LABELS ----";
            System.out.printf("%n %50s%n", message);
            
            int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
            OUTER_LOOP:
            for (int[] mySimpleArray : myComplexArray) {
                INNER_LOOP:
                for (int i = 0; i < mySimpleArray.length; i++) {
                    System.out.print(mySimpleArray[i] + "\t");
                }
                System.out.println();
            }
        }
/**
When dealing with only one loop, they add no value, but as we'll see in the next section,
they are extremely useful in nested environments. Optional labels are often only used
in loop structures. While this topic is not on the OCA exam, it is possible to add optional
labels to control and block structures. That said, it is rarely considered good coding practice
to do so.

For formatting, labels follow the same rules for identifiers. For readability, they are commonly
expressed in uppercase, with underscores between words, to distinguish them from
regular variables.
 */
    }
}
