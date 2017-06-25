/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p052_understanding_java_operators;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P051_UnderstandingJavaOperators {
    public static void main(String[] args) {
        int y = 4;
        double x = 3 + 2 * --y;
        System.out.printf("%n x = %.2f%n", x);
        P051_UnderstandingJavaOperators.precedences(); 
    }
    
    /**
Operator                                Symbols and examples

Post-unary operators                    expression++, expression--
Pre-unary operators                     ++expression, --expression
Other unary operators                   +, -, !
Multiplication/Division/Modulus         *, /, %
Addition/Subtraction                    +, -
Shift operators                         <<, >>, >>>
Relational operators                    <, >, <=, >=, instanceof
Equal to/not equal to                   ==, !=
Logical operators                       &, ^, |
Short-circuit logical operators         &&, ||
Ternary operators                       boolean expression ? expression1 : expression2
Assignment operators                    =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
     */
    
    public static void precedences(){
        int postUnaryPlus = 1;
        int postUnaryMinus = 1;
        int preUnaryPlus = 1;
        int preUnaryMinus = 1;
        
        float postUnaryOperators = postUnaryPlus++ + ++preUnaryPlus * postUnaryMinus-- + --preUnaryMinus;
        // postUnaryOperators = (postUnaryPlus++) + (++preUnaryPlus * postUnaryMinus--) + (--preUnaryMinus)
        // postUnaryOperators = ((postUnaryPlus++) + (2 * 1)) + (--preUnaryMinus)
        // postUnaryOperators = ((1) + (2 * 1)) + (0)
        // postUnaryOperators = (3) + (0)
        /**
            int postUnaryPlus = 2;
            int postUnaryMinus = 0;
            int preUnaryPlus = 2;
            int preUnaryMinus = 0;
         */
        System.out.printf("%n postUnaryPlus = %d%n", postUnaryPlus);
        System.out.printf(" postUnaryMinus = %d%n", postUnaryMinus);
        System.out.printf(" preUnaryPlus = %d%n", preUnaryPlus);
        System.out.printf(" preUnaryMinus = %d%n", preUnaryMinus);
        System.out.printf(" postUnaryOperators = %.2f%n", postUnaryOperators);
        
        float postUnaryOperators2 = postUnaryPlus++ + --preUnaryMinus * postUnaryMinus-- + ++preUnaryPlus;
        // postUnaryOperators2 = (postUnaryPlus++ + (--preUnaryMinus * postUnaryMinus--)) + (++preUnaryPlus)
        // postUnaryOperators2 = (2 + (-1 * 0)) + (++preUnaryPlus)
        // postUnaryOperators2 = (2) + (3)
        /**
            int postUnaryPlus = 3;
            int postUnaryMinus = -1;
            int preUnaryPlus = 3;
            int preUnaryMinus = -1;
         */
        System.out.printf("%n postUnaryPlus = %d%n", postUnaryPlus);
        System.out.printf(" postUnaryMinus = %d%n", postUnaryMinus);
        System.out.printf(" preUnaryPlus = %d%n", preUnaryPlus);
        System.out.printf(" preUnaryMinus = %d%n", preUnaryMinus);
        System.out.printf(" postUnaryOperators2 = %.2f%n", postUnaryOperators2);
        
        int binary = 0b1100110011001100;
        int switfPlaces = 2;
        System.out.printf("%n switfPlaces = %d%n", switfPlaces);
        System.out.printf(" binary = %,d%n", binary);
        System.out.printf(" Integer.toBinaryString(binary) = %s%n",
                Integer.toBinaryString(binary));
        System.out.printf(" Integer.toBinaryString(binary << switfPlaces[%d]) = %s%n", switfPlaces,
                Integer.toBinaryString(binary << switfPlaces));
        System.out.printf(" binary << switfPlaces[%d] = %,d%n", switfPlaces, binary << switfPlaces);
        System.out.printf(" Integer.toBinaryString(binary) = %s%n",
                Integer.toBinaryString(binary));
        System.out.printf(" Integer.toBinaryString(binary >> switfPlaces[%d]) = %s%n", switfPlaces,
                Integer.toBinaryString(binary >> switfPlaces));
        System.out.printf(" binary >> switfPlaces[%d] = %,d%n", switfPlaces, binary >> switfPlaces);
        System.out.printf(" Integer.toBinaryString(binary) = %s%n",
                Integer.toBinaryString(binary));

//        switfPlaces = 2;
        System.out.printf("%n switfPlaces = %d%n", switfPlaces);
        System.out.printf(" binary = %,d%n", binary);
        System.out.printf(" Integer.toBinaryString(binary) = %s%n",
                Integer.toBinaryString(binary));
        System.out.printf(" Integer.toBinaryString(binary >>> switfPlaces[%d]) = %s%n", switfPlaces,
                Integer.toBinaryString(binary >>> switfPlaces));
        System.out.printf(" binary >>> switfPlaces[%d] = %,d%n", switfPlaces, binary >>> switfPlaces);
        
        int operand01 = 0b11001100;
        int operand02 = 0b11110000;
        
        System.out.printf("%n Integer.toBinaryString(operand01) = %s%n", Integer.toBinaryString(operand01));
        System.out.printf(" Integer.toBinaryString(operand02) = %s%n", Integer.toBinaryString(operand02));
        System.out.printf(" operand01 & operand02 = %s%n", Integer.toBinaryString(operand01 & operand02));
        System.out.printf(" operand01 ^ operand02 = %s%n", Integer.toBinaryString(operand01 ^ operand02));
        System.out.printf(" operand01 | operand02 = %s%n", Integer.toBinaryString(operand01 | operand02));
        
        int operand03 = -100;
        int operand04 = 100;
        boolean isPositive = false;
        long operand05 = 2 * (isPositive ? operand04++ : ++operand03) + 2*(!isPositive ? operand03-- : --operand04);
        System.out.printf("%n operand05 = %,d%n", operand05);
        
        long operand06 = 2 * (isPositive ? operand04-- : operand03++);
        System.out.printf("%n operand06 = %,d%n", operand06);
        operand06 += 2 * (isPositive ? operand04-- : operand03++);
        System.out.printf(" operand06 = %,d%n", operand06);
    }
}
