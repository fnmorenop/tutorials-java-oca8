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
public class P091_1_AdvancedFlowControlUsage {
    public static void main(String[] args) {
        String message;
        
        {
            message = "---- ADVANCED FLOW CONTROL USAGE - IF ----";
            System.out.printf("%n %50s%n", message);

            int i = 1;

            IF_OPTIONAL_LABEL:
            if (i++ < 5) IF_BLOCK: {
                INNER_IF_OPTIONAL_LABEL:
                if (i == 2) {
//                    break; // NOT COMPILE - BREAK OUTSIDE SWITCH OR LOOP
//                    break IF_OPTIONAL_LABEL; // COMPILES
//                    break INNER_IF_OPTIONAL_LABEL; // COMPILES
//                    continue; // NOT COMPILE - CONTINUE OUTSIDE OF A LOOP
//                    continue IF_OPTIONAL_LABEL; // NOT COMPILE - NOT A LOOP LABEL
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
            while (i < 3) WHILE_BLOCK: {
                INNER_WHILE_OPTIONAL_LABEL:
                while (i < 1) INNER_WHILE_BLOCK: {
//                    break; // COMPILES
//                    break WHILE_OPTIONAL_LABEL; // COMPILES
//                    break INNER_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY
//                    break INNER_WHILE_BLOCK; // COMPILES
//                    break WHILE_BLOCK;
//                    continue; // COMPILES - UNNECESARY
//                    continue WHILE_OPTIONAL_LABEL; // COMPILES    
//                    continue INNER_WHILE_OPTIONAL_LABEL; // COMPILES - UNNECESARY

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
            do DO_WHILE_BLOCK: {
                INNER_DO_WHILE_OPTIONAL_LABEL:
                do INNER_DO_WHILE_BLOCK: {
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
                for (int j = 0; j < 10; j++) {
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
            switch (theCase) {
                case "": {
                    int i = 0;
                    INNER_SWITCH_OPTIONAL_LABEL:
                    switch (i) {
                        case 0: CASE_BLOCK_LABEL: {
//                            break; // COMPILES
//                            break SWITCH_OPTIONAL_LABEL; // COMPILES
//                            break INNER_SWITCH_OPTIONAL_LABEL; // COMPILES
//                            break CASE_BLOCK_LABEL;  // COMPILES
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
