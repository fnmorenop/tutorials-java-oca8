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
public class P091_2_AdvancedFlowControlUsage {
    public static void main(String[] args) {
        String message;
        
        boolean isShowIfStatement = false;
        boolean isShowWhileStatement = false;
        boolean isShowForStatement = false;
        
//        isShowForStatement = true;
        IF_STATEMENT_BLOCK:
        {
            if (!isShowIfStatement) {
                message = "---- SKIPPED: ADVANCED FLOW CONTROL USAGE - IF ----";
                System.out.printf("%n %50s%n", message);
                break IF_STATEMENT_BLOCK;
            }
            
            message = "---- ADVANCED FLOW CONTROL USAGE - IF ----";
            System.out.printf("%n %50s%n", message);
            
            int upperValue = 9;
            int lowerValue = 0;
            int tempValue = 5;
            
            OUTTER_IF_LABEL:
            if (lowerValue >= 0) {
                System.out.println("OUTTER_IF_LABEL: Initial block");
                
                INNER_A_IF_LABEL:
                if (upperValue < 10) {
                    System.out.println("");
                    System.out.println("INNER_A_IF_LABEL: Initial block");
                    
                    INNER_A_TEMP_IF_LABEL:
                    if (tempValue <= 1) {
                        System.out.println("INNER_A_TEMP_IF_LABEL: Initial block");
                        if (tempValue == 0){
                            System.out.println("INNER_A_TEMP_IF_LABEL: Initial block - tempValue == 0");
                            break INNER_A_TEMP_IF_LABEL;
                        } else {
                             System.out.println("INNER_A_TEMP_IF_LABEL: Else : No break INNER_A_TEMP_IF_LABEL");
                        }
                        System.out.println("INNER_A_TEMP_IF_LABEL: Final block");
                    }
                    System.out.println("INNER_A_IF_LABEL: Final block");
                }
                
                INNER_A_IF_LABEL:
                if (upperValue < 10) {
                    System.out.println("");
                    System.out.println("INNER_A_2_IF_LABEL: Initial block");

                    INNER_A_TEMP_IF_LABEL:
                    if (tempValue <= 3) {
                        System.out.println("INNER_A_2_TEMP_IF_LABEL: Initial block");
                        
                        if (tempValue <= 2) {
                            System.out.println("INNER_A_2_TEMP_IF_LABEL: IF :  -- tempValue <= 2");
                            break INNER_A_IF_LABEL;
                        } else {
                            System.out.println("INNER_A_2_TEMP_IF_LABEL: ELSE :  -- tempValue <= 2");
                        }
                        
                        System.out.println("INNER_A_2_TEMP_IF_LABEL: Final block");
                    }
                    
                    System.out.println("INNER_A_2_IF_LABEL: Final block");
                }
                
                INNER_B_IF_LABEL:
                if (upperValue < 10) {
                    System.out.println("");
                    System.out.println("INNER_B_IF_LABEL: Initial block");

                    INNER_B_TEMP_IF_LABEL:
                    if (tempValue <= 5) {
                        System.out.println("INNER_B_TEMP_IF_LABEL: Initial block");
                        
                        if (tempValue <= 4) {
                            System.out.println("INNER_B_TEMP_IF_LABEL: IF : tempValue <= 4");
                            break OUTTER_IF_LABEL;
                        } else {
                            System.out.println("INNER_B_TEMP_IF_LABEL: ELSE : tempValue <= 4");
                        }
                        
                        System.out.println("INNER_B_TEMP_IF_LABEL: Final block");
                    }
                    
                    System.out.println("INNER_B_IF_LABEL: Final block");
                }
                System.out.println("");
                System.out.println("OUTTER_IF_LABEL: Final block");
            }
        }
        
//        isShowWhileStatement = true;
        WHILE_STATEMENT_BLOCK:
        {
            if (!isShowWhileStatement) {
                message = "---- SKIPPED: ADVANCED FLOW CONTROL USAGE - WHILE ----";
                System.out.printf("%n %50s%n", message);
                break WHILE_STATEMENT_BLOCK;
            }
            
            message = "---- ADVANCED FLOW CONTROL USAGE - WHILE ----";
            System.out.printf("%n %50s%n", message);
            
            int cicleValue = 3;
            int outterControl = cicleValue;
            int innerControl = cicleValue;
            int innerInnerControl = cicleValue;
            
            OUTTER_WHILE_BLOCK:
            while (outterControl-- > 1) BLOCK_OUTTER_WHILE: {
                System.out.println("\n OUTTER_WHILE_BLOCK: Starting");
                
                if (true) {
//                    break BLOCK_OUTTER_WHILE; // CONTINUES OUTTER_WHILE_BLOCK
//                    break OUTTER_WHILE_BLOCK; // BREAKS OUTTER_WHILE_BLOCK - UNNECESARY LABEL
//                    break; // EXITS OUTTER_WHILE_BLOCK
//                    continue OUTTER_WHILE_BLOCK; // CONTINUES OUTTER_WHILE_BLOCK - UNNECESARY LABEL
//                    continue; // CONTINUES OUTTER_WHILE_BLOCK
                }
                
                INNER_WHILE_BLOCK:
                while (innerControl-- > 1) {
                    System.out.println("\n INNER_WHILE_BLOCK: Starting");
                    
                    if (true) {
//                        break BLOCK_OUTTER_WHILE; // CONTINUES OUTTER_WHILE_BLOCK
//                        break OUTTER_WHILE_BLOCK; // BREAKS OUTTER_WHILE_BLOCK
//                        break INNER_WHILE_BLOCK; // BREAKS OUTTER_WHILE_BLOCK - UNNECESARY LABEL
//                        break; // BREAKS OUTTER_WHILE_BLOCK
//                        continue OUTTER_WHILE_BLOCK; // CONTINUES OUTTER_WHILE_BLOCK
//                        continue INNER_WHILE_BLOCK; // CONTINUES INNER_WHILE_BLOCK - UNNECESARY LABEL
//                        continue; // CONTINUES INNER_WHILE_BLOCK
                    }
                    
                    INNER_INNER_WHILE_BLOCK:
                    while (innerInnerControl-- > 1) {
                        System.out.println("\n INNER_INNER_WHILE_BLOCK: Starting");
                        
                        

                        System.out.println(" INNER_INNER_WHILE_BLOCK: ending");
                    }
                    
                    System.out.println("\n INNER_WHILE_BLOCK: ending");
                }
                
                System.out.println("\n OUTTER_WHILE_BLOCK: Ending");
            }
            System.out.printf("%n innerInnerControl = %s%n", innerInnerControl);
            System.out.printf(" innerControl = %s%n", innerControl);
            System.out.printf(" outterControl = %s%n", outterControl);
        }
        
        isShowForStatement = true;
        FOR_STATEMENT_BLOCK: {
            if (!isShowForStatement) {
                message = "---- SKIPPED: ADVANCED FLOW CONTROL USAGE - FOR ----";
                System.out.printf("%n %50s%n", message);
                break FOR_STATEMENT_BLOCK;
            } else {
                message = "---- ADVANCED FLOW CONTROL USAGE - FOR ----";
                System.out.printf("%n %50s%n", message);
            }
            
            OUTTER_FOR_STATEMENT:
            for(int i = 0; i <= 2; i++)
                OUTTER_FOR_BLOCK: {
                    System.out.println("\n OUTTER_FOR_STATEMENT: Starting");
                    
                    if (true) {
                        
                    }
                    
                    System.out.println("\n OUTTER_FOR_STATEMENT: Ending");
                }
        }
    }
}
