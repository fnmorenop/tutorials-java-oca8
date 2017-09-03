/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p057_working_with_unary_operators;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P057_1_UnaryOperators {
    public static void main(String[] args) {
/**
a unary operator is one that requires exactly one operand, or variable, to
function. As shown in Table 2.2, they often perform simple tasks, such as increasing a
numeric variable by one, or negating a boolean value.
 */
        
/**
TABLE 2. 2 Java unary operators
 
Unary operator      Description
 
    +               Indicates a number is positive, although numbers are assumed
                    to be positive in Java unless accompanied by a negative unary
                    operator
 
    -               Indicates a literal number is negative or negates an expression
 
    ++              Increments a value by 1

    --              Decrements a value by 1

    !               Inverts a Boolean’s logical value
 */       
        {
            String message = "---- UNARY OPERATORS ----";
            System.out.printf("%n message = %s%n", message);
            
            int negativeBaseValue = -10;
            System.out.printf("%n negativeBaseValue = %,20d%n", negativeBaseValue);
            
            int positiveBaseValue = +10;
            System.out.printf(" positiveBaseValue = %,20d%n", positiveBaseValue);
            
            int positiveAsignedPositiveIntValue = +positiveBaseValue;
            System.out.printf(" positiveAsignedPositiveIntValue = %,6d%n", 
                    positiveAsignedPositiveIntValue);
            
            int negativeAsignedPositiveIntValue = -positiveBaseValue;
            System.out.printf(" %30s = %,6d%n", 
                    "negativeAsignedPositiveIntValue", negativeAsignedPositiveIntValue);
            
            int positiveAsignedNegativeIntValue = +negativeBaseValue;
            System.out.printf(" positiveAsignedNegativeIntValue = %,6d%n", 
                    positiveAsignedNegativeIntValue);
            
            int negativeAsignedNegativeIntValue = -negativeBaseValue;
            System.out.printf(" negativeAsignedNegativeIntValue = %,6d%n", 
                    negativeAsignedNegativeIntValue);
            
            int unitaryIncrementToPositiveValue = ++positiveBaseValue;
            System.out.printf("%n positiveBaseValue = %,d, unitaryIncrementToPositiveValue = %,d%n", 
                    positiveBaseValue, unitaryIncrementToPositiveValue);
            
            int unitaryIncrementToNegativeValue = ++negativeBaseValue;
            System.out.printf(" positiveBaseValue = %,d, unitaryIncrementToNegativeValue = %,d%n", 
                    negativeBaseValue, unitaryIncrementToNegativeValue);
            
            int unitaryDecrementToPositiveValue = --positiveBaseValue;
            System.out.printf(" positiveBaseValue = %,d, unitaryDecrementToPositiveValue = %,d%n", 
                    positiveBaseValue, unitaryDecrementToPositiveValue);
            
            int unitaryDecrementToNegativeValue = --negativeBaseValue;
            System.out.printf(" positiveBaseValue = %,d, unitaryDecrementToNegativeValue = %,d%n", 
                    negativeBaseValue, unitaryDecrementToNegativeValue);
            
            boolean theTrue = true;
            System.out.printf("%n !theTrue = %b%n", !theTrue);
        }
    }
}
