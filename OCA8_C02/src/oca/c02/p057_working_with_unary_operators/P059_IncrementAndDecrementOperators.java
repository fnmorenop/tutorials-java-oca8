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
public class P059_IncrementAndDecrementOperators {
    public static void main(String[] args) {
        String message;
/**
Increment and decrement operators, ++ and --, respectively, can be applied to numeric
operands and have the higher order or precedence, as compared to binary operators. In
other words, they often get applied first to an expression.
Increment and decrement operators require special care because the order they are
applied to their associated operand can make a difference in how an expression is processed.
If the operator is placed before the operand, referred to as the pre-increment operator
and the pre-decrement operator, then the operator is applied first and the value return
is the new value of the expression. Alternatively, if the operator is placed after the operand,
referred to as the post-increment operator and the post-decrement operator, then the original
value of the expression is returned, with operator applied after the value is returned.

The following code snippet illustrates this distinction:

int counter = 0;
System.out.println(counter); // Outputs 0
System.out.println(++counter); // Outputs 1
System.out.println(counter); // Outputs 1
System.out.println(counter--); // Outputs 1
System.out.println(counter); // Outputs 0
 */
        {
            message = "---- UNARY OPERATORS ----";
            System.out.printf("%n %50s%n", message);
            
            int counter = 0;
            System.out.printf("%n counter = %10d%n", counter); // Outputs 0
            System.out.printf(" ++counter = %8d%n", ++counter); // Outputs 1
            System.out.printf(" counter = %10d%n", counter); // Outputs 1
            System.out.printf(" counter-- = %8d%n", counter--); // Outputs 1
            System.out.printf(" counter = %10d%n", counter); // Outputs 0
        }
/**
The first pre-increment operator updates the value for counter and outputs the new
value of 1. The next post-decrement operator also updates the value of counter but outputs
the value before the decrement occurs.
* 
One common practice in a certification exam, albeit less common in the real world, is to
apply multiple increment or decrement operators to a single variable on the same line:
* 
int x = 3;
int y = ++x * 5 / x-- + --x;
System.out.println("x is " + x);
System.out.println("y is " + y);
 */
        {
            message = "---- MULTIPLE INCREMENT AND DECREMENT ASSIGNEMENTS ----";
            System.out.printf("%n %65s%n", message);
            
            int x = 3;
            System.out.printf("%n x = %5d%n", x);
            int y = ++x * 5 / x-- + --x;
            int y1 = 4 * 5 / 4 + 2;
            int y2 = ((4 * 5) / 4) + 2;
            System.out.printf(" y1 = %4d%n", y1);
            System.out.printf(" y2 = %4d%n", y2);
            System.out.printf("%n x = %5d%n", x);
            System.out.printf(" y = %5d%n", y);
        }
/**
This one is more complicated than the previous example because x is modified three
times on the same line. Each time it is modified, as the expression moves from left to right,
the value of x changes, with different values being assigned to the variable. As you'll recall
from our discussion on operator precedence, order of operation plays an important part in
evaluating this example.
 
So how do you read this code? First, the x is incremented and returned to the expression,
which is multiplied by 5. We can simplify this:

int y = 4 * 5 / x-- + --x; // x assigned value of 4

Next, x is decremented, but the original value of 4 is used in the expression, leading to
this:

int y = 4 * 5 / 4 + --x; // x assigned value of 3
 
The final assignment of x reduces the value to 2, and since this is a pre-increment operator,
that value is returned to the expression:
 
int y = 4 * 5 / 4 + 2; // x assigned value of 2
 
Finally, we evaluate the multiple and division from left-to-right, and finish with the addition.
The result is then printed:
 
x is 2
y is 7
 */
    }
    
}
