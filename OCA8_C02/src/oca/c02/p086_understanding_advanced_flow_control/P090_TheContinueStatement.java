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
public class P090_TheContinueStatement {

    public static void main(String[] args) {
        String message;
/**
 * Let’s now complete our discussion of advanced loop control with the
 * continue statement, a statement that causes flow to finish the
 * execution of the current loop, as shown in Figure 2.10.
 *
 * You may notice the syntax of the continue statement mirrors that of
 * the break statement. In fact, the statements are similar in how they
 * are used, but with different results. While the break statement
 * transfers control to the enclosing statement, the continue statement
 * transfers control to the boolean expression that determines if the
 * loop should continue. In other words, it ends the current iteration
 * of the loop. Also like the break statement, the continue statement is
 * applied to the nearest inner loop under execution using optional
 * label statements to override this behavior. Let’s take a look at the
 * following example:
 *
 * public class SwitchSample { public static void main(String[] args) {
 * FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) { for (char x = 'a'; x
 * <= 'c'; x++) { if (a == 2 || x == 'b') continue FIRST_CHAR_LOOP;
 * System.out.print(" " + a + x); } } } }
 *
 */
        {
            message = "---- CONTINUE STATEMENT - OPTIONAL LABEL ----";
            System.out.printf("%n %50s%n", message);

            FIRST_CHAR_LOOP:
            for (int a = 1; a <= 4; a++) {
                for (char x = 'a'; x <= 'c'; x++) {
                    if (a == 2 || x == 'b') {
                        continue FIRST_CHAR_LOOP;
                    }
                    System.out.print(" " + a + x);
                }
            }
        }
/**
 * With the structure as defined, the loop will return control to the
 * parent loop any time the first value is 2 or the second value is b.
 * This results in one execution of the inner loop for each of three
 * outer loop calls. The output looks like this:
 *
 * 1a 3a 4a
 *
 * Now, imagine we removed the FIRST_CHAR_LOOP label in the continue
 * statement so that control is returned to the inner loop instead of
 * the outer. See if you can understand how the output will be changed
 * to:
 *
 * 1a 1c 3a 3c 4a 4c
 */
        {
            message = "---- CONTINUE STATEMENT - CONTINUE----";
            System.out.printf("%n %50s%n", message);

            FIRST_CHAR_LOOP:
            for (int a = 1; a <= 4; a++) {
                for (char x = 'a'; x <= 'c'; x++) {
                    if (a == 2 || x == 'b') {
                        continue; // FIRST_CHAR_LOOP;
                    }
                    System.out.print(" " + a + x); // 1a 1c 3a 3c 4a 4c
                }
            }
        }
/**
 * Finally, if we remove the continue statement and associated if-then
 * statement altogether, we arrive at a structure that outputs all the
 * values, such as:
 *
 * 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
 */
        {
            message = "---- CONTINUE STATEMENT - NOT CONTINUE----";
            System.out.printf("%n %50s%n", message);

            FIRST_CHAR_LOOP:
            for (int a = 1; a <= 4; a++) {
                for (char x = 'a'; x <= 'c'; x++) {
//                    if (a == 2 || x == 'b') {
//                        continue; // FIRST_CHAR_LOOP;
//                    }
                    System.out.print(" " + a + x); // 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
                }
            }
        }
/**
 * Table 2.5 will help remind you when labels, break, and continue
 * statements are permitted in Java. Although for illustrative purposes
 * our examples have included using these statements in nested loops,
 * they can be used inside single loops as well.
 */

    }
}
