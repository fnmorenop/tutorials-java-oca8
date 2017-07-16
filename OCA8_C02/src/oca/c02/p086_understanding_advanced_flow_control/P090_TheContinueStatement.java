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
        {
            message = "---- ADVANCED FLOW CONTROL USAGE - IF ----";
            System.out.printf("%n %50s%n", message);

            int i = 1;

            IF_OPTIONAL_LABEL:
            if (i++ < 5) {
                INNER_IF_OPTIONAL_LABEL:
                if (i == 2) {
//                break; // NOT COMPILE - BREAK OUTSIDE SWITCH OR LOOP
//                break IF_OPTIONAL_LABEL; // COMPILES
//                break INNER_IF_OPTIONAL_LABEL; // COMPILES
//                continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP
//                continue IF_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL
                }
                System.out.printf("%nif: i = %s%n", i);
            }

            message = "                break; // NOT COMPILE - BREAK OUTSIDE SWITCH OR LOOP\n"
                    + "                break IF_OPTIONAL_LABEL; // COMPILES\n"
                    + "                break INNER_IF_OPTIONAL_LABEL; // COMPILES\n"
                    + "                continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP\n"
                    + "                continue IF_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL";
            System.out.printf("%nIF: %n%50s%n", message);
        }
        {
            message = "---- ADVANCED FLOW CONTROL USAGE - BLOCK ----";
            System.out.printf("%n %50s%n", message);
            
            BLOCK_LABEL:
            {
                INNER_BLOCK_LABEL: 
                {
//                    break; // NOT COMPILE - BREAK OUTSIDE SWITCH OR LOOP
//                    break BLOCK_LABEL; // COMPILES
//                    break INNER_BLOCK_LABEL; // COMPILES
//                    continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP
//                    continue BLOCK_LABEL; // NOT COMPILE - NOT A LOOP LABEL

                    int x = 0;
                    if (x == 0) {
                        break BLOCK_LABEL;
                    }
                    System.out.printf("%n x = %s%n", x);
                }
                System.out.println("testLine");
            }
            message = "                    break; // NOT COMPILE - BREAK OUTSIDE SWITCH OR LOOP\n"
                    + "                    break BLOCK_LABEL; // COMPILES\n"
                    + "                    break INNER_BLOCK_LABEL; // COMPILES\n"
                    + "                    continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP\n"
                    + "                    continue BLOCK_LABEL; // NOT COMPILE - NOT A LOOP LABEL";
            System.out.printf("%nBLOCK LABEL: %n%50s%n", message);
        }

        {
            message = "---- ADVANCED FLOW CONTROL USAGE - WHILE ----";
            System.out.printf("%n %50s%n", message);

            int i = 3;

            WHILE_OPTIONAL_LABEL:
            while (i < 3) {
                INNER_WHILE_OPTIONAL_LABEL:
                while (i < 1) {
//                break; // COMPILES
//                break WHILE_OPTIONAL_LABEL; // COMPILES
//                break INNER_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY
//                continue; // COMPILES - UNNECESARY
//                continue WHILE_OPTIONAL_LABEL; // COMPILES    
//                continue INNER_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY
                
                }
            }
            message = "                break; // COMPILES\n"
                    + "                break WHILE_OPTIONAL_LABEL; // COMPILES\n"
                    + "                break INNER_WHILE_OPTIONAL_LABEL; // COMPILES\n"
                    + "                continue; // COMPILES\n"
                    + "                continue WHILE_OPTIONAL_LABEL; // COMPILES    \n"
                    + "                continue INNER_WHILE_OPTIONAL_LABEL; // COMPILES";
            System.out.printf("%n %50s%n", message);

            DO_WHILE_OPTIONAL_LABEL:
            do {
                INNER_DO_WHILE_OPTIONAL_LABEL:
                do {
//                    break; // COMPILES
//                    break DO_WHILE_OPTIONAL_LABEL; // COMPILES
//                    break INNER_DO_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY
//                    continue; // COMPILES - UNNECESARY
//                    continue DO_WHILE_OPTIONAL_LABEL; // COMPILES
//                    continue INNER_DO_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY
                    
                } while (i < 1);
            } while (i < 3);
            message = "                    break; // COMPILES\n"
                    + "                    break DO_WHILE_OPTIONAL_LABEL; // COMPILES\n"
                    + "                    break INNER_DO_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY\n"
                    + "                    continue; // COMPILES - UNNECESARY\n"
                    + "                    continue DO_WHILE_OPTIONAL_LABEL; // COMPILES\n"
                    + "                    continue INNER_DO_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY";
            System.out.printf("%n %50s%n", message);
        }
        
        {
            message = "---- ADVANCED FLOW CONTROL USAGE - FOR ----";
            System.out.printf("%n %50s%n", message);
            
            FOR_OPTIONAL_LABEL:
            for (int i = 0; i < 5; i++) {
                INNER_FOR_OPTIONAL_LABEL:
                for(int j = 0; j < 10; j++){
//                    break; // COMPILES
//                    break FOR_OPTIONAL_LABEL; // COMPILES
//                    break INNER_FOR_OPTIONAL_LABEL; // COMPILES - UNNECESARY
//                    continue; // COMPILES - UNNECESARY
//                    continue FOR_OPTIONAL_LABEL; // COMPILES
//                    continue INNER_FOR_OPTIONAL_LABEL; // COMPILES - UNNECESARY
                }
            }
            message = "                    break; // COMPILES\n"
                    + "                    break FOR_OPTIONAL_LABEL; // COMPILES\n"
                    + "                    break INNER_FOR_OPTIONAL_LABEL; // COMPILES - UNNECESARY\n"
                    + "                    continue; // COMPILES - UNNECESARY\n"
                    + "                    continue FOR_OPTIONAL_LABEL; // COMPILES\n"
                    + "                    continue INNER_FOR_OPTIONAL_LABEL; // COMPILES - UNNECESARY";
            System.out.printf("%n %50s%n", message);
        }
        
        {
            message = "---- ADVANCED FLOW CONTROL USAGE - FOR ----";
            System.out.printf("%n %50s%n", message);

            String theCase = "case1";
            
            SWITCH_OPTIONAL_LABEL:
            switch(theCase){
                case "" : {
                    int i = 0;
                    INNER_SWITCH_OPTIONAL_LABEL:
                    switch(i) {
                        case 0 : {
//                            break; // COMPILES
//                            break SWITCH_OPTIONAL_LABEL; // COMPILES
//                            break INNER_SWITCH_OPTIONAL_LABEL; // COMPILES - UNNECESARY
//                            continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP
//                            continue SWITCH_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL
//                            continue INNER_SWITCH_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL
                        }
                    }
                }
            }
            message = "                            break; // COMPILES\n"
                    + "                            break SWITCH_OPTIONAL_LABEL; // COMPILES\n"
                    + "                            break INNER_SWITCH_OPTIONAL_LABEL; // COMPILES - UNNECESARY\n"
                    + "                            continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP\n"
                    + "                            continue SWITCH_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL\n"
                    + "                            continue INNER_SWITCH_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL";
            System.out.printf("%n %50s%n", message);
        }
    }
}
