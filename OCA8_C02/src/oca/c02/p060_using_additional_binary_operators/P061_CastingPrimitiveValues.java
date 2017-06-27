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
public class P061_CastingPrimitiveValues {
    public static void main(String[] args) {
        String message;
/**
We can fix the examples in the previous section by casting the results to a smaller data
type. Casting primitives is required any time you are going from a larger numerical data
type to a smaller numerical data type, or converting from a floating-point number to an
integral value.

int x = (int)1.0;
short y = (short)1921222; // Stored as 20678
int z = (int)9l;
long t = 192301398193810323L;
 */
        {
            message = "---- CASTING PRIMITIVES TYPES ----";
            System.out.printf("%n %50s%n", message);
            
            int intValueX = (int) 1.5; // Stored as 1
            System.out.printf("%n int intValueX = (int) 1.5; = %2d%n", intValueX);
            
            short shortValueY = (short) 1_921_222L; // Stored as 20678
            System.out.printf(" short shortValueY = (short) 1_921_222L; = %,2d%n", shortValueY);
            
            int intValueZ = (int) 9D;  // Stored as 9
            System.out.printf(" int intValueZ = (int) 9D; = %2d%n", intValueZ);
            
            long longValueT = 192_301_398_193_810_323L;
            System.out.printf(" long longValueT = 192_301_398_193_810_323L; = %,2d%n", longValueT);
            
            message = "---- OVERFLOW ----";
            System.out.printf("%n %50s%n", message);
            
            int longValueTCastedToInt = (int) longValueT;
            System.out.printf("%n int longValueTCastedToInt = (int) longValueT; = %,2d%n", 
                    longValueTCastedToInt);
            
            short longValueTCastedToShort = (short) longValueT;
            System.out.printf(" short longValueTCastedToShort = (short) longValueT; = %,2d%n", 
                    longValueTCastedToShort);
            
            byte longValueTCastedToByte = (byte) longValueT;
            System.out.printf(" byte longValueTCastedToByte = (byte) longValueT; = %,2d%n", 
                    longValueTCastedToByte);
            
            char longValueTCastedToChar = (char) longValueT;
            System.out.printf(" char longValueTCastedToChar = (char) longValueT; = %2c%n", 
                    longValueTCastedToChar);
        }
/**
Overflow and Underflow
* 
The expressions in the previous example now compile, although there’s a cost. The second
value, 1,921,222, is too large to be stored as a short, so numeric overflow occurs
and it becomes 20,678. Overflow is when a number is so large that it will no longer fit
within the data type, so the system “wraps around” to the next lowest value and counts
up from there. There’s also an analogous underflow, when the number is too low to fit in
the data type.

This is beyond the scope of the exam, but something to be careful of in your own code.
For example, the following statement outputs a negative number:

System.out.print(2147483647+1); // -2147483648

Since 2147483647 is the maximum int value, adding any strictly positive value to it will
cause it to wrap to the next negative number
 */
        {
            message = "---- UNDERFLOW ----";
            System.out.printf("%n %50s%n", message);
            
            int maximumLongValue = Integer.MAX_VALUE;
            System.out.printf("%n maximumLongValue = %,24d%n", maximumLongValue);
            System.out.printf(" maximumLongValue + 1 = %,20d%n", maximumLongValue + 1);
        } 
/**
Let’s return to one of our earlier examples for a moment:

short x = 10;
short y = 3;
short z = x * y; // DOES NOT COMPILE
 */        
        {
            message = "---- WRONG SHORT CASTING ----";
            System.out.printf("%n %50s%n", message);
            
            short shortValueX = 10;
            System.out.printf("%n shortValueX = %,10d%n", shortValueX);
            
            short shortValueY = 3;
            System.out.printf(" shortValueY = %,10d%n", shortValueY);
            
//            short shortValueZ = shortValueX * shortValueY; // DOES NOT COMPILE - LOOSY CONVERSION FROM INT TO SHORT
            System.out.printf(" %s%n", "short shortValueZ = shortValueX * shortValueY; // DOES NOT COMPILE - LOOSY CONVERSION FROM INT TO SHORT");
            
            short shortValueXIncrement = ++shortValueX;
            System.out.printf(" shortValueXIncrement = %,10d%n", shortValueXIncrement);
        }
/**
Based on everything you have learned up until now, can you understand why the last
line of this statement will not compile? If you remember, short values are automatically
promoted to int when applying any arithmetic operator, with the resulting value being of
type int. Trying to set a short variable to an int results in a compiler error, as Java thinks
you are trying to implicitly convert from a larger data type to a smaller one.

There are times that you may want to override the default behavior of the compiler. For
example, in the preceding example, we know the result of 10 * 3 is 30, which can easily
fit into a short variable. If you need the result to be a short, though, you can override this
behavior by casting the result of the multiplication:

short x = 10;
short y = 3;
short z = (short)(x * y);
 */
        {

            message = "---- GOOD SHORT CASTING ----";
            System.out.printf("%n %50s%n", message);

            short shortValueX = 10;
            System.out.printf("%n shortValueX = %,10d%n", shortValueX);

            short shortValueY = 3;
            System.out.printf(" shortValueY = %,10d%n", shortValueY);

            short shortValueZ = (short) (shortValueX * shortValueY);
            System.out.printf(" short shortValueZ = (short) (shortValueX * shortValueY); = %,10d%n", shortValueZ);
        }
/**
By performing this explicit cast of a larger value into a smaller data type, you are
instructing the compiler to ignore its default behavior. In other words, you are telling the
compiler that you have taken additional steps to prevent overflow or underflow. It is also
possible that in your particular application and scenario, overflow or underflow would
result in acceptable values.
 */
    }
}
