/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p067_understanding_java_statements;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P071_TernaryOperator {
    public static void main(String[] args) {
        String message;
        
/**
Now that we have discussed if-then-else statements, we can briefly return to our discussion
of operators and present the final operator that you need to learn for the exam. The
conditional operator, ? :, otherwise known as the ternary operator, is the only operator
that takes three operands and is of the form:

booleanExpression ? expression1 : expression2

The first operand must be a boolean expression, and the second and third can be any
expression that returns a value. The ternary operation is really a condensed form of an 
if-then-else statement that returns a value. For example, the following two snippets of code
are equivalent:

int y = 10;
final int x;
if(y > 5) {
    x = 2 * y;
} else {
    x = 3 * y;
}
 */
        {
            message = "---- IF-ELSE TERNARY SCHEME ----";
            System.out.printf("%n %50s%n", message);
            
            int y = 10;
            final int x;
            if (y > 5) {
                x = 2 * y;
            } else {
                x = 3 * y;
            }
            System.out.printf(" x = %d%n", x);
        }
        
        {
            message = "---- TERNARY OPERATOR - DEEPING ----";
            System.out.printf("%n %50s%n", message);
            
            boolean isTrue = true;
            System.out.printf("%n isTrue = %s%n", isTrue);
            int deepingTernaryValue = 
                    isTrue ?
                        isTrue ?
                            isTrue ?
                                isTrue ?
                                    isTrue ?
                                        isTrue ?
                                            isTrue ?
                                                isTrue ?
                                                    !isTrue ?
                                                        isTrue ?
                                                            isTrue ?
                                                                isTrue ?
                                                                    isTrue ?
                                                                        isTrue ?
                                                                            isTrue ?
                                                                                isTrue ?
                                                                                    isTrue ?
                                                                                        isTrue ? 
                                                                                            18  
                                                                                        : 0
                                                                                    : 17
                                                                                : 16
                                                                            : 15
                                                                        : 14
                                                                    : 13
                                                                : 12
                                                            : 11
                                                        : 10
                                                    : 9
                                                : 8
                                            : 7
                                        : 6
                                    : 5
                                : 4
                            : 3
                        : 2
                    : 1;
            System.out.printf(" deepingTernaryValue = %s%n", deepingTernaryValue);
            
            boolean isTernaryExpression;
            
            {
                String usabilityTernaryValue1 = 
                        false ?
                            true ?
                                true ? 
                                    "Level 4" : 
                                "Level 3" : 
                            "Level 2" : 
                        "Level 1";
                System.out.printf(" usabilityTernaryValue1 = %s%n", usabilityTernaryValue1);
            }
            
            {
                String usabilityTernaryValue2 = 
                        true ?
                            false ?
                                true ? 
                                    "Level 4" : 
                                "Level 3" : 
                            "Level 2" : 
                        "Level 1";
                System.out.printf(" usabilityTernaryValue2 = %s%n", usabilityTernaryValue2);
            }
            
            {
                String usabilityTernaryValue3 = 
                        true ?
                            true ?
                                false ? 
                                    "Level 4" : 
                                "Level 3" : 
                            "Level 2" : 
                        "Level 1";
                System.out.printf(" usabilityTernaryValue3 = %s%n", usabilityTernaryValue3);
            }
            
            {
                String usabilityTernaryValue4 = 
                        true ?
                            true ?
                                true ? 
                                    "Level 4" : 
                                "Level 3" : 
                            "Level 2" : 
                        "Level 1";
                System.out.printf(" usabilityTernaryValue4 = %s%n", usabilityTernaryValue4);
            }
            
            {
                boolean isBooleanOperation = 2 < 2 && 3 < 4 ^ 5 < 6 && 7 < 8;
                System.out.printf(" isBooleanOperation = %s%n", isBooleanOperation);
                boolean isXorOperation = 2 < 2;
                System.out.printf(" isXorOperation = %s%n", isXorOperation);
                String usabilityTernaryValueX = 
                        1 < 2 && 4 < 4 ^ 5 < 6 && 7 < 8 ?
                            8 != 9 | 10 != 11 ?
                                2 != 2.5D ? 
                                    "Level 4" : 
                                "Level 3" : 
                            "Level 2" : 
                        "Level 1";
                System.out.printf(" usabilityTernaryValueX = %s%n", usabilityTernaryValueX);
            }
        }
/**
Compare the previous code snippet with the following equivalent ternary operator code
snippet:

int y = 10;
int x = (y > 5) ? (2 * y) : (3 * y);

Note that it is often helpful for readability to add parentheses around the expressions in
ternary operations, although it is certainly not required.
 */
        {
            message = "---- TERNARY OPERATORS ----";
            System.out.printf("%n %50s%n", message);

            int y = 10;
            int x = (y > 5) ? (2 * y) : (3 * y);
            System.out.printf(" y = %d%n", y);
            System.out.printf(" x = %d%n", x);
            
            int z = ((x == 20) ? ((x = 24 + (y /= 5)) / 6) : (x = 30)) > 25 ? 2 * (y += x-- - 2) : 4 * (y *= (x-- + y++) - y);
            System.out.printf("%n x = %d%n", x);
            System.out.printf(" y = %d%n", y);
            System.out.printf(" z = %s%n", z);
            
            int z1 = ((x == 21) ? (x = 24) : (x = 30)) > 25 ? 3 * (y += x++ - 2) : 4 * (y = (x + y) - y);
            System.out.printf("%n x = %d%n", x);
            System.out.printf(" y = %d%n", y);
            System.out.printf(" z1 = %s%n", z1);
        }
/**
There is no requirement that second and third expressions in ternary operations have
the same data types, although it may come into play when combined with the assignment
operator. Compare the following two statements:

System.out.println((y > 5) ? 21 : "Zebra");
int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

Both expressions evaluate similar boolean values and return an int and a String,
although only the fi rst line will compile. The System.out.println() does not care that the
statements are completely different types, because it can convert both to String. On the
other hand, the compiler does know that "Horse" is of the wrong data type and cannot be
assigned to an int; therefore, it will not allow the code to be compiled.
 */
        {
            message = "---- TERNARY OPERATORS - TYPE RETURNMENT ----";
            System.out.printf("%n %50s%n", message);
            
            int y = 10;
            
            System.out.println((y > 5) ? 21 : "Zebra");
            
//            int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE - CANNOT CONVERT STRING TO INT
            
            message = "int animal = (y < 91) ? 9 : \"Horse\"; // DOES NOT COMPILE - CANNOT CONVERT STRING TO INT";
            System.out.printf("%n %50s%n", message);
        }
/**
Ternary Expression Evaluation
As of Java 7, only one of the right-hand expressions of the ternary operator will be evaluated
at runtime. In a manner similar to the short-circuit operators, if one of the two righthand
expressions in a ternary operator performs a side effect, then it may not be applied
at runtime. Let’s illustrate this principle with the following example:

int y = 1;
int z = 1;

final int x = y<10 ? y++ : z++;
System.out.println(y+","+z); // Outputs 2,1

Notice that since the left-hand boolean expression was true, only y was incremented.
Contrast the preceding example with the following modifi cation:

int y = 1;
int z = 1;
final int x = y>=10 ? y++ : z++;
System.out.println(y+","+z); // Outputs 1,2

Now that the left-hand boolean expression evaluates to false, only z was incremented.
In this manner, we see how the expressions in a ternary operator may not be applied if
the particular expression is not used.
* 
For the exam, be wary of any question that includes a ternary expression in which a variable
is modified in one of the right-hand side expressions.
 */
        {
            message = "---- TERNARY OPERATORS - SHORT CIRCUIT LEFT HAND SIDE EFECT ----";
            System.out.printf("%n %50s%n", message);
            
            int y = 1;
            int z = 1;

            final int x = y < 10 ? y++ : z++;
//            System.out.println(y + "," + z); // Outputs 2,1
            System.out.printf("%n x = %d%n", x);
            System.out.printf(" y = %d%n", y);
            System.out.printf(" z = %s%n", z);
        }
        {
            message = "---- TERNARY OPERATORS - SHORT CIRCUIT RIGHT HAND SIDE EFECT ----";
            System.out.printf("%n %50s%n", message);
            
            int y = 1;
            int z = 1;

            final int x = y >= 10 ? y++ : z++;
//            System.out.println(y + "," + z); // Outputs 1,2
            System.out.printf("%n x = %d%n", x);
            System.out.printf(" y = %d%n", y);
            System.out.printf(" z = %s%n", z);
        }
    }
}
