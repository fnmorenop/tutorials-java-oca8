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
public class P094_01_JavaOperators {
    public static void main(String[] args) {
/**
Which of the following Java operators can be used with boolean variables? (Choose all that
apply)

A. ==
B. +
C. --
D. !
E. %
F. <=
 */
        
/**
 * A. D. 
 */
        
        boolean booleanVariableA = true;
        boolean booleanVariableB = false;

        boolean equality = booleanVariableA == booleanVariableB;
//        boolean addition = booleanVariableA + booleanVariableB; // DOESN'T COMPILE -- BAD OPERANDS TYPES FOR BINARY OPERATOR '+'
//        boolean unaryDecrementor = booleanVariableA--; // DOESN'T COMPILE -- BAD OPERANDS TYPES FOR BINARY OPERATOR '--'
        boolean booleanInversor = !booleanVariableA;
//        boolean lessThan = booleanVariableA <= booleanVariableB; // DOESN'T COMPILE -- BAD OPERANDS TYPES FOR BINARY OPERATOR '<='
        
    }
}
