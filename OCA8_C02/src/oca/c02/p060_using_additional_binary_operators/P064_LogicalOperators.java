/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p060_using_additional_binary_operators;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P064_LogicalOperators {
    public static void main(String[] args) {
        String message;
/**
If you have studied computer science, you may have already come across logical operators
before. If not, no need to panic—we'll be covering them in detail in this section.

The logical operators, (&), (|), and (^), may be applied to both numeric and boolean data
types. When they’re applied to boolean data types, they’re referred to as logical operators.
Alternatively, when they’re applied to numeric data types, they’re referred to as bitwise
operators, as they perform bitwise comparisons of the bits that compose the number. For
the exam, though, you don’t need to know anything about numeric bitwise comparisons, so
we'll leave that educational aspect to other books.

You should familiarize with the truth tables in Figure 2.1, where x and y are assumed to
be boolean data types.

Here are some tips to help remember this table:

■ AND is only true if both operands are true.
■ Inclusive OR is only false if both operands are false.
■ Exclusive OR is only true if the operands are different.

Finally, we present the conditional operators, && and ||, which are often referred to as
short-circuit operators. The short-circuit operators are nearly identical to the logical operators,
& and |, respectively, except that the right-hand side of the expression may never be
evaluated if the final result can be determined by the left-hand side of the expression. For
example, consider the following statement:

boolean x = true || (y < 4);

Referring to the truth tables, the value x can only be false if both sides of the expression
are false. Since we know the left-hand side is true, there’s no need to evaluate the right-hand
side, since no value of y will ever make the value of x anything other than true. It may help
you to illustrate this concept by executing the previous line of code for various values of y.
 */
        {
            message = "---- LOGICAL OPERATORS ----";
            System.out.printf("%n %50s%n", message);
            
            int y;
            boolean x = true || (y < 4);
            System.out.printf("%n int y;%n boolean x = true || (y < 4);%n x = %b%n", x);
        }
        
/**
A more common example of where short-circuit operators are used is checking for null
objects before performing an operation, such as this:

if(x != null && x.getValue() < 5) {
    // Do something
}

In this example, if x was null, then the short-circuit prevents a NullPointerException
from ever being thrown, since the evaluation of x.getValue() < 5 is never reached.
Alternatively, if we used a logical &, then both sides would always be evaluated and when x
was null this would throw an exception:

if(x != null & x.getValue() < 5) { // Throws an exception if x is null
// Do something
}
 */
        {
            message = "---- SHORT CIRCUIT OPERATORS ----";
            System.out.printf("%n %50s%n", message);
            
            Integer x = null;

//            if (x != null & x < 5) { // NULL POINTER EXCEPTION
            if (x != null && x < 5) { // SHORT CIRCUIT PREVENTS NULL POINTER
                System.out.printf("%n x = %,d%n", x);
            } else {
                System.out.println("x == null");
            }
        }
/**
Be wary of short-circuit behavior on the exam, as questions are known to alter a variable
on the right-hand side of the expression that may never be reached. For example, what
is the output of the following code?

int x = 6;
boolean y = (x >= 6) || (++x <= 7);
System.out.println(x);

Because x >= 6 is true, the increment operator on the right-hand side of the expression
is never evaluated, so the output is 6.
 */
        {
            message = "---- NEVER REACHED EXPRESSION ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 6;
            boolean y = (x >= 6) || (++x <= 7);
            System.out.printf("%n y = %b%n", y);
            System.out.printf(" x = %,d%n", x);
        }
    }
}
