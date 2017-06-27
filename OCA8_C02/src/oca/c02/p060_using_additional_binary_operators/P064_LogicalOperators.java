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
    }
}
