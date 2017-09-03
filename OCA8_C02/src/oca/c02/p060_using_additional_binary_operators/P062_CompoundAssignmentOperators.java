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
public class P062_CompoundAssignmentOperators {
    public static void main(String[] args) {
        String message;
/**
Besides the simple assignment operator, =, there are also numerous compound assignment
operators. Only two of the compound operators listed in Table 2.1 are required for the
exam, += and -=. Complex operators are really just glorified forms of the simple assignment
operator, with a built-in arithmetic or logical operation that applies the left- and right-hand
sides of the statement and stores the resulting value in a variable in the left-hand side of the
statement. For example, the following two statements after the declaration of x and z are
equivalent:

int x = 2, z = 3;
x = x * z; // Simple assignment operator
x *= z; // Compound assignment operator
 */
        {
            message = "---- COMPOUND ASSIGNAMENT ----";
            System.out.printf("%n %50s%n", message);
            
            int x = 2, z = 3;
            System.out.printf("%n x = %,20d%n", x);
            System.out.printf(" z = %,20d%n", z);
            x = x * z; // Simple assignment operator
            System.out.printf(" x = x * z; = %,11d%n", x);
            x *= z; // Compound assignment operator
            System.out.printf(" x *= z; = %,14d%n", x);
        }
/**
The left-hand side of the compound operator can only be applied to a variable that is
already defined and cannot be used to declare a new variable. In the previous example, if x
was not already defined, then the expression x *= z would not compile.

Compound operators are useful for more than just shorthand—they can also save us
from having to explicitly cast a value. For example, consider the following example, in
which the last line will not compile due to the result being promoted to a long and assigned
to an int variable:

long x = 10;
int y = 5;
y = y * x; // DOES NOT COMPILE
 */
        {
            message = "---- BAD CASTING ASSIGNAMENT ----";
            System.out.printf("%n %50s%n", message);
            
            long longValue = 10;
            System.out.printf("%n long longValue = 10; = %d%n", longValue);
            int intValue = 5;
            System.out.printf(" int intValue = 5; = %d%n", intValue);
//            intValue = intValue * longValue; // DOES NOT COMPILE - LOOSY CONVERSION FROM LONG TO INT
            System.out.printf(" intValue = intValue * longValue; // DOES NOT COMPILE - LOOSY CONVERSION FROM LONG TO INT%n");
        }
/**
Based on the last two sections, you should be able to spot the problem in the last line.
This last line could be fixed with an explicit cast to (int), but there’s a better way using the
compound assignment operator:

long x = 10;
int y = 5;
y *= x;
 */
        {
            message = "---- GOOD COMPOUND CASTING ASSIGNAMENT ----";
            System.out.printf("%n %50s%n", message);

            long longValue = 10;
            System.out.printf("%n long longValue = 10; = %d%n", longValue);
            
            int intValue = 5;
            System.out.printf(" int intValue = 5; = %d%n", intValue);
            
            intValue *= longValue; 
            System.out.printf(" intValue *= longValue; = %d%n", intValue);
            
            short shortValue = 3;
            System.out.printf("short shortValue = 3; shortValue = %d%n", shortValue);
            
            shortValue *= longValue;
            System.out.printf("shortValue *= longValue; shortValue = %d%n", shortValue);
            
            short shortValueFromShortAndLongOpertation = 0;
            System.out.printf(" shortValueFromShortAndLongOpertation = %d%n", 
                    shortValueFromShortAndLongOpertation);
            
            shortValueFromShortAndLongOpertation += shortValue * longValue + ( 4/2 + intValue) + 10f * 5d;
            System.out.printf("shortValueFromShortAndLongOpertation += shortValue * longValue + ( 4/2 + intValue) + 10f * 5d;%n shortValueFromShortAndLongOpertation = %d%n", 
                    shortValueFromShortAndLongOpertation);
            
            shortValueFromShortAndLongOpertation = 1;
            System.out.printf(" shortValueFromShortAndLongOpertation = %d%n", 
                    shortValueFromShortAndLongOpertation);
            
            shortValueFromShortAndLongOpertation *= shortValue * longValue + ( 4/2 + intValue) + 10f * 5d;
            System.out.printf("shortValueFromShortAndLongOpertation *= shortValue * longValue + ( 4/2 + intValue) + 10f * 5d;%n shortValueFromShortAndLongOpertation = %d%n", 
                    shortValueFromShortAndLongOpertation);
        }
/**
The compound operator will first cast x to a long, apply the multiplication of two long
values, and then cast the result to an int. Unlike the previous example, in which the compiler
threw an exception, in this example we see that the compiler will automatically cast
the resulting value to the data type of the value on the left-hand side of the compound
operator.
 */

/**
One final thing to know about the assignment operator is that the result of the assignment
is an expression in and of itself, equal to the value of the assignment. For example, the
following snippet of code is perfectly valid, if not a little odd looking:

long x = 5;
long y = (x=3);
System.out.println(x); // Outputs 3
System.out.println(y); // Also, outputs 3
 */
        {
            message = "---- THE RESULT OF AN ASIGNAMENT ----";
            System.out.printf("%n %50s%n", message);
            
            long longValueX = 5;
            System.out.printf("%n longValueX = %d%n", longValueX);
            
            long longValueY = (longValueX = 3);
            System.out.printf("%nlong longValueY = (longValueX = 3); longValueX = %d%n", longValueX);
            System.out.printf("long longValueY = (longValueX = 3); longValueY = %d%n", longValueY);
            
            long longValueMultiReturned = (longValueY = 5 * (longValueX = 3)) / 3;
            System.out.printf("%nlong longValueMultiReturned = (longValueY = 5 * (longValueX = 3)) / 3; longValueX = %d%n", longValueX);
            System.out.printf("long longValueMultiReturned = (longValueY = 5 * (longValueX = 3)) / 3; longValueY = %d%n", longValueY);
            System.out.printf("long longValueMultiReturned = (longValueY = 5 * (longValueX = 3)) / 3; longValueMultiReturned = %d%n", longValueMultiReturned);
            
            long longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3;
            System.out.printf("%nlong longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3; longValueX = %d%n", longValueX);
            System.out.printf("long longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3; longValueY = %d%n", longValueY);
            System.out.printf("long longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3; longValueMultiReturned2 = %d%n", longValueMultiReturned2);
            
            long longComplexMultiReturnedValue = (longValueX = longValueMultiReturned2) *
                                                 (longValueX = longValueMultiReturned) +
                                                 (longValueMultiReturned = longValueX * longValueY) -
                                                 (longValueMultiReturned2 = longValueMultiReturned + longValueX / longValueY);
            message = "long longComplexMultiReturnedValue = (longValueX = longValueMultiReturned2) *\n" +
"                                                 (longValueX = longValueMultiReturned) +\n" +
"                                                 (longValueMultiReturned = longValueX * longValueY) -\n" +
"                                                 (longValueMultiReturned2 = longValueMultiReturned + longValueX / longValueY);";
            System.out.printf("%n message = %s%n", message);
            System.out.printf("%n longValueX = %d%n", longValueX);
            System.out.printf(" longValueY = %d%n", longValueY);
            System.out.printf(" longValueMultiReturned = %d%n", longValueMultiReturned);
            System.out.printf(" longValueMultiReturned2 = %d%n", longValueMultiReturned2);
            System.out.printf(" longComplexMultiReturnedValue = %d%n", longComplexMultiReturnedValue);
            
            System.out.printf("%n (longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3) = %d%n", 
                    (longValueMultiReturned2 = ((longValueY = 5) * (longValueX = 3)) / 3));
            System.out.printf(" longValueMultiReturned2 = %d%n", longValueMultiReturned2);
        }
/**
The key here is that (x=3) does two things. First, it sets the value of the variable x to be
3. Second, it returns a value of the assignment, which is also 3. The exam creators are fond
of inserting the assignment operator = in the middle of an expression and using the value of
the assignment as part of a more complex expression.
 */
    }
}
