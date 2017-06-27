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
public class P057_2_LogicalComplementAndNegationOperators {
    public static void main(String[] args) {
        String message;
/**
The logical complement operator, !, flips the value of a boolean expression. For example,
if the value is true, it will be converted to false, and vice versa. To illustrate this, compare
the outputs of the following statements:
* 
System.out.printf("%n %50s%n", message);

boolean booleanFalseValue = false;
System.out.printf("%n booleanFalseValue = %10b%n", booleanFalseValue); // false

booleanFalseValue = !booleanFalseValue;
System.out.printf(" !booleanFalseValue = %9b%n", booleanFalseValue); // true
 */
        {
            message = "---- LOGICAL COMPLEMENT ----";
            System.out.printf("%n %50s%n", message);
            
            boolean booleanFalseValue = false;
            System.out.printf("%n booleanFalseValue = %10b%n", booleanFalseValue); // false
            
            booleanFalseValue = !booleanFalseValue;
            System.out.printf(" !booleanFalseValue = %9b%n", booleanFalseValue); // true
        }
/**
Likewise, the negation operator, -, reverses the sign of a numeric expression, as shown
in these statements:
* 
double doubleValue = 1.21;
System.out.printf("%n doubleValue = %,10.2f%n", doubleValue); // 1.21
doubleValue = -doubleValue;
System.out.printf("%n doubleValue = %,10.2f%n", doubleValue); // -1.21
doubleValue = -doubleValue;
System.out.printf("%n doubleValue = %,10.2f%n", doubleValue); // 1.21
 */
        {
            message = "---- NEGATION OPERATOR ----";
            System.out.printf("%n %50s%n", message);
            
            double doubleValue = 1.21;
            System.out.printf("%n doubleValue = %,10.2f%n", doubleValue); // 1.21
            doubleValue = -doubleValue;
            System.out.printf(" doubleValue = %,10.2f%n", doubleValue); // -1.21
            doubleValue = -doubleValue;
            System.out.printf(" doubleValue = %,10.2f%n", doubleValue); // 1.21
        }
/**
Based on the description, it might be obvious that some operators require the variable
or expression they’re acting upon to be of a specific type. For example, you cannot apply
a negation operator, -, to a boolean expression, nor can you apply a logical complement
operator, !, to a numeric expression. Be wary of questions on the exam that try to do this,
as they'll cause the code to fail to compile. For example, none of the following lines of code
will compile:
* 
int x = !5; // DOES NOT COMPILE
boolean y = -true; // DOES NOT COMPILE
boolean z = !0; // DOES NOT COMPILE
 */
        {
            message = "---- BAD ASSIGNAMENT ----";
            System.out.printf("%n %50s%n", message);
            
//            int x = !5; // DOES NOT COMPILE - BAD OPERAND TYPE
            System.out.println("\nint x = !5; // DOES NOT COMPILE - BAD OPERAND TYPE");
//            boolean y = -true; // DOES NOT COMPILE - BAD OPERAND TYPE
            System.out.println("boolean y = -true; // DOES NOT COMPILE - BAD OPERAND TYPE");
//            boolean z = !0; // DOES NOT COMPILE - BAD OPERAND TYPE
            System.out.println("boolean z = !0; // DOES NOT COMPILE - BAD OPERAND TYPE");
        }
/**
The first statement will not compile due the fact that in Java you cannot perform a
logical inversion of a numeric value. The second statement does not compile because you
cannot numerically negate a boolean value; you need to use the logical inverse operator.
Finally, the last statement does not compile because you cannot take the logical complement
of a numeric value, nor can you assign an integer to a boolean variable.
 */
        
/**
Keep an eye out for questions on the exam that use the logical complement
operator or numeric values with boolean expressions or variables. Unlike
some other programming languages, in Java 1 and true are not related in
any way, just as 0 and false are not related.
 */
        {
            message = "---- NOTE ----";
            System.out.printf("%n %50s%n", message);
            
            message = "Keep an eye out for questions on the exam that use the logical complement\n"
                    + "operator or numeric values with boolean expressions or variables. Unlike\n"
                    + "some other programming languages, in Java 1 and true are not related in\n"
                    + "any way, just as 0 and false are not related.";
            System.out.printf("%n %50s%n", message);
        }
    }
}
