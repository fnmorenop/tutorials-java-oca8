/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.c02.p053_arithmetic_operators;

/**
 *
 * @author fabio.moreno.dlbi
 */
public class P053_ArithmeticOperators {
    /*
Arithmetic operators are often encountered in early mathematics and include addition
(+), subtraction (-), multiplication (*), division (/), and modulus (%). They also include the
unary operators, ++ and --.
* 
the multiplicative operators (*, /, %) have a higher order of precedence
than the additive operators (+, -). That means when you see an expression such as this:
* 
int x = 2 * 5 + 3 * 4 - 8;
* 
you first evaluate the 2 * 5 and 3 * 4, which reduces the expression to the following:
* 
int x = 10 + 12 - 8;
* 
Then, you evaluate the remaining terms in left-to-right order, resulting in a value of x of
14.
     */
    public static void main(String[] args) {
        {
            int x1 = 2 * 5 + 3 * 4 - 8;
            int x1_1 = (2 * 5) + (3 * 4) - 8;
            int x2 = 10 + 12 - 8;
            int x3 = 14;
            String mensaje = ((x1 == x1_1) && (x1_1 == x2) && (x2 == x3))
                    ? "Everyone is equal to 14" : "Something wrong happened";
            System.out.printf("%n mensaje = %s%n", mensaje);
        }
        /*
you can change the order of operation explicitly by wrapping parentheses around
the sections you want evaluated first
         */
        {
            int y1 = 2 * ((5 + 3) * 4 - 8);
            int y2 = 2 * (8 * 4 - 8);
            int y3 = 2 * (32 - 8);
            int y4 = 2 * 24;
            int y5 = 48;
            
            String mensaje = ((y1 == y2) && (y2 == y3) && (y3 == y4) && (y4 == y5))
                    ? "Everyone is equal to 48" : "Something wrong happened";
            System.out.printf("%n mensaje = %s%n", mensaje);
        }
        {
            int multiplicationDivisionPrecedence = 6 / 2 * (1 + 2); // 9
//            multiplicationDivisionPrecedence = (6 / 2) * (1 + 2);
            System.out.printf("%n multiplicationDivisionPrecedence = %d%n", 
                    multiplicationDivisionPrecedence);
        }
        /*
All of the arithmetic operators may be applied to any Java primitives, except boolean
and String. Furthermore, only the addition operators + and += may be applied to String
values, which results in String concatenation
         */
        {
            String string01 = "String01";
            String string02 = "String02";
            String string03 = " ";
            String stringResult = "The result is: ";
            stringResult += string01 + string03 + string02;
            System.out.printf("%n stringResult = %s%n", stringResult);
        }
        /*
the modulus operator, %, may be new to you. The modulus, or remainder operator, is simply the
remainder when two numbers are divided. For example, 9 divided by 3 divides evenly and
has no remainder; therefore, the remainder, or 9 % 3, is 0. On the other hand, 11 divided
by 3 does not divide evenly; therefore, the remainder, or 11 % 3, is 2.
         */
        {
            int nine = 9;
            int three = 3;
            int eleven = 11;
            int modulusNineThree = nine % three; // 9 % 3 = 0
            System.out.printf("%n modulusNineThree = %d%n", modulusNineThree);
            int modulusElevenThree = eleven % three; // 11 % 3 = 2
            System.out.printf(" modulusElevenThree = %d%n", modulusElevenThree);
        }
        /*
Be sure to understand the difference between arithmetic division and modulus. For integer
values, division results in the floor value of the nearest integer that fulfills the operation,
whereas modulus is the remainder value.
         */
        {
            int nine = 9;
            int three = 3;
            int eleven = 11;
            int ten = 10;
            int twelve = 12;
            int nineDividedThree = nine / three; // 3
            System.out.printf("%n nineDividedThree = %d%n", nineDividedThree);
            int nineModulusThree = nine % three; // 0
            System.out.printf(" nineModulusThree = %d%n", nineModulusThree);
            int tenDividedThree = ten / three; // 3
            System.out.printf(" tenDividedThree = %d%n", tenDividedThree);
            int tenModulusThree = ten % three; //1
            System.out.printf(" tenModulusThree = %d%n", tenModulusThree);
            int elevenDividedThree = eleven / three; // 3
            System.out.printf(" elevenDividedThree = %d%n", elevenDividedThree);
            int elevenModulusThree = eleven % three; // 2
            System.out.printf(" elevenModulusThree = %d%n", elevenModulusThree);
            int twelveDividedThree = twelve / three; // 4
            System.out.printf(" twelveDividedThree = %d%n", twelveDividedThree);
            int twelveModulusThree = twelve % three; // 0
            System.out.printf(" twelveModulusThree = %d%n", twelveModulusThree);
            double elevenDividedThreeDouble = eleven / three; // 3,00
            System.out.printf(" elevenDividedThreeDouble = %.2f%n", elevenDividedThreeDouble);
            double elevenModulusThreeDouble = eleven % three; // 2,00
            System.out.printf(" elevenModulusThreeDouble = %.2f%n", elevenModulusThreeDouble);
            /*
             * The modulus operation is not limited to positive integer values
             * in Java and may also be applied to negative integers and
             * floating-point integers. For a given divisor y and negative
             * dividend, the resulting modulus value is between and (-y + 1) and
             * 0.
             */
            float elevenFloatDividedThreeFloat = 11F / 3F; // 3,67
            System.out.printf("%n elevenFloatDividedThreeFloat = %.2f%n", elevenFloatDividedThreeFloat);
            float elevenFloatModulusThreeFloat = 11F % 3F; // 2,00
            System.out.printf(" elevenFloatModulusThreeFloat = %.2f%n", elevenFloatModulusThreeFloat);
            int negativeElevenModulusThree = -eleven % three; // -2
            System.out.printf(" negativeElevenModulusThree = %d%n", negativeElevenModulusThree);
            int negativeElevenModulusNegativeThree = -eleven % -three; // -2
            System.out.printf(" negativeElevenModulusNegativeThree = %d%n", negativeElevenModulusNegativeThree);
            int negativeTwelveModulusThree = -twelve % three; // 0
            System.out.printf(" negativeTwelveModulusThree = %d%n", negativeTwelveModulusThree);
        }
    }
}
